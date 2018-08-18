package lm.rcx.pojo;
	import selenium.framework.common.CommonMethods;
		public class FlowComposerPojo extends CommonMethods{
			
			String RuleName;
			String Description;
			String EffectiveFrom;
			String EffectiveTo;
			String Priority;
			
			public String getRuleName() {
				if(this.RuleName==null){
					RuleName = generateRandomName();
				}
				return RuleName;
			}
			public void setName(String RuleName) {
				this.RuleName = RuleName;
			}
			
			public String getDescription() {
				if (this.Description == null) {
					Description = "Adding Rules";
				}
				return Description;
			}

			public void setDescription(String Description) {
				this.Description = Description;
			}
			public String getEffectiveFrom() {
				if (this.EffectiveFrom == null) {
					EffectiveFrom = "02/21/1994";
				}
				return EffectiveFrom;
			}

			public void setEffectiveFrom(String EffectiveFrom) {
				this.EffectiveFrom = EffectiveFrom;
			}
			public String getEffectiveTo(){
				if(this.EffectiveTo==null){
					EffectiveTo="02/21/2017"; 
				}
				return EffectiveTo;
			}
			public void setEffectiveTo(String ContactFirst) {
				EffectiveTo = EffectiveTo;
			}
			public String getPriority(){
				if(this.Priority==null){
					Priority="7777" ;
				}
				return Priority;
			}
			public void setPriority(String Priority) {
				Priority = Priority;
			}
							
				
			}
