package selenium.framework.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.google.common.collect.Ordering;

import lm.rcx.pojo.RewardPolicyPojo;
import selenium.framework.common.PageControls;

public class RewardPoliciesPage extends PageControls {

	public  final By ADD_REWARD_POLICY_BUTTON = By.xpath("//a[@id='dialog']");
	public  final By REWARD_POLICY_NAME_INPUT  = By.xpath("//*[@name='name']");
	public  final By REWARD_POLICY_DESCRIPTION_INPUT  = By.xpath("//*[@name='desc']");
	public  final By REWARD_POLICY_USES_lEFT_INPUT  = By.xpath("//input[@name='numUses']");
	public  final By REWARD_POLICY_EXPIRATION_HOURS_INPUT  = By.xpath("//*[@id='expirationDate-dme']");
	public  final By REWARD_POLICY_EXPIRATION_SNAP_TO_DROPDOWN  = By.xpath("//input[@name='expirationSnapTo']");
	public  final By REWARD_POLICY_EXPIRATION_SNAP_TO_DROPDOWN_OPTIONS  = By.xpath("//input[@name='expirationSnapTo']//option");
	public  final By REWARD_POLICY_ACTIVITY_BASED_EXPIRATION_RADIOBUTTON  = By.xpath("//span[@class='onoffswitch-switch']");
	public final By SELECT_INTENDED_USE=By.xpath("//select[@placeholder='Intended Use']");
	public  final By ADD_REWARD_POLICY_OK_BUTTON  = By.xpath("//button[@class='btn btn-primary ok_button']");
	public  final By ADD_REWARD_POLICY_CANCEL_BUTTON  = By.xpath("//footer//button[2]");
	public  final By PAGE_LOADING = By.xpath("//div[@class='loading' and style='display: block;']");
	public  final By REWARD_POLICY_SEARCH_INPUT  = By.xpath("//*[@placeholder='Name']");
	public  final By SUGGESTION_INPUT=By.xpath("//label/ul/li/a");
	public  final By ADVANCED_SEARCH_BUTTON = By.xpath(".//*[@id='advanced-search-button']");
	public  final By REWARD_POLICY_TABLE_NAME_COLUMN = By.xpath("//table[@id='rewardPolicyTable']//tbody//tr[1]//td[3]");
	public  final By REWARD_POLICY_EDIT_BUTTON = By.xpath("//a[@class='lm-action-update ios ng-scope']");
	public  final By REWARD_POLICY_DELETE_BUTTON = By.xpath("//div[@class='project-actions ng-scope']//span[2]");
	public  final By REWARD_POLICY_DELETE_POPUP = By.xpath(".//*[@class='toast-message']");
	public  final By VALIDATION_ERROR_POPUP_TEXT = By.xpath(".//*[@class='toast-message']");
	public  final By DELETE_REWARD_POLICY_OK_BUTTON = By.xpath("//button[@class='btn btn-primary ok_button']");
	public  final By REWARD_POLICY_SHOW_ENTITIES_DROPDOWN = By.xpath(".//*[@id='rewardPolicyTable_length']/label/select");
	public  final By REWARDPOLICY_TABLE = By.xpath("//table[@id='rewardPolicyTable']/tbody/tr");
	public  final By FIELDSETTINGS_BUTTON = By.xpath(".//*[@id='show-table-options']");
	public  final By SETTINGS_NAME_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li[1]//input");
	public  final By SETTINGS_ALL_COLUMNS_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li//input");
	public  final By REWARDPOLICIES_TABLE_HEADER = By.xpath("//*[@id='rewardPolicyTable']//thead//tr//th");
	public  final By COLLAPSE_BUTTON = By.xpath("//a[@class='button-icon jarviswidget-toggle-btn']");
	public  final By COLLAPSER_BUTTON_CLASSNAME = By.xpath("//div[@id='wid-id-policiesWiget']");
	public  final By REWARDPOLICIES_TABLE_NAME_SORT_BUTTON = By.xpath(".//*[@id='rewardPolicyTable']//thead//tr//th[3]");
	public  final By REWARDPOLICY_TABLE_NAME_COLUMN = By.xpath("//table[@id='rewardPolicyTable']/tbody//tr//td[3]");
	public  final By VALIDATION_ERROR = By.xpath("//div[@class='alert alert-danger alert-block']");
	public  final By INVALID_FORMAt_ERROR = By.xpath("//em[@class='invalid ng-binding ng-scope']");
	public  final By NEXT_BUTTON_CLASS_NAME = By.xpath("//li[@id='rewardPolicyTable_next']");
	public  final By NEXT_BUTTON = By.linkText("Next");
	public  final By VALIDATE_NEXT_BUTTON = By.xpath("//div[@id='rewardPolicyTable_paginate']//li[3]");
	public  final By PREVIOUS_BUTTON = By.linkText("Previous");
	public  final By PREVIOUS_BUTTON_CLASS_NAME = By.xpath("//li[@id='rewardPolicyTable_previous']");
	public  final By VALIDATE_PREVIOUS_BUTTON = By.xpath("//div[@id='rewardPolicyTable_paginate']//li[2]");
	public  final By REWARDPOLICY_SORT_BY_CREATED=By.xpath(".//*[@id='rewardPolicyTable']//thead//tr//th[5]");
	public  final By REWARDPOLICY_TABLE_CREATED_COLUMN=By.xpath("//*[@id='rewardPolicyTable']//tbody//tr//td[5]");
	public  final By REWARDPOLICY_SORT_BY_UPDATED=By.xpath(".//*[@id='rewardPolicyTable']//thead//tr//th[6]");
	public  final By REWARDPOLICY_TABLE_UPDATED_COLUMN=By.xpath("//*[@id='rewardPolicyTable']//tbody//tr//td[6]");
	public  final By REWARDPOLICY_TABLE_LENGTH = By.xpath(".//*[@id='rewardPolicyTable']/tbody/tr/td");
	public  final By REWARDPOLICY_TABLE1 = By.xpath("//table[@id='rewardPolicyTable']/tbody");
	public final By  EXPIRYWARNINGDAYS_INPUT=By.xpath("//*[@name='expiryWarningDays']");
	public final By rewardimageURL=By.xpath("//*[@name='url']");
	public final By rewardUPC=By.xpath("//*[@name='upc']");
	public final By rewardPriority=By.xpath("//*[@name='priority']");
	public final By rewardUsesLeft=By.xpath("//*[@placeholder='Uses Left']");
	public final By rewardOffset=By.xpath("//*[@placeholder='Offset']");
	

