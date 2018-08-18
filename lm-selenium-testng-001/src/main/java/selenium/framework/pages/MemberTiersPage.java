package selenium.framework.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import selenium.framework.common.PageControls;

public class MemberTiersPage extends PageControls{
	public MemberTiersPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public  final By EDIT_TIER_BUTTON = By.xpath("//table[@id='tierTable']//tbody//tr//td//a[3]");
	public  final By PAGE_LOADING = By.xpath("//div[@class='loading'][@style='display: block;']");
	public  final By ACHIEVED_ON_INPUT = By.xpath("//input[@type='text']");
	public  final By ACHIEVED_ON_COLUMN = By.xpath("//table[@id='tierTable']//tbody//tr[1]//td[4]");
	public  final By REQUALS_ON_INPUT=By.xpath("(//input[@type='text'])[2]");
	public  final By REQUALS_ON_COLUMN=By.xpath("//table[@id='tierTable']//tbody//tr[1]//td[5]");
	public  final By SHOW_ENTITIES_DROPDOWN = By.xpath("//div[@id='tierTable_length']//select");
	public  final By TIER_TABLE = By.xpath("//table[@id='tierTable']//tbody//tr");
	public  final By FIELD_SETTINGS_BUTTON = By.xpath("//div[@id='tierTable_wrapper']//button");
	public  final By TIER_NAME_BOX = By.xpath("//ul[@class='ColVis_collection']//li[1]");
	public  final By TIER_NAME_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li[1]//input");
	public  final By SETTINGS_ALL_COLUMNS_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li//input");
	public  final By SETTINGS_ALL_COLUMNS = By.xpath("//ul[@class='ColVis_collection']");
	public  final By TIER_TABLE_HEADER = By.xpath("//table[@id='tierTable']//thead//tr//th");
	public  final By NEXT_BUTTON_CLASS_NAME = By.xpath("//li[@id='tierTable_next']");
	public  final By NEXT_BUTTON = By.linkText("Next");
	public  final By PREVIOUS_BUTTON = By.linkText("Previous");
	public  final By PREVIOUS_BUTTON_CLASS_NAME = By.xpath("//li[@id='tierTable_previous']");
	public  final By VALIDATE_NEXT_BUTTON = By.xpath("//div[@id='tierTable_paginate']//li[3]");
	public  final By VALIDATE_PREVIOUS_BUTTON = By.xpath("//div[@id='tierTable_paginate']//li[2]");
	public  final By UPGRADE_TIER_BUTTON = By.xpath("//table[@id='tierTable']//tbody//tr//td//a[2]");
	public  final By DOWNGRADE_TIER_BUTTON = By.xpath("//table[@id='tierTable']//tbody//tr//td//a[2]");
	public  final By TIER_POPUP = By.xpath("//div[@class='toast-message']");
	public  final By TIER_NAME_SORT_BUTTON = By.xpath("//table[@id='tierTable']//thead//tr//th[2]");
	public  final By TIER_NAME_COLUMN = By.xpath("//table[@id='tierTable']//tbody//tr//td[2]");
	public  final By OK_BUTTON = By.xpath("//button[@class='btn btn-primary ok_button']");
	public final By VALIDATION_ADD = By.xpath(".//*[@class='toast-message']");

