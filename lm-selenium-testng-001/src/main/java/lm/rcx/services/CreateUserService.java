package lm.rcx.services;

import java.util.HashMap;
import java.util.Map;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.testsuite.TestProperty;

import lm.rcx.pojo.UsersPojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;

public class CreateUserService extends CommonMethods{
	UsersPojo usersPojo;
	public static void main(String[] args){

		try {
			new CreateUserService().runCreateUserWebService();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public WsdlProject setCreateUserPropertyValues(WsdlProject project, UsersPojo userDetails){

		project.setPropertyValue("login",userDetails.getName());
		project.setPropertyValue("emailID", userDetails.getEmail());
		project.setPropertyValue("orgId", "58f834f6e78d57209922a92b");
		this.usersPojo = userDetails;
		return project;
	}

	public HashMap<String, String> runCreateUserWebService() throws Exception {
		String response=null;

		String projectPath=System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/CreateUserService-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectPath);
		UsersPojo uj=new UsersPojo();
		project = setCreateUserPropertyValues(project, uj);
		project = WebServices.runWebService(project, "CreateNewUser", "Create New user");
		HashMap<String, String> userValues = new HashMap<String, String>();
		userValues.put("Name", uj.getName());
		userValues.put("Email", uj.getEmail());
		Map<String, TestProperty> props = project.getProperties();
		for (String s : props.keySet()) {
			if(props.get(s).getName().equalsIgnoreCase("response")){
				response=props.get(s).getValue();
			}
		}
		String a=response.substring(response.lastIndexOf("_id") + 6); 
		String Id=a.substring(0, 24); 
		userValues.put("userId", Id);
		System.out.println(Id);
		WebServices.soapShutdown();
		return userValues;



	}
}

