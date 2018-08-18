package lm.rcx.pojo;

import com.aventstack.extentreports.ExtentTest;

import selenium.framework.common.CommonMethods;

public class ReferenceDataDMApojo extends CommonMethods {
	public ReferenceDataDMApojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	String DMAName;
	String DMAdescription;
	String Zipcodes;
	String singleZipcode;
	String dmaId;
	
	public String getSingleZipcode() {
		if(this.singleZipcode==null){
			this.singleZipcode=generateSingleZipcode();
		}
		return singleZipcode;
	}
	public void setSingleZipcode(String singleZipcode) {
		this.singleZipcode = singleZipcode;
	}
	public String getDMAId() {
		if(this.dmaId==null){
			this.dmaId=generateRandomNumbers(23);
		}
		return dmaId;
	}
	public void setDMAId(String dmaId) {
		this.dmaId = dmaId;
	}
	public String getDMAName(){
		if(this.DMAName==null){
			this.DMAName = generateRandomName();
			}
			return DMAName;
	}
	public void setDMAName(String DMAName) {
		this.DMAName= DMAName;
		
	}
	public String getDMADescription() {
		if(DMAdescription== null){
			this.DMAdescription="Desc"+generateRandomName();
		}
		return DMAdescription;
	}
	public void setDMADescription(String DMAdescription) {
		this.DMAdescription = DMAdescription;
	}
	public String getZipcodes() {
		if (this.Zipcodes == null) {
			Zipcodes = generateZipcode();
		}
		return Zipcodes;
	}
	public void setZipcodes(String Zipcodes) {
		this.Zipcodes = Zipcodes;
	}
	
	public String getDuplicateZipcodes() {
		if (this.Zipcodes == null) {
			Zipcodes = generateDuplicateZipcode();
		}
		return Zipcodes;
	}
	public void setDuplicateZipcodes(String Zipcodes) {
		this.Zipcodes = Zipcodes;
	}
	
}
