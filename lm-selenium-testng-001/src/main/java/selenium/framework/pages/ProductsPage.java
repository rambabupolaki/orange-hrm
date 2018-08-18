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

import junit.framework.Assert;
import selenium.framework.common.PageControls;

public class ProductsPage extends PageControls {
	public WebDriver driver;
	public final By REFERENCE_DATA_LNK = By.xpath("//a[@href='#/referenceData']");
	public final By ADD_PRODUCT = By.xpath("//a[@id='addProductButton']");
	public final By PRODUCT_SKU_INPUT = By.xpath("//textarea[@name='sku']");
	public final By NAME_INPUT = By.xpath("//textarea[@name='name']");
	public final By CATEGORY_INPUT = By.xpath("//textarea[@name='category']");
	public final By SUB_CATEGORY_INPUT = By.xpath("//textarea[@name='subcategory']");
	public final By STYLE_INPUT = By.xpath("//textarea[@name='style']");
	public final By DESCRIPTION_INPUT = By.xpath("//textarea[@name='desc']");
	public final By COST_INPUT = By.xpath("//input[@name='cost']");
	public final By OK_BUTTON = By.xpath("//button[@class='btn btn-primary ok_button']");
	public final By CANCEL_BUTTON = By.xpath("//button[@class='btn btn-default cancel_button2']");
	public final By SEARCH_BAR = By.xpath("//*[@id='advanced-search-button']");
	public final By PAGE_LOADING = By.xpath("//div[@class='loading' and style='display: block;']");
	public final By SEARCH_PRODUCT_NAME = By.xpath("//input[@placeholder='Name']");
	public final By SELECT_DROP_DOWN = By.xpath("//*[@id='typeahead-7625-5742-option-0']/a");
	public final By VALIDATE_PRODUCT_SKU = By.xpath("//table[@id='productTable']//tbody//tr[1]//td[2]");

	// Editing product

	public final By EDIT_PRODUCT_LINK = By.xpath("//a[@class='lm-action-update ios ng-scope']");
	public final By EDIT_OK_BUTTON = By.xpath("//button[@class='btn btn-primary ok_button']");
	public final By CANCEL_PRODUCT = By.xpath("//button[@class='btn btn-default cancel_button2']");

	// Searching product
	public final By SEARCH_NAME = By.xpath("(//input[@type='text'])[2]");
	public final By SEARCH_CATEGORY = By.xpath("(//input[@type='text'])[3]");
	public final By VALIDATE_PRODUCT_NAME = By.xpath("//table[@id='productTable']//tbody//tr//td[3]");
	public final By VALIDATE_PRODUCT_CATEGORY = By.xpath("//table[@id='productTable']//tbody//tr//td[4]");
	// Sort product
	public final By SORT_SKU_NAME_BUTTON = By.xpath("//*[@id='productTable_0_2']");
	public final By SORT_SKU_NAME = By.xpath("//*[@id='productTable']//tbody//tr//td[2]");

	// Pagination
	public final By SHOW_ENTRIES = By.name("productTable_length");
	public final By PRODUCT_TABLE = By.xpath("//table[@id='productTable']/tbody/tr");

	// Field Settings
	public final By FIELDSETTINGS_BUTTON = By.xpath("//a[@id='show-table-options']/i");
	public final By FIELDSETTINGS_CHECKBOX = By.xpath("//li[1][@class='ng-scope']//label//input[1]");
	public final By FIELDSETTINGS_ALL_COLUMNS = By.xpath("//ul[@id='spec']//li//input");
	public final By PRODUCTS_TABLE_HEADER = By.xpath("//table[@id='productTable']//thead//tr//th");

	// Invisible Columns

	// Delete Products
	public final By DELETE_BUTTON = By.xpath("//table[@id='productTable']//tbody//tr//td[1]//div//div//span[2]//a");
	public final By DELETE_YES_BUTTON = By.xpath("//button[@class='btn btn-primary ok_button']");
	public final By PRODUCTS_DELETE_SUCCESSFUL_POP_UP = By.xpath(".//*[@class='toast-message']");

