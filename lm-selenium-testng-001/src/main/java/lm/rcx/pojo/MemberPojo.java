package lm.rcx.pojo;

import selenium.framework.common.CommonMethods;
import selenium.framework.common.PageControls;
import selenium.framework.pages.MembersPage;

public class MemberPojo extends CommonMethods {

	String firstName;
	String lastName;
	String dateOfBirth;
	String Email;
	String address;
	String city;
	String state;
	String country;
	String zipCode;
	String phoneNumber;
	String uniqueId;
	String referralCode;
	String loyaltyIdCode;
	String memberType;
	String enrollSource;
	String program;
	String loyaltyIdName;
	String enrollChannel;
	String memberId;
	String createdAt;
	String enrollDate;
	String acquisitionDate;
	String acquisitionChannel;
	String orgID;
	PageControls pageControls = null;
	MembersPage membersPage = null;
	ProgramsPojo programsPojo;
	
	public String getMemberId() {
		if(this.memberId==null){
			memberId="Web";
		}
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getOrgID() {
		if(this.orgID==null){
			orgID="5a01006f45cb2a00772046c4";
		}
		return orgID;
	}
	public void setOrgId(String orgID) {
		this.orgID = orgID;
	}
	public String getCreatedAt() {
		if(this.createdAt==null){
			createdAt="Web";
		}
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getProgram(){
		if(this.program==null){
			program="Hyderabad";
		}
		return program;
	}
	public void setProgram(String program){
		this.program=program;
	}
	
	public String getEnrollDate() {
		if(this.enrollDate==null){
			enrollDate=getDateForEnrollDate();
		}
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	public String getAcquisitionDate() {
		if(this.acquisitionDate==null){
			acquisitionDate=getDateForAcquisitionDate();
		}
		return acquisitionDate;
	}
	public void setAcquisitionDate(String acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}
	public String getAcquisitionChannel() {
		if(this.acquisitionChannel==null){
			acquisitionChannel="Hyderabad";
		}
		return acquisitionChannel;
	}
	public void setAcquisitionChannel(String acquisitionChannel) {
		this.acquisitionChannel = acquisitionChannel;
	}
	public String getFirstName() {
		if (this.firstName == null) {
			firstName = generateRandomName();
		}
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		if (this.lastName == null) {
			lastName = generateRandomName();
		}
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		if (this.dateOfBirth == null) {
			dateOfBirth = "02/21/1994";
		}
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		if (this.Email == null) {
			Email = generateRandomName() + "@gmail.com";
		}
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		if (this.address == null) {
			address = "Dallas";
		}
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		if (this.city == null) {
			city = randomCitiStateNameGenerator();
		}
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		if (this.state == null) {
			state = randomCitiStateNameGenerator();
		}
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		if (this.country == null) {
			country = "USA";
		}
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		if (this.zipCode == null) {
			zipCode = "12323-3456";
		}
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhoneNumber() {
		if (this.phoneNumber == null) {
			phoneNumber = "+"+generateRandomNumbers(10);
		}
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUniqueId() {
		if (this.uniqueId == null) {
			uniqueId = generateRandomExpirationHours();
		}
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getReferralCode() {
		if (this.referralCode == null) {
			referralCode = generateRandomNumbers(5);
		}
		return referralCode;
	}

	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
	}

	public String getLoyaltyIdCode() {
		if (this.loyaltyIdCode == null) {
			loyaltyIdCode = generateRandomNumbers(6);
		}
		return loyaltyIdCode;
	}

	public void setLoyaltyIdCode(String loyaltyIdCode) {
		this.loyaltyIdCode = loyaltyIdCode;
	}

	public String getMemberType() {
		if (this.memberType == null) {
			memberType = "Individual";
		}
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public static void main(String[] args) {
		MemberPojo mp = new MemberPojo();
		mp.setFirstName("Madhuri");
		System.out.println(mp.getFirstName());
	}
	public String getEnrollSource() {
		if (this.enrollSource == null) {
			enrollSource = "Campaign 2";
		}
		return enrollSource;
	}

	public void setEnrollSource(String enrollSource) {
		this.enrollSource = enrollSource;
	}
	public String getEnrollChannel() {
		if(this.enrollChannel==null){
			enrollChannel="Web";
		}
		return enrollChannel;
	}

	public void setEnrollChannel(String enrollChannel) {
		this.enrollChannel = enrollChannel;
	}

	
	public String getLoyaltyIdName() {
		if (this.loyaltyIdName == null) {
			loyaltyIdName = "Membership Card";
		}
		return loyaltyIdName;
	}

	public void setLoyaltyIdName(String loyaltyIdName) {
		this.loyaltyIdName = loyaltyIdName;
	}
	
	
}
