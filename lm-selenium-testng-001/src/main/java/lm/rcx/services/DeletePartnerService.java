package lm.rcx.services;

import com.eviware.soapui.impl.wsdl.WsdlProject;

import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;

public class DeletePartnerService extends CommonMethods{
	public static void main(String[] args) {

		 String partnerid=null;
		new DeletePartnerService().runDeletePartnersWebServices(partnerid); 
	}
	public WsdlProject setCreatePartnersPropertyValues(WsdlProject project,String partnerId) {

		project.setPropertyValue("partnerid",partnerId);
		
		return project;
	}


	public void runDeletePartnersWebServices(String partnerid){
		String projectPath=System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/DeletePartnerService-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectPath);
		project = setCreatePartnersPropertyValues(project,partnerid);
		project = WebServices.runWebService(project, "DeletePartner", "Delete Partner");
		reportInfo("Web Service Ran Successfully.");
		
		WebServices.soapShutdown();

		
	}
}
