package selenium.framework.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import selenium.framework.common.PageControls;

public class MemberTranscationsPage extends PageControls {
	public final By PAGE_LOADING = By.xpath("//div[@class='loading'][@style='display: block;']");
	public final By TRANSACTIONS_BUTTON = By.xpath("//div[2]/ul/li[7]/a");
	public final By TRANSACTIONS_CLASS = By.xpath("//li[@id='red_s6']");
	public final By SHOW_ENTITIES_DROPDOWN = By.name("transactionTable_length");
	public final By LINEITEMS_SHOW_ENTITIES_DROPDOWN = By.xpath("//div[@id='memberLineItemTable_length']/label/select");
	public final By TENDERITEMS_SHOW_ENTITIES_DROPDOWN = By
			.xpath("//div[@id='memberTenderItemTable_length']/label/select");
	public final By TRANSACTION_TABLE = By.xpath("//table[@id='transactionTable']/tbody/tr");
	public final By LINEITEMS_TABLE = By.xpath("//table[@id='memberLineItemTable']/tbody/tr");
	public final By TENDERITEMS_TABLE = By.xpath("//table[@id='memberTenderItemTable']/tbody/tr");
	public final By FIELDSETTINGS_BUTTON = By.xpath("//a[@id='show-table-options']/i");
	public final By LINEITEMS_FIELDSETTINGS_BUTTON = By.xpath("//div[@id='memberLineItemTable_wrapper']/div/button");
	public final By TENDERITEMS_FIELDSETTINGS_BUTTON = By
			.xpath("//div[@id='memberTenderItemTable_wrapper']/div/button");
	public final By SETTINGS_CODE_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']/li[1]/label/input[1]");
	public final By SETTINGS_ALL_COLUMNS_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li//input");
	public final By LINEITEM_SETTINGS_ALL_COLUMNS_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li//input");
	public final By TENDERITEM_SETTINGS_ALL_COLUMNS_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li//input");
	public final By LINEITEM_TABLE_HEADER = By.xpath("//*[@id='memberLineItemTable']//thead//tr//th");
	public final By TENDERITEM_TABLE_HEADER = By.xpath("//*[@id='memberTenderItemTable']//thead//tr//th");
	public final By TRANSACTION_TABLE_HEADER = By.xpath("//*[@id='transactionTable']//thead//tr//th");
	public final By SETTINGS_NAME_CHECKBOX = By.xpath("//li[1][@class='ng-scope']//label//input[1]");
	public final By LINEITEM_SETTINGS_LINENO_CHECKBOX = By
			.xpath("//ul[@class='ColVis_collection']//li[1]/label//input");
	public final By TENDERITEM_SETTINGS_LINENO_CHECKBOX = By
			.xpath("//ul[@class='ColVis_collection']//li[1]/label//input");
	public final By COLLAPSE_BUTTON = By.xpath("//div[2]/div/header/div/a/i");
	public final By COLLAPSER_BUTTON_CLASSNAME = By.xpath("//div[@id='wid-id-achievementsWidget']");
	public final By VALIDATE_NEXT_BUTTON = By.xpath("//div[@id='Table_paginate']//li[3]");
	public final By NEXT_BUTTON = By.xpath("//li[@id='Table_next']/a");
	public final By VALIDATE_PREVIOUS_BUTTON = By.xpath(".//*[@id='Table_paginate']/ul/li[2]");
	public final By PREVIOUS_BUTTON = By.xpath("//li[@id='Table_previous']/a");
	public final By VALIDATE_LINEITEM_NEXT_BUTTON = By.xpath("//div[@id='Table_paginate']//li[3]");
	public final By LINEITEM_NEXT_BUTTON = By.xpath("//li[@id='memberLineItemTable_next']/a");
	public final By VALIDATE_LINEITEM_PREVIOUS_BUTTON = By.xpath("//div[@id='Table_paginate']//li[2]");
	public final By LINEITEM_PREVIOUS_BUTTON = By.xpath("//li[@id='memberLineItemTable_previous']/a");
	public final By VALIDATE_TENDERITEM_NEXT_BUTTON = By.xpath("//div[@id='Table_paginate']//li[3]");
	public final By TENDERITEM_NEXT_BUTTON = By.xpath("//li[@id='memberTenderItemTable_next']/a");
	public final By VALIDATE_TENDERITEM_PREVIOUS_BUTTON = By.xpath("//div[@id='Table_paginate']//li[2]");
	public final By TENDERITEM_PREVIOUS_BUTTON = By.xpath("//li[@id='memberTenderItemTable_previous']/a");
	public final By NEXT_BUTTON_CLASS_NAME = By.xpath("//li[@id='Table_next']");
	public final By PREVIOUS_BUTTON_CLASS_NAME = By.xpath("//li[@id='Table_previous']");
	public final By LINEITEM_NEXT_CLASSNAME = By.xpath(".//*[@id='memberLineItemTable_next']");
	public final By LINEITEM_PREVIOUS_CLASSNAME = By.xpath(".//*[@id='memberLineItemTable_previous']");
	public final By TENDERITEM_NEXT_CLASSNAME = By.xpath(".//*[@id='memberTenderItemTable_next']");
	public final By TENDERITEM_PREVIOUS_CLASSNAME = By.xpath(".//*[@id='memberTenderItemTable_previous']");
	public final By TRANSACTION_EMPTY=By.xpath("//table[@id='transactionTable']//tbody//tr//td");
	

