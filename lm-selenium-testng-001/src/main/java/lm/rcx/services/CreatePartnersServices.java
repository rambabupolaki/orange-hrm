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

import lm.rcx.pojo.PartnersPojo;
import lm.rcx.pojo.Products_Pojo;
	import lm.rcx.pojo.ReferenceDataDMApojo;
	import selenium.framework.common.CommonMethods;
	import selenium.framework.common.WebServices;

	public class CreatePartnersServices extends CommonMethods{
		PartnersPojo partnerspojo;
		
		public static void main(String[] args) {

			 String programid=null;
			new CreatePartnersServices().runCreatePartnersWebServices(programid); 
		}
		public WsdlProject setCreatePartnersPropertyValues(WsdlProject project, PartnersPojo PartnersDetails,String programId) {

			project.setPropertyValue("partnerstatus","Active");
			project.setPropertyValue("partnerName", PartnersDetails.getName());
			project.setPropertyValue("partnerCode", PartnersDetails.getCode());
			project.setPropertyValue("orgId", "58f834f6e78d57209922a92b");
			project.setPropertyValue("programId", programId);
			this.partnerspojo=PartnersDetails;
			return project;
		}


		public HashMap<String,String> runCreatePartnersWebServices(String programid){
			String response = null;
			HashMap<String,String> PartnersDetails=new HashMap<String,String>();
			
			String projectPath=System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/CreatePartnersService-soapui-project.xml";
			WsdlProject project = WebServices.getProject(projectPath);
			PartnersPojo partnerspojo = new PartnersPojo();
			PartnersDetails.put("partnerstatus", "Active");
			PartnersDetails.put("partnerName", partnerspojo.getName());
			PartnersDetails.put("partnerCode", partnerspojo.getCode());
			project = setCreatePartnersPropertyValues(project, partnerspojo,programid);
			project = WebServices.runWebService(project, "CreatePartners", "CreatePartners");
			reportInfo("Web Service Ran Successfully.");
			Map<String, TestProperty> props = project.getProperties();
			for (String s : props.keySet()) {
				if(props.get(s).getName().equalsIgnoreCase("response")){
					response=props.get(s).getValue();
				}
			}
			@SuppressWarnings("null")
			String a=response.substring(response.lastIndexOf("_id") + 6); 
			String Id=a.substring(0, 24); 
			System.out.println(Id);
			PartnersDetails.put("partnerId", Id);
			WebServices.soapShutdown();
			return PartnersDetails;

			
		}
	}



