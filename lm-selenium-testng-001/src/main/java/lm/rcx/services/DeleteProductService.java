package lm.rcx.services;

import java.util.Map;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.testsuite.TestProperty;

import lm.rcx.pojo.Products_Pojo;
import lm.rcx.pojo.ReferenceDataDMApojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;

public class DeleteProductService extends CommonMethods{
	public static void main(String[] args) {
		String id = null;
		try {
			new DeleteProductService().runDeleteProductWebService(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	Products_Pojo productDetails;

	public WsdlProject setDeleteProductPropertyValues(WsdlProject project, String id){
		project.setPropertyValue("orgId", "58f834f6e78d57209922a92b");
		project.setPropertyValue("productid", "id");
		return project;
	}

	public void runDeleteProductWebService(String id) throws Exception  {
		boolean flag = false;
		String projectpath = System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/DeleteProductService-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectpath);
		Products_Pojo productsPojo = new Products_Pojo();
		project = setDeleteProductPropertyValues(project, id);
		project = WebServices.runWebService(project, "DeleteProduct", "");
		reportInfo("Web Service Ran Successfully.");
	
		WebServices.soapShutdown();
		//return Name;

		}
		
}


