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

import com.google.common.collect.Ordering;

import selenium.framework.common.PageControls;

public class ReferenceData_LocationsPage extends PageControls{

	public  final By REFERENCE_DATA_LNK = By.xpath("//a[@href='#/referenceData']");
	public  final By ADD_LOCATIONS = By.xpath("//a[@id='createLocation']");
	public  final By NAME_INPUT = By.xpath("//textarea[@name='name']");
	public  final By NUMBER_INPUT = By.xpath("//textarea[@name='number']");
	public  final By DESCRIPTION_INPUT = By.cssSelector("textarea[name='desc']");
	public  final By CITY_INPUT = By.xpath("//textarea[@name='city']");
	public  final By STATE_INPUT = By.xpath("//textarea[@name='state']");
	public  final By ZIPCODE_INPUT = By.xpath("//textarea[@name='zipCode']");
	public  final By COUNTRY_INPUT=By.xpath("//textarea[@name='country']");
	public  final By OK_BUTTON = By.xpath("//button[@class='btn btn-primary ok_button']");
	public  final By CANCEL_BUTTON = By.xpath("//button[@class='btn btn-default cancel_button2']");
	public  final By SEARCH_BUTTON = By.xpath("//*[@id='advanced-search-button']");
	public  final By PAGE_LOADING = By.xpath("//div[@class='loading' and style='display: block;']");
	public  final By ADVANCED_SEARCH_NAME =By.xpath("//*[@placeholder='Name']");
	public  final By ADVANCED_SEARCH_NUMBER =By.xpath("(//input[@type='text'])[2]");
	public  final By ADVANCED_SEARCH_DESCRIPTION =By.xpath("(//input[@type='text'])[3]");
	public  final By ADVANCED_SEARCH_NAME_SUGGESTIONS_DROPDOWN =By.xpath("//label[@class='input']//ul[1]");
	public  final By ADVANCED_OK_BUTTON = By.xpath("//button[@class='btn btn-primary ok_button']");
	public  final By VALIDATE_LOCATION = By.xpath("//table[@id='locationTable']//tbody//tr//td[2]");
	public  final By EDIT_LOCATION =By.xpath("//*[@class='lm-action-update ios ng-scope']");
	public  final By DELETE_LOCATION=By.xpath("//*[@class='lm-action-delete ios ng-scope']");
	public  final By DELETE_LOCATION_YES=By.xpath("//*[@class='btn btn-primary ok_button']");
	public  final By DELETE_LOCATION_SUCCESSFUL=By.xpath(".//*[@class='toast-message']");
	public  final By SUGGESTIONS=By.xpath("//*[@id='advanced-search-dialog']//div//div//section//label//ul//*[@class='ng-binding ng-scope']");
	public  final By LOCATION_SORT_BY_NAME=By.xpath("//*[@id='locationTable_0_2']");
	public  final By LOCATION_SORT_BY_NUMBER=By.xpath("//*[@id='locationTable_0_3']");
	public  final By LOCATION_SORT_BY_DESCRIPTION=By.xpath("//*[@id='locationTable_0_4']");
	public  final By LOCATION_TABLE_NAME_COLUMN=By.xpath("//*[@id='locationTable']//tbody//tr//td[2]");
	public  final By LOCATION_TABLE_NUMBER_COLUMN=By.xpath("//*[@id='locationTable']//tbody//tr//td[3]");
	public  final By LOCATION_TABLE_DESCRIPTION_COLUMN=By.xpath("//*[@id='locationTable']//tbody//tr//td[4]");
	public  final By SHOW_ENTITIES_DROPDOWN = By.name("locationTable_length");
	public  final By LOCATION_TABLE = By.xpath("//table[@id='locationTable']/tbody/tr");
	public  final By FIELDSETTINGS_BUTTON = By.xpath("//a[@id='show-table-options']/i");
	public  final By SETTINGS_NAME_CHECKBOX = By.xpath("//li[1][@class='ng-scope']//label//input[1]"); 
	public  final By SETTINGS_ALL_COLUMNS_CHECKBOX = By.xpath("//ul[@id='spec']//li//input");
	public  final By LOCATION_TABLE_HEADER = By.xpath("//*[@id='locationTable']//thead//tr//th");
	public  final By SELECT_DROP_DOWN = By.xpath("//*[@id='typeahead-7625-5742-option-0']/a");
	public  final By VALIDATION_ERROR = By.xpath("//*[@class='alert alert-danger alert-block']");
	public  final By NEXT_BUTTON = By.linkText("Next");
	public  final By VALIDATE_NEXT_BUTTON = By.xpath("//*[@class='ng-isolate-scope']//div[2]/ul/li[3]");
	public  final By PREVIOUS_BUTTON = By.linkText("Previous");
	public  final By VALIDATE_PREVIOUS_BUTTON = By.xpath("//*[@class='ng-isolate-scope']//div[2]/ul/li[2]");
	public  final By COLLAPSE_BUTTON = By.xpath("//a[@class='button-icon jarviswidget-toggle-btn']");
	public  final By COLLAPSER_BUTTON_CLASSNAME=By.xpath("//*[@id='wid-id-locationWiget']");
	public  final By NEXT_BUTTON_CLASS_NAME = By.xpath("//li[@id='Table_next']");
	public  final By PREVIOUS_BUTTON_CLASS_NAME = By.xpath("//li[@id='Table_previous']");
	public  final By SUGGESTION_INPUT=By.xpath("//label/ul/li/a");
	public  final By VALIDATE_LOCATIONNAME = By.xpath("//table[@id='locationTable']//tbody//tr//td[3]");
	public final By DUPLICATE_ERROR=By.xpath(".//*[@class='toast-message']");
	public static final String LocationDeletedPopUp="Delete successful.";


