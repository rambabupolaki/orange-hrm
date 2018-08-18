	package lm.rcx.services;

	import java.util.Map;
	import com.eviware.soapui.impl.wsdl.WsdlProject;
	import com.eviware.soapui.model.testsuite.TestProperty;
	import selenium.framework.common.CommonMethods;
	import selenium.framework.common.WebServices;
	import selenium.framework.pages.LoginPage;

	public class DeleteRulesService extends CommonMethods{
		public static void main(String[] args) {
			String id = null;
			try {
				new DeleteRulesService().runDeleteRulesService(id);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public WsdlProject setDeleteRulesPropertyValues(WsdlProject project, String id){
			project.setPropertyValue("userName",LoginPage.username);
			project.setPropertyValue("password",LoginPage.password);
			project.setPropertyValue("orgId", orgId());
			project.setPropertyValue("ruleId", id);
			return project;
		}

		public void runDeleteRulesService(String id) throws Exception  {
			String projectpath = System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/DeleteRules-soapui-project.xml";
			WsdlProject project = WebServices.getProject(projectpath);
			project = setDeleteRulesPropertyValues(project, id);
			project = WebServices.runWebService(project, "DeleteRules", "");
			reportInfo("Web Service Ran Successfully.");
	}
	}