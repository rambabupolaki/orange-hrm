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

public class SecuritySetUpPage extends PageControls {
	
	public  final By ADD_ROLE_BUTTON = By.xpath("//*[@id='createRole']");
	public  final By ROLE_NAME_INPUT = By.xpath("//*[@name='role']");
	public  final By ADD_ROLE_OK_BUTTON = By.xpath("//*[@class='btn btn-primary ok_button']");
	public  final By ADD_ROLE_CANCEL_BUTTON = By.xpath("//*[@class='btn btn-default cancel_button2']");
	public  final By SEARCH_INPUT = By.xpath("//*[@id='roleTable_filter']//input");
	public  final By VALIDATE_ROLE_NAME = By.xpath("//*[@id='roleTable']//tbody//tr//td[2]");
	public  final By EDIT_ROLE_BUTTON = By.xpath("//*[@id='roleTable']//tbody//tr[1]//td[1]//a[1]//i");
	public  final By DELETE_ROLE_BUTTON = By.xpath("//*[@id='roleTable']//tbody//tr[1]//td[1]//a[2]//i");
	public  final By DELETE_ROLE_YES_BUTTON = By.xpath("//form[@class='ng-pristine ng-valid ng-scope']//div[3]//button[1]");
	public  final By SORT_BUTTON = By.xpath("//*[@id='roleTable']//thead//tr[1]//th[2]");
	public  final By PREVIOUS_BUTTON = By.xpath(".//*[@id='roleTable_previous']/a");
	public  final By NEXT_BUTTON = By.xpath(".//*[@id='roleTable_next']/a");
	public  final By FIELD_SETTINGS_BUTTON = By.xpath("//div[@id='wid-id-acl-roles']//div//div//div//div//div//button");
	public  final By PAGE_LOADING = By.xpath("//div[@class='loading' and style='display: block;']");
	public  final By DELETE_ROLE_POPUP = By.className("toast-message");
	public  final By VALIDATION_ERROR_POPUP = By.className("toast-message");
	public  final By SHOW_ENTITIES_DROPDOWN = By.xpath("//div[@id='roleTable_length']//label//select");
	public  final By ROLE_TABLE_LENGTH = By.xpath("//table[@id='roleTable']/tbody/tr");
	public  final By INVALID_FORMAT_ERROR = By.xpath("//em[@class='invalid ng-binding ng-scope']");
	public  final By VALIDATE_PREVIOUS_BUTTON = By.xpath("//div[@id='roleTable_paginate']//ul//li[2]");
	public  final By VALIDATE_NEXT_BUTTON = By.xpath(".//*[@id='roleTable_paginate']/ul/li[3]");
	public  final By SETTINGS_ALL_COLUMNS_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li//input");
	public  final By ROLE_TABLE_HEADER = By.xpath("//*[@id='roleTable']//thead//tr//th");
	public  final By SETTINGS_NAME_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li//label//input");
	public  final By ROLE_TABLE_NAME_COLUMN = By.xpath("//*[@id='roleTable']//tbody//tr//td[2]");
	public  final By COLLAPSE_BUTTON = By.xpath("//div[@id='wid-id-acl-roles']//header//div[1]/a");
	public  final By COLLAPSE_BUTTON_CLASSNAME=By.xpath("//div[@id='wid-id-acl-roles']");
	public  final By VALIDATION_ERROR=By.xpath("//div[@id='wid-id-acl-roles']");
	public  final By NEXT_BUTTON_CLASS_NAME = By.xpath("//li[@id='roleTable_next']");
	public  final By PREVIOUS_BUTTON_CLASS_NAME = By.xpath("//li[@id='roleTable_previous']");
	public  final By ADD_USER_BUTTON = By.xpath("//div[@id='wid-id-acl-users']//div//section//a");
	public  final By USER_NAME_DROPDOWN = By.xpath("//select[@name='user']");
	public  final By ADD_USER_OK_BUTTON = By.xpath("//div[@class='modal-footer']//button[1]");
	public  final By ADD_USER_CLOSE_BUTTON = By.xpath("//div[@class='modal-footer']//button[2]");
	public  final By ROLE_SEARCH_INPUT = By.xpath("//div[@id='userTable_filter']//label//input");
	public  final By VALIDATE_USER_NAME = By.xpath("//table[@id='userTable']//tbody//tr[1]//td[2]");
	public  final By DELETE_USER_BUTTON = By.xpath("//table[@id='userTable']//tbody//tr[1]//td[1]//a");
	public  final By DELETE_USER_YES_BUTTON = By.xpath("//div[@class='modal-footer']//button[1]");
	public  final By VALIDATE_DELETE_USER = By.xpath("//table[@id='userTable']//tbody//tr[1]//td[1]");
	public  final By USER_SHOW_ENTITIES_DROPDOWN = By.xpath("//div[@id='userTable_length']//label//select");
	public  final By USERS_NEXT_BUTTON = By.xpath("//div[@id='userTable_paginate']//ul//li[3]//a");
	public  final By USERS_PREVIOUS_BUTTON = By.xpath("//div[@id='userTable_paginate']//ul//li[1]//a");
	public  final By VALIDATE_USERS_PREVIOUS_BUTTON = By.xpath("//div[@id='userTable_paginate']//ul//li[2]");
	public  final By VALIDATE_USERS_NEXT_BUTTON = By.xpath("//div[@id='userTable_paginate']//ul//li[3]");
	public  final By USERS_FIELD_SETTINGS_BUTTON = By.xpath("//div[@id='wid-id-acl-users']//div//div//div//div//div//button");
	public  final By USERS_NAME_CHECK_BOX = By.xpath("//ul[@class='ColVis_collection']//li//label//input");
	public  final By USERS_SETTINGS_ALL_COLUMNS_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li//input");
	public  final By USER_TABLE_HEADER = By.xpath("//*[@id='userTable']//thead//tr//th");
	public  final By USER_COLLAPSE_BUTTON = By.xpath("//div[@id='wid-id-acl-users']//header//div//a");
	public  final By USER_COLLAPSE_BUTTON_CLASSNAME=By.xpath("//div[@id='wid-id-acl-users']");
	public  final By USER_SORT_NAME_BUTTON=By.xpath("//table[@id='userTable']//th[2]");
	public  final By USER_TABLE_NAME_COLUMN = By.xpath("//*[@id='userTable']//tbody//tr//td[2]");
	public  final By USER_NEXT_BUTTON_CLASS_NAME = By.xpath("//li[@id='userTable_next']");
	public  final By USER_PREVIOUS_BUTTON_CLASS_NAME = By.xpath("//li[@id='userTable_previous']");
	
	
	public SecuritySetUpPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void clickOnAddRoleButton(){
		this.click(ADD_ROLE_BUTTON);
		reportInfo("Clicking On AddRole Button");
	}
	public void enterRoleName(String testdata){
		this.type(ROLE_NAME_INPUT, testdata);
		reportInfo("Entering Role Name. :"+testdata);
	}
	public void clickOnAddRoleOKButton(){
		this.click(ADD_ROLE_OK_BUTTON);
		reportInfo("Clicking On OK Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnAddRoleCancelButton(){
		this.click(ADD_ROLE_CANCEL_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void enterSearchInput(String testdata){
		this.clear(SEARCH_INPUT);
		this.type(SEARCH_INPUT, testdata);
		reportInfo("Entering Search Input. :"+testdata);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickEditRoleButton(){
		this.click(EDIT_ROLE_BUTTON);
		reportInfo("Clicking On Edit Role Button");
	}
	public void clickDeleteButton(){
		this.click(DELETE_ROLE_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On Delete Role Button.");
		
	}
	public void clickDeleteYesButton(){
		this.click(DELETE_ROLE_YES_BUTTON);
		reportInfo("Clicking On Delete Role Yes Button.");
	}
	public String selectShowEntitiesDropdown(){
		String testData=this.getFirstDropDownLabel(SHOW_ENTITIES_DROPDOWN);
		this.selectDropdown(SHOW_ENTITIES_DROPDOWN, testData);
		reportInfo("Selecting Show Entities Dropdown. "+testData);
		return testData;
	}
	
	public int clickOnUsersNextButton(){
		int count=0;
		WebElement ele=driver.findElement(USER_NEXT_BUTTON_CLASS_NAME);
		String classname=ele.getAttribute("class");
		if(classname != null && classname.contains("disabled")){
			reportInfo("Next Button Is Disabled");
		}
		else{
			this.click(USERS_NEXT_BUTTON);
			waitForPageToLoad(PAGE_LOADING);
			reportInfo("Clicking On Next Button to navigate to Next Page");
			
			}
			return count;
	}
	public int clickOnUsersPreviousButton(){
		int count=0;
		WebElement ele=driver.findElement(USER_PREVIOUS_BUTTON_CLASS_NAME);
		String classname=ele.getAttribute("class");
		if(classname != null && classname.contains("disabled")){
			reportInfo("Previous Button Is Disabled");
		}
		else{
			this.click(USERS_PREVIOUS_BUTTON);
			waitForPageToLoad(PAGE_LOADING);
			reportInfo("Clicking On Previous Button to navigate to previous Page");
			count++;

		}
		return count;
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

	public int locationTableColumns(By by){
		reportInfo("Fetching number of columns in table.");
		List<WebElement> preferenceColumnList = getWebElementList(by);
		return preferenceColumnList.size()-1;
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
	public void clickOnFieldSettingsButton(){
		this.click(FIELD_SETTINGS_BUTTON);
		reportInfo("Field Settings Button Clicked");
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
	
	public void clickonSortButton(){
		this.click(SORT_BUTTON);
		reportInfo("Sort Button Clicked");
	}
	public void clickOnCollapseButton(){
		this.click(COLLAPSE_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Collapse Button Clicked");
	}
	public void clickOnAddUserButton(){
		this.click(ADD_USER_BUTTON);
		reportInfo("Add User Button Clicked");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public String selectuserName(){
		String testData=this.getFirstDropDownValue(USER_NAME_DROPDOWN);
		/*if(testData==null){
			System.out.println("Creating User");
			HomePage homePage = new HomePage(this.driver);
			SettingsPage settingsPage= homePage.clickOnSettingsMenuButton();
			UsersPage usersPage = settingsPage.navigateToUsersPage();
			usersPage.addUser();
		}
		testData=this.getFirstDropDownValue(USER_NAME_DROPDOWN);*/
		this.selectDropdown(USER_NAME_DROPDOWN, testData);
		reportInfo("Selecting User Name. :"+testData);
		return testData;
	}
	
	public void clickOnAddUserOKButton(){
		this.click(ADD_USER_OK_BUTTON);
		reportInfo("Clicking On Add User OK Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnAddUserCloseButton(){
		this.click(ADD_USER_CLOSE_BUTTON);
		reportInfo("Clicking On Add User Close Button");
	}
	public void enterRoleSearchInput(String testdata){
		this.clear(ROLE_SEARCH_INPUT);
		this.type(ROLE_SEARCH_INPUT, testdata);
		reportInfo("Entering Searec Input. :"+testdata);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnDeleteUserButton(){
		this.click(DELETE_USER_BUTTON);
		reportInfo("Delete User Button Clicked");
	}
	public void clickOnDeleteUserYesButton(){
		this.click(DELETE_USER_YES_BUTTON);
		reportInfo("Delete User yes Button Clicked");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void selectUsersShowEntitiesDropdown(String testData){
		this.selectDropdown(USER_SHOW_ENTITIES_DROPDOWN, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Selecting Show Entities Dropdown. :"+testData);
	}
	public void clickOnUsersFieldSettinsButton(){
		this.click(USERS_FIELD_SETTINGS_BUTTON);
	}
	public void checkUsername(){
		this.check(USERS_NAME_CHECK_BOX);
		reportInfo("Name Checkbox Checked");
	}
	public void uncheckUsername(){
		this.check(USERS_NAME_CHECK_BOX);
		reportInfo("Name Checkbox unchecked");
	}
	public void clickOnUserCollapseButton(){
		this.click(USER_COLLAPSE_BUTTON);
		reportInfo("Clicked On Users Collapse Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnUserSortButton(){
		this.click(USER_SORT_NAME_BUTTON);
		reportInfo("User Table Sort Button Is Clicked");
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
	
	public void validateDeleteRolePopup(String expected,String testType){
		reportInfo("Assert to check Delete Role");
		try {
			if (this.getText(DELETE_ROLE_POPUP).equals(expected)) {
				Assert.assertEquals(this.getText(DELETE_ROLE_POPUP), expected);
				reportPassedStatus("Verified Delete Role Popup");
				String successFilePath = elementScreenshot(DELETE_ROLE_POPUP);
				reportSuccessScreenshot(successFilePath,"");
			} else {
				String successFilePath = elementScreenshot(DELETE_ROLE_POPUP);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Delete Role Assertion Failed");
		}
	}
	public boolean validatePagination(int expected) {
		boolean flag=false;
		List<WebElement> rows = getWebElementList(ROLE_TABLE_LENGTH);
		int count = rows.size();
		if(count<=expected){
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
	public List<String> expectedNameList(By by,String testData){ 
		List<String> list1 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(by); 
		for (WebElement element : memberTableNameColumn) { 
			list1.add(element.getText()); 
		} 
		Collections.sort(list1,new SortIgnoreCase()); 
		System.out.println(list1);
		Collections.reverse(list1); 
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
	
	
	public void assertInvalidFormatError(String testType){
		reportInfo("Assert for Invalid Format");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(INVALID_FORMAT_ERROR);
				reportSuccessScreenshot(successFilePath,"Invalid Name Screenshot");
			} else if (testType.equalsIgnoreCase("invalid")) {

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}
	public void validateNextButton(String testType){
		reportInfo("Validating Next Button");
		WebElement ele=driver.findElement(VALIDATE_NEXT_BUTTON);
		String classname=ele.getAttribute("class");
		System.out.println(classname);
		try {
				if(classname != null && classname.contains("active")){
					String successFilePath = elementScreenshot(VALIDATE_NEXT_BUTTON);
					reportSuccessScreenshot(successFilePath,"Next button Screenshot.");
					reportPassedStatus("Verified Next button");
				} else  {
					String successFilePath = elementScreenshot(VALIDATE_NEXT_BUTTON);
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
					String successFilePath = elementScreenshot(VALIDATE_PREVIOUS_BUTTON);
					reportSuccessScreenshot(successFilePath,"Previous Button Screenshot.");
					reportPassedStatus("Verified Previous button");
				} else{
					String successFilePath = elementScreenshot(VALIDATE_PREVIOUS_BUTTON);
					reportFailureScreenshot(successFilePath);
				}
				
		}catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Previous Button Assertion Failed");
		}
	}
	public void assertCheckedColumns(String testType) {
		reportInfo("Validating Member visible columns in member table");
		try {
				List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);
				List<WebElement> roleColumnList = getWebElementList(ROLE_TABLE_HEADER);
				System.out.println(checkBoxList.size());
				System.out.println(roleColumnList.size());
				if(checkBoxList.size()== (roleColumnList.size() - 1)){
				Assert.assertEquals(checkBoxList.size(), (roleColumnList.size() - 1));
				String successFilePath = elementScreenshot(SETTINGS_ALL_COLUMNS_CHECKBOX);
				reportSuccessScreenshot(successFilePath,"All checked columns Screenshot");
				for (WebElement w : roleColumnList) {
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
			} else{
				String successFilePath = elementScreenshot(SETTINGS_ALL_COLUMNS_CHECKBOX);
				reportFailureScreenshot(successFilePath);

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
		reportInfo("Validating Role Invisible columns in member table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> memberColumnList = getWebElementList(ROLE_TABLE_HEADER);
				String count = "0";
				for (WebElement w : memberColumnList) {
					if (w.getText() == "Name") {
						count = count + 1;
					}
					Assert.assertEquals(count, "0");
					System.out.println("validated Role Table Invisible Columns");
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
	public boolean sortingByName() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> segmentTableNameColumn = getWebElementList(ROLE_TABLE_NAME_COLUMN);
		for (WebElement element : segmentTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		Collections.sort(list2,new SortIgnoreCase());
		System.out.println("after 1st sort:"+list2);
		Collections.reverse(list2);
		System.out.println("After Reverse"+list2);
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
	public boolean validateCollapseButton(){
		boolean flag=false;
		WebElement ele=driver.findElement(COLLAPSE_BUTTON_CLASSNAME);
		String classname=ele.getAttribute("class");
		if(classname != null && classname.contains("jarviswidget-collapsed")){
			flag=true;
		}

		return flag;
	}
	public void validateUserName(String expected,String testType){
		reportInfo("Assert to check User Name");
		try {
			if (this.getText(VALIDATE_USER_NAME).equals(expected)) {
				Assert.assertEquals(this.getText(VALIDATE_USER_NAME), expected);
				reportPassedStatus("VerifiedRole Name");
				String successFilePath = elementScreenshot(VALIDATE_USER_NAME);
				reportSuccessScreenshot(successFilePath,"");
			} else {
				String successFilePath = elementScreenshot(VALIDATE_USER_NAME);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("User Name Assertion Failed");
		}
	}
	
	public void validateDeleteUser(String expected,String testType){
		reportInfo("Assert to check User Deletion");
		try {
			if (this.getText(VALIDATE_DELETE_USER).equals(expected)) {
				Assert.assertEquals(this.getText(VALIDATE_DELETE_USER), expected);
				reportPassedStatus("Verified User Deletion");
				String successFilePath = elementScreenshot(VALIDATE_DELETE_USER);
				reportSuccessScreenshot(successFilePath,"");
			} else {
				String successFilePath = elementScreenshot(VALIDATE_DELETE_USER);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("User Deletion Assertion Failed");
		}
	}
	public void validateUsersNextButton(String testType){
		reportInfo("Validating Next Button");
		WebElement ele=driver.findElement(VALIDATE_USERS_NEXT_BUTTON);
		String classname=ele.getAttribute("class");
		//System.out.println(classname);
		try {
				if(classname != null && classname.contains("active")){
					String successFilePath = elementScreenshot(VALIDATE_USERS_NEXT_BUTTON);
					reportSuccessScreenshot(successFilePath,"Next Button Screenshot");
					reportPassedStatus("Verified Next button");
				} else {
					String successFilePath = elementScreenshot(VALIDATE_USERS_NEXT_BUTTON);
					reportFailureScreenshot(successFilePath);
				}
				
		}catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Next Button Assertion Failed");
		}
	}
	public void validateUsersPreviousButton(String testType){
		reportInfo("Validating Previous Button");
		WebElement ele=driver.findElement(VALIDATE_USERS_PREVIOUS_BUTTON);
		String classname=ele.getAttribute("class");
		try {
				if(classname != null && classname.contains("active")){
					String successFilePath = elementScreenshot(VALIDATE_USERS_PREVIOUS_BUTTON);
					reportSuccessScreenshot(successFilePath,"Previos Button Screenshot");
					reportPassedStatus("Verified Previous button");
				} else  {
					String successFilePath = elementScreenshot(VALIDATE_USERS_PREVIOUS_BUTTON);
					reportFailureScreenshot(successFilePath);
				}
				
		}catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Previous Button Assertion Failed");
		}
	}
	public void assertUserTableCheckedColumns(String testType) {
		reportInfo("Validating Member visible columns in member table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> checkBoxList = getWebElementList(USERS_SETTINGS_ALL_COLUMNS_CHECKBOX);
				List<WebElement> usersColumnList = getWebElementList(USER_TABLE_HEADER);
				System.out.println(checkBoxList.size());
				System.out.println(usersColumnList.size());
				Assert.assertEquals(checkBoxList.size(), (usersColumnList.size() - 1));
				String successFilePath = elementScreenshot(USERS_SETTINGS_ALL_COLUMNS_CHECKBOX);
				reportSuccessScreenshot(successFilePath,"All Checked Columns Screenshot.");
				for (WebElement w : usersColumnList) {
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
	public void assertUserstableUncheckedColumns(String testType) {
		reportInfo("Validating Role Invisible columns in member table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> memberColumnList = getWebElementList(USER_TABLE_HEADER);
				int count = 0;
				for (WebElement w : memberColumnList) {
					if (w.getText() == "Name") {
						count = count + 1;
						
					}
				}
				if(count==0){
			
				
				Assert.assertEquals(count, 0);
				System.out.println("validated Role Table Invisible Columns");
			}
			}else {

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Test Case Failed");
		}
	}
	public boolean validateUserCollapseButton(){
		boolean flag=false;
		WebElement ele=driver.findElement(USER_COLLAPSE_BUTTON_CLASSNAME);
		String classname=ele.getAttribute("class");
		if(classname != null && classname.contains("jarviswidget-collapsed")){
			flag=true;
		}

		return flag;
	}
	public boolean sortingUserTableByName() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> segmentTableNameColumn = getWebElementList(USER_TABLE_NAME_COLUMN);
		for (WebElement element : segmentTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		Collections.sort(list2,new SortIgnoreCase1());
		System.out.println("after 1st sort:"+list2);
		Collections.reverse(list2);
		System.out.println("After Reverse"+list2);
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
}