	public ReferenceData_LocationsPage(WebDriver driver) {
		super(driver);


	}	

	public void navigateToLocationsPage(){
		String tmp = getCurrentUrl();
		String tmp1 = tmp.substring(0, tmp.lastIndexOf("#/"));
		driver.navigate().to(tmp1+"#/locations");
		System.out.println("Redirecting to locations page");
		waitForPageToLoad(PAGE_LOADING);
	}

	public void addNewLocations(){
		this.click(ADD_LOCATIONS);
		reportInfo("Clicking On Add location Button");
	}

	public void enterLocationName(String testData){
		this.clear(NAME_INPUT);
		this.type(NAME_INPUT, testData);
		reportInfo("Entering  Name. :"+testData);

	}
	public void enterDescription(String testData){
		this.clear(DESCRIPTION_INPUT);
		this.type(DESCRIPTION_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering  description :"+testData);
	}
	public void enterLocationNumber(String testData){
		this.clear(NUMBER_INPUT);
		this.type(NUMBER_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering  number :"+testData);
	}
	public void enterCity(String testData){
		this.clear(CITY_INPUT);
		this.type(CITY_INPUT, testData);
		reportInfo("Entering  city :"+testData);
	}
	public void enterState(String testData){
		this.clear(STATE_INPUT);
		this.type(STATE_INPUT, testData);
		reportInfo("Entering  State :"+testData);
	}
	public void enterZipcode(String testData){
		this.clear(ZIPCODE_INPUT);
		this.type(ZIPCODE_INPUT,testData);
		reportInfo("Entering zipcode:"+testData);
	}
	public void enterCountry(String testData){
		this.clear(COUNTRY_INPUT);
		this.type(COUNTRY_INPUT,testData);
		reportInfo("Entering country:"+testData);
	}

	public void clickOn_Ok_Button(){
		this.click(OK_BUTTON);
		reportInfo("Clicking On OK Button");
		this.waitForPageToLoad(PAGE_LOADING);

	}
	public void clickOnNewOk_Button(){
		this.click(OK_BUTTON);
		reportInfo("Clicking On Add Location OK Button");
		//this.waitForPageToLoad(PAGE_LOADING);

	}


	public void clickOn_Cancel_Button(){
		this.click(CANCEL_BUTTON);
	}
	public void clickOn_Search_Button(){
		this.click(SEARCH_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on Advanced Search button");
	}
	public void enterAdvancedSearch(String testData){
		this.clear(ADVANCED_SEARCH_NAME );
		this.type(ADVANCED_SEARCH_NAME , testData);
		this.waitForPageToLoad(PAGE_LOADING);
		//this.click(SUGGESTION_INPUT);
		//this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering  Location Name :"+testData);
	}
	public void enterAdvancedLocationNumber(String testData){
		this.clear(ADVANCED_SEARCH_NUMBER );
		this.type(ADVANCED_SEARCH_NUMBER , testData);
		this.waitForPageToLoad(PAGE_LOADING);
		List<WebElement> lst = driver.findElements(By.xpath("//form[@id='advanced-search-dialog']//section[1]//lm-multi-select-input//label//ul"));
		lst.get(0).click();
		reportInfo("Entering  Location Name :"+testData);
	}
	public void enterAdvancedDescription(String testData){
		this.clear(ADVANCED_SEARCH_DESCRIPTION);
		this.type(ADVANCED_SEARCH_DESCRIPTION , testData);
		this.waitForPageToLoad(PAGE_LOADING);
		List<WebElement> lst = driver.findElements(By.xpath("//label[@class='input']//ul[1]"));
		lst.get(0).click();
		reportInfo("Entering  Location Name :"+testData);
	}

	public void clickOn_Advancedsearch_Ok_Button(){
		this.click(ADVANCED_OK_BUTTON );
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOn_EditLocation_Button(){
		this.click(EDIT_LOCATION );
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOn_DeleteLocation_Button(){
		this.click(DELETE_LOCATION );
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOn_DeleteLocationYes_Button(){
		this.click(DELETE_LOCATION_YES );
	}
	public void clickonSortNameButton(){
		this.click(LOCATION_SORT_BY_NAME);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickonSortNumberButton(){
		this.click(LOCATION_SORT_BY_NUMBER);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickonSortDescriptionButton(){
		this.click(LOCATION_SORT_BY_DESCRIPTION);
		this.waitForPageToLoad(PAGE_LOADING);
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
	public void uncheckNameField() {
		this.uncheck(SETTINGS_NAME_CHECKBOX);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void selectDropDownValue(String testData) {
		this.selectDropdown(SELECT_DROP_DOWN, testData);
		waitForPageToLoad(PAGE_LOADING);
		//this.type(SELECT_DROP_DOWN,Keys.ENTER);
		waitForPageToLoad(PAGE_LOADING);
		reportInfo("Selecting Search Criteria. :testData");
	}
	public String getText(By by ,String testData){
		reportInfo(testData);
		return this.getText(by);
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
		System.out.println(list1);
		//Collections.reverse(list1); 
		reportInfo(testData);
		return list1; 
	}
	public List<String> expectedNameList(By by,String testData){ 
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

	public boolean validateCollapseButton(){
		boolean flag=false;
		WebElement ele=driver.findElement(COLLAPSER_BUTTON_CLASSNAME);
		String classname=ele.getAttribute("class");
		if(classname != null && classname.contains("jarviswidget-collapsed")){
			flag=true;
		}

		return flag;

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

			if(classname != null && classname.contains("active")){
				String successFilePath = elementScreenshot(VALIDATE_NEXT_BUTTON);
				reportSuccessScreenshot(successFilePath,"");
				reportPassedStatus("Verified Next button");
			} else {
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
				reportSuccessScreenshot(successFilePath,"");
				reportPassedStatus("Verified Previous button");
			} else {
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
	public String selectShowEntitiesDropdown() {
		String testData=this.getFirstDropDownLabel(SHOW_ENTITIES_DROPDOWN);
		this.selectDropdown(SHOW_ENTITIES_DROPDOWN, testData);
		reportInfo("Clicking On Show Entities DropDown");
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}
	public void clickOnCollapseButton() {
		this.click(COLLAPSE_BUTTON);
		reportInfo("Clicking On Collapse Button");
		waitForPageToLoad(PAGE_LOADING);
	}
	public void assertUncheckedColumns(String testType) {
		reportInfo("Validating Locations Invisible columns in location table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> memberColumnList = getWebElementList(LOCATION_TABLE_HEADER);
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


	public void assertCheckedColumns(String testType) {
		reportInfo("Validating Locations visible columns in Location table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);
				List<WebElement> memberColumnList = getWebElementList(LOCATION_TABLE_HEADER);
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
	public boolean validatePagination(int expected, String testType) {
		boolean flag=false;
			List<WebElement> rows = getWebElementList(LOCATION_TABLE);
			int count = rows.size();
			if(count<=expected){
				flag=true;
			}
		return flag;	
	}
	public boolean sortingByName() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> locationTableNameColumn = getWebElementList(LOCATION_TABLE_NAME_COLUMN);
		for (WebElement element : locationTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		Collections.sort(list1,new SortIgnoreCase());
		Collections.reverse(list1);
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		boolean sorted=list1.equals(list2);
		return sorted;
	}
	public class SortIgnoreCase implements Comparator<Object> {
		public int compare(Object o1, Object o2) {
			String s1 = (String) o1;
			String s2 = (String) o2;
			return s1.toLowerCase().compareTo(s2.toLowerCase());
		}
	}

	public boolean sortingByNumber() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> segmentTableNameColumn = getWebElementList(LOCATION_TABLE_NUMBER_COLUMN);
		for (WebElement element : segmentTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		Collections.sort(list1,new SortIgnoreCase());
		//System.out.println("after 1st sort:"+list2);
		//Collections.reverse(list1);
		System.out.println("After Reverse"+list1);
		System.out.println("List2 is"+list2);
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
	public boolean sortingByDescription() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> segmentTableNameColumn = getWebElementList(LOCATION_TABLE_DESCRIPTION_COLUMN);
		for (WebElement element : segmentTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		Collections.sort(list2,new SortIgnoreCase());
		//System.out.println("after 1st sort:"+list2);
		Collections.reverse(list2);
		//System.out.println("After Reverse"+list2);
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


	public void assertLocationPopup(String expected, String testType)
	{
		reportInfo("Validating Location Delete Or Not");
		try {
			if (this.getText(DELETE_LOCATION_SUCCESSFUL).equals(expected)) {
				Assert.assertEquals(this.getText(DELETE_LOCATION_SUCCESSFUL), expected);
				reportPassedStatus("Verified Location Delete Or Not");
				String successFilePath = elementScreenshot(DELETE_LOCATION_SUCCESSFUL);
				reportSuccessScreenshot(successFilePath,""); 
			} else{
				String successFilePath = elementScreenshot(DELETE_LOCATION_SUCCESSFUL);
				reportFailureScreenshot(successFilePath);

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

	public void assertLocationName(String expected, String testType)
	{
		reportInfo("Validating Location Name");
		try {
			if (this.getText(VALIDATE_LOCATION).equals(expected)) {
				Assert.assertEquals(this.getText(VALIDATE_LOCATION), expected);
				reportPassedStatus("Verified Location Name");
				String successFilePath = elementScreenshot(VALIDATE_LOCATION);
				reportSuccessScreenshot(successFilePath,""); 
			} else {
				String successFilePath = elementScreenshot(VALIDATE_LOCATION);
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
		int count=0;
		reportInfo("Fetching number of columns in table.");
		List<WebElement> preferenceColumnList = getWebElementList(by);
		for(WebElement l:preferenceColumnList){
			if(l.getAttribute("class").equalsIgnoreCase("ng-scope")){
				count=count+1;
			}
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
}
