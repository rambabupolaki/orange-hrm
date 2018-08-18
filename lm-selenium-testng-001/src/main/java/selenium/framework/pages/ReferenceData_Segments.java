package selenium.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import lm.rcx.pojo.MemberPojo;
import lm.rcx.pojo.ProgramsPojo;
import lm.rcx.pojo.ReferenceData_Segments_Pojo;
import lm.rcx.validations.Success_Validations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import selenium.framework.common.PageControls;

public class ReferenceData_Segments extends PageControls{

	/**
	 * Description:This is segments page constructor. It holds all the element locators in segments page
	 * 
	 * @param webDriver
	 */
	public  ReferenceData_Segments(WebDriver driver){
		super(driver);

	}

	public  final By ADD_SEGMENTS = By.xpath("//a[@id='addSegmentButton']");
	public  final By NAME_INPUT = By.xpath("//textarea[@name='name']");
	public  final By TYPE_INPUT = By.xpath("//textarea[@name='type']");
	public  final By DESCRIPTION_INPUT = By.cssSelector("textarea[name='description']");
	public  final By EFFECTIVE_DT_INPUT = By.xpath("//*[@id='addSegmentDialog']/div[2]/div/fieldset/div[5]/dynamic-modal-row/div[1]/section/dynamic-modal-element/div/label[2]/label/input");
	public  final By EXPIRY_DT_INPUT = By.xpath("//*[@id='addSegmentDialog']/div[2]/div/fieldset/div[5]/dynamic-modal-row/div[2]/section/dynamic-modal-element/div/label[2]/label/input");
	public  final By EXTENSIONS_BUTTON = By.xpath("//button[@class='btn btn-primary btn-ext-attri ng-scope']");
	public  final By OK_BUTTON = By.xpath("//button[@class='btn btn-primary ok_button']");
	public  final By CANCEL_BUTTON = By.xpath("//button[@class='btn btn-default cancel_button2']");
	public  final By SEARCH_BAR = By.xpath("//input[@aria-controls='segmentTable']");
	public  final By PAGE_LOADING = By.xpath("//div[@class='loading' and style='display: block;']");
	public  final By VALIDATE_SEGNAME = By.xpath("//table[@id='segmentTable']//tbody//tr//td[3]");
	public  final By SEGMENT_EDIT_BUTTON = By.xpath("//td[@id='segmentTable']/div/div/span[1]/span/a/i");
	public  final By SEGEMENT_DEL_BUTTON = By.xpath("//table[@id='segmentTable']//tbody//tr//td[1]//div//div//span[2]//a");
	public  final By SEGMENT_DEL_YES_BUTTON = By.xpath("//*[@class='modal-footer']//button[1]");
	public  final By SEGMENTS_DELETE_SUCCESSFUL_POP_UP = By.xpath(".//*[@class='toast-message']");
	public  final By SHOW_ENTITIES_DROPDOWN = By.name("segmentTable_length");
	public  final By SEGMENT_TABLE = By.xpath("//table[@id='segmentTable']/tbody/tr");
	public  final By COLLAPSE_BUTTON = By.xpath("//a[@class='button-icon jarviswidget-toggle-btn']");
	public  final By COLLAPSER_BUTTON_CLASSNAME=By.xpath("//*[@id='wid-id-segmentsWiget']");
	public  final By NEXT_BUTTON = By.linkText("Next");
	public  final By PREVIOUS_BUTTON = By.linkText("Previous");
	public  final By VALIDATE_PREVIOUS_BUTTON = By.xpath("//*[@class='paginate_button previous']");
	public  final By VALIDATE_NEXT_BUTTON = By.xpath("//*[@class='paginate_button next']");
	public  final By FIELDSETTINGS_BUTTON = By.xpath("//*[@id='show-table-options']");
	public  final By SETTINGS_NAME_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li[1]//label//input[@type='checkbox']");
	public  final By SETTINGS_ALL_COLUMNS_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li//input");
	public  final By SEGMENT_TABLE_HEADER = By.xpath("//*[@id='segmentTable']//thead//tr//th");
	public  final By INVALID_FORMAt_ERROR = By.xpath("//em[@class='invalid ng-binding ng-scope'] ");
	public  final By SEGMENTS_TABLE_NAME_SORT_BUTTON=  By.id("segmentTable_0_2");
	public  final By SEGMENT_TABLE_NAME_COLUMN = By.xpath("//*[@id='segmentTable']//tbody//tr//td[2]");
	public  final By VALIDATION_ERROR = By.xpath(".//*[@id='addSegmentDialog']/div[2]/div[1]");
	public  final By NEXT_BUTTON_CLASS_NAME = By.xpath("//li[@id='Table_next']");
	public  final By PREVIOUS_BUTTON_CLASS_NAME = By.xpath("//li[@id='Table_previous']");
	public final By VALIDATE_SEGMENTNAME = By.xpath("//table[@id='segmentTable']//tbody//tr//td[3]");
	public final By DUPLICATE_ERROR=By.xpath(".//*[@class='toast-message']");
	public final By SETTINGS_ALL_COLUMNS_VISIBLE=By.xpath("//ul[@class='ColVis_collection']//li");
	public final By SETTINGS_ALL_COLUMNS=By.xpath("//ul[@class='ColVis_collection']//li//input");
	public  final By VALIDATE_SEGMENT_LENGTH = By.xpath("//em[@class='invalid ng-binding ng-scope']");
	public  final By SEARCH_BUTTON = By.xpath("//*[@id='advanced-search-button']");
	public  final By ADVANCED_SEARCH_TYPE =By.xpath("//*[@placeholder='Name']");
	public  final By SUGGESTIONS=By.xpath("//label/ul/li/a");
	public final By Edit_Action=By.xpath("//*[@tooltip='Edit']");
	public final By Delete_Action=By.xpath("//*[@tooltip='Delete']");

