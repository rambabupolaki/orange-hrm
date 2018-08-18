package lm.rcx.services;

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

import lm.rcx.pojo.UsersPojo;
import selenium.framework.common.CommonMethods;

public class GetAllUsersService extends CommonMethods{

	UsersPojo usersPojo;
	public static void main(String[] args) {

		try {
			new GetAllUsersService().runGetAllUsersService();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void soapShutdown() {
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

	public WsdlProject getProject(String projectFilePath) {
		WsdlProject project = null;
		try {
			project = new WsdlProject(projectFilePath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return project;
	}

	public boolean runGetAllUsersService() throws Exception {
		boolean flag = false;
		boolean flag1=false;

		WsdlProject project = getProject(System.getProperty("user.dir") + "/GetAllUsers-soapui-project.xml");

		try {
			reportInfo("Checking for existing members through services.");
			
			List<TestSuite> testSuiteList = project.getTestSuiteList();

			for (TestSuite ts : testSuiteList) {

				String suiteName = "GetAllUsers";
				if (ts.getName().equalsIgnoreCase(suiteName)) {

					System.out.println("****Running Test suite " + ts.getLabel() + "********");

					List<TestCase> testCaseList = (List<TestCase>) ts.getTestCaseList();

					for (TestCase testcase : testCaseList) {
						System.out.println("****Running Test Case " + testcase.getLabel() + "*****");
						TestCaseRunner testRunner = testcase.run(new PropertiesMap(), false);
						for (TestStepResult tcr : testRunner.getResults()) {
							System.out.println("STEP NAME : "+tcr.getTestStep().getName());
							TestStepStatus status = tcr.getStatus();
							String time = tcr.getTimeTaken() + "ms";

							System.out.println(status);
							System.out.println(time);

							if(tcr.getTestStep().getName().equalsIgnoreCase("Get All Users")){
								String request = ((MessageExchange)tcr).getRequestContent().toString();
								String response = ((MessageExchange)tcr).getResponseContent().toString();

								System.err.println(request);
								System.err.println(response);
								if(response.isEmpty()){
									flag1=true;
								}

							}
						}
						if (TestCaseRunner.Status.FINISHED == testRunner.getStatus()) {
							System.out.println("PASSED");
							reportInfo("All Users retrieved successfully through services.");
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


		}catch (Exception e) {
			//e.printStackTrace();
		}finally {
			soapShutdown();
		}
		return flag1;


	}
}


