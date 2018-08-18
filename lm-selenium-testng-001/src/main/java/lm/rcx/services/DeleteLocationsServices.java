package lm.rcx.services;

import java.util.Map;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.testsuite.TestProperty;

import lm.rcx.pojo.EnumPojo;
import lm.rcx.pojo.LocationPojo;
import lm.rcx.pojo.ReferenceDataDMApojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;

public class DeleteLocationsServices extends CommonMethods{
	public static void main(String[] args) {
		String id = null;
		try {
			new DeleteLocationsServices().runDeleteLocationWebService(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	LocationPojo locationsDetails;

	public WsdlProject setDeleteLocationPropertyValues(WsdlProject project, String id){

		project.setPropertyValue("orgId", "58f834f6e78d57209922a92b");
		project.setPropertyValue("locationId", "id");
		return project;
	}

	public void runDeleteLocationWebService(String id) throws Exception  {
		boolean flag = false;
		String projectpath = System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/DeleteLocation-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectpath);
		LocationPojo locationPojo = new LocationPojo();
		project = setDeleteLocationPropertyValues(project, id);
		project = WebServices.runWebService(project, "DeleteLocation", "DeleteLocation");
		reportInfo("Web Service Ran Successfully.");
		Map<String, TestProperty> props = project.getProperties();
		for (String s : props.keySet()) {
		if(props.get(s).getName().equalsIgnoreCase("locationId")){
		props.get(s).getValue();
		}
		//System.out.println(props.get(s).getName() + " : " + props.get(s).getValue());
		}
		WebServices.soapShutdown();
		//return Name;

		}
		
}


