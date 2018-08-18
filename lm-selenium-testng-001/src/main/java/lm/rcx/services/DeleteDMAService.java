package lm.rcx.services;

import java.util.Map;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.testsuite.TestProperty;

import lm.rcx.pojo.ReferenceDataDMApojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;

public class DeleteDMAService extends CommonMethods{
	public static void main(String[] args) {
		String id = null;
		try {
			new DeleteDMAService().runDeleteDMAWebService(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	ReferenceDataDMApojo DMADetails;

	public WsdlProject setDeleteDMAPropertyValues(WsdlProject project, String id){

		project.setPropertyValue("orgId", "58f834f6e78d57209922a92b");
		project.setPropertyValue("dmaid", "id");
		return project;
	}

	public void runDeleteDMAWebService(String id) throws Exception  {
		boolean flag = false;
		String projectpath = System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/DeleteDMAService-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectpath);
		ReferenceDataDMApojo dmaPojo = new ReferenceDataDMApojo();
		project = setDeleteDMAPropertyValues(project, id);
		project = WebServices.runWebService(project, "DeleteDMA", "DeleteDMA");
		reportInfo("Web Service Ran Successfully.");
		Map<String, TestProperty> props = project.getProperties();
		for (String s : props.keySet()) {
		if(props.get(s).getName().equalsIgnoreCase("dmaid")){
		props.get(s).getValue();
		}
		//System.out.println(props.get(s).getName() + " : " + props.get(s).getValue());
		}
		WebServices.soapShutdown();
		//return Name;

		}
		
}


