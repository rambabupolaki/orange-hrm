	package selenium.framework.pages;
	import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import selenium.framework.common.PageControls;
	public class MemberLoyaltyIDsPage extends PageControls{
		public  final By PAGE_LOADING = By.xpath("//div[@class='loading'][@style='display: block;']");
		public  final By MEMBER_LOYALTYIDCODE=By.xpath("//table[@id='loyaltyidTable']//tbody//tr[1]//td[3]");
		public  final By ADD_LOYALTYID_BUTTON=By.xpath("//*[@class='btn btn-default general_button ng-scope']");
		public  final By LOYALTYIDNAME_INPUT=By.xpath("//*[@name='name']");
		public  final By CODE_INPUT=By.xpath("//*[@name='loyaltyId']");
		public  final By OK_BUTTON=By.xpath("//*[@class='btn btn-primary ok_button']");
		public  final By VALIDATE_ADD_SUCCESSFUL=By.xpath(".//*[@class='toast-message']");
		public final By SEARCh_BUTTON=By.xpath(".//*[@id='advanced-search-button']");
		public  final By SEARCH_INPUT=By.xpath(".//*[@id='loyaltyidTable_filter']/label/input");
		public  final By VALIDATE_LOYALTYIDS=By.xpath("//table[@id='loyaltyIDTable']//tbody//tr//td[3]");
		public  final By EDIT_LOYALTYID_BUTTON=By.xpath("//table[@id='loyaltyidTable']//tbody//tr//td/div/div/span[1]/span/a/i");
		public  final By LOYALTYID_SORT_BY_NAME_BUTTON=By.xpath("//table[@id='loyaltyidTable']//th[2]");
		public  final By LOYALTYID_TABLE_NAME_COLUMN=By.xpath("//table[@id='loyaltyidTable']//tbody//tr//td[2]");
		public  final By LOYALTYID_SORT_BY_CODE_BUTTON=By.xpath(".//table[@id='loyaltyidTable']//thead//tr[1]//th[3]");
		public  final By LOYALTYID_TABLE_CODE_COLUMN_BUTTON=By.xpath("//*[@id='loyaltyidTable']//tbody//tr//td[3]");
		public  final By LOYALTYID_SORT_BY_CREATED_BUTTON=By.xpath(".//table[@id='loyaltyidTable']//thead//tr[1]//th[5]");
		public  final By LOYALTYID_TABLE_CREATED_COLUMN_BUTTON=By.xpath("//*[@id='loyaltyidTable']//tbody//tr//td[5]");
		public  final By SHOW_ENTITIES_DROPDOWN = By.xpath("//*[@id='loyaltyidTable_length']/label/select");
		public  final By LOYALTYID_TABLE = By.xpath("//table[@id='loyaltyIDTable']/tbody/tr");
		public  final By FIELDSETTINGS_BUTTON = By.xpath("//*[@id='show-table-options']");
		public  final By SETTINGS_NAME_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li[1]//input");
		public  final By SETTINGS_ALL_COLUMNS_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li//input");
		public  final By LOYALTYID_TABLE_HEADER = By.xpath("//*[@id='loyaltyidTable']//thead//tr//th");
		public  final By VALIDATION_NAME_ERROR = By.xpath(".//*[@class='toast-message']");
		public  final By DELETE_LOYALTYID_BUTTON=By.xpath("//*[@class='lm-action-delete ios ng-scope']");
		public  final By DELETE_LOYALTYID_YES_BUTTON=By.xpath("//*[@class='btn btn-primary ok_button']");
		public  final By DELETE_LOYALTYID_SUCCESSFUL=By.xpath(".//*[@class='toast-message']");
		public  final By ACCRUE_TO=By.xpath("//*[@id='loyaltyidTable']//tbody//tr[1]//td[4]");
		public  final By ACCRUE_TO_SEARCH_INPUT=By.xpath(".//*[@id='searchText']");
		public  final By SELECT_ACCRUE_TO_SUGGESTION=By.xpath(".//*[@id='typeahead-7822-2697-option-0']/a");
		public  final By ADVANCED_SEARCH_TYPE =By.xpath("//*[@id='advanced-search-button']");
		public  final By SUGGESTIONS=By.xpath("//label/ul/li/a");
		public  final By INPUT_CODE=By.xpath("//*[@placeholder='Code']");

		

		public MemberLoyaltyIDsPage(WebDriver driver) {
			super(driver);	
		}
		public void clickOnAddLoyaltyIDButton(){
			this.click(ADD_LOYALTYID_BUTTON);
			this.waitForPageToLoad(PAGE_LOADING);
			reportInfo("Clicking On Add LoyaltyID Button");
			
		}
		public void selectLoyaltyIdName(){
			String testData=this.getFirstDropDownValue(LOYALTYIDNAME_INPUT);
			this.selectDropdown(LOYALTYIDNAME_INPUT, testData);
			reportInfo("Selecting Name. :"+testData);
	        this.waitForPageToLoad(PAGE_LOADING);
		}
		public void enterCodeInput(String testData){
			this.clear(CODE_INPUT);
			this.type(CODE_INPUT, testData);
			reportInfo("Entering Code.:"+testData);
	        this.waitForPageToLoad(PAGE_LOADING);
		}
		public void clickOnOKButton(){
			this.click(OK_BUTTON);
			reportInfo("Clicking On OK Button");
			//this.waitForPageToLoad(PAGE_LOADING);
			
		}
		public void clickOnOKButton(boolean flag){
			this.click(OK_BUTTON);
			reportInfo("Clicking On OK Button");
		}
		public void clickOnAccrueToButton(){
			List<WebElement> loyaltyIdTable = getWebElementList(LOYALTYID_TABLE);
			if(loyaltyIdTable.size()==1){
				this.waitForPageToLoad(PAGE_LOADING);
			}
			else{
			this.click(ACCRUE_TO);
			reportInfo("Clicking On Accrue To Button.");
			this.waitForPageToLoad(PAGE_LOADING);
			}
			
		}
		public void enterAccrueToSearchInput(String testData){
			this.type(ACCRUE_TO_SEARCH_INPUT, testData);
			reportInfo("Entering Group Member Name:"+testData);
			this.waitForPageToLoad(PAGE_LOADING);
			/*this.click(SELECT_ACCRUE_TO_SUGGESTION);
			reportInfo("Selecting Group Member Name.");*/
		}
		public void enterSearchInput(String testData){
			this.clear(SEARCH_INPUT);
			this.type(SEARCH_INPUT, testData);
			reportInfo("Entering Search Input.:"+testData);
			this.waitForPageToLoad(PAGE_LOADING);
		}
		public void clickOnEditLoyaltyIDButton(){
			this.click(EDIT_LOYALTYID_BUTTON);
			this.waitForPageToLoad(PAGE_LOADING);
			reportInfo("Clicking On Edit LoyaltyID Button");
			
		}
		public void clickOn_DeleteLoyalty_Button(){
			this.click(DELETE_LOYALTYID_BUTTON );
			reportInfo("Clicking On Delete Button.");
			this.waitForPageToLoad(PAGE_LOADING);
		}
		public void clickOn_DeleteLocationYes_Button(){
			this.click(DELETE_LOYALTYID_YES_BUTTON );
			reportInfo("Clicking On Delete OK Button.");
		}
		
		public String getText(By by,String testData){
			reportInfo(testData);
			return this.getText(by);
		}
		public void assertText(String expected, String actual, By by, String message){
			if(expected.equalsIgnoreCase(actual)){
				reportPassedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
				this.scrollDown();
				String successFilePath = elementScreenshot(by);
				reportSuccessScreenshot(successFilePath,message);
			}else{
				reportFailedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
				this.scrollDown();
				String failureFilePath = driverScreenshot();
				reportFailureScreenshot(failureFilePath);
			}
		}
		
		public int checkedColumns(By by){
			int count=0;
			reportInfo("Fetching number of checked columns in Fieldsettings.");
			List<WebElement> checkBoxList = getWebElementList(by);
			for(WebElement l:checkBoxList){
				boolean flag=l.isSelected();
				if(flag==true){
					count=count+1;
				}
			}
			return count;
		}
		
		public int tierTableColumns(By by){
			int count=0;
			reportInfo("Fetching number of columns in table.");
			List<WebElement> transactionColumnList = getWebElementList(by);
			for(WebElement l:transactionColumnList){
				if(l.getAttribute("class").equalsIgnoreCase("ng-scope")){
					count=count+1;
				}
			}
			return count-1;
		}
		
		public void assertInt(int expected, int actual,By by,String message){
			if(expected==actual){
				reportPassedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
				this.scrollDown();
				String successFilePath = elementScreenshot(by);
				reportSuccessScreenshot(successFilePath,message);
			}else{
				reportFailedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
				this.scrollDown();
				String failureFilePath = driverScreenshot();
				reportFailureScreenshot(failureFilePath);
			}
		}
		
		
		
		
		public void assertLoyaltyIDPopup(String expected, String testType)
		{
			reportInfo("Validating Badge Delete Or Not");
			try {
				if (testType.equalsIgnoreCase("valid")) {
					Assert.assertEquals(this.getText(DELETE_LOYALTYID_SUCCESSFUL), expected);
					reportPassedStatus("Verified Location Delete Or Not");
					String successFilePath = elementScreenshot(DELETE_LOYALTYID_SUCCESSFUL);
					reportSuccessScreenshot(successFilePath,""); 
				} else if (testType.equalsIgnoreCase("invalid")) {

				}
			} catch (Exception e) {
				String failureFilePath = driverScreenshot();
				reportFailureScreenshot(failureFilePath);
				reportFailedStatus();
				new Exception("Assertion Failed");
			}
		}
		public void clickOnFieldSettingsButton() {
			this.click(FIELDSETTINGS_BUTTON);
			reportInfo("Clicking On Field Settings Button");
			this.waitForPageToLoad(PAGE_LOADING);
		}
		public void checkNameField() {

			this.check(SETTINGS_NAME_CHECKBOX);
			reportInfo("Clicking Field Settings Name Checkbox");
			this.waitForPageToLoad(PAGE_LOADING);
		}
		public void assertBoolean(boolean expected, boolean actual, By by, String message){
			if(expected==actual){
				reportPassedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
				this.scrollDown();
				String successFilePath = elementScreenshot(by);
				reportSuccessScreenshot(successFilePath,message);
			}else{
				reportFailedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
				this.scrollDown();
				String failureFilePath = driverScreenshot();
				reportFailureScreenshot(failureFilePath);
			}
		}
		public void assertCheckedColumns(String testType) {
			reportInfo("Validating LoyaltyID visible columns in LoyaltyID table");
			try {
				if (testType.equalsIgnoreCase("valid")) {
					List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);
					List<WebElement> memberColumnList = getWebElementList(LOYALTYID_TABLE_HEADER);
					Assert.assertEquals(checkBoxList.size(), (memberColumnList.size() - 1));
					String successFilePath = elementScreenshot(SETTINGS_ALL_COLUMNS_CHECKBOX);
					reportSuccessScreenshot(successFilePath,"");
					for (WebElement w : memberColumnList) {
						System.out.println(w.getText());
						if (!w.getText().equals("Actions")) {
							for (WebElement e : checkBoxList) {
								if (e.isSelected()) {
									Assert.assertEquals(e.getText(), w.getText());
									reportPassedStatus("Verified" + " " + e.getText() + " " + "Column");
									System.out.println("selected");
									break;

								}
							}
						}
					}
				} else if (testType.equalsIgnoreCase("invalid")) {

				}
			} catch (Exception e) {
				String failureFilePath = driverScreenshot();
				reportFailureScreenshot(failureFilePath);
				reportFailedStatus();
				new Exception("Assertion Failed");
			}
		}
		public void uncheckNameField() {
			this.uncheck(SETTINGS_NAME_CHECKBOX);
			reportInfo("Uncheck Name Field.");
			this.waitForPageToLoad(PAGE_LOADING);
		}
		public void assertUncheckedColumns(String testType) {
			reportInfo("Validating Loyalty ID Invisible columns in LoyaltyID table");
			try {
				if (testType.equalsIgnoreCase("valid")) {
					List<WebElement> memberColumnList = getWebElementList(LOYALTYID_TABLE_HEADER);
					String count = "0";
					for (WebElement w : memberColumnList) {
						if (w.getText() == "Name") {
							count = count + 1;
						}
						Assert.assertEquals(count, "0");
						String successFilePath = driverScreenshot();
						reportSuccessScreenshot(successFilePath,"");

					}
				} else if (testType.equalsIgnoreCase("invalid")) {

				}
			} catch (Exception e) {
				String failureFilePath = driverScreenshot();
				reportFailureScreenshot(failureFilePath);
				reportFailedStatus();
				new Exception("Test Case Failed");
			}
		}

		
		public String selectShowEntiesDropdown(){
			String testData=this.getFirstDropDownValue(SHOW_ENTITIES_DROPDOWN);
			this.selectDropdown(SHOW_ENTITIES_DROPDOWN, testData);
			reportInfo("Selecting value from show entities dropdown. :"+testData);
			this.waitForPageToLoad(PAGE_LOADING);
			return testData;
		}
		public boolean validatePagination(int expected, String testType) {
			reportInfo("Validating Pagination");
			boolean flag = false;
			
					List<WebElement> rows = getWebElementList(LOYALTYID_TABLE);
					int count = rows.size();
					if(count<=expected){
						flag=true;
					}
					return flag;
		}
		
		public void assertObect(Object expected, Object actual,String message){
			if(expected.equals(actual)){
				reportPassedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
				
			}else{
				reportFailedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
				this.scrollDown();
				String failureFilePath = driverScreenshot();
				reportFailureScreenshot(failureFilePath);
			}
		}
		public List<String> actualList(By by,String testData){
			List<String> list1 = new ArrayList<String>();
			List<WebElement> memberTableNameColumn = getWebElementList(by);
			for (WebElement element : memberTableNameColumn) {
				list1.add(element.getText());
			}
			reportInfo(testData);
			return list1;
		}
		public List<String> expectedList(By by,String testData){
			List<String> list1 = new ArrayList<String>();
			List<WebElement> memberTableNameColumn = getWebElementList(by);
			for (WebElement element : memberTableNameColumn) {
				list1.add(element.getText());
			}
			Collections.sort(list1);
			Collections.reverse(list1);
			reportInfo(testData);
			return list1;
		}
		public boolean sortingByName() {
			List<String> list1 = new ArrayList<String>();
			List<String> list2 = new ArrayList<String>();
			List<WebElement> sortingTableNameColumn = getWebElementList(LOYALTYID_TABLE_NAME_COLUMN);
			for (WebElement element : sortingTableNameColumn) {
				list1.add(element.getText());
				list2.add(element.getText());
			}
			Collections.sort(list1,new SortIgnoreCase());
			//Collections.sort(list2,new SortIgnoreCase());

			Collections.reverse(list1);
			System.out.println("After Reverse"+list1);
			System.out.println("List1 is"+list1);
			boolean sorted=list2.equals(list1);
			return sorted;
		}
		public class SortIgnoreCase implements Comparator<Object> {
			public int compare(Object o1, Object o2) {
				String s1 = (String) o1;
				String s2 = (String) o2;
				return s1.toLowerCase().compareTo(s2.toLowerCase());
			}
		}
		public void clickonSortCodeButton(){
			this.click(LOYALTYID_SORT_BY_CODE_BUTTON);
			reportInfo("Clicking On Sort By Code Button.");
			this.waitForPageToLoad(PAGE_LOADING);
		}
		public void clickonSortNameButton(){
			this.click(LOYALTYID_SORT_BY_NAME_BUTTON);
			reportInfo("Clicking On Sort By Name Button.");
			this.waitForPageToLoad(PAGE_LOADING);
		}
		public boolean sortingByCode() {
			List<String> list1 = new ArrayList<String>();
			List<String> list2 = new ArrayList<String>();
			List<WebElement> sortingTableNameColumn = getWebElementList(LOYALTYID_TABLE_CODE_COLUMN_BUTTON);
			for (WebElement element : sortingTableNameColumn) {
				list1.add(element.getText());
				list2.add(element.getText());
			}
			Collections.sort(list1,new SortIgnoreCase());
			//Collections.sort(list2,new SortIgnoreCase());

			Collections.reverse(list1);
			System.out.println("After Reverse"+list1);
			System.out.println("List1 is"+list1);
			boolean sorted=list2.equals(list1);
			return sorted;
		}
		public class SortIgnoreCase1 implements Comparator<Object> {
			public int compare(Object o1, Object o2) {
				String s1 = (String) o1;
				String s2 = (String) o2;
				return s1.toLowerCase().compareTo(s2.toLowerCase());
			}
		}
		public void clickonSortCreatedButton(){
			this.click(LOYALTYID_SORT_BY_CREATED_BUTTON);
			reportInfo("Clicking On Sort By Created Date Button.");
			this.waitForPageToLoad(PAGE_LOADING);
		}
		public boolean sortingByCreated() {
			List<String> list1 = new ArrayList<String>();
			List<String> list2 = new ArrayList<String>();
			List<WebElement> sortingTableNameColumn = getWebElementList(LOYALTYID_TABLE_CREATED_COLUMN_BUTTON);
			for (WebElement element : sortingTableNameColumn) {
				list1.add(element.getText());
				list2.add(element.getText());
			}
			Collections.sort(list1,new SortIgnoreCase());
			//Collections.sort(list2,new SortIgnoreCase());

			Collections.reverse(list1);
			System.out.println("After Reverse"+list1);
			System.out.println("List1 is"+list1);
			boolean sorted=list2.equals(list1);
			return sorted;
		}
		public class SortIgnoreCase2 implements Comparator<Object> {
			public int compare(Object o1, Object o2) {
				String s1 = (String) o1;
				String s2 = (String) o2;
				return s1.toLowerCase().compareTo(s2.toLowerCase());
			}
		}
		public void assertMemberLoyltyIDcode(String expected, String testType) {
			reportInfo("Validating Member LoyaltyIDCode");
			try {
				if (testType.equalsIgnoreCase("valid")) {
					Assert.assertEquals(this.getText(MEMBER_LOYALTYIDCODE), expected);
					String successFilePath = driverScreenshot();
					reportFailureScreenshot(successFilePath);
					reportPassedStatus("Verified Member LoyaltyIDcode");
				} else if (testType.equalsIgnoreCase("invalid")) {

				}
			} catch (Exception e) {
				String failureFilePath = driverScreenshot();
				reportFailureScreenshot(failureFilePath);
				reportFailedStatus();
				new Exception("Assertion Failed");
			}
		}
		public void assertLoyaltyIDname(String expected, String testType)
		{
			reportInfo("Validating LoyaltyID name");
			try {
				if (testType.equalsIgnoreCase("valid")) {
					Assert.assertEquals(this.getText(VALIDATE_LOYALTYIDS), expected);
					reportPassedStatus("Verified loyaltyIDs Name");
					String successFilePath = elementScreenshot(VALIDATE_LOYALTYIDS);
					reportSuccessScreenshot(successFilePath,""); 
				} else if (testType.equalsIgnoreCase("invalid")) {

				}
			} catch (Exception e) {
				String failureFilePath = driverScreenshot();
				reportFailureScreenshot(failureFilePath);
				reportFailedStatus();
				new Exception("Assertion Failed");
			}

		}
		public void assertAddLoyaltyIDPopup(String expected, String testType) {
			reportInfo("Validating Flow");
			try {
				if (testType.equalsIgnoreCase("valid")) {
					Assert.assertEquals(this.getText(VALIDATE_ADD_SUCCESSFUL), expected);
					reportPassedStatus("Verified Flow");
					String successFilePath = elementScreenshot(VALIDATE_ADD_SUCCESSFUL);
					reportSuccessScreenshot(successFilePath,"");
				} else if (testType.equalsIgnoreCase("invalid")) {

				}
			} catch (Exception e) {
				String failureFilePath = driverScreenshot();
				reportFailureScreenshot(failureFilePath);
				reportFailedStatus();
				new Exception("Assertion Failed");
			}
		}
		public void validationErrorPopUp(String testType) {
			/*this.waitForPageToLoad(PAGE_LOADING);*/
			reportInfo("Validating Duplicate Records");
			try {
				if (testType.equalsIgnoreCase("valid")) {
					String successFilePath = elementScreenshot(VALIDATION_NAME_ERROR);
					reportSuccessScreenshot(successFilePath,"");
					reportPassedStatus("Duplicate Record Error");
				} else if (testType.equalsIgnoreCase("invalid")) {

				}
			} catch (Exception e) {
				String failureFilePath = driverScreenshot();
				reportFailureScreenshot(failureFilePath);
				reportFailedStatus();
				new Exception("Test Case Failed");
			}

		}
		public void clickOnSearchButton(){
			this.click(SEARCh_BUTTON);
			reportInfo("Clicking On Search Button.");
			this.waitForPageToLoad(PAGE_LOADING);
		}
		public void enterAdvancedSearch(String testData){
			this.type(INPUT_CODE , testData);
			this.waitForPageToLoad(PAGE_LOADING);
			//this.click(SUGGESTIONS);
			//this.waitForPageToLoad(PAGE_LOADING);
			reportInfo("Entering  LoyaltyID  :"+testData);
		}
		public void clickOnnewOKButton(){
			this.click(OK_BUTTON);
			reportInfo("Clicking On OK Button");
			this.waitForPageToLoad(PAGE_LOADING);
			
		}
}
