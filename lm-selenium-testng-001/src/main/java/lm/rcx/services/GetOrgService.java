package lm.rcx.services;

import java.util.Map;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.testsuite.TestProperty;

import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;
import selenium.framework.pages.LoginPage;

public class GetOrgService extends CommonMethods{
	public static void main(String[] args) {

		new GetOrgService().runGetOrgDetailsWebService(); 
	}
	public WsdlProject setGetOrgDetailsPropertyValues(WsdlProject project) {
		project.setPropertyValue("userName",LoginPage.username);
		project.setPropertyValue("password",LoginPage.password);
		return project;
	}

	public String runGetOrgDetailsWebService(){
		String response = null;
		String OrgID;
		String projectPath=System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/Get-Org-Details-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectPath);
		project = setGetOrgDetailsPropertyValues(project);
		project = WebServices.runWebService(project, "Get Org Details", "GetOrgDetails");
		reportInfo("Web Service Ran Successfully.");
		Map<String, TestProperty> props = project.getProperties();
		for (String s : props.keySet()) {
			if(props.get(s).getName().equalsIgnoreCase("response")){
				response=props.get(s).getValue();
			}
			//System.out.println(props.get(s).getName() + " : " + props.get(s).getValue());
		}
		String a=response.substring(response.lastIndexOf("_id") + 6); 
		OrgID=a.substring(0, 24); 
		System.out.println(OrgID);
		WebServices.soapShutdown();
		return OrgID;


	}
}
