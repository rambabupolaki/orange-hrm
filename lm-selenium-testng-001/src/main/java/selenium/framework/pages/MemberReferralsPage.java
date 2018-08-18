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

public class MemberReferralsPage extends PageControls{
	public  final By PAGE_LOADING = By.xpath("//div[@class='loading'][@style='display: block;']");
	public  final By ADDREFERRALS_BUTTON=By.xpath("//*[@id='addReferralButton']");
	public  final By NAME_INPUT=By.name("referredMemberName");//By.xpath("//*[@class='form-control ng-pristine ng-valid ng-scope ng-isolate-scope ng-empty ng-touched']");
	public  final By CONTACT_INPUT=By.name("referredMemberContact");//By.xpath("//*[@class='form-control ng-pristine ng-untouched ng-valid ng-scope ng-isolate-scope ng-empty']");
	public  final By HANDLE_INPUT=By.xpath("//*[@placeholder='Handle']");
	public  final By OK_BUTTON=By.xpath("//*[@class='btn btn-primary ok_button']");
	public  final By SEARCH_INPUT=By.xpath("//*[@id='referralTable_filter']//input");
	public  final By VALIDATE_REFERRALS=By.xpath("//table[@id='referralTable']//tbody//tr//td[3]");
	public  final By SHOW_ENTITIES_DROPDOWN = By.name("referralTable_length");
	public  final By REFERRALS_TABLE = By.xpath("//table[@id='referralTable']/tbody/tr");
	public  final By FIELDSETTINGS_BUTTON = By.xpath("//*[@id='referralTable_wrapper']//div//*[@class='ColVis_Button ColVis_MasterButton']");
	public  final By SETTINGS_CODE_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']/li[1]/label/input[1]");
	public  final By SETTINGS_ALL_COLUMNS_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li//input");
	public  final By SETTINGS_NAME_COLUMNS_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li[1]");
	public  final By SETTINGS_ALL_COLUMNS_CHECKBOX_SCREENSHOT = By.xpath("//ul[@class='ColVis_collection']//li");
	public  final By REFERRALS_TABLE_HEADER = By.xpath("//*[@id='referralTable']//thead//tr//th");
	public  final By REFERRALS_SORT_BY_CODE_BUTTON=By.xpath("//*[@id='referralTable_0_1']");
	public  final By REFERRALS_TABLE_CODE_COLUMN_BUTTON=By.xpath("//*[@id='referralTable']//tbody//tr//td[1]");
	public  final By REFERRALS_SORT_BY_NAME_BUTTON=By.xpath("//*[@id='referralTable_0_2']");
	public  final By REFERRALS_TABLE_NAME_COLUMN_BUTTON=By.xpath("//*[@id='referralTable']//tbody//tr//td[2]");
	public  final By REFERRALS_SORT_BY_STATUS_BUTTON=By.xpath("//*[@id='referralTable_0_4']");
	public  final By REFERRALS_TABLE_STATUS_COLUMN_BUTTON=By.xpath("//*[@id='referralTable']//tbody//tr//td[4]");
	public  final By VALIDATION_NAME_ERROR = By.xpath("//*[@class='invalid ng-binding ng-scope']");
	public  final By CODE_VALUE_COLUMN = By.xpath("//table[@id='referralTable']//tbody//tr[1]//td[1]");
	public  final By GET_MEMBER_FIRST_NAME = By.xpath("//table[@id='memberTable']//tbody//tr//td[10]");
	public  final By REFERRAL_STATUS = By.xpath("//table[@id='referralTable']//tbody//tr[1]//td[4]");
	public  final By SEARCH_BUTTON = By.xpath("//*[@id='advanced-search-button']");
	public  final By ADVANCED_SEARCH_NAME  =By.xpath("//*[@placeholder='Referred Member Name']");
	public  final By SUGGESTION_INPUT=By.xpath("//label/ul/li/a");
	public MemberReferralsPage(WebDriver driver) {
		super(driver);	
	}
	
