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

public class CreateDMAService extends CommonMethods{
	ReferenceDataDMApojo dmapojo;
	public static void main(String[] args) {
		
		new CreateDMAService().runCreateDMAWebService(); 
	}
	public WsdlProject setCreateDMAPropertyValues(WsdlProject project, ReferenceDataDMApojo DMADetails) {

		project.setPropertyValue("DMAName", DMADetails.getDMAName());
		project.setPropertyValue("zipCode", DMADetails.getSingleZipcode());
		project.setPropertyValue("orgId", "58f834f6e78d57209922a92b");
		this.dmapojo=DMADetails;
		return project;
	}


	public HashMap<String,String> runCreateDMAWebService(){
		String Name = null;
		HashMap<String,String> DMADetails=new HashMap<String,String>();
		
		String projectPath=System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/CreateDMAservice-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectPath);
		ReferenceDataDMApojo dmaPojo = new ReferenceDataDMApojo();
		DMADetails.put("DMAName", dmaPojo.getDMAName());
		project = setCreateDMAPropertyValues(project, dmaPojo);
		project = WebServices.runWebService(project, "CreateDMA", "CreateDMA");
		reportInfo("Web Service Ran Successfully.");
		Map<String, TestProperty> props = project.getProperties();
		for (String s : props.keySet()) {
			if(props.get(s).getName().equalsIgnoreCase("response")){
				Name=props.get(s).getValue();
			}
			//System.out.println(props.get(s).getName() + " : " + props.get(s).getValue());
		}
		
		WebServices.soapShutdown();
		return DMADetails;

		
	}
}