	public MemberTranscationsPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnFieldSettingsButton() {
		this.click(FIELDSETTINGS_BUTTON);
		reportInfo("Clicking On Field Settings Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void clickOnLineItemsFieldSettingsButton() {
		this.click(LINEITEMS_FIELDSETTINGS_BUTTON);
		reportInfo("CLicking On LineItems Field Settings Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void clickOnTenderItemsFieldSettingsButton() {
		this.click(TENDERITEMS_FIELDSETTINGS_BUTTON);
		reportInfo("Clicking on TenderItems Field Settings Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void uncheckNameField() {
		this.uncheck(SETTINGS_NAME_CHECKBOX);
		reportInfo("Unchecking Type Field.");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void uncheckLinenoField() {
		this.uncheck(LINEITEM_SETTINGS_LINENO_CHECKBOX);
		reportInfo("Unchecking Line No field.");
		this.waitForPageToLoad(PAGE_LOADING);

	}

	public void uncheckTendernoField() {
		this.uncheck(TENDERITEM_SETTINGS_ALL_COLUMNS_CHECKBOX);
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void checkCodeField() {
		this.check(SETTINGS_CODE_CHECKBOX);
		reportInfo("Clicking Field Settings Code Checkbox");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void clickOnCollapseButton() {
		this.click(COLLAPSE_BUTTON);
		reportInfo("Clicking On Collapse Button");
		waitForPageToLoad(PAGE_LOADING);
	}

	public int clickOnNextButton(By by1, By by2) {
		int count = 0;
		WebElement ele = driver.findElement(by2);
		String classname = ele.getAttribute("class");
		if (classname != null && classname.contains("disabled")) {
			reportInfo("Next Button Is Disabled");
		} else {
			this.click(by1);
			waitForPageToLoad(PAGE_LOADING);
			reportInfo("Clicking On Next Button to navigate to Next Page");
			count++;

		}
		return count;
	}

	public int clickOnPreviousButton(By by1, By by2) {
		int count = 0;
		WebElement ele = driver.findElement(by2);
		String classname = ele.getAttribute("class");
		if (classname != null && classname.contains("disabled")) {
			reportInfo("Previous Button Is Disabled");
		} else {
			this.click(by1);
			waitForPageToLoad(PAGE_LOADING);
			reportInfo("Clicking On Previous Button to navigate to previous Page");
			count++;

		}
		return count;
	}

	public String selectShowEntitiesDropdown() {
		String testData = this.getFirstDropDownLabel(SHOW_ENTITIES_DROPDOWN);
		this.selectDropdown(SHOW_ENTITIES_DROPDOWN, testData);
		reportInfo("Clicking On Show Entities DropDown");
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}

	public String LineItemsselectShowEntitiesDropdown() {
		String testData = this.getFirstDropDownLabel(LINEITEMS_SHOW_ENTITIES_DROPDOWN);
		this.selectDropdown(LINEITEMS_SHOW_ENTITIES_DROPDOWN, testData);
		reportInfo("Clicking On Line Items Show Entities DropDown");
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}

	public String TenderItemsselectShowEntitiesDropdown() {
		String testData = this.getFirstDropDownLabel(TENDERITEMS_SHOW_ENTITIES_DROPDOWN);
		this.selectDropdown(TENDERITEMS_SHOW_ENTITIES_DROPDOWN, testData);
		reportInfo("CLicking On TenderItems Show Entities DropDown");
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}

	public void assertCheckedColumns(String testType) {
		reportInfo("Validating Member Transactions visible columns in Transactions table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);
				List<WebElement> memberReferralsColumnList = getWebElementList(TRANSACTION_TABLE_HEADER);
				Assert.assertEquals(checkBoxList.size(), (memberReferralsColumnList.size()));
				String successFilePath = elementScreenshot(SETTINGS_ALL_COLUMNS_CHECKBOX);
				reportSuccessScreenshot(successFilePath, "");
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

	public void lineItemassertCheckedColumns(String testType) {
		reportInfo("Validating Member Transactions Line Item visible columns in Transactions table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> checkBoxList = getWebElementList(LINEITEM_SETTINGS_ALL_COLUMNS_CHECKBOX);
				List<WebElement> memberReferralsColumnList = getWebElementList(LINEITEM_TABLE_HEADER);
				Assert.assertEquals(checkBoxList.size(), (memberReferralsColumnList.size()));
				String successFilePath = elementScreenshot(LINEITEM_SETTINGS_ALL_COLUMNS_CHECKBOX);
				reportSuccessScreenshot(successFilePath, "");
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

	public void tenderItemassertCheckedColumns(String testType) {
		reportInfo("Validating Member Transactions Line Item visible columns in Transactions table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> checkBoxList = getWebElementList(TENDERITEM_SETTINGS_ALL_COLUMNS_CHECKBOX);
				List<WebElement> memberReferralsColumnList = getWebElementList(TENDERITEM_TABLE_HEADER);
				Assert.assertEquals(checkBoxList.size(), (memberReferralsColumnList.size()));
				String successFilePath = elementScreenshot(TENDERITEM_SETTINGS_ALL_COLUMNS_CHECKBOX);
				reportSuccessScreenshot(successFilePath, "");
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

	public boolean validatePagination(int expected, String testData) {
		reportInfo(testData);
		boolean flag = false;

		List<WebElement> rows = getWebElementList(TRANSACTION_TABLE);
		int count = rows.size();
		if (count <= expected) {
			flag = true;
		}
		return flag;

	}

	public void assertBoolean(boolean expected, boolean actual, By by, String message) {
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

	public String getClassname(By by, String testData) {
		reportInfo(testData);
		WebElement ele = driver.findElement(by);
		String classname = ele.getAttribute("class");
		return classname;

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

	public int transactionTableColumns(By by) {
		reportInfo("Fetching number of columns in table.");
		List<WebElement> tierColumnList = getWebElementList(by);
		return tierColumnList.size();
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

	public void assertText(String expected, String actual, By by, String message) {
		if (expected.equalsIgnoreCase(actual)) {
			reportPassedStatus("Expected [ " + expected + " ] : Actual [ " + actual + " ]");
			this.scrollDown();
			String successFilePath = elementScreenshot(by);
			reportSuccessScreenshot(successFilePath, message);
		} else {
			reportFailedStatus("Expected [ " + expected + " ] : Actual [ " + actual + " ]");
			this.scrollDown();
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
		}
	}

	public void validateLineItemsPagination(int expected, String testType) {
		reportInfo("Validating Line Items Pagination");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> rows = getWebElementList(LINEITEMS_TABLE);
				int count = rows.size();
				// Assert.assertEquals(count, expected);
				if (count <= expected) {
					reportPassedStatus("Verified Member Transaction Pagination");
					String successFilePath = elementScreenshot(LINEITEMS_SHOW_ENTITIES_DROPDOWN);
					reportSuccessScreenshot(successFilePath, "");
				} else if (testType.equalsIgnoreCase("invalid")) {

				}
			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Pagination Assertion Failed");
		}
	}

	public void validateTenderItemsPagination(int expected, String testType) {
		reportInfo("Validating Line Items Pagination");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> rows = getWebElementList(TENDERITEMS_TABLE);
				int count = rows.size();
				// Assert.assertEquals(count, expected);
				if (count <= expected) {
					reportPassedStatus("Verified Member Transaction Pagination");
					String successFilePath = elementScreenshot(TENDERITEMS_SHOW_ENTITIES_DROPDOWN);
					reportSuccessScreenshot(successFilePath, "");
				} else if (testType.equalsIgnoreCase("invalid")) {

				}
			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Pagination Assertion Failed");
		}
	}

	public void validationErrorPopUp(String testType) {

		reportInfo("Validating Transcations Link");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(TRANSACTIONS_BUTTON);
				reportSuccessScreenshot(successFilePath, "");
				reportPassedStatus("Clicked on Transactions Tab");
			} else if (testType.equalsIgnoreCase("invalid")) {

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Test Case Failed");
		}

	}

	public void lineItemassertUncheckedColumns(String testType) {
		reportInfo("Validating Locations Invisible columns in location table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> memberColumnList = getWebElementList(LINEITEM_TABLE_HEADER);
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

	public void tenderItemassertUncheckedColumns(String testType) {
		reportInfo("Validating Transactions tenderItem Invisible columns in Transaction table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> memberColumnList = getWebElementList(TENDERITEM_TABLE_HEADER);
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

	public void assertUncheckedColumns(String testType) {
		reportInfo("Validating Locations Invisible columns in location table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> memberColumnList = getWebElementList(TRANSACTION_TABLE_HEADER);
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

	public boolean validateCollapseButton() {
		boolean flag = false;
		WebElement ele = driver.findElement(COLLAPSER_BUTTON_CLASSNAME);
		String classname = ele.getAttribute("class");
		if (classname != null && classname.contains("jarviswidget-collapsed")) {
			flag = true;
		}

		return flag;

	}
	public void validateTransactiontable(){
		boolean flag=false;
		WebElement ele=driver.findElement(TRANSACTION_EMPTY);
		String classname = ele.getAttribute("class");
		if (classname != null && classname.contains("dataTables_empty")) {
			reportInfo("Transactions Table Is Empty.");
		}
		String successFilePath = elementScreenshot(TRANSACTION_TABLE);
		reportSuccessScreenshot(successFilePath, "Transaction table records.");
		
	}
}
