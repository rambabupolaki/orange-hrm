package lm.rcx.services;

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

import lm.rcx.pojo.MemberPojo;
import lm.rcx.pojo.ReferenceDataDMApojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;

public class GetAllMembersService extends CommonMethods{
	MemberPojo memberPojo;

	public static void main(String[] args) {

		try {
			new GetAllMembersService().runGetAllMembersWebService();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public WsdlProject setCreateDMAPropertyValues(WsdlProject project ) {

		project.setPropertyValue("orgId", "58f834f6e78d57209922a92b");
		return project;
	}


	

	

	public boolean runGetAllMembersWebService() throws Exception {
		boolean flag = false;
		boolean flag1=false;
		String projectPath=System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/GetAllMembers-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectPath);
		project = setCreateDMAPropertyValues(project);
		project = WebServices.runWebService(project, "GetAllMembers", "GetAllMembers");
		reportInfo("Web Service Ran Successfully.");
		Map<String, TestProperty> props = project.getProperties();
		for (String s : props.keySet()) {
			if(props.get(s).getName().equalsIgnoreCase("response")){
				props.get(s).getValue();
			if(props.get(s).getValue()==null){
				flag1=true;
				}
			}
			//System.out.println(props.get(s).getName() + " : " + props.get(s).getValue());
		}
		
		WebServices.soapShutdown();
		return flag1;
	}
}