	public RewardPoliciesPage(WebDriver driver) {
		super(driver);

	}
	public void clickOnAddRewardPolicyButton(){
		//this.pause(1000);
		this.waitForPageToLoad(PAGE_LOADING);
		this.click(ADD_REWARD_POLICY_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On Add RewardPolicy Button.");
	}
	public void enterRewardPolicyName(String testData){
		this.clear(REWARD_POLICY_NAME_INPUT);
		this.type(REWARD_POLICY_NAME_INPUT, testData);
		reportInfo("Entering RewardPolicy Name. :"+testData);
	}
	public void enterRewardPolicyDescription(String testData){
		this.clear(REWARD_POLICY_DESCRIPTION_INPUT);
		this.type(REWARD_POLICY_DESCRIPTION_INPUT, testData);
		reportInfo("Entering RewardPolicy Description. :"+testData);
	}
	public void enterRewardPolicyUsesLeft(String testData){
		this.type(REWARD_POLICY_USES_lEFT_INPUT, testData);
		reportInfo("Entering RewardPolicy Usesleft. :"+testData);
	}
	public void enterRewardPolicyExpirationHours(String testData){
		this.type(REWARD_POLICY_EXPIRATION_HOURS_INPUT, testData);
		reportInfo("Entering RewardPolicy Expiration Hours Input. :"+testData);
	}
	public void selectRewardPolicyExpirationSnapTo(){
		String tmp=this.getFirstDropDownValue(REWARD_POLICY_EXPIRATION_SNAP_TO_DROPDOWN_OPTIONS);
		this.selectDropdown(REWARD_POLICY_EXPIRATION_SNAP_TO_DROPDOWN, tmp);
		reportInfo("Selecting RewardPolicy ExpirationSnapTo");
	}
	public void clickOnActivityBasedExpirationRadioButton(){
		this.click(REWARD_POLICY_ACTIVITY_BASED_EXPIRATION_RADIOBUTTON);
		reportInfo("Clicking On Activity Based Expiration Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void selectIntendedUse(){
		String testData=this.getFirstDropDownLabel(SELECT_INTENDED_USE);
		this.selectDropdown(SELECT_INTENDED_USE, testData);
		reportInfo("Selecting Intended Use:"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnAddRewardPolicyOKButton(){
		this.waitForPageToLoad(PAGE_LOADING);
		this.click(ADD_REWARD_POLICY_OK_BUTTON);
		reportInfo("Clicking On Add Reward policy OK Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnAddRewardPolicyOKButton(Boolean flag){
		this.click(ADD_REWARD_POLICY_OK_BUTTON);
		reportInfo("Clicking On OK Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnAddRewardPolicyCancelButton(){
		this.click(ADD_REWARD_POLICY_CANCEL_BUTTON);
		reportInfo("Clicking On Cancel Button");

	}
	public void clickOnAdvancedSearchButton(){
		this.click(ADVANCED_SEARCH_BUTTON);
		reportInfo("Clicking On Advanced Search Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void enterRewardPolicySearchInput(String testData){
		this.type(REWARD_POLICY_SEARCH_INPUT,testData);
		reportInfo("Entering search input. :"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
		//this.click(SUGGESTION_INPUT);
		this.waitForPageToLoad(PAGE_LOADING);
		this.scrollDown();
	}
	public void clickOnRewardPolicyEditButton(){
		this.click(REWARD_POLICY_EDIT_BUTTON);
		reportInfo("Clicking On Reward policy Edit Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnRewardPolicyDeleteButton(){
		this.click(REWARD_POLICY_DELETE_BUTTON);
		reportInfo("Clicking On Reward policy Delete Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnRewardPolicyDeleteOKButton(){
		this.click(DELETE_REWARD_POLICY_OK_BUTTON);
		reportInfo("Clicking On Reward policy Delete OK Button");
		//this.waitForPageToLoad(PAGE_LOADING);
	}
	/**
	 * MethodName:selectShowEntitiesDropdown() 
	 * Description:This method used to select the value in showEntities DropDown
	 * @param testData
	 */
	public String selectShowEntitiesDropdown() {
		String testData=this.getFirstDropDownLabel(REWARD_POLICY_SHOW_ENTITIES_DROPDOWN);
		this.selectDropdown(REWARD_POLICY_SHOW_ENTITIES_DROPDOWN, testData);
		reportInfo("Selecting Show Entities DropDown :"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}
	/**
	 * MethodName: clickOnFieldSettingsButton() 
	 * Description: This method is used to click on field settings button.
	 */
	public void clickOnFieldSettingsButton() {
		this.click(FIELDSETTINGS_BUTTON);
		reportInfo("Clicking On Field Settings Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	/**
	 * MethodName: checkNameField() 
	 * Description: This method is used to check the name field in field settings
	 */
	public void checkNameField() {

		this.check(SETTINGS_NAME_CHECKBOX);
		reportInfo("Check Field Settings Name Checkbox");
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
		String successFilePath = elementScreenshot(SETTINGS_NAME_CHECKBOX);
		reportSuccessScreenshot(successFilePath,"");
	}
	/**
	 * MethodName: clickOnCollapseButton() 
	 * Description: This method is used to click on collapse button.
	 */
	public void clickOnCollapseButton() {
		this.click(COLLAPSE_BUTTON);
		reportInfo("Clicking On Collapse Button");
		waitForPageToLoad(PAGE_LOADING);
	}
	/**
	 * MethodName:clickOnNameSortButton() 
	 * Description: This method is used to click on Name Sort Button
	 */
	public void clickOnNameSortButton() {
		this.click(REWARDPOLICIES_TABLE_NAME_SORT_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On Sort By Name Button");
	}
	public String getText(By by,String testData){
		
		return this.getText(by);
	}
	public String getClassname(By by,String testData){ 
        reportInfo(testData); 
        WebElement ele=driver.findElement(by); 
        String classname=ele.getAttribute("class"); 
        return classname; 
        
}
	public int RewardPolicyTable(){
		int tableLength=0;
		WebElement ele=driver.findElement(REWARDPOLICY_TABLE_LENGTH);
		String classname=ele.getAttribute("class");
		if(classname.contains("dataTables_empty")){
			String successFilePath = elementScreenshot(REWARDPOLICY_TABLE1);
			reportSuccessScreenshot(successFilePath,"Reward Plicy Table is empty.");
			tableLength=1;
		}
		return tableLength;
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
	public int clickOnPreviousButton() {
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
	public void clickonSortCreatedButton(){
		this.click(REWARDPOLICY_SORT_BY_CREATED);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public boolean sortingByCreated() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList(REWARDPOLICY_TABLE_CREATED_COLUMN);
		for (WebElement element : sortingTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		Collections.sort(list1,new SortIgnoreCase1());
		/*System.out.println("After Reverse"+list1);
		System.out.println("List2 is"+list2);*/
		boolean sorted=Ordering.natural().isOrdered(list1);
		return sorted;
	}
	public class SortIgnoreCase1 implements Comparator<Object> {
		public int compare(Object o1, Object o2) {
			String s1 = (String) o1;
			String s2 = (String) o2;
			return s1.toLowerCase().compareTo(s2.toLowerCase());
		}
	}
	public void clickonSortUpdatedButton(){
		this.click(REWARDPOLICY_SORT_BY_UPDATED);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public boolean sortingByUpdated() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList(REWARDPOLICY_TABLE_UPDATED_COLUMN);
		for (WebElement element : sortingTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		Collections.sort(list1,new SortIgnoreCase1());
		/*System.out.println("After Reverse"+list1);
		System.out.println("List2 is"+list2);*/
		boolean sorted=Ordering.natural().isOrdered(list1);
		return sorted;
	}
	public class SortIgnoreCase2 implements Comparator<Object> {
		public int compare(Object o1, Object o2) {
			String s1 = (String) o1;
			String s2 = (String) o2;
			return s1.toLowerCase().compareTo(s2.toLowerCase());
		}
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
	
	public HashMap<String, String> addRewardPolicy(){
		HashMap<String, String> rewardPolicyValues = new HashMap<String, String>();
		RewardPolicyPojo rp=new RewardPolicyPojo();
		rewardPolicyValues.put("name", rp.getName());
		clickOnAddRewardPolicyButton();
		enterRewardPolicyName(rp.getName());
		enterRewardPolicyDescription(rp.getDescription());
		enterRewardPolicyExpirationHours(rp.getFutureDate());
		//rewardPoliciesPage.selectRewardPolicyExpirationSnapTo();
		clickOnActivityBasedExpirationRadioButton();
		clickOnAddRewardPolicyOKButton();
		return rewardPolicyValues;
	}
	public void validateRewardPolicyDelete(String expected,String testType) {
		reportInfo("Validating Reward Policy Name");
		try {
			if (this.getText(REWARD_POLICY_DELETE_POPUP).equals(expected)) {
				Assert.assertEquals(this.getText(REWARD_POLICY_DELETE_POPUP), expected);
				reportPassedStatus("Verified Reward Policy Name");
				String successFilePath = elementScreenshot(REWARD_POLICY_DELETE_POPUP);
				reportSuccessScreenshot(successFilePath,"");
				reportInfo("Validated reward Policy Delete Option");
			} else{
				String successFilePath = elementScreenshot(REWARD_POLICY_DELETE_POPUP);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}
	public boolean validatePagination(int expected) {
		boolean flag=false;
		List<WebElement> rows = getWebElementList(REWARDPOLICY_TABLE);
		int count = rows.size();
		if(count<=expected){
			flag=true;
		}
	return flag;
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

	public int RewardPolicyTableColumns(By by){
		int count=0;
		reportInfo("Fetching number of columns in table.");
		List<WebElement> ColumnList = getWebElementList(by);
		for(WebElement we:ColumnList){
			if(we.getAttribute("class").equalsIgnoreCase("ng-scope"));
			count=count++;
		}
		return count-1;
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
	
	public boolean validateCollapseButton(){
		boolean flag=false;
		WebElement ele=driver.findElement(COLLAPSER_BUTTON_CLASSNAME);
		String classname=ele.getAttribute("class");
		if(classname != null && classname.contains("jarviswidget-collapsed")){
			flag=true;
		}

		return flag;

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
	
	public void assertObject(Object expected, Object actual, String message){
		if(expected.equals(actual)){
			reportPassedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");

		}else{
			reportFailedStatus("Expected [ "+expected+" ] ");
			reportFailedStatus(" Actual [ "+actual+" ]");

		}
	}
	
	public List<String> expectedNameList(By by,String testData){ 
		List<String> list1 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(by); 
		for (WebElement element : memberTableNameColumn) { 
			list1.add(element.getText()); 
		} 
		Collections.sort(list1); 
		Collections.reverse(list1); 
		return list1; 
	}
	public boolean sortingByName() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(REWARDPOLICY_TABLE_NAME_COLUMN);
		for (WebElement element : memberTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		Collections.sort(list2);
		Collections.reverse(list2);
		boolean sorted=list1.equals(list2);
		return sorted;
	}

	/**
	 * MethodName: validationErrorPopUp() 
	 * Description: This method is used to assert ValiodationError
	 * @param screenshotName
	 */
	public void validationErrorPopUp(String testType) {
		/*this.waitForPageToLoad(PAGE_LOADING);*/
		reportInfo("Validating Duplicate Records");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(VALIDATION_ERROR);
				reportSuccessScreenshot(successFilePath,"");
				reportPassedStatus("Duplicate Record Error screenshot");
			} else if (testType.equalsIgnoreCase("invalid")) {

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Test Case Failed");
		}

	}
	/**
	 * MethodName: nullValueInmandatoryFieldError() 
	 * Description: This method is used to assert NullValueInMandatoryField
	 * @param screenshotName
	 */
	public void nullValueInmandatoryFieldError(String testType) {
		reportInfo("Validating Null Value in Mandatory fields");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(INVALID_FORMAt_ERROR);
				reportSuccessScreenshot(successFilePath,"Invalid Name Format Screenshot.");
			} else if (testType.equalsIgnoreCase("invalid")) {

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Test Case Failed");
		}
	}
	public void validateNextButton(String testType){
		reportInfo("Validating Next Button");
		WebElement ele=driver.findElement(VALIDATE_NEXT_BUTTON);
		String classname=ele.getAttribute("class");
		try {
			if(classname != null && classname.contains("active")){
				String successFilePath = elementScreenshot(NEXT_BUTTON);
				reportSuccessScreenshot(successFilePath,"Next Button Scereenshot.");
				reportPassedStatus("Verified Next button");
			} else {
				String successFilePath = elementScreenshot(NEXT_BUTTON);
				reportFailureScreenshot(successFilePath);
			}

		}catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Next Button Assertion Failed");
		}
	}
	public void validatePreviousButton(String testType){
		reportInfo("Validating Previous Button");
		WebElement ele=driver.findElement(VALIDATE_PREVIOUS_BUTTON);
		String classname=ele.getAttribute("class");
		try {
			if(classname != null && classname.contains("active")){
				String successFilePath = elementScreenshot(PREVIOUS_BUTTON);
				reportSuccessScreenshot(successFilePath,"Previous Button Screenshot.");
				reportPassedStatus("Verified Previous button");
			} else {
				String successFilePath = elementScreenshot(PREVIOUS_BUTTON);
				reportFailureScreenshot(successFilePath);
			}

		}catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Previous Button Assertion Failed");
		}
	}
	public void expiryWarningDaysInput(String testData){
		this.clear(EXPIRYWARNINGDAYS_INPUT);
		this.type(EXPIRYWARNINGDAYS_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering expiry warning days:"+testData);
	}
public void rewardimageURL(String testData){
	this.clear(rewardimageURL);
	this.type(rewardimageURL,testData);
	this.waitForPageToLoad(PAGE_LOADING);
	reportInfo("Entering reward image URL:"+testData);
}
public void rewardUPC(String testData){
	this.clear(rewardUPC);
	this.type(rewardUPC, testData);
	this.waitForPageToLoad(PAGE_LOADING);
	reportInfo("Entering reward UPC:"+testData);
}
public void rewardPriority(String testData){
	this.clear(rewardPriority);
	this.type(rewardPriority, testData);
	this.waitForPageToLoad(PAGE_LOADING);
	reportInfo("Entering reward UPC:"+testData);
}
public void rewardUsesLeft(String testData){
	this.clear(rewardUsesLeft);
	this.type(rewardUsesLeft, testData);
	this.waitForPageToLoad(PAGE_LOADING); 
	reportInfo("Entering reward UsesLeft:"+testData);
}
public void rewardOffset(String testData){
	this.clear(rewardOffset);
	this.type(rewardOffset, testData);
	this.waitForPageToLoad(PAGE_LOADING);
	reportInfo("Entering reward Offset:"+testData);
}
}
