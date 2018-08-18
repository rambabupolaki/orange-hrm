package lm.rcx.services;

import com.eviware.soapui.impl.wsdl.WsdlProject;

import lm.rcx.pojo.UsersPojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;

public class DeleteUserService extends CommonMethods{
	UsersPojo usersPojo;
	public static void main(String[] args){
		String id = null;
		try {
			new DeleteUserService().runDeleteUserWebService(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public WsdlProject setDeleteUserPropertyValues(WsdlProject project, String id){

		project.setPropertyValue("orgId", "58f834f6e78d57209922a92b");
		project.setPropertyValue("userid", id);
		
		return project;
	}

	public void runDeleteUserWebService(String id) throws Exception {
		String projectPath=System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/DeleteUserService-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectPath);
		project = setDeleteUserPropertyValues(project, id);
		project = WebServices.runWebService(project, "DeleteUser", "");

				


	}
}
