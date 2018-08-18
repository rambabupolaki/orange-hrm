package lm.rcx.services;

import com.eviware.soapui.impl.wsdl.WsdlProject;

import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;

public class DeleteRewardPolicyService extends CommonMethods {
	public static void main(String[] args) {

		try {
			String rewardid = null;
			new DeleteRewardPolicyService().runDeleterewardPolicyWebService(rewardid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public WsdlProject setDeleteRewardPolicyPropertyValues(WsdlProject project, String rewardid) {

		project.setPropertyValue("orgId", "58f834f6e78d57209922a92b");
		project.setPropertyValue("rewardpolicyid", rewardid);

		return project;
	}

	public void runDeleterewardPolicyWebService(String rewardid) throws Exception {
		String projectPath = System.getProperty("user.dir")+ "/src/test/resources/ServiceXmls/DeleteRewardPolicyService-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectPath);
		project = setDeleteRewardPolicyPropertyValues(project, rewardid);
		project = WebServices.runWebService(project, "DeleteRewardpolicy", "");
		reportInfo("Web Service Ran Successfully.");

	}

}
