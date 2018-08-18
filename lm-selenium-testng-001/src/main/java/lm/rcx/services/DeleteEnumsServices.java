package lm.rcx.services;

import java.util.Map;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.testsuite.TestProperty;

import lm.rcx.pojo.EnumPojo;
import lm.rcx.pojo.ReferenceDataDMApojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;

public class DeleteEnumsServices extends CommonMethods{
	public static void main(String[] args) {
		String id = null;
		try {
			new DeleteEnumsServices().runDeleteENUMWebService(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	EnumPojo ENUMDetails;

	public WsdlProject setDeleteEnumPropertyValues(WsdlProject project, String id){

		project.setPropertyValue("orgId", "58f834f6e78d57209922a92b");
		project.setPropertyValue("enumId", "id");
		return project;
	}

	public void runDeleteENUMWebService(String id) throws Exception  {
		boolean flag = false;
		String projectpath = System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/DeleteEnums-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectpath);
		EnumPojo enumPojo = new EnumPojo();
		project = setDeleteEnumPropertyValues(project, id);
		project = WebServices.runWebService(project, "DeleteEnums", "DeleteEnums");
		reportInfo("Web Service Ran Successfully.");
		Map<String, TestProperty> props = project.getProperties();
		for (String s : props.keySet()) {
		if(props.get(s).getName().equalsIgnoreCase("enumId")){
		props.get(s).getValue();
		}
		//System.out.println(props.get(s).getName() + " : " + props.get(s).getValue());
		}
		WebServices.soapShutdown();
		//return Name;

		}
		
}


