package selenium.framework.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import selenium.framework.common.PageControls;

public class MemberPreferencesPage extends PageControls{
	public MemberPreferencesPage(WebDriver driver) {
		super(driver);
	}
	public  final By ADD_PREFERENCE_BUTTON = By.xpath("//a[@id='addPreferenceButton']");
	public  final By PAGE_LOADING = By.xpath("//div[@class='loading'][@style='display: block;']");
	public  final By PREFERENCE_NAME_DROPDOWN = By.name("name");
	public final By PREFERENCE_VALUE_INPUT = By.xpath("//textarea[@name='value']");
	public  final By SELECT_PREFERENCE_VALUE = By.name("value");
	public  final By PREFERENCE_EXPIRATION_DATE_INPUT = By.xpath("//*[@id='expirationDate-dme']");
	public  final By PREFERENCE_OPT_IN_DATE_INPUT = By.xpath("//input[@id='optedInDate-dme']");
	public  final By PREFERENCE_AUTOMATIC_OPT_IN_DATE_INPUT = By.xpath("(//input[@type='text'])[4]");
	public  final By INFERRED_RADIO_BUTTON = By.xpath("//input[@id='myonoffswitch+Inferred']");
	public  final By PENDING_OPT_IN_RADIO_BUTTON = By.xpath("//input[@id='myonoffswitch+Pending Opt-in']");
	public  final By OK_BUTTON = By.xpath("//div[@class='modal-footer']//button[1]");
	public  final By PREFERENCE_ADDED_SUCCESSFULLY_POP_UP = By.className("toast-message");
	public  final By PREFERENCE_TABLE_NAME_COLUMN = By.xpath("//table[@id='memberPreferenceTable']//tbody//tr//td[3]");
	public  final By PREFERENCE_ADVANCED_SEARCH_BUTTON = By.xpath(".//*[@id='advanced-search-button']");
	public  final By ENTER_ADVANCED_SEARCH_NAME_INPUT = By.xpath("//input[@placeholder='Preference']");
	public  final By SELECT_FIRST_VALUE_IN_ADVANCED_SEARCH = By.xpath("//ul[@class='dropdown-menu ng-isolate-scope']//li[1]//a");
	public  final By ADVANCED_SEARCH_OK_BUTTON = By.xpath("//button[@class='btn btn-primary ok_button']");
	public  final By PREFERENCE_NAME_COLUMN = By.xpath("//table[@id='memberPreferenceTable']//tbody//tr[1]//td[3]");
	public  final By EDIT_MEMBER_PREFERENCE_BUTTON = By.xpath("(//a[@tooltip='Edit'])[2]");
	public  final By PREFERENCE_VALUE_COLUMN = By.xpath("//table[@id='memberPreferenceTable']//tbody//tr[1]//td[5]");
	public  final By DELETE_MEMBER_PREFERENCE_BUTTON = By.xpath("//*[@class='lm-action-delete ios ng-scope']");
	public  final By DELETE_PREFERENCE_OK_BUTTON = By.xpath("//button[@class='btn btn-primary ok_button']");
	public  final By NEXT_BUTTON = By.linkText("Next");
	public  final By PREVIOUS_BUTTON = By.linkText("Previous");
	public  final By NEXT_BUTTON_CLASS_NAME = By.xpath("//li[@id='Table_next']");
	public  final By PREVIOUS_BUTTON_CLASS_NAME = By.xpath("//li[@id='Table_previous']");
	public  final By VALIDATE_PREVIOUS_BUTTON = By.xpath(".//*[@id='Table_paginate']/ul/li[2]");
	public  final By VALIDATE_NEXT_BUTTON = By.xpath(".//*[@id='Table_paginate']/ul/li[3]");
	public  final By SHOW_ENTITIES_DROPDOWN = By.name("memberPreferenceTable_length");
	public  final By MEMBERPREFERENCE_TABLE = By.xpath("//table[@id='memberPreferenceTable']/tbody/tr");
	public  final By FIELDSETTINGS_BUTTON = By.xpath("//a[@id='show-table-options']/i");
	public  final By SETTINGS_NAME_CHECKBOX = By.xpath("//*[@id='spec']/li[1]/label/input");
	public  final By SETTINGS_ALL_COLUMNS_CHECKBOX = By.xpath("//ul[@id='spec']//li//input");
	public  final By MEMBERPREFERENCE_TABLE_HEADER = By.xpath("//*[@id='memberPreferenceTable']//thead//tr//th");
	public  final By VALIDATION_ERROR = By.xpath("//div[@class='alert alert-danger alert-block']");
	public  final By PREFERENCE_CANCEL_BUTTON = By.xpath("//div[@class='modal-footer']//button[2]");
	public  final By FIELDSETTINGS_FIRST_VALUE = By.xpath(".//*[@id='spec']/li[1]");
	public  final By VALIDATION_ERROR_POPUP=By.xpath("//div[@class='alert alert-danger alert-block' and contains(.,'Validation Error Duplicate value')]");
	public final By TABLE_PREFERENCES = By.xpath("//table[@id='memberPreferenceTable']/tbody/tr");