	/**
	 * MethodName:  navigateToSegmentsPage() 
	 * Description: This method is used to navigate to segments page
	 */
	public void navigateToSegmentsPage(){

		String tmp = getCurrentUrl();
		String tmp1 = tmp.substring(0, tmp.lastIndexOf("#/"));
		driver.navigate().to(tmp1+"#/segments");
		reportInfo("Redirecting to segments page.");
		waitForPageToLoad(PAGE_LOADING);

	}

	/**
	 * MethodName: addNewSegment()
	 * Description: This method is used to add new segment
	 */
	public void addNewSegment(){
		this.click(ADD_SEGMENTS);
		reportInfo("Clicking on Add Segment Button.");
	}

	/**
	 * MethodName:  enterName()
	 * Description: This method is used to enter Name field
	 */
	public void enterName(String name){
		this.clear(NAME_INPUT);
		this.type(NAME_INPUT, name);
		reportInfo("Entering Segment Name :"+name);
	}

	/**
	 * MethodName:  description()
	 * Description: This method is used to enter description field
	 */
	public void description(String description){
		this.clear(DESCRIPTION_INPUT);
		this.type(DESCRIPTION_INPUT, description);
		reportInfo("Entering Segment Description :"+description);
	}

	/**
	 * MethodName:  type()
	 * Description: This method is used to enter type field
	 */
	public void type(String type){
		this.clear(TYPE_INPUT);
		this.type(TYPE_INPUT, type);
		reportInfo("Entering Segment type :"+type);
	}

	/**
	 * MethodName:  Effective_Dt_Input()
	 * Description: This method is used to enter Effective_Dt_Input field
	 */
	public void Effective_Dt_Input(String effective_dt){
		this.clear(EFFECTIVE_DT_INPUT);
		this.type(EFFECTIVE_DT_INPUT, effective_dt);
		reportInfo("Entering  Effectivedate :"+effective_dt);
	}

	/**
	 * MethodName:  Expiry_Dt()
	 * Description: This method is used to enter Expiry_Dt field
	 */

	public void Expiry_Dt(String expiry_dt){
		this.clear(EXPIRY_DT_INPUT);
		this.type(EXPIRY_DT_INPUT, expiry_dt);
		reportInfo("Entering  Expirydate :"+expiry_dt);
	}

	public String getText(By by,String testData){
		reportInfo(testData);
		return this.getText(by);
	}
	/**
	 * MethodName:  Extensions_Button()
	 * Description: This method is used to click Extensions_Button field
	 */
	public void Extensions_Button(){
		this.click(EXTENSIONS_BUTTON);
		reportInfo("Clicking on Extensions Button.");
	}

