package lm.rcx.services;

import java.util.HashMap;
import java.util.Map;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.testsuite.TestProperty;

import lm.rcx.pojo.SecuritySetUpPojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;
import selenium.framework.pages.LoginPage;

public class CreateRuleFolderService extends CommonMethods{
	HashMap<String, String> RuleFolderDetails=new HashMap<String,String>();
	public static void main(String[] args){

		try {
			String programId=null;
			new CreateRuleFolderService().runCreateRuleFolderWebService(programId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public WsdlProject setCreateRolePropertyValues(WsdlProject project, String programId){
		String testData=generateRandomName();
		RuleFolderDetails.put("folderName", testData);
		project.setPropertyValue("userName",LoginPage.username);
		project.setPropertyValue("password",LoginPage.password);
		project.setPropertyValue("programId",programId);
		project.setPropertyValue("ruleFolderName", testData);
		project.setPropertyValue("orgID", orgId());
		
		return project;
	}

	public HashMap<String, String> runCreateRuleFolderWebService(String programId) {
		String projectPath=System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/CreateNewRuleFolderService-soapui-project.xml";		
		WsdlProject project = WebServices.getProject(projectPath);
		project = setCreateRolePropertyValues(project, programId);
		project = WebServices.runWebService(project, "AddRuleFolder", "Add RuleFolder");
		Map<String, TestProperty> props = project.getProperties();
		String response = null;
		for (String s : props.keySet()) {
			if(props.get(s).getName().equalsIgnoreCase("response")){
				response=props.get(s).getValue();
				//System.out.println(response);
			}
			//System.out.println(props.get(s).getName() + " : " + props.get(s).getValue());
		}
		String a=response.substring(response.lastIndexOf("_id") + 6); 
		String Id=a.substring(0, 24); 
		RuleFolderDetails.put("roleId", Id);
		WebServices.soapShutdown();
		return RuleFolderDetails;
		

}
}
