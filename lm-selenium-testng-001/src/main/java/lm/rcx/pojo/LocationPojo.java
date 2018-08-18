package lm.rcx.pojo;

	

import selenium.framework.common.CommonMethods;

	public class LocationPojo extends CommonMethods{
		
		String Name;
		String Number;
		String description;
		String city;
		String state;
		String zipCode;
		String country;
		String timezone;
		String advancedsearchname;
		String locationId;
		
		public String getName() {
			if(this.Name==null){
				Name = randomCitiStateNameGenerator();
			}
			return Name;
		}
		public void setName(String Name) {
			this.Name = Name;
		}
		
		public String getLocationId() {
			if(this.locationId==null){
				locationId = generateRandomNumbers(23);
			}
			return locationId;
		}
		public void setLocationId(String locationId) {
			this.locationId = locationId;
		}
		public String getTimeZone() {
			if(this.timezone==null){
				timezone = "UTC";
			}
			return timezone;
		}
		public void setTimezone(String timezone) {
			this.timezone = timezone;
		}
		
		public String getNumber() {
			if(this.Number==null)
			{
				Number=generateRandomNumbersWithLength(8);
			}
			return Number;
		}
		public void setNumber(String Number) {
			this.Number = Number;
		}
		public String getdescription() {
			if(this.description==null){
				description="Adding Locations";
			}
			return description;
		}
		public void setdescription(String description) {
			this.description = description;
		}
		public String getcity() {
			if(this.city==null){
				city=randomCitiStateNameGenerator();
				}
			return city;
		}
		public void setcity(String city) {
			city = city;
		}
		public String getstate() {
			if(this.state==null){
				state=randomCitiStateNameGenerator();
			}
			return state;
		}
		public void setstate(String state) {
			this.state = state;
		}
		public String getzipCode() {
			if(this.zipCode==null){
				zipCode="12323-3456";
			}
			return zipCode;
		}
		public void setzipCode(String zipCode) {
			this.zipCode = zipCode;
		}
		public String getcountry() {
			if(this.country==null){
				country=generateRandomName();
			}
			return country;
		}
		public void setcountry(String country) {
			this.country = country;
		}
		
		public String getadvancedsearchname() {
			if(this.advancedsearchname==null){
				advancedsearchname="testdata";
			}
			return advancedsearchname;
		}
		public void setadvancedsearchname(String advancedsearchname) {
			this.advancedsearchname = advancedsearchname;
		}
		
		
		public static void main(String[] args) {
			LocationPojo mp = new LocationPojo();
			
		}
		

	}


