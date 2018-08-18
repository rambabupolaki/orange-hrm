package lm.rcx.services;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;

public class DeleteRoleService extends CommonMethods{
	public static void main(String[] args){
		String id = null;
		try {
			new DeleteRoleService().runDeleteRoleWebService(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	public WsdlProject setDeleteUserPropertyValues(WsdlProject project, String name){

		project.setPropertyValue("roleName", "RolenameGriceLinwood2076");

		return project;
	}

	public void runDeleteRoleWebService(String roleName) throws Exception {
		String projectPath=System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/DeleteRoleService-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectPath);
		project = setDeleteUserPropertyValues(project, roleName);
		project = WebServices.runWebService(project, "DeleteRole", "Delete Role");

	}
}
