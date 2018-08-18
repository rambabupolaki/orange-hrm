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

import com.google.common.collect.Ordering;

import selenium.framework.common.PageControls;

public class PursePoliciesPage extends PageControls {

	public final By PAGE_LOADING = By.xpath("//div[@class='loading' and style='display: block;']");
	public final By PURSE_POLICIES = By.linkText("Purse Policies");
	public final By PROGRAM_TABLE = By.xpath("//table[@id='programTable']");
	public final By PROGRAM_RULE_FOLDER = By.xpath("//table[@id='programTable']//tbody//tr[1]//td[8]");
	public final By ADD_PURSE_POLICY_BUTTON = By.id("dialog");
	public final By NAME_INPUT = By.xpath("//*[@name='name']");
	// public final By DESCRIPTION_INPUT =
	// By.cssSelector("textarea[name='description']");
	public final By DESCRIPTION_INPUT = By.xpath("//textarea[@name='desc']");
	public final By ESCROWSIN_INPUT = By.xpath("//*[@name='escrowDays']");
	public final By EXPIRESIN_INPUT = By.xpath("//*[@name='expirationHours']");
	public final By ADDRANGE_BUTTON = By.xpath("//*[@id='colors']");
	public final By STARTRANGE_INPUT = By.xpath("//*[@name='start']");
	public final By ENDRANGE_INPUT = By.xpath("//*[@name='end']");
	public final By COLOR_INPUT = By.xpath("//*[@name='color']");
	public final By OK_BUTTON = By.xpath("//button[@class='btn btn-primary ok_button']");
	public final By SEARCH_INPUT = By.xpath("//input[@type='text']");
	public final By VALIDATE_PURSEPOLICIES = By.xpath("//table[@id='pursePolicyTable']//tbody//tr//td[3]");
	public final By EDIT_PURSEPOLICIES = By.xpath("//a[@tooltip='Edit']");
	public final By DELETE_PURSEPOLICIES = By.xpath("//a[@tooltip='Delete']");
	public final By DELETE_PURSEPOLICIES_YES = By.xpath("//*[@class='btn btn-primary ok_button']");
	public final By DELETE_PURSEPOLICIES_SUCCESSFUL = By.xpath(".//*[@class='toast-message']");
	public final By SHOW_ENTITIES_DROPDOWN = By.name("pursePolicyTable_length");
	public final By PURSEPOLICY_TABLE = By.xpath("//table[@id='pursePolicyTable']/tbody/tr");
	public final By FIELDSETTINGS_BUTTON = By.xpath("//*[@class='ColVis_Button ColVis_MasterButton']");
	public final By SETTINGS_NAME_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']/li[1]/label/input[1]");
	public final By PURSEPOLICY_TABLE_HEADER = By.xpath("//*[@id='pursePolicyTable']//thead//tr//th");
	public final By SETTINGS_ALL_COLUMNS_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li//input");
	public final By PURSEPOLICY_SORT_BY_NAME = By.xpath(".//*[@id='pursePolicyTable']//thead//tr//th[3]");
	public final By PURSEPOLICY_TABLE_NAME_COLUMN = By.xpath("//*[@id='pursePolicyTable']//tbody//tr//td[2]");
	public final By PURSEPOLICY_SORT_BY_CREATED = By.xpath("//*[@id='pursePolicyTable_0_4']");
	public final By PURSEPOLICY_TABLE_CREATED_COLUMN = By.xpath("//*[@id='pursePolicyTable']//tbody//tr//td[4]");
	public final By PURSEPOLICY_SORT_BY_UPDATED = By.xpath("//*[@id='pursePolicyTable_0_5']");
	public final By VALIDATE_PURSEPOLICIES_ERROR = By.xpath("//*[@class='invalid ng-binding ng-scope']");
	public final By PURSEPOLICY_TABLE_UPDATED_COLUMN = By.xpath("//*[@id='pursePolicyTable']//tbody//tr//td[5]");
	public  final By ADVANCED_SEARCH_BUTTON = By.xpath(".//*[@id='advanced-search-button']");
	public  final By SUGGESTION_INPUT=By.xpath("//label/ul/li/a");
	public final By VALIDATION_ERROR = By.xpath("//*[@class='alert alert-danger alert-block']");
	public final By NULLVALUE_ERROR=By.xpath("//em[@class='invalid ng-binding ng-scope']");
	public final By OFFSETESCROW_INPUT=By.xpath("//*[@name='escrowOffset']");
	public final By OFFSETEXPIRY_INPUT=By.xpath("//*[@name='expiryOffset']");
	public final By EXPIRYWARNINGDAYS_INPUT=By.xpath("//*[@name='expiryWarningDays']");

