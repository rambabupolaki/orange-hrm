	package lm.rcx.services;

	import java.util.HashMap;
	import java.util.Map;
	import com.eviware.soapui.impl.wsdl.WsdlProject;
	import com.eviware.soapui.model.testsuite.TestProperty;
	import selenium.framework.common.CommonMethods;
	import selenium.framework.common.WebServices;
	import selenium.framework.pages.LoginPage;
	import selenium.framework.pages.MemberAchievementsPage;
	import selenium.framework.pages.MemberRewardsPage;
import selenium.framework.pages.RulesPage;

	public class AddRulesService extends CommonMethods {
		HashMap<String, String> rulesDetails = new HashMap<String, String>();
		MemberAchievementsPage memberAchievementsPage = null;
		RulesPage rulesPage = null;
		public static void main(String[] args) {
			String ruleName = null;
			String programId = null;
			new AddRulesService().runCreateAddRulesWebService(programId);
		}
		public WsdlProject setCreateRulesPropertyValues(WsdlProject project,String programId) {
			String testData=generateRandomName();
			rulesDetails.put("ruleName", testData);
			project.setPropertyValue("userName", LoginPage.username);
			project.setPropertyValue("password", LoginPage.password);
			project.setPropertyValue("programId", programId);  
			project.setPropertyValue("ruleName", testData);
			project.setPropertyValue("effectiveFrom",getCurrentDate() );
			project.setPropertyValue("orgId", orgId());	
			return project;
		}

		public HashMap<String, String> runCreateAddRulesWebService(String programId) {
			
			String response=null;
			String testData=generateRandomName();
			String projectPath = System.getProperty("user.dir")+ "/src/test/resources/ServiceXmls/AddRules-soapui-project.xml";
			WsdlProject project = WebServices.getProject(projectPath);
			rulesDetails.put("ruleName", testData );
			rulesDetails.put("effectiveFrom",getCurrentDate());
			project = setCreateRulesPropertyValues(project,programId);
			project = WebServices.runWebService(project, "AddRules", "AddRules");
			reportInfo("Web Service Ran Successfully.");
			Map<String, TestProperty> props = project.getProperties();
			for (String s : props.keySet()) {
				if (props.get(s).getName().equalsIgnoreCase("response")) {
					response=props.get(s).getValue();
					System.out.println(response);
				}
				 /*System.out.println(props.get(s).getName() + " : " +
				 props.get(s).getValue());*/
			}
			String a=response.substring(response.lastIndexOf("_id") + 6); 
			String Id=a.substring(0, 24); 
			rulesDetails.put("ruleId", Id);
			System.out.println(Id);
			WebServices.soapShutdown(); 
			return rulesDetails;

		}
	}
