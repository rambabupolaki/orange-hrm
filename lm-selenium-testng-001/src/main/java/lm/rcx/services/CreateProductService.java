package lm.rcx.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.eviware.soapui.SoapUI;
import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.support.http.SoapUIMultiThreadedHttpConnectionManager;
import com.eviware.soapui.model.iface.MessageExchange;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestCase;
import com.eviware.soapui.model.testsuite.TestCaseRunner;
import com.eviware.soapui.model.testsuite.TestProperty;
import com.eviware.soapui.model.testsuite.TestStepResult;
import com.eviware.soapui.model.testsuite.TestSuite;
import com.eviware.soapui.model.testsuite.TestStepResult.TestStepStatus;

import lm.rcx.pojo.Products_Pojo;
import lm.rcx.pojo.ReferenceDataDMApojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;

public class CreateProductService extends CommonMethods{
	Products_Pojo productsPojo;
	public static void main(String[] args){

		try {
			new CreateProductService().runCreateProductWebService();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public WsdlProject setCreateProductPropertyValues(WsdlProject project, Products_Pojo productDetails){

		project.setPropertyValue("productName", productDetails.getName());
		project.setPropertyValue("SKU", productDetails.getProductName());
		project.setPropertyValue("orgId", "58f834f6e78d57209922a92b");
		this.productsPojo = productDetails;
		return project;
	}

	public HashMap<String, String> runCreateProductWebService() throws Exception {
		String Name = null;
		HashMap<String,String> productDetails=new HashMap<String,String>();
		
		String projectPath=System.getProperty("user.dir") + "/src/test/resources/ServiceXmls//CreateProductService-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectPath);
		Products_Pojo productpojo = new Products_Pojo();
		productDetails.put("productName", productpojo.getName());
		project = setCreateProductPropertyValues(project, productpojo);
		project = WebServices.runWebService(project, "Create New Product", "CreateProduct");
		reportInfo("Web Service Ran Successfully.");
		Map<String, TestProperty> props = project.getProperties();
		for (String s : props.keySet()) {
			if(props.get(s).getName().equalsIgnoreCase("response")){
				Name=props.get(s).getValue();
			}
			//System.out.println(props.get(s).getName() + " : " + props.get(s).getValue());
		}
		
		WebServices.soapShutdown();
		return productDetails;

		
	}
}