	// Duplicate Product
	public final By DUPLICATE_PRODUCT_VALIDATION_ERROR = By.xpath("//*[@class='alert alert-danger alert-block']");

	// Null Value
	public final By PRODUCT_REQUIRED_FIELD_ERROR = By.xpath("//em[@class='invalid ng-binding ng-scope']");

	// Remove Button
	public final By PRODUCT_REMOVE_BUTTON = By.xpath("//*[@id='advanced-search-remove-button']");
	public final By VALIDATE_PRODUCTNAME = By.xpath("//table[@id='productTable']//tbody//tr//td[4]");
	public final By VALIDATION_ERROR = By.xpath(".//*[@class='toast-message']");
	public final By SUGGESTION_INPUT = By.xpath("//label/ul/li/a");

	public ProductsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	public void navigateToProductsPage() {

		String tmp = getCurrentUrl();
		String tmp1 = tmp.substring(0, tmp.lastIndexOf("#/"));
		driver.navigate().to(tmp1 + "#/products");
		System.out.println("Redirecting to products page");
		waitForPageToLoad(PAGE_LOADING);

	}

	public void addNewProduct() {
		this.click(ADD_PRODUCT);
		reportInfo("Clicking on Add Product Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void enterProductSKUName(String name) {
		this.clear(PRODUCT_SKU_INPUT);
		this.type(PRODUCT_SKU_INPUT, name);
		reportInfo("Entering product SKU. :" + name);
		this.waitForPageToLoad(PAGE_LOADING);

	}

	public void enterName(String name) {
		this.clear(NAME_INPUT);
		this.type(NAME_INPUT, name);
		reportInfo("Entering  Name. :" + name);

	}

	public void description(String description) {
		this.clear(DESCRIPTION_INPUT);
		this.type(DESCRIPTION_INPUT, description);
		reportInfo("Entering  description :" + description);
	}

	public void category(String category) {
		this.clear(CATEGORY_INPUT);
		this.type(CATEGORY_INPUT, category);
		reportInfo("Entering  category :" + category);
	}

	public void subCategory(String subCategory) {
		this.clear(SUB_CATEGORY_INPUT);
		this.type(SUB_CATEGORY_INPUT, subCategory);
		reportInfo("Entering  sub category :" + subCategory);
	}

	public void style(String style) {
		this.clear(STYLE_INPUT);
		this.type(STYLE_INPUT, style);
		reportInfo("Entering  style :" + style);
	}

	public void cost(String i) {
		this.clear(COST_INPUT);
		this.type(COST_INPUT, i);
		reportInfo("Entering  cost :" + i);
	}

	public void Ok_Button() {
		this.click(OK_BUTTON);
		reportInfo("Click On OK button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void NewOk_Button() {
		this.click(OK_BUTTON);
		reportInfo("Click On OK button.");
		// this.waitForPageToLoad(PAGE_LOADING);
	}

	public void Cancel_Button() {
		this.click(CANCEL_BUTTON);
	}

	public void Search_bar() {
		this.click(SEARCH_BAR);
		reportInfo("Click On Advanced Search Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void productNameSearch(String testData) {
		this.clear(SEARCH_PRODUCT_NAME);
		this.type(SEARCH_PRODUCT_NAME, testData);
		reportInfo("Enter Product Name. :" + testData);
		this.waitForPageToLoad(PAGE_LOADING);
		//this.click(SUGGESTION_INPUT);
		reportInfo("Entering Search Input." + testData);
	}

	public void clickOn_Ok_Button() {
		this.click(OK_BUTTON);
		reportInfo("Clicking On OK Button");
		this.waitForPageToLoad(PAGE_LOADING);

	}

	public void selectDropDownValue(String testData) {
		this.selectDropdown(SELECT_DROP_DOWN, testData);
		waitForPageToLoad(PAGE_LOADING);
		this.type(SELECT_DROP_DOWN, Keys.ENTER);
		waitForPageToLoad(PAGE_LOADING);
		reportInfo("Selecting Search Criteria. :testData");
	}

	public void assertProductSkuName(String expected, String testType) {
		reportInfo("Validating Product Sku Name");
		try {
			if (this.getText(VALIDATE_PRODUCT_SKU).equals(expected)) {
				Assert.assertEquals(this.getText(VALIDATE_PRODUCT_SKU), expected);
				reportPassedStatus("Verified Product SKU");
				String successFilePath = elementScreenshot(VALIDATE_PRODUCT_NAME);
				reportSuccessScreenshot(successFilePath, "");
			} else {
				String successFilePath = elementScreenshot(VALIDATE_PRODUCT_NAME);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}

	// edit product methods
	public void clickOnEditProductButton() {
		this.click(EDIT_PRODUCT_LINK);
		reportInfo("Clicking on Edit Member Button");
	}

	public void clickOnEditOk_Button() {
		this.click(EDIT_OK_BUTTON);
		reportInfo("Clicking On OK button");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void clickOnCancelButton() {
		this.click(CANCEL_PRODUCT);
		this.waitForPageToLoad(PAGE_LOADING);
	}

	// advanced search product

	public void advancedNameSearch(String testData) {
		this.clear(SEARCH_NAME);
		this.type(SEARCH_NAME, testData);
		waitForPageToLoad(PAGE_LOADING);
		List<WebElement> lst = driver.findElements(
				By.xpath("//form[@id='advanced-search-dialog']//section[2]//lm-multi-select-input//label//ul"));
		lst.get(0).click();
		// Ok_Button();
		reportInfo("Entering Search Input." + testData);
	}

	public void advancedCategorySearch(String testData) {
		this.clear(SEARCH_CATEGORY);
		this.type(SEARCH_CATEGORY, testData);
		waitForPageToLoad(PAGE_LOADING);
		List<WebElement> lst = driver.findElements(
				By.xpath("//form[@id='advanced-search-dialog']//section[1]//lm-multi-select-input//label//ul"));
		lst.get(0).click();
		// Ok_Button();
		reportInfo("Entering Search Input.");
	}

	public void assertName(String expected, String testType) {
		reportInfo("Validating Product Name");
		try {
			if (this.getText(VALIDATE_PRODUCT_NAME).equals(expected)) {
				Assert.assertEquals(this.getText(VALIDATE_PRODUCT_NAME), expected);
				reportPassedStatus("Verified Product Name");
				String successFilePath = elementScreenshot(VALIDATE_PRODUCT_NAME);
				reportSuccessScreenshot(successFilePath, "");
			} else {
				String successFilePath = elementScreenshot(VALIDATE_PRODUCT_NAME);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}

	public void assertCategory(String expected, String testType) {
		reportInfo("Validating Product Category");
		try {
			if (this.getText(VALIDATE_PRODUCT_CATEGORY).equals(expected)) {
				Assert.assertEquals(this.getText(VALIDATE_PRODUCT_CATEGORY), expected);
				reportPassedStatus("Verified Product Category.");
				String successFilePath = elementScreenshot(VALIDATE_PRODUCT_CATEGORY);
				reportSuccessScreenshot(successFilePath, "");
			} else {
				String successFilePath = elementScreenshot(VALIDATE_PRODUCT_CATEGORY);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}

	// sorting

	public void sortSkuButton() {
		this.click(SORT_SKU_NAME_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);

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

	public void assertObject(Object expected, Object actual, String message) {
		if (expected.equals(actual)) {
			reportPassedStatus("Expected [ " + expected + " ] : Actual [ " + actual + " ]");

		} else {
			reportFailedStatus("Expected [ " + expected + " ] ");
			reportFailedStatus(" Actual [ " + actual + " ]");

		}
	}

	public boolean sortingBySkuName() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList(SORT_SKU_NAME);
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

	// Pagination
	public String selectShowEntriesDropdown() {
		String testData = this.getFirstDropDownLabel(SHOW_ENTRIES);
		this.selectDropdown(SHOW_ENTRIES, testData);
		reportInfo("Clicking On Show Entities DropDown");
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}

	public boolean validatePagination(int expected) {
		boolean flag = false;
		List<WebElement> rows = getWebElementList(PRODUCT_TABLE);
		int count = rows.size();
		if (count <= expected) {
			flag = true;
		}
		return flag;
	}

	// Field Settings

	public void fieldSettings() {
		this.click(FIELDSETTINGS_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void checkFieldName() {
		this.check(FIELDSETTINGS_CHECKBOX);
		reportInfo("clicking field settings");
		this.waitForPageToLoad(PAGE_LOADING);
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

	public int productTableColumns(By by) {
		int count = 0;
		reportInfo("Fetching number of columns in table.");
		List<WebElement> transactionColumnList = getWebElementList(by);
		for (WebElement l : transactionColumnList) {
			if (l.getAttribute("class").equalsIgnoreCase("ng-scope")) {
				count = count + 1;
			}
		}
		return count - 1;
	}

	public void assertCheckedColumns(String testType) {
		reportInfo("Validating Products visible columns in Location table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> checkBoxList = getWebElementList(FIELDSETTINGS_ALL_COLUMNS);
				List<WebElement> memberColumnList = getWebElementList(PRODUCTS_TABLE_HEADER);
				Assert.assertEquals(checkBoxList.size(), (memberColumnList.size() - 1));
				String successFilePath = elementScreenshot(FIELDSETTINGS_ALL_COLUMNS);
				reportSuccessScreenshot(successFilePath, "");
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

	// Invisible Fields

	public void unCheckFieldName() {
		this.uncheck(FIELDSETTINGS_CHECKBOX);
		String screenshotFilePath = elementScreenshot(FIELDSETTINGS_ALL_COLUMNS);
		reportSuccessScreenshot(screenshotFilePath, "");
		reportInfo("clicking field settings");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void assertUnCheckedColumns(String testType) {
		reportInfo("Validating Product Invisible columns in member table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> productList = getWebElementList(PRODUCTS_TABLE_HEADER);
				String count = "0";
				for (WebElement w : productList) {
					if (w.getText() == "SKU") {
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

	// Delete Product
	public void clickDeleteButton() {
		this.click(DELETE_BUTTON);
		waitForPageToLoad(PAGE_LOADING);
	}

	public void clickOnDeleteYesButton() {
		this.click(DELETE_YES_BUTTON);
		// waitForPageToLoad(PAGE_LOADING);
	}

	public void assertProductDeletionPopUp(String expected, String testType) {
		reportInfo("Validating Product Deletion.");
		try {
			if (this.getText(PRODUCTS_DELETE_SUCCESSFUL_POP_UP).equals(expected)) {
				Assert.assertEquals(this.getText(PRODUCTS_DELETE_SUCCESSFUL_POP_UP), expected);
				reportPassedStatus("Verified Product Deletion.");
				String successFilePath = elementScreenshot(PRODUCTS_DELETE_SUCCESSFUL_POP_UP);
				reportSuccessScreenshot(successFilePath, "");
			} else {
				String successFilePath = elementScreenshot(PRODUCTS_DELETE_SUCCESSFUL_POP_UP);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}

	// Duplicate Product
	public void assertDuplicateProductPopUp(String testType) {
		reportInfo("Validating Duplicate Records");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(DUPLICATE_PRODUCT_VALIDATION_ERROR);
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

	// Null Value for Mandatory field
	public void mandatoryFieldError(String testType) {
		reportInfo("Validating Null Value in Mandatory fields");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(PRODUCT_REQUIRED_FIELD_ERROR);
				reportSuccessScreenshot(successFilePath, "");
			} else if (testType.equalsIgnoreCase("invalid")) {

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Test Case Failed");
		}
	}

	// Remove Button
	public void clickOnRemoveButton() {
		String successFilePath = elementScreenshot(PRODUCT_REMOVE_BUTTON);
		reportSuccessScreenshot(successFilePath, "");
		this.click(PRODUCT_REMOVE_BUTTON);

		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void assertRemoveRecord(String testType) {
		reportInfo("Validating Remove record ");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(PRODUCT_TABLE);
				reportSuccessScreenshot(successFilePath, "");

			} else if (testType.equalsIgnoreCase("invalid")) {

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Test Case Failed");
		}
	}

	public String getText(By by, String testData) {
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
}
