package selenium.framework.pages;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import selenium.framework.common.PageControls;


public class  PartnersPage extends PageControls {

	public  final By PAGE_LOADING = By.xpath("//div[@class='loading' and style='display: block;']");
	public  final By PARTNERS=By.linkText("Partners");
	public  final By PROGRAM_TABLE = By.xpath("//table[@id='programTable']");
	public  final By PROGRAM_RULE_FOLDER = By.xpath("//table[@id='programTable']//tbody//tr[1]//td[8]");
	public  final By ADD_PARTNER_BUTTON =By.id("dialog");
	public  final By NAME_INPUT = By.xpath("//*[@name='name']");
	public  final By STATUS_DROPDOWN=By.xpath("//*[@name='status']");
	public  final By CODE_INPUT = By.xpath("//*[@name='code']");
	public  final By EMAIL_INPUT = By.xpath("//*[@name='email']");
	public  final By PHONE_INPUT = By.xpath("//*[@name='phone']");
	public  final By CONTACTFIRST_INPUT = By.xpath("//*[@name='contactFirst']");
	public  final By CONTACTLAST_INPUT = By.xpath("//*[@name='contactLast']");
	public  final By OK_BUTTON = By.xpath("//button[text()='OK']");
	public final By ADVANCED_SEARCH_BUTTON=By.xpath(".//*[@id='advanced-search-button']");
	public  final By ADVANCED_SEARCH_INPUT = By.xpath("//input[@type='text']");
	public  final By SUGGESTION_INPUT=By.xpath("//label/ul/li/a");
	public  final By VALIDATE_PARTNERS = By.xpath("//table[@id='partnerTable']//tbody//tr//td[3]");
	public  final By EDIT_PARTNERS =By.xpath("//a[@tooltip='Edit']");
	public  final By DELETE_PARTNERS=By.xpath("//a[@tooltip='Delete']");
	public  final By DELETE_PARTNERS_YES=By.xpath("//*[@class='btn btn-primary ok_button']");
	public  final By DELETE_PARTNER_SUCCESSFUL=By.xpath(".//*[@class='toast-message']");
	public  final By SHOW_ENTITIES_DROPDOWN = By.xpath(".//*[@id='partnerTable_length']/label/select");
	public  final By PARTNERS_TABLE = By.xpath("//table[@id='partnerTable']/tbody/tr");
	public  final By FIELDSETTINGS_BUTTON = By.xpath("//*[@class='ColVis_Button ColVis_MasterButton']");
	public  final By SETTINGS_NAME_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']/li[1]/label/input[1]"); 
	public  final By PARTNERS_TABLE_HEADER = By.xpath("//*[@id='partnerTable']//thead//tr//th");
	public  final By SETTINGS_ALL_COLUMNS_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li//input");
	public  final By PARTNERS_SORT_BY_NAME=By.xpath("//*[@id='partnerTable_0_2']");
	public  final By PARTNERS_TABLE_NAME_COLUMN=By.xpath("//*[@id='partnerTable']//tbody//tr//td[3]");
	public  final By PARTNERS_SORT_BY_CODE=By.xpath("//*[@id='partnerTable_0_3']");
	public  final By PARTNERS_TABLE_CODE_COLUMN=By.xpath("//*[@id='partnerTable']//tbody//tr//td[3]");
	public  final By PARTNERS_SORT_BY_STATUS=By.xpath("//*[@id='partnerTable_0_4']");
	public  final By VALIDATE_PARTNERS_ERROR=By.xpath("//*[@class='invalid ng-binding ng-scope']");
	public  final By PARTNERS_TABLE_STATUS_COLUMN=By.xpath("//*[@id='partnerTable']//tbody//tr//td[4]");
	public  final By VALIDATION_ERROR=By.xpath("//*[@class='alert alert-danger alert-block']");
	public final By DUPLICATE_ERROR=By.xpath(".//*[@class='toast-message']");
	public  final By VALIDATE_PARTNER_NAME = By.xpath("//em[@class='invalid ng-binding ng-scope']");
	
