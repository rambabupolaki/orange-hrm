package lm.rcx.pojo;

import selenium.framework.common.CommonMethods;

public class UsersPojo extends CommonMethods{
	String loginName;
	String Email;
	String tokenExpiresInMinute;
	String orgId;
	String blocked;
	String userId;
	
	public String getOrgId() {
		if(orgId==null){
			this.orgId=generateRandomNumbers(23);
		}
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getUserId() {
		if(userId==null){
			this.userId=generateRandomNumbers(23);
		}
		return userId;
	}
	public void setUserId(String orgId) {
		this.userId = userId;
	}
	public String getBlocked() {
		if(orgId==null){
			this.blocked="false";
		}
		return blocked;
	}
	public void setBlocked(String blocked) {
		this.blocked = blocked;
	}
	public String getName() {
		if(loginName==null){
			this.loginName="User"+generateRandomName();
		}
		return loginName;
	}
	public void setName(String name) {
		this.loginName = name;
	}
	public String getEmail() {
		if(Email==null){
			this.Email=generateRandomName()+"@gmail.com";
		}
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTokenExpiresInMinute() {
		if(tokenExpiresInMinute==null){
		}
		return tokenExpiresInMinute;
	}
	public void setTokenExpiresInMinute(String tokenExpiresInMinute) {
		this.tokenExpiresInMinute = tokenExpiresInMinute;
	}

}
