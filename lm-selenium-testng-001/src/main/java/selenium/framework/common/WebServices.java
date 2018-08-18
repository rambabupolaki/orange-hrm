package selenium.framework.common;

import java.util.List;
import java.util.concurrent.TimeUnit;
import com.eviware.soapui.SoapUI;
import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.support.http.SoapUIMultiThreadedHttpConnectionManager;
import com.eviware.soapui.model.iface.MessageExchange;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestCase;
import com.eviware.soapui.model.testsuite.TestCaseRunner;
import com.eviware.soapui.model.testsuite.TestStepResult;
import com.eviware.soapui.model.testsuite.TestSuite;
import com.eviware.soapui.model.testsuite.TestStepResult.TestStepStatus;



public class WebServices extends CommonMethods{

	public static void soapShutdown() {
		SoapUI.getThreadPool().shutdown();
		try {
			SoapUI.getThreadPool().awaitTermination(1, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}

		// Now to shutdown the monitor thread setup by SoapUI
		Thread[] tarray = new Thread[Thread.activeCount()];
		Thread.enumerate(tarray);
		for (Thread t : tarray) {
			if (t instanceof SoapUIMultiThreadedHttpConnectionManager.IdleConnectionMonitorThread) {
				((SoapUIMultiThreadedHttpConnectionManager.IdleConnectionMonitorThread) t).shutdown();
			}
		}
		// Finally Shutdown SoapUI itself.
		SoapUI.shutdown();
	}

	public static WsdlProject getProject(String projectFilePath) {
		WsdlProject project = null;
		try {
			project = new WsdlProject(projectFilePath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return project;
	}

	public static WsdlProject runWebService(WsdlProject project, String suiteName, String testStepName){
		boolean flag = false;
		String response = null;

		try {

			List<TestSuite> testSuiteList = project.getTestSuiteList();

			for (TestSuite ts : testSuiteList) {

				if (ts.getName().equalsIgnoreCase(suiteName)) {

					System.out.println("****Running Test suite " + ts.getLabel() + "********");

					// Retrieve all TestCases from a particular TestSuite
					List<TestCase> testCaseList = (List<TestCase>) ts.getTestCaseList();
					// Iterate all TestCases of the particular TestSuite
					for (TestCase testcase : testCaseList) {

						System.out.println("****Running Test Case " + testcase.getLabel() + "*****");
						TestCaseRunner testRunner = testcase.run(new PropertiesMap(), false);
						for (TestStepResult tcr : testRunner.getResults()) {
							System.out.println("STEP NAME : " + tcr.getTestStep().getName());
							TestStepStatus status = tcr.getStatus();
							String time = tcr.getTimeTaken() + "ms";

							System.out.println(status);
							System.out.println(time);
							if (tcr.getTestStep().getName().equalsIgnoreCase(testStepName)) {
								String request = ((MessageExchange) tcr).getRequestContent().toString();
								response = ((MessageExchange) tcr).getResponseContent().toString();

								System.err.println(request);
								System.err.println(response);
								project.setPropertyValue("request", request);
								project.setPropertyValue("response", response);


							}
						}
						if (TestCaseRunner.Status.FINISHED == testRunner.getStatus()) {
							System.out.println("PASSED");
							System.out.println("Web Service Ran Successfully.");
						}

						flag = true;
						break;

					}

					if (flag) {
						break;
					}
				}
				Thread.sleep(20000);
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return project;

	}




}