	public void clickOnAddPreferenceButton(){
		this.click(ADD_PREFERENCE_BUTTON);
		reportInfo("Clicking On Add Preference Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public String getExistingPreferencename(){
		String testData=this.getText(PREFERENCE_NAME_COLUMN);
		return testData;
	}

	public String addPreference() {
		String testData=null; 

		List<String> list1 = new ArrayList<String>(); 
		List<String> list2 = new ArrayList<String>(); 
		List<WebElement> preferences=getWebElementList(PREFERENCE_TABLE_NAME_COLUMN); 
		this.click(ADD_PREFERENCE_BUTTON); 
		Select select = new Select(waitForElement(PREFERENCE_NAME_DROPDOWN)); 
		List<WebElement> options = select.getOptions(); 
		for (WebElement e : options) { 
			list1.add(e.getAttribute("label")); 
		} 
		for(WebElement e :preferences){ 
			list2.add(e.getText()); 
		} 
		list1.removeAll(list2); 
		if(list1.size()>1){
			testData=list1.get(1); 
			System.out.println(testData); 
			if(testData!=null){ 
				this.selectDropdown(PREFERENCE_NAME_DROPDOWN, testData); 
				System.out.println("selecting dropdown. :"+testData);
			}
		}
		return testData;
	}

	public void selectPreferencename(String testData){
		this.selectDropdown(PREFERENCE_NAME_DROPDOWN, testData);
		reportInfo("Selecting Preference Name. :"+testData);
	}

	public String selectPreferenceValue(){
		//String testData=this.getFirstDropDownLabel(SELECT_PREFERENCE_VALUE);
		//this.selectDropdown(SELECT_PREFERENCE_VALUE, testData);
		String testData = "Yes";
		this.clear(PREFERENCE_VALUE_INPUT);
		this.type(PREFERENCE_VALUE_INPUT, testData);
		reportInfo("Selecting Preference Value. :"+testData);
		//this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}
	public void enterPreferenceExpirationDate(String testData){
		//this.clear(PREFERENCE_EXPIRATION_DATE_INPUT);
		this.type(PREFERENCE_EXPIRATION_DATE_INPUT, testData);
		reportInfo("Enter Preference Expiration Date. :"+testData);
		//this.waitForPageToLoad(PAGE_LOADING);
	}
	public void enterPreferenceOptInDate(String testData){
		//this.clear(PREFERENCE_OPT_IN_DATE_INPUT);
		this.type(PREFERENCE_OPT_IN_DATE_INPUT, testData);
		reportInfo("Enter PREFERENCEC_OPT_IN_DATE_INPUT :"+testData);
		//this.waitForPageToLoad(PAGE_LOADING);
	}
	/*public void enterPreferenceAutomaticOptInDate(String testData){
		this.clear(PREFERENCE_AUTOMATIC_OPT_IN_DATE_INPUT);
		this.type(PREFERENCE_AUTOMATIC_OPT_IN_DATE_INPUT, testData);
		reportInfo("Enter Preference Automatic Opt-In Date. :"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
	}*/
	public void clickOnPendingOptInButton(){
		this.click(PENDING_OPT_IN_RADIO_BUTTON);
		reportInfo("Clicking On Pending OptIn Button. ");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnInferredButton(){
		this.click(INFERRED_RADIO_BUTTON);
		reportInfo("Clicking On Inferred Button. ");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void clickOnOKButton(){
		this.click(OK_BUTTON);
		reportInfo("Clicking On OK Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnOKButton(boolean testData){
		this.click(OK_BUTTON);
		reportInfo("Clicking On OK Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnCancelButton(){
		this.click(PREFERENCE_CANCEL_BUTTON);
		reportInfo("Clicking On Cancel Button.");
		this.waitForPageToLoad(PAGE_LOADING);

	}
	public void enterAdvancedSearchNameInput(String testData){
		this.type(ENTER_ADVANCED_SEARCH_NAME_INPUT, testData);
		reportInfo("Enter Advanced Search Name Input. :"+testData);
		//this.waitForPageToLoad(PAGE_LOADING);
		//this.click(ADVANCED_SEARCH_OK_BUTTON);
	}
	public void clickOnAvancedSearchButton(){
		this.click(PREFERENCE_ADVANCED_SEARCH_BUTTON);
		reportInfo("Clicking On Advanced Search Button.");
		//this.waitForPageToLoad(PAGE_LOADING);

	}
	public void clickOnAvancedSearchOKButton(){
		this.click(ADVANCED_SEARCH_OK_BUTTON);
		reportInfo("Clicking On Advanced Search OK Button.");
		this.waitForPageToLoad(PAGE_LOADING);

	}
	public void pageRefresh(){
		driver.navigate().refresh(); 
		System.out.println("Refreshing Web Page."); 
		this.waitForPageToLoad(PAGE_LOADING); 
	}
	public void clickOnEditButton(){
		this.click(EDIT_MEMBER_PREFERENCE_BUTTON);
		reportInfo("Clicking On Edit Button.");
		this.waitForPageToLoad(PAGE_LOADING);

	}
	public void clickOnDeleteButton(){
		this.click(DELETE_MEMBER_PREFERENCE_BUTTON);
		reportInfo("Clicking On Delete Button.");
		//this.waitForPageToLoad(PAGE_LOADING);

	}
	public void clickOnDeleteOKButton(){
		this.click(DELETE_PREFERENCE_OK_BUTTON);
		reportInfo("Clicking On OK Button.");
		//this.waitForPageToLoad(PAGE_LOADING);

	}
	public int getPreferenceTableRowSize(){
		return getRowSize(TABLE_PREFERENCES);
	}
	/**
	 * MethodName:selectShowEntitiesDropdown() 
	 * Description:This method used to select the value in showEntities DropDown
	 * @param testData
	 */
	public String selectShowEntitiesDropdown() {
		String testData=this.getFirstDropDownLabel(SHOW_ENTITIES_DROPDOWN);
		this.selectDropdown(SHOW_ENTITIES_DROPDOWN, testData);
		reportInfo("Clicking On Show Entities DropDown");
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}


	/**
	 * MethodName: clickOnFieldSettingsButton() 
	 * Description: This method is used to click on field settings button.
	 */
	public void clickOnFieldSettingsButton() {
		this.click(FIELDSETTINGS_BUTTON);
		reportInfo("Clicking On Field Settings Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	/**
	 * MethodName: checkNameField() 
	 * Description: This method is used to check the name field in field settings
	 */
	public void checkNameField() {

		this.check(SETTINGS_NAME_CHECKBOX);
		reportInfo("Clicking Field Settings Name Checkbox");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	/**
	 * MethodName: uncheckNameField() 
	 * Description: This method is used to uncheck the name field in field settings
	 */
	public void uncheckNameField() {
		System.out.println(this.getText(SETTINGS_NAME_CHECKBOX));
		this.uncheck(SETTINGS_NAME_CHECKBOX);
		this.waitForPageToLoad(PAGE_LOADING);
	}


	/**
	 * clickOnNextButton() 
	 * Description: This method is used to click on Next Button
	 */
	public int clickOnNextButton() {
		int count=0;
		WebElement ele=driver.findElement(NEXT_BUTTON_CLASS_NAME);
		String classname=ele.getAttribute("class");
		if(classname != null && classname.contains("disabled")){
			reportInfo("Next Button Is Disabled");
		}
		else{
			this.click(NEXT_BUTTON);
			waitForPageToLoad(PAGE_LOADING);
			reportInfo("Clicking On Next Button to navigate to Next Page");
			count++;

		}
		return count;
	}
	public int clickOnPreviousButton(){
		int count=0;
		WebElement ele=driver.findElement(PREVIOUS_BUTTON_CLASS_NAME);
		String classname=ele.getAttribute("class");
		if(classname != null && classname.contains("disabled")){
			reportInfo("Previous Button Is Disabled");
		}
		else{
			this.click(PREVIOUS_BUTTON);
			waitForPageToLoad(PAGE_LOADING);
			reportInfo("Clicking On Previous Button to navigate to previous Page");
			count++;

		}
		return count;
	}
	public String getText(By by,String testData){
		reportInfo(testData);
		return this.getText(by);

	}
	public String getClassname(By by,String testData){ 
		reportInfo(testData); 
		WebElement ele=driver.findElement(by); 
		String classname=ele.getAttribute("class"); 
		return classname; 

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

	public int transactionTableColumns(By by){
		int count=0;
		reportInfo("Fetching number of columns in table.");
		List<WebElement> preferenceColumnList = getWebElementList(by);
		for(WebElement l:preferenceColumnList){
			if(l.getAttribute("class").equalsIgnoreCase("ng-scope") || l.getAttribute("class").equalsIgnoreCase("dragtable-drag-boundary") || l.getAttribute("class").equalsIgnoreCase("ng-scope dragtable-drag-boundary")){
				count=count+1;
			}
		}
		return count-1;
	}
	public int preferenceTableColumns(By by){
		int count=1;
		reportInfo("Fetching number of columns in table.");
		List<WebElement> preferenceColumnList = getWebElementList(by);
		for(WebElement l:preferenceColumnList){
			if(l.getAttribute("class").equalsIgnoreCase("ng-scope") || l.getAttribute("class").equalsIgnoreCase("dragtable-drag-boundary")){
				count=count+1;
			}
		}
		return count;
	}

	public void assertText(String expected, String actual, By by, String message){
		if(expected.equalsIgnoreCase(actual)){
			reportPassedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			String successFilePath = elementScreenshot(by);
			reportSuccessScreenshot(successFilePath,message);
		}else{
			reportFailedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			this.scrollDown();
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
		}
	}
	public void assertTable(int expected, int actual, By by, String message){
		if(expected==actual){
			reportPassedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			String successFilePath = elementScreenshot(by);
			reportSuccessScreenshot(successFilePath,message);
		}else{
			reportFailedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			this.scrollDown();
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
		}
	}
	public void assertContainsText(String expected, String actual, By by, String message){
		if(actual.contains(expected)){
			reportPassedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			String successFilePath = elementScreenshot(by);
			reportSuccessScreenshot(successFilePath,message);
		}else{
			reportFailedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			this.scrollDown();
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
		}
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
	
	public List<WebElement> getPreferenceNaemColumn(){
		List<WebElement> l1=getWebElementList(PREFERENCE_TABLE_NAME_COLUMN);
		for(WebElement l: l1){
			System.out.println("Added Preferences:"+l.getText());
		}
		return l1;
	}

	/**
	 * MethodName: validatePagination() 
	 * Description: This method is used to Validate Pagination
	 */
	public boolean validatePagination(int expected, String testType) {
		boolean flag=false;

		List<WebElement> rows = getWebElementList(MEMBERPREFERENCE_TABLE);
		int count = rows.size();
		if(count<=expected){
			flag=true;
		}
		return flag;

	}

	/**
	 *MethodName: assertCheckedColumns() 
	 *Description: This method is used to validate visible columns in member table
	 */
	public void assertCheckedColumns(String testType) {
		reportInfo("Validating Member visible columns in member table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);
				List<WebElement> memberColumnList = getWebElementList(MEMBERPREFERENCE_TABLE_HEADER);
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
	public void assertValidationError(String expected, String testType) {
		reportInfo("Validating Preference Value");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(VALIDATION_ERROR);
				reportSuccessScreenshot(successFilePath,"");
			} else {


			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}
	/**
	 *MethodName: assertUncheckedColumns() 
	 *Description: This method is used to validate Invisible columns in member table
	 */
	public void assertUncheckedColumns(String testType) {
		reportInfo("Validating Member Invisible columns in member table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> memberColumnList = getWebElementList(MEMBERPREFERENCE_TABLE_HEADER);
				String count = "0";
				for (WebElement w : memberColumnList) {
					if (w.getText() == this.getText(FIELDSETTINGS_FIRST_VALUE)) {
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

}
