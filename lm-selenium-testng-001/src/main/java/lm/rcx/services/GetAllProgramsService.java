package lm.rcx.services;

import java.util.Map;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.testsuite.TestProperty;

import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;
import selenium.framework.pages.LoginPage;

public class GetAllProgramsService extends CommonMethods{


	public static void main(String[] args){

		try {
			new GetAllProgramsService().runGetAllProgramsWebService();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public WsdlProject setGetAllProgramsPropertyValues(WsdlProject project,String orgID) {
		project.setPropertyValue("userName",LoginPage.username);
		project.setPropertyValue("password",LoginPage.password);
		project.setPropertyValue("orgId", orgID);
		return project;
	}

	public boolean runGetAllProgramsWebService() throws Exception {
		boolean flag1=false;

		String projectPath=System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/GetAllPrograms-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectPath);
		GetOrgService getOrgService=new GetOrgService();
		String orgID=getOrgService.runGetOrgDetailsWebService();
		project =setGetAllProgramsPropertyValues(project,orgID);
		project = WebServices.runWebService(project, "GetAllPrograms", "Get All Programs");
		Map<String, TestProperty> props = project.getProperties();
		for (String s : props.keySet()) {
			if(props.get(s).getName().equalsIgnoreCase("response")){
				props.get(s).getValue();
				if(props.get(s).getValue()==null){
					flag1=true;
				}
			}
			//System.out.println(props.get(s).getName() + " : " + props.get(s).getValue());
		}

		WebServices.soapShutdown();	
		return flag1;


	}

}