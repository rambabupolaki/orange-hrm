package lm.rcx.services;

import java.util.HashMap;
import java.util.Map;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.testsuite.TestProperty;

import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;
import selenium.framework.pages.LoginPage;

public class GetAllProducts extends CommonMethods{
	public static void main(String[] args){

		try {
			new GetAllProducts().runGetAllProductsService();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public WsdlProject setGetAllProductsPropertyValues(WsdlProject project) {
		project.setPropertyValue("orgId", orgId());
		project.setPropertyValue("userName",LoginPage.username);
		project.setPropertyValue("password",LoginPage.password);
		return project;
	}
	
	public HashMap<String,String> runGetAllProductsService() throws Exception {
		String response = null;
		HashMap<String, String> productDetails = new HashMap<String, String>();
		String projectPath = System.getProperty("user.dir")+ "/src/test/resources/ServiceXmls/GetAllProducts-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectPath);
		project = setGetAllProductsPropertyValues(project);
		project = WebServices.runWebService(project, "GetAllProducts", "Get All Products");
		reportInfo("Web Service Ran Successfully.");
		Map<String, TestProperty> props = project.getProperties();
		for (String s : props.keySet()) {
			if (props.get(s).getName().equalsIgnoreCase("response")) {
				response = props.get(s).getValue();
				System.out.println(response);
			}
			// System.out.println(props.get(s).getName() + " : " +
			// props.get(s).getValue());
		}
		String a=response.substring(response.lastIndexOf("name") + 7); 
		String name=a.split("\\,")[0] ;
		String productName=name.substring(0, name.length()-1);
		System.out.println(productName);
		productDetails.put("productName", productName);
		WebServices.soapShutdown();
		return productDetails;

	}
}