	public PartnersPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}	 
	public void clickOnPartnerslink()
	{
		this.click(PARTNERS);
		waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on Partners Link.");
	}
	public void clickOnAddPartnerButton()
	{
		this.click(ADD_PARTNER_BUTTON);
		waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on Add Partner Button.");
	}
	public void clickOnAdvancedSearchButton(){
		this.click(ADVANCED_SEARCH_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On Advanced Search Button. ");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void enterSearchInput(String testData){
		//this.click(ADVANCED_SEARCH_INPUT);
		this.type(ADVANCED_SEARCH_INPUT, testData);
		reportInfo("Entering Search Input :"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
		//this.click(SUGGESTION_INPUT);
	}
	public void enterName(String testData){
		this.clear(NAME_INPUT);
		this.type(NAME_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		this.type(NAME_INPUT, Keys.TAB);
		reportInfo("Entering Product Name :"+testData);
	}
	public void enterStatus(String testData){
		//this.clear(STATUS_DROPDOWN);
		this.type(STATUS_DROPDOWN, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering Status :"+testData);
	}
	public void enterCode(String testData){
		this.clear(CODE_INPUT);
		this.type(CODE_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering Code :"+testData);
	}
	public void enterEmail(String testData){
		this.clear(EMAIL_INPUT);
		this.type(EMAIL_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering Email :"+testData);
	}

	public void enterPhone(String testData){
		this.clear(PHONE_INPUT);
		this.type(PHONE_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering Phone :"+testData);
	}
	public void enterContatctFirst(String testData){
		this.clear(CONTACTFIRST_INPUT);
		this.type(CONTACTFIRST_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering Contact First :"+testData);
	}
	public void enterContactLast(String testData){
		this.clear(CONTACTLAST_INPUT);
		this.type(CONTACTLAST_INPUT, testData);
		this.type(CONTACTLAST_INPUT, Keys.ENTER);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering  Contact Last :"+testData);
	}
	public void clickOnOkButton()
	{
		waitForPageToLoad(PAGE_LOADING);
		this.click(OK_BUTTON);
		waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on OK Button.");
	}
	public void clickNewOnOkButton()
	{
		this.click(OK_BUTTON);
		/*waitForPageToLoad(PAGE_LOADING);*/
		reportInfo("Clicking on OK Button.");
	}
	public void clickOnEditButton()
	{
		this.click(EDIT_PARTNERS);
		waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on OK Button.");

	}
	public void clickOn_Delete_Button(){
		this.click(DELETE_PARTNERS );
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOn_DeleteYes_Button(){
		this.click(DELETE_PARTNERS_YES );
	}
	public String selectShowEntitiesDropdown() {
		String testData=this.getFirstDropDownLabel(SHOW_ENTITIES_DROPDOWN);
		this.selectDropdown(SHOW_ENTITIES_DROPDOWN, testData);
		reportInfo("Clicking On Show Entities DropDown.");
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}
	public void clickOnFieldSettingsButton() {
		this.click(FIELDSETTINGS_BUTTON);
		reportInfo("Clicking On Field Settings Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void checkNameField() {

		this.check(SETTINGS_NAME_CHECKBOX);
		reportInfo("Check Field Settings First Column Checkbox.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void uncheckNameField() {
		this.uncheck(SETTINGS_NAME_CHECKBOX);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public int checkedColumns(By by){
		int count=0;
		reportInfo("Fetching number of Checked Columns in Fieldsettings.");
		List<WebElement> checkBoxList = getWebElementList(by);
		for(WebElement l:checkBoxList){
			boolean flag=l.isSelected();
			if(flag==true){
				count=count+1;
			}
		}
		return count;
	}
	
	public int partnersTableColumns(By by){
		int count = 0;
		reportInfo("Fetching Number of Columns in Table.");
		List<WebElement> DMAColumnList = getWebElementList(by);
		for(WebElement tr:DMAColumnList){
			if(tr.getAttribute("class").equalsIgnoreCase("ng-scope")){
				count=count+1;
			}
		}
		return count-1;
	}
	

	public void clickonSortNameButton(){
		this.click(PARTNERS_SORT_BY_NAME);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public List<String> expectedList(By by,String testData){ 
		List<String> list1 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(PARTNERS_TABLE_NAME_COLUMN); 
		for (WebElement element : memberTableNameColumn) { 
			list1.add(element.getText()); 
		} 
		Collections.sort(list1); 
		System.out.println(list1);
		//Collections.reverse(list1); 
		reportInfo(testData);
		return list1; 
	}
	public List<String> actualList(By by,String testData){ 
		List<String> list1 = new ArrayList<String>(); 
		List<WebElement> memberTableNameColumn = getWebElementList(PARTNERS_TABLE_NAME_COLUMN); 
		for (WebElement element : memberTableNameColumn) { 
			list1.add(element.getText()); 
		} 
		reportInfo(testData);
		return list1; 
	} 
	public boolean sortingByName() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList(PARTNERS_TABLE_NAME_COLUMN);
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
		/* String previous = ""; // empty string

		    for (String current: list1) {
		    	System.out.println(current);
		        if (current.compareTo(previous) < 0)
		        {
		            return false;
		        }
		        previous = current;
		    }
		return true;*/
		
	}
	public class SortIgnoreCase implements Comparator<Object> {
		public int compare(Object o1, Object o2) {
			String s1 = (String) o1;
			String s2 = (String) o2;
			return s1.toLowerCase().compareTo(s2.toLowerCase());
		}
	}
	public void clickonSortCodeButton(){
		this.click(PARTNERS_SORT_BY_CODE);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public boolean sortingByCode() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList(PARTNERS_TABLE_CODE_COLUMN);
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
		this.click(PARTNERS_SORT_BY_STATUS);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public boolean sortingByStatus() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList(PARTNERS_TABLE_STATUS_COLUMN);
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
	public void assertPartnersError(String testType)
	{
		reportInfo("Validating Partner Error message");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(VALIDATE_PARTNERS_ERROR);
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
				String successFilePath = elementScreenshot(VALIDATION_ERROR);
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

	public void assertCheckedColumns(String testType) {
		reportInfo("Validating Visible Columns In Table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);
				List<WebElement> memberColumnList = getWebElementList(PARTNERS_TABLE_HEADER);
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
	public void assertUncheckedColumns(String testType) {
		reportInfo("Validating PursePolicies Invisible columns in Location Table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> memberColumnList = getWebElementList(PARTNERS_TABLE_HEADER);
				String count = "0";
				for (WebElement w : memberColumnList) {
					if (w.getText() == "Name") {
						count = count + 1;
					}
					Assert.assertEquals(count, "0");
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
	public boolean validatePagination(int expected, String testType) {
		boolean flag = false;
		reportInfo("Validating Pagination");
				List<WebElement> rows = getWebElementList(PARTNERS_TABLE);
				int count = rows.size();
				if(count<=expected){
					flag=true;
				}
		return flag;
	}

	public String getText(By by,String testData){
		reportInfo(testData);
		return this.getText(by);
	}
	
	
	public void assertText(String expected, String actual, By by, String message){
		if(expected.equalsIgnoreCase(actual)){
			reportPassedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			String successFilePath = elementScreenshot(by);
			reportSuccessScreenshot(successFilePath,message);
		}else{
			reportFailedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
		}
	}

	public void assertLocationPopup(String expected, String testType)
	{
		reportInfo("Validating Location Delete Or Not");
		try {
			if (this.getText(DELETE_PARTNER_SUCCESSFUL).equals(expected)) {
				Assert.assertEquals(this.getText(DELETE_PARTNER_SUCCESSFUL), expected);
				reportPassedStatus("Verified Location Delete Or Not");
				String successFilePath = elementScreenshot(DELETE_PARTNER_SUCCESSFUL);
				reportSuccessScreenshot(successFilePath,""); 
			} else {
				String successFilePath = elementScreenshot(DELETE_PARTNER_SUCCESSFUL);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}
	public void assertpartnersName(String expected, String testType)
	{
		reportInfo("Validating partners Name");
		try {
			if (this.getText(VALIDATE_PARTNERS).equals(expected)) {
				Assert.assertEquals(this.getText(VALIDATE_PARTNERS), expected);
				reportPassedStatus("Verified pursepolicies Name");
				String successFilePath = elementScreenshot(VALIDATE_PARTNERS);
				reportSuccessScreenshot(successFilePath,""); 
			} else {
				String successFilePath = elementScreenshot(VALIDATE_PARTNERS);
				reportFailureScreenshot(successFilePath);
				

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}

	}
	public void assertBoolean(Boolean expected, Boolean actual, By by, String message){
		if(expected==actual){
			reportPassedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			JavascriptExecutor jse =(JavascriptExecutor)driver;
			jse.executeScript("scroll(0, 250);");
			String successFilePath = elementScreenshot(by);
			reportSuccessScreenshot(successFilePath,message);
		}else{
			reportFailedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
		}
	}
	public void assertObject(Object expected, Object actual, String message){
		if(expected.equals(actual)){
			reportPassedStatus("Expected [ "+expected+" ] ");
			reportPassedStatus(" Actual [ "+actual+" ]");
			JavascriptExecutor jse =(JavascriptExecutor)driver;
			jse.executeScript("scroll(0, 250);");

		}else{
			reportFailedStatus("Expected [ "+expected+" ] ");
			reportFailedStatus(" Actual [ "+actual+" ]");

		}
	}
	public void assertInt(int expected, int actual,By by,String message){
		if(expected==actual){
			reportPassedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0, 250);");
			String successFilePath = elementScreenshot(by);
			reportSuccessScreenshot(successFilePath,message);
		}else{
			reportFailedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
		}
	}
}


