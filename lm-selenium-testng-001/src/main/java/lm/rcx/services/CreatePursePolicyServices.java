package lm.rcx.services;
import java.util.HashMap;
import java.util.Map;
import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.testsuite.TestProperty;

import lm.rcx.pojo.PursePoliciesPojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;
import selenium.framework.pages.LoginPage;

public class CreatePursePolicyServices extends CommonMethods{
	PursePoliciesPojo PursePoliciesPojo;

	public static void main(String[] args){

		try {
			String programId = null;
			new CreatePursePolicyServices().runCreatePursePolicyWebService(programId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



	public WsdlProject setCreatePursePolicyPropertyValues(WsdlProject project, PursePoliciesPojo PursePoliciesDetails,String orgID,String programId){
		project.setPropertyValue("userName",LoginPage.username);
		project.setPropertyValue("password",LoginPage.password);
		project.setPropertyValue("programId", programId);
		project.setPropertyValue("purseName", PursePoliciesDetails.getName());
		project.setPropertyValue("name", PursePoliciesDetails.getName());
		project.setPropertyValue("org", orgID);

		this.PursePoliciesPojo = PursePoliciesDetails;
		return project;
	}

	public HashMap<String,String> runCreatePursePolicyWebService(String programId){
		HashMap<String,String> PursePolicyDetails=new HashMap<String,String>();
		String response = null;
		String projectPath=System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/CreatePursePolicy-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectPath);
		PursePoliciesPojo pursepoliciespojo=new PursePoliciesPojo();
		PursePolicyDetails.put("purseName", pursepoliciespojo.getName());
		GetOrgService getOrgService=new GetOrgService();
		String orgID=getOrgService.runGetOrgDetailsWebService();
		project = setCreatePursePolicyPropertyValues(project, pursepoliciespojo,orgID,programId);
		project = WebServices.runWebService(project, "CreatePursePolicy", "CreatePursePolicy");
		Map<String, TestProperty> props = project.getProperties();
		for (String s : props.keySet()) {
			if(props.get(s).getName().equalsIgnoreCase("response")){
				response=props.get(s).getValue();
			}
			//System.out.println(props.get(s).getName() + " : " + props.get(s).getValue());
		}
		String a=response.substring(response.lastIndexOf("_id") + 6); 
		String Id=a.substring(0, 24); 
		PursePolicyDetails.put("PursePoliciesId", Id);
		WebServices.soapShutdown();
		return PursePolicyDetails;


	}
}
