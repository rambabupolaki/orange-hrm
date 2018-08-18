package lm.rcx.pojo;

import selenium.framework.common.CommonMethods;

public class RewardPolicyPojo extends CommonMethods{
	String name;
	String description;
	String usesleft;
	String expirationhours;
	String programId;
	public String getProgramId() {
		if(this.programId==null){
			programId = generateRandomName();
		}
		return programId;
	}
	public void setProgramId(String programId) {
		this.programId = programId;
	}
	public String getName() {
		if(name==null){
			this.name=generateRandomName();
		}
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		if(description==null){
			this.description="desc"+generateRandomName();
		}
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUsesleft() {
		if(usesleft==null){
			this.usesleft=generateRandomNumbers(2);
		}
		return usesleft;
	}
	public void setUsesleft(String usesleft) {
		this.usesleft = usesleft;
	}
	public String getExpirationhours() {
		if(expirationhours==null){
			this.expirationhours=generateRandomExpirationHours();
		}
		return expirationhours;
	}
	public void setExpirationhours(String expirationhours) {
		this.expirationhours = expirationhours;
	}
}

