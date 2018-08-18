package lm.rcx.pojo;

import selenium.framework.common.CommonMethods;

public class ReferenceData_Segments_Pojo extends CommonMethods {
	String SegmentName;
	String description;
	String Effective_Dt;
	String Expiry_Dt;
	String type;
	String segmentId;
	
	public String getSegmentName(){
		if(this.SegmentName==null){
			this.SegmentName = generateRandomName();
			}
			return SegmentName;
	}
	public void setSegmentName(String SegmentName) {
		this.SegmentName= SegmentName;
		
	}
	public String getSegmentId(){
		if(this.segmentId==null){
			this.segmentId = generateRandomName();
			}
			return segmentId;
	}
	public void setSegmentId(String segmentId) {
		this.segmentId= segmentId;
		
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
	public String getType() {
		if(type== null){
			this.type="Type"+generateRandomName();
		}
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String Effective_Dt() {
		if(this.Effective_Dt==null){
			Effective_Dt="08/21/1994";
		}
		return Effective_Dt;
	}
	public void setEffective_Dt(String Effective_Dt) {
		this.Effective_Dt= Effective_Dt;
		
	}
	public String Expiry_Dt() {
		if(this.Expiry_Dt==null){
			Expiry_Dt="08/21/2024";
		}
		return Expiry_Dt;
	}
	public void setExpiry_Dt(String Expiry_Dt) {
		this.Expiry_Dt= Expiry_Dt;
		
	}
}