	public void clickOnAddReferralsButton(){
		this.click(ADDREFERRALS_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On Add Referral ID Button");
		
	}
	public void enterNameInput(String testData){
		this.type(NAME_INPUT, testData);
		reportInfo("Entering Referral Name:"+testData);
        this.waitForPageToLoad(PAGE_LOADING);
	}
	public void enterContactInput(String testData){
		this.type(CONTACT_INPUT, testData);
		reportInfo("Entering Contact:"+testData);
        this.waitForPageToLoad(PAGE_LOADING);
	}
	public void enterHandleInput(String testData){
		this.type(HANDLE_INPUT, testData);
		reportInfo("Entering Handle:"+testData);
        this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnOKButton(){
		this.click(OK_BUTTON);
		this.waitForPageToLoad(OK_BUTTON);
		reportInfo("Clicking On OK Button.");
		
	}
	public void enterSearchInput(String testData){
		this.type(SEARCH_INPUT, testData);
		reportInfo("Entering Search Input.:"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 250);");
	}
	public String getCodeValue(){
		return this.getText(CODE_VALUE_COLUMN);
		
	}
	public String getMemberName(){
		return this.getText(GET_MEMBER_FIRST_NAME);
		
	}
	public void clickonSortCodeButton(){
		this.click(REFERRALS_SORT_BY_CODE_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
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
	public boolean sortingByCode() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList(REFERRALS_TABLE_CODE_COLUMN_BUTTON);
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
	public void clickonSortNameButton(){
		this.click(REFERRALS_SORT_BY_NAME_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public boolean sortingByName() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList(REFERRALS_TABLE_NAME_COLUMN_BUTTON);
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
	public void clickonSortStatusButton(){
		this.click(REFERRALS_SORT_BY_STATUS_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public boolean sortingByStatus() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList(REFERRALS_TABLE_STATUS_COLUMN_BUTTON);
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
	public void clickOnFieldSettingsButton() {
		this.click(FIELDSETTINGS_BUTTON);
		reportInfo("Clicking On Field Settings Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void checkCodeField() {
		this.check(SETTINGS_CODE_CHECKBOX);
		reportInfo("Clicking Field Settings Code Checkbox");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public int checkedColumns(){
		int count=0;
		reportInfo("Fetching number of checked columns in Fieldsettings.");
		List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);
		for(WebElement l:checkBoxList){
			boolean flag=l.isSelected();
			if(flag==true){
				count=count+1;
			}
		}
		return count;
	}
	
	public int referralTableColumns(){
		reportInfo("Fetching number of columns in table.");
		List<WebElement> tierColumnList = getWebElementList(REFERRALS_TABLE_HEADER);
		return tierColumnList.size();
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
	public void assertCheckedColumns(String testType) {
		reportInfo("Validating Referrals visible columns in Referrals table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);
				List<WebElement> memberReferralsColumnList = getWebElementList(REFERRALS_TABLE_HEADER);
				Assert.assertEquals(checkBoxList.size(), (memberReferralsColumnList.size()));
				String successFilePath = elementScreenshot(SETTINGS_ALL_COLUMNS_CHECKBOX);
				reportSuccessScreenshot(successFilePath,"");
				for (WebElement w : memberReferralsColumnList) {
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
		this.uncheck(SETTINGS_CODE_CHECKBOX);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void assertUncheckedColumns(String testType) {
		reportInfo("Validating Referrals Invisible columns in LoyaltyID table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> memberColumnList = getWebElementList(REFERRALS_TABLE_HEADER);
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

	public String selectShowEntitiesDropdown() {
		String testData=this.getFirstDropDownLabel(SHOW_ENTITIES_DROPDOWN);
		this.selectDropdown(SHOW_ENTITIES_DROPDOWN, testData);
		reportInfo("Clicking On Show Entities DropDown");
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
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
	public boolean validatePagination(int expected, String testType) {
		boolean flag=false;
				List<WebElement> rows = getWebElementList(REFERRALS_TABLE);
				int count = rows.size();
				//Assert.assertEquals(count, expected);
				if(count<=expected){
					flag=true;
				}
				return flag;
			}
		
	public void assertReferralsname(String expected, String testType)
	{
		reportInfo("Validating Referrals name");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				Assert.assertEquals(this.getText(VALIDATE_REFERRALS), expected);
				reportPassedStatus("Verified Referrals Name");
				String successFilePath = elementScreenshot(VALIDATE_REFERRALS);
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
	public void validateReferralStatus(String expected, String testType)
	{
		reportInfo("Validating Referrals name");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				Assert.assertEquals(this.getText(REFERRAL_STATUS), expected);
				reportPassedStatus("Verified Referrals Name");
				String successFilePath = elementScreenshot(REFERRAL_STATUS);
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
	public void clickOn_Search_Button(){
		this.click(SEARCH_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on Advanced Search button");
	}
	public void enterAdvancedSearch(String testData){
		this.clear(ADVANCED_SEARCH_NAME );
		this.type(ADVANCED_SEARCH_NAME  , testData);
		this.waitForPageToLoad(PAGE_LOADING);
		//this.click(SUGGESTION_INPUT);
		//this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering  Refferal Name :"+testData);
	}
	public void clickOn_Ok_Button(){
		this.click(OK_BUTTON);
		reportInfo("Clicking On OK Button");
		this.waitForPageToLoad(PAGE_LOADING);

	}

}
