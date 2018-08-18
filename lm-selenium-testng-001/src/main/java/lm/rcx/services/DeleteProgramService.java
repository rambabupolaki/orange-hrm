package lm.rcx.services;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import selenium.framework.common.WebServices;
import selenium.framework.pages.LoginPage;

public class DeleteProgramService {
	public static void main(String[] args) {
		String programId=null;
		try {
			new DeleteProgramService().runDeleteProgramWebService(programId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	public WsdlProject setCreateProgramPropertyValues(WsdlProject project, String programId,String orgID){
		project.setPropertyValue("userName",LoginPage.username);
		project.setPropertyValue("password",LoginPage.password);
		project.setPropertyValue("programId", programId);
		project.setPropertyValue("orgId", orgID);
		return project;
	}

	public void runDeleteProgramWebService(String programId) throws Exception {
		String projectPath=System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/DeleteProgramService-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectPath);
		GetOrgService getOrgService=new GetOrgService();
		String orgID=getOrgService.runGetOrgDetailsWebService();
		project = setCreateProgramPropertyValues(project,programId,orgID);
		project = WebServices.runWebService(project, "DeleteProgram", "");



	}
}
