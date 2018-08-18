package lm.rcx.services;

import java.util.Map;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.testsuite.TestProperty;

import lm.rcx.pojo.ReferenceDataDMApojo;
import lm.rcx.pojo.ReferenceData_Segments_Pojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;

public class DeleteSegmentsServices extends CommonMethods{
	public static void main(String[] args) {
		String id = null;
		try {
			new DeleteSegmentsServices().runDeleteSegmentWebService(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	ReferenceData_Segments_Pojo  SegmentDetails;

	public WsdlProject setDeleteSegmentPropertyValues(WsdlProject project, String id){

		project.setPropertyValue("orgId", "58f834f6e78d57209922a92b");
		project.setPropertyValue("segmentid", "id");
		return project;
	}

	public void runDeleteSegmentWebService(String id) throws Exception  {
		boolean flag = false;
		String projectpath = System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/DeleteSegment-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectpath);
		ReferenceData_Segments_Pojo segmentpojo = new ReferenceData_Segments_Pojo();
		project = setDeleteSegmentPropertyValues(project, id);
		project = WebServices.runWebService(project, "DeleteSegment", "DeleteSegment");
		reportInfo("Web Service Ran Successfully.");
		Map<String, TestProperty> props = project.getProperties();
		for (String s : props.keySet()) {
		if(props.get(s).getName().equalsIgnoreCase("segmentid")){
		props.get(s).getValue();
		}
		//System.out.println(props.get(s).getName() + " : " + props.get(s).getValue());
		}
		WebServices.soapShutdown();
		//return Name;

		}
		
}


