package lm.rcx.services;

import java.util.HashMap;
import java.util.Map;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.testsuite.TestProperty;

import lm.rcx.pojo.ReferenceDataDMApojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;
import selenium.framework.pages.LoginPage;

public class AddConditionAction extends CommonMethods {
	ReferenceDataDMApojo dmapojo;
	public static void main(String[] args) {
		
		String programId=null;
		new AddConditionAction().runCreateConditionActionWebService(programId); 
	}
	public WsdlProject setCreateDMAPropertyValues(WsdlProject project,String programId,String orgID) {
		project.setPropertyValue("userName",LoginPage.username);
		project.setPropertyValue("password",LoginPage.password);
		project.setPropertyValue("ruleName", generateRandomName());
		project.setPropertyValue("programId", programId);
		project.setPropertyValue("effectiveFrom", getCurrentDate1());
		project.setPropertyValue("orgId", orgID);
		return project;
	}

	public HashMap<String,String> runCreateConditionActionWebService(String programId){
		HashMap<String,String> DMADetails=new HashMap<String,String>();
		String projectPath=System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/AddConditionAndActionService-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectPath);
		ReferenceDataDMApojo dmaPojo = new ReferenceDataDMApojo();
		DMADetails.put("DMAName", dmaPojo.getDMAName());
		GetOrgService getOrgService=new GetOrgService();
		String orgID=getOrgService.runGetOrgDetailsWebService();
		project = setCreateDMAPropertyValues(project, programId,orgID);
		project = WebServices.runWebService(project, "AddConditionAction", "Create Condition Action");
		reportInfo("Web Service Ran Successfully.");
		Map<String, TestProperty> props = project.getProperties();
		for (String s : props.keySet()) {
			if(props.get(s).getName().equalsIgnoreCase("response")){
			}
			//System.out.println(props.get(s).getName() + " : " + props.get(s).getValue());
		}
		
		WebServices.soapShutdown();
		return DMADetails;

		
	}
}
