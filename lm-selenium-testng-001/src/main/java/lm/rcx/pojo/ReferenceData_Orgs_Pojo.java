package lm.rcx.pojo;

import selenium.framework.common.CommonMethods;

public class ReferenceData_Orgs_Pojo extends CommonMethods {
	String OrgsName;
	String OrgsInvalidName;
	public String getOrgsName(){
		if(this.OrgsName==null){
			this.OrgsName = "Starbucks";
			}
			return OrgsName;
	}
	public void setOrgsName(String OrgsName) {
		this.OrgsName= OrgsName;
		
	}
	public String getOrgsInvalidName(){
		if(this.OrgsInvalidName==null){
			this.OrgsInvalidName = generateRandomName();
			}
			return OrgsInvalidName;
	}
	public void setrgsInvalidName(String OrgsInvalidName) {
		this.OrgsInvalidName= OrgsInvalidName;
		
	}
}
