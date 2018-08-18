package lm.rcx.pojo;
	import selenium.framework.common.CommonMethods;
		public class TierPoliciesPojo extends CommonMethods{
			
			String Name;
			String ExpiresIn;
			String Color;
			String programId;
			String levelName;
			
			public String getName() {
				if(this.Name==null){
					Name = generateRandomName();
				}
				return Name;
			}
			public void setName(String Name) {
				this.Name = Name;
			}
			public String getLevelName() {
				if(this.levelName==null){
					levelName = generateRandomName();
				}
				return levelName;
			}
			public void setLevelName(String levelName) {
				this.levelName = levelName;
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
			public String getExpiresIn() {
				if(this.ExpiresIn==null){
					ExpiresIn=generateRandomNumbers(4);
				}
				return ExpiresIn;
			}
			public void setExpiresIn(String ExpiresIn) {
				this.ExpiresIn = ExpiresIn;
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