	public PursePoliciesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickOnPursePolicieslink() {
		this.click(PURSE_POLICIES);
		waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on Rulefolder LINK.");
	}

	public void clickOnAddPursePolicyButton() {
		this.click(ADD_PURSE_POLICY_BUTTON);
		waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on Add Purse Policy Button.");
	}

	public void clickOnAdvancedSearchButton(){
		this.click(ADVANCED_SEARCH_BUTTON);
		reportInfo("Clicking On Advanced Search Button.");
		this.waitForPageToLoad(PAGE_LOADING);
		//this.click(SUGGESTION_INPUT);
	}
	public void enterSearchInput(String testData) {
		this.type(SEARCH_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		//this.click(SUGGESTION_INPUT);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering Search Input :" + testData);
	}

	public void enterName(String testData) {
		this.clear(NAME_INPUT);
		this.type(NAME_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		this.click(DESCRIPTION_INPUT);
		reportInfo("Entering  Name :" + testData);
	}

	public void enterDescription(String testData) {
		this.clear(DESCRIPTION_INPUT);
		this.type(DESCRIPTION_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering  Description :" + testData);
	}

	public void enterEscrowsIn(String testData) {
		this.clear(ESCROWSIN_INPUT);
		this.type(ESCROWSIN_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering  EscrowsIn :" + testData);
	}

	public void enterExpiresIn(String testData) {
		this.clear(EXPIRESIN_INPUT);
		this.type(EXPIRESIN_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering  ExpiresIn :" + testData);
	}

	public void clickOnAddRangeButton() {
		this.click(ADDRANGE_BUTTON);
		waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on Add Range Button.");
	}

	public void enterStartRange(String testData) {
		this.clear(STARTRANGE_INPUT);
		this.type(STARTRANGE_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering StartRange :" + testData);
	}

	public void enterEndRange(String testData) {
		this.clear(ENDRANGE_INPUT);
		this.type(ENDRANGE_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering EndRange :" + testData);
	}

	public void enterColorInput(String testData) {
		this.clear(COLOR_INPUT);
		this.type(COLOR_INPUT, testData);
		this.type(COLOR_INPUT, Keys.ENTER);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering Color :" + testData);
	}

	public void clickOnOkButton() {
		this.click(OK_BUTTON);
		waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on OK Button.");
	}

	public void clickOnEditButton() {
		this.click(EDIT_PURSEPOLICIES);
		waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on OK Button ");

	}

	public void clickOnDeletePursepolicyButton() {
		this.click(DELETE_PURSEPOLICIES);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On Delete Button.");
	}

	public void clickOnDeletePursePolicyYesButton() {
		this.click(DELETE_PURSEPOLICIES_YES);
	}

	public String selectShowEntitiesDropdown() {
		String testData = this.getFirstDropDownLabel(SHOW_ENTITIES_DROPDOWN);
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
		reportInfo("Check Field Settings Name Checkbox.");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void uncheckNameField() {
		this.uncheck(SETTINGS_NAME_CHECKBOX);
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void clickonSortNameButton() {
		this.click(PURSEPOLICY_SORT_BY_NAME);
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public boolean sortingByName() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList(PURSEPOLICY_TABLE_NAME_COLUMN);
		for (WebElement element : sortingTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		Collections.sort(list1, new SortIgnoreCase());
		// Collections.sort(list2,new SortIgnoreCase());

		Collections.reverse(list1);
		System.out.println("After Reverse" + list1);
		System.out.println("List1 is" + list1);
		boolean sorted = list2.equals(list1);
		return sorted;
	}

	public class SortIgnoreCase implements Comparator<Object> {
		public int compare(Object o1, Object o2) {
			String s1 = (String) o1;
			String s2 = (String) o2;
			return s1.toLowerCase().compareTo(s2.toLowerCase());
		}
	}

	public void clickonSortCreatedButton() {
		this.click(PURSEPOLICY_SORT_BY_CREATED);
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public String getPursePolicyText(By by, String testData) {
		reportInfo(testData);
		return this.getText(by);
	}

	public void assertText(String expected, String actual, By by, String message) {
		if (expected.equalsIgnoreCase(actual)) {
			reportPassedStatus("Expected [ " + expected + " ] : Actual [ " + actual + " ]");
			String successFilePath = elementScreenshot(by);
			reportSuccessScreenshot(successFilePath, message);
		} else {
			reportFailedStatus("Expected [ " + expected + " ] : Actual [ " + actual + " ]");
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
		}
	}

	public boolean sortingByCreated() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList(PURSEPOLICY_TABLE_CREATED_COLUMN);
		for (WebElement element : sortingTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		Collections.sort(list1, new SortIgnoreCase());
		System.out.println("After Reverse" + list1);
		System.out.println("List2 is" + list2);
		boolean sorted = Ordering.natural().isOrdered(list1);
		return sorted;
	}

	public class SortIgnoreCase1 implements Comparator<Object> {
		public int compare(Object o1, Object o2) {
			String s1 = (String) o1;
			String s2 = (String) o2;
			return s1.toLowerCase().compareTo(s2.toLowerCase());
		}
	}

	public void clickonSortUpdatedButton() {
		this.click(PURSEPOLICY_SORT_BY_UPDATED);
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public boolean sortingByUpdated() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList(PURSEPOLICY_TABLE_UPDATED_COLUMN);
		for (WebElement element : sortingTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		Collections.sort(list1, new SortIgnoreCase());
		System.out.println("After Reverse" + list1);
		System.out.println("List2 is" + list2);
		boolean sorted = Ordering.natural().isOrdered(list1);
		return sorted;
	}

	public class SortIgnoreCase2 implements Comparator<Object> {
		public int compare(Object o1, Object o2) {
			String s1 = (String) o1;
			String s2 = (String) o2;
			return s1.toLowerCase().compareTo(s2.toLowerCase());
		}
	}

	public void assertPursePoliciesError(String testType) {
		reportInfo("Validating PURSE POLICIES NAME");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(VALIDATE_PURSEPOLICIES_ERROR);
				reportSuccessScreenshot(successFilePath, "");
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
		/* this.waitForPageToLoad(PAGE_LOADING); */
		reportInfo("Validating Duplicate Records");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(VALIDATION_ERROR);
				reportSuccessScreenshot(successFilePath, "");
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
		reportInfo("Validating PursePolicies visible columns in PursePolicies table");
		try {

			List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);
			List<WebElement> memberColumnList = getWebElementList(PURSEPOLICY_TABLE_HEADER);
			if (checkBoxList.size() == (memberColumnList.size() - 1)) {
				Assert.assertEquals(checkBoxList.size(), (memberColumnList.size() - 1));
				String successFilePath = elementScreenshot(SETTINGS_ALL_COLUMNS_CHECKBOX);
				reportSuccessScreenshot(successFilePath, "Check All Columns");

			} else {
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

	public void assertUncheckedColumns(String testType) {
		reportInfo("Validating PursePolicies Invisible columns in location table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> memberColumnList = getWebElementList(PURSEPOLICY_TABLE_HEADER);
				List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);
				if (checkBoxList.size() == (memberColumnList.size() - 1)) {
					Assert.assertEquals(checkBoxList.size(), (memberColumnList.size() - 1));
					String count = "0";
					for (WebElement w : memberColumnList) {
						if (w.getText() == "Name") {
							count = count + 1;
						}
						Assert.assertEquals(count, "0");
					}
				} else if (testType.equalsIgnoreCase("invalid")) {

				}
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
		List<WebElement> rows = getWebElementList(PURSEPOLICY_TABLE);
		int count = rows.size();
		if (count <= expected) {
			flag = true;
		}
		return flag;
	}

	public void assertLocationPopup(String expected, String testType) {
		reportInfo("Validating Location Delete Or Not");
		try {
			if (this.getText(DELETE_PURSEPOLICIES_SUCCESSFUL).equals(expected)) {
				Assert.assertEquals(this.getText(DELETE_PURSEPOLICIES_SUCCESSFUL), expected);
				reportPassedStatus("Verified Location Delete Or Not");
				String successFilePath = elementScreenshot(DELETE_PURSEPOLICIES_SUCCESSFUL);
				reportSuccessScreenshot(successFilePath, "");
			} else {
				String successFilePath = elementScreenshot(DELETE_PURSEPOLICIES_SUCCESSFUL);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}

	public void assertpursepoliciesName(String expected, String testType) {
		reportInfo("Validating pursepolicies Name");
		try {
			if (this.getText(VALIDATE_PURSEPOLICIES).equals(expected)) {
				Assert.assertEquals(this.getText(VALIDATE_PURSEPOLICIES), expected);
				reportPassedStatus("Verified pursepolicies Name");
				String successFilePath = elementScreenshot(VALIDATE_PURSEPOLICIES);
				reportSuccessScreenshot(successFilePath, "");
			} else {
				String successFilePath = elementScreenshot(VALIDATE_PURSEPOLICIES);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}

	}

	public void assertBoolean(Boolean expected, Boolean actual, By by, String message) {
		if (expected == actual) {
			reportPassedStatus("Expected [ " + expected + " ] : Actual [ " + actual + " ]");
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("scroll(0, 250);");
			String successFilePath = elementScreenshot(by);
			reportSuccessScreenshot(successFilePath, message);
		} else {
			reportFailedStatus("Expected [ " + expected + " ] : Actual [ " + actual + " ]");
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
		}
	}

	public int checkedColumns(By by) {
		int count = 0;
		reportInfo("Fetching number of checked columns in Fieldsettings.");
		List<WebElement> checkBoxList = getWebElementList(by);
		for (WebElement l : checkBoxList) {
			boolean flag = l.isSelected();
			if (flag == true) {
				count = count + 1;
			}
		}
		return count;
	}

	public int pursepoliciesTableColumns(By by) {
		int count=0;
		reportInfo("Fetching number of columns in table.");
		List<WebElement> pursepoliciesColumnList = getWebElementList(by);
		for(WebElement we:pursepoliciesColumnList){
			if(we.getAttribute("class").equalsIgnoreCase("ng-scope")){
				count=count+1;
			}
		}
		return count - 1;
	}

	public void assertInt(int expected, int actual, By by, String message) {
		if (expected == actual) {
			reportPassedStatus("Expected [ " + expected + " ] : Actual [ " + actual + " ]");
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("scroll(0, 250);");
			String successFilePath = elementScreenshot(by);
			reportSuccessScreenshot(successFilePath, message);
		} else {
			reportFailedStatus("Expected [ " + expected + " ] : Actual [ " + actual + " ]");
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
		}
	}

	public List<String> expectedNameList(By by, String testData) {
		List<String> list1 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(by);
		for (WebElement element : memberTableNameColumn) {
			list1.add(element.getText());
		}
		Collections.sort(list1);
		System.out.println(list1);
		Collections.reverse(list1);
		reportInfo(testData);
		return list1;
	}

	public List<String> actualList(By by, String testData) {
		List<String> list1 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(by);
		for (WebElement element : memberTableNameColumn) {
			list1.add(element.getText());
		}
		reportInfo(testData);
		return list1;
	}

	public void assertObject(Object expected, Object actual, String message) {
		if (expected.equals(actual)) {
			reportPassedStatus("Expected [ " + expected + " ] : Actual [ " + actual + " ]");

		} else {
			reportFailedStatus("Expected [ " + expected + " ] ");
			reportFailedStatus(" Actual [ " + actual + " ]");

		}
	}

	public String getText(By by, String testData) {
		reportInfo(testData);
		return this.getText(by);
	}

	public void offsetEscrowInput(String testData){
		this.clear(OFFSETESCROW_INPUT);
		this.type(OFFSETESCROW_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering offsetEscrow Input:"+testData);
		
	}
	
	public void offsetExpiryInput(String testData){
		this.clear(OFFSETEXPIRY_INPUT);
		this.type(OFFSETEXPIRY_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering offsetExpiry Input:"+testData);
	}
	
	public void expiryWarningDaysInput(String testData){
		this.clear(EXPIRYWARNINGDAYS_INPUT);
		this.type(EXPIRYWARNINGDAYS_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering expiry warning days:"+testData);
	}
	
	
	
}