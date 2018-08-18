package lm.rcx.pojo;

import selenium.framework.common.CommonMethods;

public class SecuritySetUpPojo extends CommonMethods {
	
String RoleName;

public String getRoleName() {
	if(RoleName==null){
		this.RoleName="Rolename"+generateRandomName();
	}
	return RoleName;
}

public void setRoleName(String roleName) {
	RoleName = roleName;
}
}