	/**
	 * MethodName:  Ok_Button()
	 * Description: This method is used to click Ok_Button field
	 */
	public void Ok_Button(){
		this.click(OK_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on Ok Button. ");
	}
	public void NewOk_Button(){
		this.click(OK_BUTTON);
		//this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on Ok Button. ");
	}

	/**
	 * MethodName:  Cancel_Button()
	 * Description: This method is used to click Cancel_Button field
	 */

	public void Cancel_Button(){
		this.click(CANCEL_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On Cancel Button ");
	}

	/**
	 * MethodName:  Search_bar()
	 * Description: This method is used to search any field
	 */
	public void Search_bar(String search){
		this.clear(SEARCH_BAR);
		this.type(SEARCH_BAR, search);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering  Search Input:"+search);
	}

	/**
	 * MethodName:  clickOnSegmentEditActionButton()
	 * Description: This method is used to click On SegmentEditActionButton
	 */
	public void clickOnSegmentEditActionButton(){

		this.click(Edit_Action);
		reportInfo("Clicking On Edit Segment Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	/**
	 * MethodName:  clickOnDeleteActionButton()
	 * Description: This method is used to click On DeleteActionButton
	 */

	public void clickOnDeleteActionButton()
	{
		this.click(Delete_Action);
		reportInfo("Clicking On Delete Segment Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	/**
	 * MethodName:  clickOnDeleteYesButton()
	 * Description: This method is used to click On DeleteYesButton
	 */
	public void clickOnDeleteYesButton()
	{
		this.click(SEGMENT_DEL_YES_BUTTON);
		reportInfo("Clicking On Delete yes Button.");

	}

	/**
	 * MethodName:  assertSegmentName()
	 * Description: This method is used to assert statements
	 */
	public void assertSegmentName(String expected, String testType)
	{
		reportInfo("Validating Segment Name.");
		try {
			if (this.getText(VALIDATE_SEGNAME).equals(expected)) {
				Assert.assertEquals(this.getText(VALIDATE_SEGNAME), expected);
				reportPassedStatus("Verified Segment Name");
				String successFilePath = elementScreenshot(VALIDATE_SEGNAME);
				reportSuccessScreenshot(successFilePath,""); 
			} else {
				String successFilePath = elementScreenshot(VALIDATE_SEGNAME);
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


	/**
	 * MethodName:createSegment() 
	 * Description: This method is used to create Segment
	 */

	public HashMap<String, String> createSegment() {
		HashMap<String, String> segmentValues = new HashMap<String, String>();
		ReferenceData_Segments_Pojo seg = new ReferenceData_Segments_Pojo();
		segmentValues.put("SegmentName", seg.getSegmentName());
		segmentValues.put("Description", seg.getDescription());
		addNewSegment();
		enterName(seg.getSegmentName());
		description(seg.getDescription());
		Ok_Button();
		return segmentValues;
	}
	/**
	 * MethodName:assertSegmentDeletionPopUp()
	 * Description:This method is used to validate Delete Program Pop Up
	 * @param expected
	 * @param testType
	 */
	public void assertSegmentDeletionPopUp(String expected, String testType) {
		reportInfo("Validating Segment Deletion.");
		try {
			if (this.getText(SEGMENTS_DELETE_SUCCESSFUL_POP_UP).equals(expected)) {
				Assert.assertEquals(this.getText(SEGMENTS_DELETE_SUCCESSFUL_POP_UP), expected);
				reportPassedStatus("Verified Segment Deletion");
				String successFilePath = elementScreenshot(SEGMENTS_DELETE_SUCCESSFUL_POP_UP);
				reportSuccessScreenshot(successFilePath,"");
			} else {
				String successFilePath = elementScreenshot(SEGMENTS_DELETE_SUCCESSFUL_POP_UP);
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
	 * MethodName: validatePagination() 
	 * Description: This method is used to Validate Pagination
	 */
	public boolean validatePagination(int expected) {
		boolean flag=false;
			List<WebElement> rows = getWebElementList(SEGMENT_TABLE);
			int count = rows.size();
			if(count<=expected){
				flag=true;
			}
		return flag;	
	}
	
	
	/**
	 * MethodName: clickOnCollapseButton() 
	 * Description: This method is used to click on collapse button.
	 */
	public void clickOnCollapseButton() {
		this.click(COLLAPSE_BUTTON);
		reportInfo("Clicking On Collapse Button.");
		waitForPageToLoad(PAGE_LOADING);
	}

	/**
	 * MethodName: validateCollapseButton() 
	 * Description: This method is used to validate on collapse button.
	 */
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

	/**
	 * clickOnPreviousButton() 
	 * Description: This method is used to click on Previous Button
	 */
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
	/**
	 * validatePreviousButton() 
	 * Description: This method is used to validate Previous Button
	 */
	public void validatePreviousButton(String testType){
		reportInfo("Validating Previous Button");
		WebElement ele=driver.findElement(VALIDATE_PREVIOUS_BUTTON);
		String classname=ele.getAttribute("class");
		try {
			if(classname != null && classname.contains("active")){
				String successFilePath = elementScreenshot(VALIDATE_PREVIOUS_BUTTON);
				reportSuccessScreenshot(successFilePath,"");
				reportPassedStatus("Verified Previous Button.");
			} else {
				String successFilePath = elementScreenshot(VALIDATE_PREVIOUS_BUTTON);
				reportFailureScreenshot(successFilePath);
			}
		}catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Previous Button Assertion Failed.");
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
	/**
	 * validateNextButton() 
	 * Description: This method is used to validate Next Button
	 */
	public void validateNextButton(String testType){
		reportInfo("Validating Next Button");
		WebElement ele=driver.findElement(VALIDATE_NEXT_BUTTON);
		String classname=ele.getAttribute("class");
		try {
				if(classname != null && classname.contains("active")){
					String successFilePath = elementScreenshot(VALIDATE_NEXT_BUTTON);
					reportSuccessScreenshot(successFilePath,"");
					reportPassedStatus("Verified Next Button.");
				} else {
					String successFilePath = elementScreenshot(VALIDATE_NEXT_BUTTON);
					reportFailureScreenshot(successFilePath);
				}
				
		}catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Next Button Assertion Failed.");
		}
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
		reportInfo("Check Field Settings Name Checkbox.");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	/**
	 *MethodName: assertCheckedColumns() 
	 *Description: This method is used to validate visible columns in member table
	 */
	/*public void assertCheckedColumns(String testType) {
		reportInfo("Validating Member visible columns in member table");
		try {
				List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);

				System.out.println(checkBoxList.size());
				for(WebElement e:checkBoxList )
				{
					System.out.println(e.getText());
				}
				List<WebElement> segmentColumnList = getWebElementList(SEGMENT_TABLE_HEADER);

				for(WebElement e1:segmentColumnList )
				{
					System.out.println(e1.getText());
				}
				System.out.println(segmentColumnList.size());
				if(checkBoxList.size()== (segmentColumnList.size() - 1)){
				Assert.assertEquals(checkBoxList.size(), (segmentColumnList.size() - 1));
				String successFilePath = elementScreenshot(SETTINGS_ALL_COLUMNS_CHECKBOX);
				reportSuccessScreenshot(successFilePath,"");
				for (WebElement w : segmentColumnList) {
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
	}*/
	/**
	 * MethodName: uncheckNameField() 
	 * Description: This method is used to un check the name field in field settings
	 */
	public void uncheckNameField() {
		System.out.println(this.getText(SETTINGS_NAME_CHECKBOX));
		this.uncheck(SETTINGS_NAME_CHECKBOX);
		reportInfo("Uncheck Name Field in Fieldsettings.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	/**
	 *MethodName: assertUncheckedColumns() 
	 *Description: This method is used to validate Invisible columns in member table
	 */
	public void assertUncheckedColumns(String testType) {
		reportInfo("Validating Segment Invisible columns in member table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> memberColumnList = getWebElementList(SEGMENT_TABLE_HEADER);
				int count = 0;
				for (WebElement w : memberColumnList) {
					if (w.getText() == "Name") {
						count = count + 1;
					}
					if(count==0){
					Assert.assertEquals(count, 0);
				}
				}
			} else{

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
	public void nullValueInmandatoryError(String testType) {
		reportInfo("Validating Null Value in Mandatory field.");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(INVALID_FORMAt_ERROR);
				reportSuccessScreenshot(successFilePath,"");
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
	 * MethodName:clickOnNameSortButton() 
	 * Description: This method is used to click on Name Sort Button
	 */
	public void clickOnSegmentsspageNameSortButton() {
		this.click(SEGMENTS_TABLE_NAME_SORT_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On Name Sort Button.");
	}
	/**
	 * MethodName:sortingByName()
	 * Description:This method checks member table is sorted by name or not
	 * @return boolean
	 */
	public boolean sortingByName() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> segmentTableNameColumn = getWebElementList(SEGMENT_TABLE_NAME_COLUMN);
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
	/**
	 * MethodName: nullValueInmandatoryFieldError() 
	 * Description: This method is used to assert NullValueInMandatoryField
	 * @param screenshotName
	 */
	public void nullValueInmandatoryFieldError(String testType) {
		reportInfo("Validating Null Value in Mandatory field.");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(INVALID_FORMAt_ERROR);
				reportSuccessScreenshot(successFilePath,"");
			} else if (testType.equalsIgnoreCase("invalid")) {

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Test Case Failed");
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

        public int segmentTableColumns(By by){
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
	public List<String> expectedList(By by,String testData){ 
		List<String> list1 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(SEGMENT_TABLE_NAME_COLUMN); 
		for (WebElement element : memberTableNameColumn) { 
			list1.add(element.getText()); 
		} 
		Collections.sort(list1,new SortIgnoreCase()); 
		System.out.println(list1);
		Collections.reverse(list1); 
		reportInfo(testData);
		return list1; 
	}
	public List<String> actualList(By by,String testData){ 
		List<String> list1 = new ArrayList<String>(); 
		List<WebElement> memberTableNameColumn = getWebElementList(SEGMENT_TABLE_NAME_COLUMN); 
		for (WebElement element : memberTableNameColumn) { 
			list1.add(element.getText()); 
		} 
		reportInfo(testData);
		return list1; 
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
		reportInfo("Entering  Segment Type :"+testData);
	}
	public void clickOn_Ok_Button(){
		this.click(OK_BUTTON);
		reportInfo("Clicking On OK Button");
		this.waitForPageToLoad(PAGE_LOADING);

	}
}
