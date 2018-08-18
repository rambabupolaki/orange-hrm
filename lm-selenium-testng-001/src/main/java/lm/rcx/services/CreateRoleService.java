package lm.rcx.services;

import java.util.HashMap;
import java.util.Map;
import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.testsuite.TestProperty;
import lm.rcx.pojo.SecuritySetUpPojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;

public class CreateRoleService extends CommonMethods{
	SecuritySetUpPojo secutirySetUp;
	public static void main(String[] args){

		try {
			new CreateRoleService().runCreateRoleWebService();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public WsdlProject setCreateRolePropertyValues(WsdlProject project, SecuritySetUpPojo securitySetUpDetails){

		project.setPropertyValue("roleName", securitySetUpDetails.getRoleName());
		
		this.secutirySetUp = securitySetUpDetails;
		return project;
	}

	public HashMap<String, String> runCreateRoleWebService() {
		String response=null;

		String projectPath=System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/CreateRoleService-soapui-project.xml";		
		WsdlProject project = WebServices.getProject(projectPath);
		SecuritySetUpPojo securityPojo=new SecuritySetUpPojo();
		project = setCreateRolePropertyValues(project, securityPojo);
		HashMap<String, String> roleDetails = new HashMap<String, String>();
		roleDetails.put("roleName", securityPojo.getRoleName());
		project = WebServices.runWebService(project, "CreateRole", "Create Role");
		Map<String, TestProperty> props = project.getProperties();
		for (String s : props.keySet()) {
			if(props.get(s).getName().equalsIgnoreCase("response")){
				response=props.get(s).getValue();
			}
			//System.out.println(props.get(s).getName() + " : " + props.get(s).getValue());
		}
		String a=response.substring(response.lastIndexOf("_id") + 6); 
		String Id=a.substring(0, 24); 
		roleDetails.put("roleId", Id);
		WebServices.soapShutdown();
		return roleDetails;
		

}
}
