package lm.rcx.services;
import java.util.Map;
import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.testsuite.TestProperty;
import lm.rcx.pojo.MemberPojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebServices;

public class GetAllPursePolicyService extends CommonMethods{

	MemberPojo memberPojo;

	public static void main(String[] args){

		try {
			new GetAllPursePolicyService().runGetAllPursePolicyWebService();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean runGetAllPursePolicyWebService() throws Exception {
		boolean flag1=false;
		String projectPath=System.getProperty("user.dir") + "/src/test/resources/ServiceXmls/GetAllPursePolicy-soapui-project.xml";
		WsdlProject project = WebServices.getProject(projectPath);
		project = WebServices.runWebService(project, "GetAllPursePolicy", "GetAllPursePolicy");
		Map<String, TestProperty> props = project.getProperties();
		for (String s : props.keySet()) {
			if(props.get(s).getName().equalsIgnoreCase("response")){
				if( props.get(s).getValue()==null){
					flag1=true;
				}
			}
			//System.out.println(props.get(s).getName() + " : " + props.get(s).getValue());
		}
		
		return flag1;


	}

}