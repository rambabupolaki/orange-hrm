	package lm.rcx.services;
	
	import com.eviware.soapui.impl.wsdl.WsdlProject;
	
	import lm.rcx.pojo.PursePoliciesPojo;
	import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;

	public class DeletePursePolicyServices extends CommonMethods{
		PursePoliciesPojo PursePoliciesPojo;
		public static void main(String[] args){
			
			try {
				String pursePolicyId = null;
				new DeletePursePolicyServices().runDeletePursePolicyWebServices(pursePolicyId);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		

		public WsdlProject setDeletePursePolicyPropertyValues(WsdlProject project, String pursePolicyId){

			
			project.setPropertyValue("pursePolicyId", pursePolicyId);
			project.setPropertyValue("orgId", "58f834f6e78d57209922a92b");
			return project;
		}

		public void runDeletePursePolicyWebServices(String pursePolicyId) throws Exception {
			String projectPath=System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/DeletePursePolicy-soapui-project.xml";
			WsdlProject project = WebServices.getProject(projectPath);
			
			project = setDeletePursePolicyPropertyValues(project, pursePolicyId);
			project = WebServices.runWebService(project, "DeletePursePolicy", "DeletePursePolicy");
			// Create a WsdlProject instance by specifying the project absolute path
			WebServices.soapShutdown();
			
	}
	}