	public void clickOnEditTierButton(){
		this.click(EDIT_TIER_BUTTON);
		reportInfo("Clicking On Edit Tier Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void enterAchievedOnDate(String testData){
		this.clear(ACHIEVED_ON_INPUT);
		this.type(ACHIEVED_ON_INPUT, testData);
		reportInfo("Entering Achieved On Input. :"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
		String s=this.getText(ACHIEVED_ON_COLUMN);
		System.out.println(s);
	}
	
	public void enterRequalsOnDate(String testData){
		this.clear(REQUALS_ON_INPUT);
		this.type(REQUALS_ON_INPUT, testData);
		reportInfo("Entering Requals On Input. :"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
		String s=this.getText(REQUALS_ON_INPUT);
		System.out.println(s);
		
	}
	
	public String selectShowEntiesDropdown(){
		String testData=this.getFirstDropDownValue(SHOW_ENTITIES_DROPDOWN);
		this.selectDropdown(SHOW_ENTITIES_DROPDOWN, testData);
		reportInfo("Selecting value from show entities Dropdown. :"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}
	public void clickOnFieldSettingsButton(){
		this.click(FIELD_SETTINGS_BUTTON);
		reportInfo("Clicking On Field Settings Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void checkTierName(){
		this.check(TIER_NAME_CHECKBOX);
		reportInfo("Check TierName Column.");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void uncheckTierName(){
		this.uncheck(TIER_NAME_CHECKBOX);
		reportInfo("Uncheck Tier Name Column.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnUpgradetierButton(){
		this.click(UPGRADE_TIER_BUTTON);
		reportInfo("Clicking On upgrade Tier Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnDowngradeTierButton(){
		this.click(DOWNGRADE_TIER_BUTTON);
		reportInfo("Clicking On Downgrade Tier Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnTiernameSortButton(){
		this.click(TIER_NAME_SORT_BUTTON);
		reportInfo("Clicking On Sort By Name Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnOKButton(){
		this.click(OK_BUTTON);
		reportInfo("Clicking On OK Button.");
		//this.waitForPageToLoad(PAGE_LOADING);
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
	public void assertObject(Object expected, Object actual,String message){
		if(expected.equals(actual)){
			reportPassedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");

		}else{
			reportFailedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			this.scrollDown();
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
		}
	}

	public int clickOnNextButton() {
		int count=0;
		WebElement ele=driver.findElement(NEXT_BUTTON_CLASS_NAME);
		String classname=ele.getAttribute("class");
		if(classname != null && classname.contains("disabled")){
			reportInfo("Next Button Is Disabled.");
		}
		else{
			this.click(NEXT_BUTTON);
			waitForPageToLoad(PAGE_LOADING);
			reportInfo("Clicking On Next Button to navigate to Next Page.");
			count++;

		}
		return count;
	}
	public int clickOnPreviousButton() {
		int count=0;
		WebElement ele=driver.findElement(PREVIOUS_BUTTON_CLASS_NAME);
		String classname=ele.getAttribute("class");
		if(classname != null && classname.contains("disabled")){
			reportInfo("Previous Button Is Disabled.");
		}
		else{
			this.click(PREVIOUS_BUTTON);
			waitForPageToLoad(PAGE_LOADING);
			reportInfo("Clicking On Previous Button to navigate to previous Page.");
			count++;

		}
		return count;
	}
	public boolean validatePagination(int expected, String testType) {
		reportInfo("Validating Pagination");
		boolean flag = false;

		List<WebElement> rows = getWebElementList(TIER_TABLE);
		int count = rows.size();
		if(count<=expected){
			flag=true;
		}
		return flag;
	}
	public int checkedColumns(){
		int count=0;
		reportInfo("Fetching number of checked columns.");
		List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);
		for(WebElement l:checkBoxList){
			boolean flag=l.isSelected();
			if(flag==true){
				count=count+1;
			}
		}
		return count;
	}

	public int tierTableColumns(){
		reportInfo("Fetching number of columns in table.");
		List<WebElement> tierColumnList = getWebElementList(TIER_TABLE_HEADER);
		return tierColumnList.size()-1;
	}

	/*	public void assertCheckedColumns(String testType) {
		reportInfo("Validating Member visible columns in member table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);
				List<WebElement> tierColumnList = getWebElementList(TIER_TABLE_HEADER);
				String successFilePath = elementScreenshot(SETTINGS_ALL_COLUMNS_CHECKBOX);
				reportSuccessScreenshot(successFilePath,"");
				for (WebElement w : tierColumnList) {
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
	}*/
	public boolean assertUncheckedColumns(String testType) {
		boolean flag=true;
		List<WebElement> memberColumnList = getWebElementList(TIER_TABLE_HEADER);
		for (WebElement w : memberColumnList) {
			if (w.getText() == this.getText(TIER_NAME_BOX)) {
				flag=false;
			}
		}
		return flag;
	}

	public String getClassname(By by,String testData){
		reportInfo(testData);
		WebElement ele=driver.findElement(by);
		String classname=ele.getAttribute("class");
		return classname;
	}

	public void validateNextButton(String testType){
		reportInfo("Validating Next Button");
		WebElement ele=driver.findElement(VALIDATE_NEXT_BUTTON);
		String classname=ele.getAttribute("class");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				if(classname != null && classname.contains("active")){
					String successFilePath = elementScreenshot(NEXT_BUTTON);
					reportSuccessScreenshot(successFilePath,"");
					reportPassedStatus("Verified Next button");
				} else if (testType.equalsIgnoreCase("invalid")) {
				}
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
			if (testType.equalsIgnoreCase("valid")) {
				if(classname != null && classname.contains("active")){
					String successFilePath = elementScreenshot(PREVIOUS_BUTTON);
					reportSuccessScreenshot(successFilePath,"");
					reportPassedStatus("Verified Previous button");
				} else if (testType.equalsIgnoreCase("invalid")) {
				}
			}
		}catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Previous Button Assertion Failed");
		}
	}
	public void validateTierUpgradeAndDowngrade(String testType){
		reportInfo("Validating Tier Upgrade and Downgrade");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(TIER_POPUP);
				reportSuccessScreenshot(successFilePath,"");
				reportPassedStatus("Verified Tier Upgrade and Downgrade");
			} else if (testType.equalsIgnoreCase("invalid")) {
			}

		}catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}
	public List<String> actualList(){
		List<String> list1 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(TIER_NAME_COLUMN);
		for (WebElement element : memberTableNameColumn) {
			list1.add(element.getText());
		}
		return list1;
	}
	public List<String> expectedList(){
		List<String> list1 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(TIER_NAME_COLUMN);
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
		List<WebElement> memberTableNameColumn = getWebElementList(TIER_NAME_COLUMN);
		for (WebElement element : memberTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		Collections.sort(list2);
		Collections.reverse(list2);
		boolean sorted=list2.equals(list1);
		return sorted;
	}
}
