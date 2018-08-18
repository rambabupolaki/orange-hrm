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
import lm.rcx.pojo.ReferenceData_Segments_Pojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;

public class CreateSegmentsServices extends CommonMethods {
	ReferenceData_Segments_Pojo segmentpojo;

	public static void main(String[] args) {

		new CreateSegmentsServices().runCreateSegmentWebService();
	}

	public WsdlProject setCreateSegmentPropertyValues(WsdlProject project, ReferenceData_Segments_Pojo SegmentDetails) {

		project.setPropertyValue("segmentName", SegmentDetails.getSegmentName());
		project.setPropertyValue("description", SegmentDetails.getDescription());
		project.setPropertyValue("orgId", "58f834f6e78d57209922a92b");
		this.segmentpojo = SegmentDetails;
		return project;
	}

	public HashMap<String, String> runCreateSegmentWebService() {
		String Name = null;
		HashMap<String, String> SegmentDetails = new HashMap<String, String>();

		String projectPath = System.getProperty("user.dir")
				+ "/src/test/resources/ServiceXmls/AddSegment-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectPath);
		ReferenceData_Segments_Pojo segmentpojo = new ReferenceData_Segments_Pojo();
		SegmentDetails.put("segmentName", segmentpojo.getSegmentName());
		SegmentDetails.put("description", segmentpojo.getDescription());

		project = setCreateSegmentPropertyValues(project, segmentpojo);
		project = WebServices.runWebService(project, "AddSegment", "AddSegment");
		reportInfo("Web Service Ran Successfully.");
		Map<String, TestProperty> props = project.getProperties();
		for (String s : props.keySet()) {
			if (props.get(s).getName().equalsIgnoreCase("response")) {
				Name = props.get(s).getValue();
			}
			// System.out.println(props.get(s).getName() + " : " +
			// props.get(s).getValue());
		}

		WebServices.soapShutdown();
		return SegmentDetails;

	}
}
