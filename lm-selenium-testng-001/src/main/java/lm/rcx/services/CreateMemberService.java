package lm.rcx.services;

import java.util.HashMap;
import java.util.Map;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.testsuite.TestProperty;

import lm.rcx.pojo.MemberPojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;
import selenium.framework.pages.LoginPage;

public class CreateMemberService extends CommonMethods{
	MemberPojo membersPojo;

	public static void main(String[] args){
		String programId=null;
		try {
			new CreateMemberService().runCreateMemberWebService(programId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public WsdlProject setCreateMemberPropertyValues(WsdlProject project, MemberPojo memberDetails,String orgID,String programId){
		project.setPropertyValue("userName",LoginPage.username);
		project.setPropertyValue("password",LoginPage.password);
		project.setPropertyValue("firstName", memberDetails.getFirstName());
		project.setPropertyValue("lastName", memberDetails.getLastName());
		project.setPropertyValue("enrollSource", memberDetails.getEnrollSource());
		project.setPropertyValue("enrollChannel", memberDetails.getEnrollChannel());
		project.setPropertyValue("memberType", memberDetails.getMemberType());
		project.setPropertyValue("aquiChannel", "Web");
		project.setPropertyValue("orgId", orgID);
		project.setPropertyValue("programId", programId);
		this.membersPojo = memberDetails;
		return project;
	}

	public HashMap<String, String> runCreateMemberWebService(String programId) {
		String response=null;

		String projectPath=System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/CreateMemberService-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectPath);
		MemberPojo pj=new MemberPojo();
		GetOrgService getOrgService=new GetOrgService();
		String orgID=getOrgService.runGetOrgDetailsWebService();
		project = setCreateMemberPropertyValues(project, pj,orgID,programId);
		HashMap<String, String> memberValues = new HashMap<String, String>();
		memberValues.put("firstName", pj.getFirstName());
		memberValues.put("lastName", pj.getLastName());
		memberValues.put("type", pj.getMemberType());
		project = WebServices.runWebService(project, "CreateMember", "Create Member");

		Map<String, TestProperty> props = project.getProperties();
		for (String s : props.keySet()) {
			if(props.get(s).getName().equalsIgnoreCase("response")){
				response=props.get(s).getValue();
			}
			//System.out.println(props.get(s).getName() + " : " + props.get(s).getValue());
		}
		String a=response.substring(response.lastIndexOf("_id") + 6);
		String Id=a.substring(0, 24);
		memberValues.put("memberId", Id);
		return memberValues;				
	}
}
