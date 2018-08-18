package lm.rcx.services;

import java.util.HashMap;
import java.util.Map;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.testsuite.TestProperty;

import lm.rcx.pojo.ProgramsPojo;
import lm.rcx.pojo.TierPoliciesPojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;

public class CreateTierPolicyService extends CommonMethods{
	TierPoliciesPojo tierPolicyPojo;
	ProgramsPojo programsPojo;

	public static void main(String[] args) {
		String programId=null;
		try {
			new CreateTierPolicyService().runCreateTierPolicyWebService(programId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public WsdlProject setCreateTierPolicyPropertyValues(WsdlProject project, TierPoliciesPojo tierPolicyDetails,String programId,String orgId){

		project.setPropertyValue("tierName" , tierPolicyDetails.getName());
		project.setPropertyValue("orgId", orgId);
		project.setPropertyValue("programId", programId);
		project.setPropertyValue("levelName", tierPolicyDetails.getName());
		this.tierPolicyPojo = tierPolicyDetails;
		return project;
	}

	public HashMap<String, String> runCreateTierPolicyWebService(String programId) throws Exception {
		String response=null;
		String projectPath=System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/CreateTierPolicyService-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectPath);
		TierPoliciesPojo tierPolicyPojo=new TierPoliciesPojo();
		GetOrgService getOrgService=new GetOrgService();
		String orgID=getOrgService.runGetOrgDetailsWebService();
		project = setCreateTierPolicyPropertyValues(project, tierPolicyPojo, programId,orgID);
		HashMap<String, String> tierPolicyDetails = new HashMap<String, String>();
		tierPolicyDetails.put("tierName", tierPolicyPojo.getName());
		tierPolicyDetails.put("tierLevel", tierPolicyPojo.getName());
		project = WebServices.runWebService(project, "CreateTierPolicy", "Create Tier Policy");
		// Create a WsdlProject instance by specifying the project absolute path
		Map<String, TestProperty> props = project.getProperties();
		for (String s : props.keySet()) {
			if(props.get(s).getName().equalsIgnoreCase("response")){
				response=props.get(s).getValue();
			}
			//System.out.println(props.get(s).getName() + " : " + props.get(s).getValue());
		}
		String a=response.substring(response.lastIndexOf("_id") + 6); 
		String Id=a.substring(0, 24); 
		tierPolicyDetails.put("tierPolicyId", Id);
		return tierPolicyDetails;
	}


}
