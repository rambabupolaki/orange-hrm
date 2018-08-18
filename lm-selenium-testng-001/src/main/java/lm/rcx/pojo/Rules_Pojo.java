package lm.rcx.pojo;

import selenium.framework.common.CommonMethods;

public class Rules_Pojo extends CommonMethods{
	String ruleName;
	String description;
	String orgId;
	String programId;
	String ruleFolderName;
	
	public String getProgramId() {
		if(programId==null){
			this.programId = generateRandomNumbers(23);
			}
		return programId;
	}
	public void setProgramId(String programId) {
		this.programId = programId;
	}
	public String getOrgId() {
		if(orgId==null){
			this.orgId = "5a01006f45cb2a00772046c4";
			}
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getEffectiveFrom() {
		if(effectiveFrom==null){
			this.effectiveFrom = getDate();
			}
		return effectiveFrom;
	}
	public void setEffectiveFrom(String effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}
	String effectiveFrom;
	
	public String getRuleName() {
		if(ruleName==null){
			this.ruleName = generateRandomName();
			}
			return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName= ruleName;
		
	}
	public String getRuleFolderName() {
		if(ruleFolderName==null){
			this.ruleFolderName = generateRandomName();
			}
			return ruleFolderName;
	}
	public void setRuleFolderName(String ruleFolderName) {
		this.ruleFolderName= ruleFolderName;
		
	}
	public String getDescription() {
		if(description== null){
			this.description="Desc"+generateRandomName();
		}
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
