package lm.rcx.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.eviware.soapui.SoapUI;
import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.support.http.SoapUIMultiThreadedHttpConnectionManager;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestCase;
import com.eviware.soapui.model.testsuite.TestProperty;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.model.testsuite.TestSuite;

import lm.rcx.pojo.MemberPojo;
import selenium.framework.common.CommonMethods;

public class DeleteMemberService extends CommonMethods{

	
	MemberPojo memberPojo;

	public static void main(String[] args){

		String projectPath=System.getProperty("user.dir") + "/ReactorCX-SoapUI-Selenium.xml";
		try {
			new DeleteMemberService().runDeleteMemberService(projectPath);
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

	
	public WsdlProject setCreateMemberPropertyValues(WsdlProject project, MemberPojo memberDetails){
	
		project.setPropertyValue("firstName", memberDetails.getFirstName());
		project.setPropertyValue("lastName", memberDetails.getLastName());
		project.setPropertyValue("memberType", memberDetails.getMemberType());
		project.setPropertyValue("orgId", "58f834f6e78d57209922a92b");
		project.setPropertyValue("enrollSource", memberDetails.getEnrollSource());
		project.setPropertyValue("enrollChannel", memberDetails.getEnrollChannel());
		this.memberPojo = memberDetails;
		return project;
	}
	
	public void runDeleteMemberService(String projectPath) throws Exception {
		boolean flag = false;

		WsdlProject project = getProject(projectPath);
        MemberPojo mp = new MemberPojo();
		
		project = setCreateMemberPropertyValues(project, mp);
		HashMap<String, String> memberValues = new HashMap<String, String>();
		memberValues.put("FirstName", mp.getFirstName());
		memberValues.put("LastName", mp.getLastName());
		memberValues.put("MemberType", mp.getMemberType());
		
		// Create a WsdlProject instance by specifying the project absolute path
		try {

			Map<String, TestProperty> props = project.getProperties();

			for (String s : props.keySet()) {
				System.out.println(props.get(s).getName() + " : " + props.get(s).getValue());

			}

			// retrieve all test suite from project
			List<TestSuite> testSuiteList = project.getTestSuiteList();

			// Iterate all TestSuites of project
			for (TestSuite ts : testSuiteList) {

				String suiteName = "Members-Create Member";
				if (ts.getName().equalsIgnoreCase(suiteName)) {

					System.out.println("****Running Test suite " + ts.getLabel() + "********");

					// Retrieve all TestCases from a particular TestSuite
					List<TestCase> testCaseList = (List<TestCase>) ts.getTestCaseList();

					// Iterate all TestCases of the particular TestSuite
					for (TestCase testcase : testCaseList) {

						String testCaseName = "DeleteMember";
						if (testcase.getName().equalsIgnoreCase(testCaseName)) {
							System.out.println("****Running Test Case " + testcase.getLabel() + "*****");
						
							// Run the specific TestCase

							TestRunner testRunner = testcase.run(new PropertiesMap(), false);
							// verify where test case pass or not

							if (TestRunner.Status.FINISHED == testRunner.getStatus()) {
								System.out.println("PASSED");
								reportInfo("member deleted successfully through services.");
							}
						
						flag = true;
						break;
						}
					}

					if (flag) {
						break;
					}
				}
				Thread.sleep(20000);
			}

			Map<String, TestProperty> propss = project.getProperties();

			for (String s : propss.keySet()) {
				System.out.println(propss.get(s).getName() + " : " + propss.get(s).getValue());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			soapShutdown();
		}

	}
}
