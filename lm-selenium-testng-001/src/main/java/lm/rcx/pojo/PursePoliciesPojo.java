package lm.rcx.pojo;
import selenium.framework.common.CommonMethods;


	

	public class PursePoliciesPojo extends CommonMethods{
		
		String Name;
		String Description;
		String EscrowsIn;
		String ExpiresIn;
		String StartRange;
		String EndRange;
		String Color;
		String programId;
		
		public String getName() {
			if(this.Name==null){
				Name = generateRandomName();
			}
			return Name;
		}
		public void setName(String Name) {
			this.Name = Name;
		}
		public String getProgramId() {
			if(this.programId==null){
				programId = generateRandomName();
			}
			return programId;
		}
		public void setProgramId(String programId) {
			this.programId = programId;
		}
		
		public String getdescription() {
			if(this.Description==null){
				Description="Desc "+generateRandomName();
			}
			return Description;
		}
		public void setdescription(String Description) {
			this.Description = Description;
		}
		public String getEscrowsIn() {
			if(this.EscrowsIn==null){
				EscrowsIn=generateRandomNumbers(4);
			}
			return EscrowsIn;
		}
		public void setEscrowsIn(String EscrowsIn) {
			EscrowsIn = EscrowsIn;
		}
		public String getExpiresIn() {
			if(this.ExpiresIn==null){
				ExpiresIn=generateRandomNumbers(4);
			}
			return ExpiresIn;
		}
		public void setExpiresIn(String ExpiresIn) {
			this.ExpiresIn = ExpiresIn;
		}
		public String getStartRange() {
			if(this.StartRange==null){
				StartRange=generateRandomNumbers(2);
			}
			return StartRange;
		}
		public void setStartRange(String StartRange) {
			StartRange = StartRange;
		}
		public String getEndRange() {
			if(this.EndRange==null){
				EndRange=generateRandomNumbers(2);
			}
			return EndRange;
		}
		public void setEndRange(String EndRange) {
			EndRange = EndRange;
		}
		public String getColor() {
			if(this.Color==null){
				Color="#cb7373";
			}
			return Color;
		}
		public void setColor(String Color) {
			Color = Color;
		}
}
