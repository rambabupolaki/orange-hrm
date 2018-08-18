package lm.rcx.services;

import java.util.HashMap;
import java.util.Map;
import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.testsuite.TestProperty;
import lm.rcx.pojo.ProgramsPojo;
import lm.rcx.pojo.RewardPolicyPojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;

public class CreateRewardPolicyService extends CommonMethods {
	RewardPolicyPojo rewardpolicyPojo;
	ProgramsPojo programsPojo;
	HashMap<String, String> rewardDetails = new HashMap<String, String>();
	public static void main(String[] args) {
		String program=null;
		try {
			new CreateRewardPolicyService().runCreateRewardPolicyWebService(program);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public WsdlProject setCreateRewardPolicyPropertyValues(WsdlProject project, RewardPolicyPojo rewardpolicyDetails,String program,String orgId) {
		project.setPropertyValue("rewardName", rewardpolicyDetails.getName());
		project.setPropertyValue("orgId", orgId);
		project.setPropertyValue("name", program);
		this.rewardpolicyPojo = rewardpolicyDetails;
		return project;
	}

	public HashMap<String, String> runCreateRewardPolicyWebService(String program) {
		String response = null;
		String projectPath = System.getProperty("user.dir")+ "/src/test/resources/ServiceXmls/CreateRewardPolicyService-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectPath);
		RewardPolicyPojo rewardpolicypojo = new RewardPolicyPojo();
		GetOrgService orgService=new GetOrgService();
		String orgId=orgService.runGetOrgDetailsWebService();
		project = setCreateRewardPolicyPropertyValues(project, rewardpolicypojo,program,orgId);
		rewardDetails.put("rewardName", rewardpolicypojo.getName());
		project = WebServices.runWebService(project, "CreateRewardPolicy", "Create Reward Policy");
		Map<String, TestProperty> props = project.getProperties();
		for (String s : props.keySet()) {
			if (props.get(s).getName().equalsIgnoreCase("response")) {
				response = props.get(s).getValue();
			}
		
		}
		String a = response.substring(response.lastIndexOf("_id") + 6);
		String Id = a.substring(0, 24);
		rewardDetails.put("rewardPoliciesId", Id);
		System.out.println(Id);
		WebServices.soapShutdown();

		return rewardDetails;
	}
}
