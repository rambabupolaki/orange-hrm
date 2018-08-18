package lm.rcx.pojo;
	

import selenium.framework.common.CommonMethods;

	public class EnumPojo extends CommonMethods{
		
		String Type;
		String Value;
		String Label;
		String Description;
		
		
		public String getType() {
			if(this.Type==null){
				Type = generateRandomName();
			}
			return Type;
		}
		public void setType(String Type) {
			this.Type = Type;
		}
		public String getValue() {
			if(this.Value==null)
			{
				Value=generateRandomName();
			}
			return Value;
		}
		public void setValue(String Value) {
			this.Value = Value;
		}
		
		public String getLabel() {
			if(this.Label==null)
			{
				Label=generateRandomName();
			}
			return Label;
		}
		public void setLabel(String Label) {
			this.Label = Label;
		}
		public String getDescription() {
			if(this.Description==null){
				Description="Adding Locations";
			}
			return Description;
		}
		public void setDescription(String description) {
			this.Description = description;
		}
		
		public static void main(String[] args) {
			EnumPojo mp = new EnumPojo();
			
		}
		

	}




