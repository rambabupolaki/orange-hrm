package lm.rcx.services;

import com.eviware.soapui.impl.wsdl.WsdlProject;

import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;

public class DeleteTierpolicyService extends CommonMethods{
	public static void main(String[] args){

		try {
			String tierdid = null;
			String programid=null;
			new DeleteTierpolicyService().runDeleteTierPolicyService(tierdid,programid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public WsdlProject setDeleteTierPolicyPropertyValues(WsdlProject project, String tierid ){

		project.setPropertyValue("orgId", "58f834f6e78d57209922a92b");
		project.setPropertyValue("tierpolicyId", tierid);
		
		return project;
	}
	public void runDeleteTierPolicyService(String tierid, String prigramid) throws Exception {
		String projectPath=System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/DeleteTierPolicy-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectPath);
		project = setDeleteTierPolicyPropertyValues(project, tierid);
		project = WebServices.runWebService(project, "DeleteTierPolicy", "");
		
	}
}
