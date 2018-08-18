package selenium.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.google.common.collect.Ordering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import selenium.framework.common.PageControls;

public class ReferenceData_EnumsPage extends PageControls{
	public WebDriver driver;
	public  final By REFERENCE_DATA_LNK = By.xpath("//a[@href='#/referenceData']");
	public  final By ADD_ENUM = By.xpath("//a[@id='createEnum']");
	public  final By TYPE_INPUT = By.xpath("//textarea[@name='type']");
	public  final By VALUE_INPUT = By.xpath("//textarea[@name='value']");
	public  final By LABEL_INPUT = By.xpath("//textarea[@name='label']");
	public  final By DESCRIPTION_INPUT = By.cssSelector("textarea[name='desc']");
	public  final By OK_BUTTON = By.xpath("//button[@class='btn btn-primary ok_button']");
	public  final By REMOVE_BUTTON = By.xpath("//*[@id='advanced-search-remove-button']");
	public  final By CANCEL_BUTTON = By.xpath("//button[@class='btn btn-default cancel_button2']");
	public  final By SEARCH_BUTTON = By.xpath("//*[@id='advanced-search-button']");
	public  final By PAGE_LOADING = By.xpath("//div[@class='loading' and style='display: block;']");
	public  final By ADVANCED_SEARCH_TYPE =By.xpath("//*[@placeholder='Type']");
	public  final By ADVANCED_SEARCH_VALUE =By.xpath("(//input[@type='text'])[2]");
	public  final By ADVANCED_SEARCH_DESCRIPTION =By.xpath("(//input[@type='text'])[3]");
	public  final By ADVANCED_SEARCH_LABEL =By.xpath("(//input[@type='text'])[4]");
	public  final By ADVANCED_SEARCH_LANGUAGE =By.xpath("(//input[@type='text'])[5]");
	public  final By ADVANCED_SEARCH_NAME_SUGGESTIONS_DROPDOWN =By.xpath("//label[@class='input']//ul[1]");
	public  final By ADVANCED_OK_BUTTON = By.xpath("//button[@class='btn btn-primary ok_button']");
	public  final By VALIDATE_ENUM = By.xpath("//table[@id='enumTable']//tbody//tr//td[3]");
	public  final By VALIDATE_ENUM2 = By.xpath("//table[@id='enumTable']//tbody//tr//td[3]");
	public  final By VALIDATE_ENUM_TYPE = By.xpath("//em[@class='invalid ng-binding ng-scope']");
	public  final By VALIDATE_ENUM_VALUE = By.xpath("//table[@id='enumTable']//tbody//tr//td[3]");
	public  final By VALIDATE_ENUM_REMOVEBUTTON = By.xpath("//*[@class='widget-body']");
	public  final By EDIT_ENUM =By.xpath("//*[@class='lm-action-update ios ng-scope']");
	public  final By DELETE_ENUM=By.xpath("//*[@class='lm-action-delete ios ng-scope']");
	public  final By DELETE_ENUM_YES=By.xpath("//*[@class='btn btn-primary ok_button']");
	public  final By DELETE_ENUM_SUCCESSFUL=By.xpath(".//*[@class='toast-message']");
	public  final By ENUM_SORT_BY_TYPE=By.xpath("//*[@id='enumTable_0_2']");
	public  final By ENUM_SORT_BY_VALUE=By.xpath("//*[@id='enumTable_0_3']");
	public  final By ENUM_SORT_BY_LABEL=By.xpath("//*[@id='enumTable_0_5']");
	public  final By ENUM_TABLE_TYPE_COLUMN=By.xpath("//*[@id='enumTable']//tbody//tr//td[2]");
	public  final By ENUM_TABLE_VALUE_COLUMN=By.xpath("//*[@id='enumTable']//tbody//tr//td[3]");
	public  final By ENUM_TABLE_LABEL_COLUMN=By.xpath("//*[@id='enumTable']//tbody//tr//td[5]");
	public  final By SHOW_ENTITIES_DROPDOWN = By.name("enumTable_length");
	public  final By ENUM_TABLE = By.xpath("//table[@id='enumTable']/tbody/tr");
	public  final By FIELDSETTINGS_BUTTON = By.xpath("//a[@id='show-table-options']/i");
	public  final By SETTINGS_NAME_CHECKBOX = By.xpath("//li[1][@class='ng-scope']//label//input[1]"); 
	public  final By SETTINGS_ALL_COLUMNS_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li//input");
	public  final By ENUM_TABLE_HEADER = By.xpath("//*[@id='enumTable']//thead//tr//th");
	public  final By SELECT_DROP_DOWN = By.xpath("//*[@id='typeahead-7625-5742-option-0']/a");
	public  final By VALIDATION_ERROR = By.xpath("//*[@class='alert alert-danger alert-block']");
	public  final By SUGGESTIONS=By.xpath("//label/ul/li/a");
	public final By SETTINGS_ALL_COLUMNS_VISIBLE=By.xpath("//ul[@class='ColVis_collection']//li");
	public final By SETTINGS_ALL_COLUMNS=By.xpath("//ul[@class='ColVis_collection']//li//input");
	
	
	public ReferenceData_EnumsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}	

	public void navigateToEnumsPage(){
		String tmp = getCurrentUrl();
		String tmp1 = tmp.substring(0, tmp.lastIndexOf("#/"));
		driver.navigate().to(tmp1+"#/enums");
		System.out.println("Redirecting to Enums page");
		waitForPageToLoad(PAGE_LOADING);
	}

	public void addNewEnum(){
		this.click(ADD_ENUM);
		reportInfo("Clicking On Add Enum Button");
	}
	public void enterEnumType(String testData){
		this.clear(TYPE_INPUT);
		this.type(TYPE_INPUT, testData);
		reportInfo("Entering Enum Type :"+testData);

	}
	public void enterEnumValue(String testData){
		this.clear(VALUE_INPUT);
		this.type(VALUE_INPUT, testData);
		reportInfo("Entering Enum Value: "+testData);
	}
	public void enterEnumLabel(String testData){
		this.clear(LABEL_INPUT);
		this.type(LABEL_INPUT, testData);
		reportInfo("Entering Enum Label:"+testData);
	}
	public void enterEnumDescription(String testData){
		this.clear(DESCRIPTION_INPUT);
		this.type(DESCRIPTION_INPUT, testData);
		reportInfo("Entering Enum Description:"+testData);
	}
	public void clickOn_Ok_Button(){
		this.click(OK_BUTTON);
		reportInfo("Clicking On  OK Button");
		this.waitForPageToLoad(PAGE_LOADING);

	}
	public void clickRemoveButton(){
		this.click(REMOVE_BUTTON);
		reportInfo("Clicking On Remove Button");
		this.waitForPageToLoad(PAGE_LOADING);

	}
	public void searchButton(){
		this.click(SEARCH_BUTTON);
		reportInfo("Clicking On Search Button");
		this.waitForPageToLoad(PAGE_LOADING);

	}
	public void enterAdvancedSearch(String testData){
		this.clear(ADVANCED_SEARCH_TYPE );
		this.type(ADVANCED_SEARCH_TYPE , testData);
		this.waitForPageToLoad(PAGE_LOADING);
		//this.click(SUGGESTIONS);
		reportInfo("Entering  Enum Type :"+testData);
	}
	public void enterAdvancedSearchValue(String testData){
		this.clear(ADVANCED_SEARCH_VALUE);
		this.type(ADVANCED_SEARCH_VALUE, Keys.TAB);
		reportInfo("Entering ENum Advanced Search Value:"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void enterAdvancedSearchDescription(String testData){
		this.clear(ADVANCED_SEARCH_DESCRIPTION);
		this.type(ADVANCED_SEARCH_DESCRIPTION, testData);
		reportInfo("Entering ENum Advanced Search Description:"+testData);
	}
	public void enterAdvancedSearchLabel(String testData){
		this.clear(ADVANCED_SEARCH_LABEL);
		this.type(ADVANCED_SEARCH_LABEL, testData);
		reportInfo("Entering ENum Advanced Search Label:"+testData);
	}
	public void enterAdvancedSearchLanguage(String testData){
		this.clear(ADVANCED_SEARCH_LANGUAGE);
		this.type(ADVANCED_SEARCH_LANGUAGE, testData);
		reportInfo("Entering ENum Advanced Search Language:"+testData);
	}
	public void clickOn_EditLocation_Button(){
		this.click(EDIT_ENUM );
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOn_DeleteLocation_Button(){
		this.click(DELETE_ENUM );
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOn_DeleteLocationYes_Button(){
		this.click(DELETE_ENUM_YES );
	}
	public void clickonSortTypeButton(){
		this.click(ENUM_SORT_BY_TYPE);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public String selectShowEntitiesDropdown() {
		String testData=this.getFirstDropDownLabel(SHOW_ENTITIES_DROPDOWN);
		this.selectDropdown(SHOW_ENTITIES_DROPDOWN, testData);
		reportInfo("Clicking On Show Entities DropDown");
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
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
		public int enumsTableColumns(By by){
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
	public void uncheckNameField() {
		this.uncheck(SETTINGS_NAME_CHECKBOX);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public String getText(By by,String testData){
		reportInfo(testData);
		return this.getText(by);
		}
	public List<String> expectedList(By by,String testData){ 
		List<String> list1 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(ENUM_TABLE_TYPE_COLUMN); 
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
		List<WebElement> memberTableNameColumn = getWebElementList(ENUM_TABLE_TYPE_COLUMN); 
		for (WebElement element : memberTableNameColumn) { 
			list1.add(element.getText()); 
		} 
		reportInfo(testData);
		return list1; 
	} 
	
	public List<String> expectedList1(By by,String testData){ 
		List<String> list1 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(ENUM_TABLE_VALUE_COLUMN); 
		for (WebElement element : memberTableNameColumn) { 
			list1.add(element.getText()); 
		} 
		Collections.sort(list1); 
		System.out.println(list1);
		//Collections.reverse(list1); 
		reportInfo(testData);
		return list1; 
	}
	public List<String> actualList1(By by,String testData){ 
		List<String> list1 = new ArrayList<String>(); 
		List<WebElement> memberTableNameColumn = getWebElementList(ENUM_TABLE_VALUE_COLUMN); 
		for (WebElement element : memberTableNameColumn) { 
			list1.add(element.getText()); 
		} 
		reportInfo(testData);
		return list1; 
	} 
	public void assertCheckedColumns(String testType) {
		reportInfo("Validating Enums visible columns in Enums table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);
				List<WebElement> memberColumnList = getWebElementList(ENUM_TABLE_HEADER);
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
		reportInfo("Validating Locations Invisible columns in location table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> memberColumnList = getWebElementList(ENUM_TABLE_HEADER);
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
				List<WebElement> rows = getWebElementList(ENUM_TABLE);
				int count = rows.size();
				if(count<=expected){
					flag=true;
				}
		return flag;
	}
	public boolean sortingByType() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList(ENUM_TABLE_TYPE_COLUMN);
		for (WebElement element : sortingTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		Collections.sort(list1,new SortIgnoreCase());
		//Collections.sort(list2,new SortIgnoreCase());

		Collections.reverse(list1);
		System.out.println("After Reverse"+list1);
		System.out.println("List1 is"+list1);
		boolean sorted=Ordering.natural().isOrdered(list2);
		return sorted;
	}
	public class SortIgnoreCase implements Comparator<Object> {
		public int compare(Object o1, Object o2) {
			String s1 = (String) o1;
			String s2 = (String) o2;
			return s1.toLowerCase().compareTo(s2.toLowerCase());
		}
	}
	public void clickonSortValueButton(){
		this.click(ENUM_SORT_BY_VALUE);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	
	public void clickonSortLabelButton(){
		this.click(ENUM_SORT_BY_LABEL);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public boolean sortingByLabel() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableLabelColumn = getWebElementList(ENUM_TABLE_LABEL_COLUMN);
		for (WebElement element : sortingTableLabelColumn) {
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
	public void assertEnumPopup(String expected, String testType)
	{
		reportInfo("Validating Enum Delete Or Not");
		try {
			if (this.getText(DELETE_ENUM_SUCCESSFUL).equals(expected)) {
				Assert.assertEquals(this.getText(DELETE_ENUM_SUCCESSFUL), expected);
				reportPassedStatus("Verified Location Delete Or Not");
				String successFilePath = elementScreenshot(DELETE_ENUM_SUCCESSFUL);
				reportSuccessScreenshot(successFilePath,""); 
			} else {
				String successFilePath = elementScreenshot(DELETE_ENUM_SUCCESSFUL);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}
	
	public void assertEnumType(String expected,String testType)
	{
		reportInfo("Validating Enum Type");
		try {
			if (this.getText(VALIDATE_ENUM).equals(expected)) {
				Assert.assertEquals(this.getText(VALIDATE_ENUM), expected);
				reportPassedStatus("Verified Enum Type");
				String successFilePath = elementScreenshot(VALIDATE_ENUM);
				reportSuccessScreenshot(successFilePath,""); 
			} else {
				String successFilePath = elementScreenshot(VALIDATE_ENUM);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}

	}
	public void assertEnumValue(String expected,String testType)
	{
		reportInfo("Validating Enum Type");
		try {
			if (this.getText(VALIDATE_ENUM_VALUE).equals(expected)) {
				Assert.assertEquals(this.getText(VALIDATE_ENUM_VALUE), expected);
				reportPassedStatus("Verified Enum Type");
				String successFilePath = elementScreenshot(VALIDATE_ENUM_VALUE);
				reportSuccessScreenshot(successFilePath,""); 
			} else{
				String successFilePath = elementScreenshot(VALIDATE_ENUM_VALUE);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}

	}
	public void assertEnumTypeError(String testType)
	{
		reportInfo("Validating Enum Type");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(VALIDATE_ENUM_TYPE);
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
	public void assertEnumRemoveButton(String expected, String testType)
	{
		reportInfo("Validating Enum Remove Button");
		try {
			if (this.getText(VALIDATE_ENUM_REMOVEBUTTON).equals(expected)) {
				Assert.assertEquals(this.getText(VALIDATE_ENUM_REMOVEBUTTON), expected);
				reportPassedStatus("Verified Enum Type");
				String successFilePath = elementScreenshot(VALIDATE_ENUM_REMOVEBUTTON);
				reportSuccessScreenshot(successFilePath,""); 
			} else{
				String successFilePath = elementScreenshot(VALIDATE_ENUM_REMOVEBUTTON);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
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
	public void assertInt(int expected, int actual, By by, String message){
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
}


