package lm.rcx.pojo;
	import selenium.framework.common.CommonMethods;
		public class PartnersPojo extends CommonMethods{
			
			String Name;
			String Email;
			String Code;
			String Status;
			String Phone;
			String ContactFirst;
			String ContactLast;
			
			public String getName() {
				if(this.Name==null){
					Name = generateRandomName();
				}
				return Name;
			}
			public void setName(String Name) {
				this.Name = Name;
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
			
			public String getCode() {
				if(this.Code==null){
					Code=generateRandomNumbers(5) ;
				}
				return Code;
			}
			public void setCode(String code) {
				Code = code;
			}

			public String getStatus() {
				if (this.Status == null) {
					Status = "Active";
				}
				return Status;
			}

			public void setAddress(String Status) {
				this.Status = Status;
			}
			public String getPhone() {
				if (this.Phone == null) {
					Phone = "+"+generateRandomNumbers(10);
				}
				return Phone;
			}

			public void setPhone(String Phone) {
				this.Phone = Phone;
			}
			public String getContactFirst(){
				if(this.ContactFirst==null){
					ContactFirst=generateRandomName() ;
				}
				return ContactFirst;
			}
			public void setContactFirst(String ContactFirst) {
				ContactFirst = ContactFirst;
			}
			public String getContactLast(){
				if(this.ContactLast==null){
					ContactLast=generateRandomName() ;
				}
				return ContactLast;
			}
			public void setContactLast(String ContactLast) {
				ContactLast = ContactLast;
			}
							
				
			}

	





