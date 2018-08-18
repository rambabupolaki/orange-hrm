package lm.rcx.pojo;

import selenium.framework.common.CommonMethods;

public class ProgramsPojo extends CommonMethods{
	String programName;
	String description;
	String programId;
	
	public String getPrograId() {
		if(programId==null){
			this.programId = generateRandomName();
			}
			return programId;
	}
	public void setProgramId(String programId) {
		this.programId= programId;
		
	}
	public String getProgramName() {
		if(programName==null){
			this.programName = generateRandomName();
			}
			return programName;
	}
	public void setProgramName(String programName) {
		this.programName= programName;
		
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
