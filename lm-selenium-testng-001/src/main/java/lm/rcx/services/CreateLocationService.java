
package lm.rcx.services;

import java.util.HashMap;
import java.util.Map;
import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.testsuite.TestProperty;
import lm.rcx.pojo.LocationPojo;
import lm.rcx.pojo.ReferenceDataDMApojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;

public class CreateLocationService extends CommonMethods {
	LocationPojo locationpojo;
	public static void main(String[] args) {
		new CreateLocationService().runCreateLocationsWebService();
	}

	

	// String path="user.dir") + "/CreateDMAservice-soapui-project.xml";
	public WsdlProject setCreateLocationsPropertyValues(WsdlProject project, LocationPojo locationsDetails) {

		project.setPropertyValue("locationName", locationsDetails.getName());
		project.setPropertyValue("description", locationsDetails.getdescription());
		project.setPropertyValue("number", locationsDetails.getNumber());
		project.setPropertyValue("orgId", "58f834f6e78d57209922a92b");
		this.locationpojo = locationsDetails;
		return project;
	}

	public HashMap<String, String> runCreateLocationsWebService() {
		HashMap<String, String> locationsDetails = new HashMap<String, String>();
		String Name = null;
		String projectPath = System.getProperty("user.dir")
				+ "/src/test/resources/ServiceXmls/AddLocation-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectPath);
		LocationPojo locationPojo = new LocationPojo();
		locationsDetails.put("locationName", locationPojo.getName());
		project = setCreateLocationsPropertyValues(project, locationPojo);
		project = WebServices.runWebService(project, "AddLocation", "AddLocation");
		reportInfo("Web Service Ran Successfully.");
		Map<String, TestProperty> props = project.getProperties();
		for (String s : props.keySet()) {
			if (props.get(s).getName().equalsIgnoreCase("locationName")) {
				Name = props.get(s).getValue();
			}
			// System.out.println(props.get(s).getName() + " : " +
			// props.get(s).getValue());
		}
		WebServices.soapShutdown();
		return locationsDetails;

	}
}
