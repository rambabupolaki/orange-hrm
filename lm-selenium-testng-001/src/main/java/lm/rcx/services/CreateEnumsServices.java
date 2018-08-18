
package lm.rcx.services;

import java.util.HashMap;
import java.util.Map;
import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.testsuite.TestProperty;

import lm.rcx.pojo.EnumPojo;
import lm.rcx.pojo.ReferenceDataDMApojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;

public class CreateEnumsServices extends CommonMethods {
	EnumPojo enumPojo;

	public static void main(String[] args) {

		new CreateEnumsServices().runCreateEnumWebService();
	}

	// String path="user.dir") + "/CreateDMAservice-soapui-project.xml";
	public WsdlProject setCreateEnumsPropertyValues(WsdlProject project, EnumPojo enumsDetails) {

		project.setPropertyValue("enumType", enumsDetails.getType());
		project.setPropertyValue("enumValue", enumsDetails.getValue());
		project.setPropertyValue("enumLang", "en");
		project.setPropertyValue("orgId", "58f834f6e78d57209922a92b");
		this.enumPojo = enumsDetails;
		return project;
	}

	public HashMap<String, String> runCreateEnumWebService() {
		String Name = null;
		HashMap<String, String> enumsDetails = new HashMap<String, String>();
		String projectPath = System.getProperty("user.dir")
				+ "/src/test/resources/ServiceXmls/AddEnums-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectPath);
		EnumPojo enumPojo = new EnumPojo();
		enumsDetails.put("enumType", enumPojo.getType());
		project = setCreateEnumsPropertyValues(project, enumPojo);
		project = WebServices.runWebService(project, "AddEnums", "AddEnums");
		reportInfo("Web Service Ran Successfully.");
		Map<String, TestProperty> props = project.getProperties();
		for (String s : props.keySet()) {
			if (props.get(s).getName().equalsIgnoreCase("enumType")) {
				Name = props.get(s).getValue();
			}
			// System.out.println(props.get(s).getName() + " : " +
			// props.get(s).getValue());
		}
		WebServices.soapShutdown();
		return enumsDetails;

	}
}
