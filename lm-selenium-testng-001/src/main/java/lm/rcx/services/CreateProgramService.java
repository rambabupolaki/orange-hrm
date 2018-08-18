package lm.rcx.services;

import java.util.HashMap;
import java.util.Map;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.testsuite.TestProperty;

import lm.rcx.pojo.ProgramsPojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;
import selenium.framework.pages.LoginPage;

public class CreateProgramService extends CommonMethods{

	ProgramsPojo programspojo;
	HashMap<String, String> programValues = new HashMap<String, String>();
	public static void main(String[] args) {

		try {
			new CreateProgramService().runCreateProgramWebService();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	public WsdlProject setCreateProgramPropertyValues(WsdlProject project, ProgramsPojo programDetails,String orgID){
		String programName=programDetails.getProgramName();
		programValues.put("programName", programName);
		project.setPropertyValue("userName",LoginPage.username);
		project.setPropertyValue("password",LoginPage.password);
		project.setPropertyValue("programName", programName);
		project.setPropertyValue("orgId", orgID);
		this.programspojo = programDetails;
		return project;
	}

	public HashMap<String, String> runCreateProgramWebService() throws Exception {
		String response=null;

		String projectPath=System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/CreateProgramService-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectPath);
		ProgramsPojo programPojo=new ProgramsPojo();
		GetOrgService getOrgService=new GetOrgService();
		String orgID=getOrgService.runGetOrgDetailsWebService();
		project = setCreateProgramPropertyValues(project, programPojo,orgID);
		programValues.put("programName", programPojo.getProgramName());
		project = WebServices.runWebService(project, "Programs-Create Program", "CreateProgram");
		Map<String, TestProperty> props = project.getProperties();
		for (String s : props.keySet()) {
			if(props.get(s).getName().equalsIgnoreCase("response")){
				response=props.get(s).getValue();
			}
			//System.out.println(props.get(s).getName() + " : " + props.get(s).getValue());
		}
		String a=response.substring(response.lastIndexOf("_id") + 6); 
		String Id=a.substring(0, 24); 
		System.out.println(Id);
		programValues.put("programId", Id);
		return programValues;


	}
}