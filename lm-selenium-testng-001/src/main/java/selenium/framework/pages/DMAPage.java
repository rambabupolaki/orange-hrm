package selenium.framework.pages;

import java.io.IOException;
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

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import lm.rcx.pojo.ReferenceDataDMApojo;
import selenium.framework.common.PageControls;

public class DMAPage extends PageControls{
	
	/**
	 * Description:This is DMA page constructor. It holds all the element locators in DMA page
	 * 
	 * @param webDriver
	 */
	public DMAPage(WebDriver driver){
		super(driver);
		
	}
	ExtentTest test;
	public final By ADD_DMA = By.xpath("//a[@id='addDMAButton']");
	public final By DMA_NAME_INPUT = By.xpath("//textarea[@name='name']");
	public final By DMA_DESCRIPTION_INPUT = By.xpath("//textarea[@name='desc']");
	public final By DMA_ZIPCODE_INPUT = By.xpath("//textarea[@name='zipCodes']");
	public final By EXTENSIONS_BUTTON = By.xpath("//button[@class='btn btn-primary btn-ext-attri ng-scope']");
	public final By OK_BUTTON = By.xpath("//button[@class='btn btn-primary ok_button']");
	public final By CANCEL_BUTTON = By.xpath("//button[@class='btn btn-default cancel_button2']");
	public final By SEARCH_BAR = By.xpath("//input[@aria-controls='dmaTable']");
	public final By PAGE_LOADING = By.xpath("//div[@class='loading' and style='display: block;']");
	public final By VALIDATE_DMANAME = By.xpath("//table[@id='dmaTable']//tbody//tr//td[3]");
	public final By DMA_EDIT_BUTTON = By.xpath("//td[@id='dmaTable_11_1']/div/div/span[1]/span/a/i");
	public final By DMA_DEL_BUTTON = By.xpath("//a[@tooltip='Delete']");
	public final By DMA_DEL_YES_BUTTON = By.xpath("//*[@class='modal-footer']//button[1]");
	public final By DMA_DELETE_SUCCESSFUL_POP_UP = By.xpath(".//*[@class='toast-message']");
	public final By SHOW_ENTITIES_DROPDOWN = By.name("dmaTable_length");
	public final By DMA_TABLE = By.xpath("//table[@id='dmaTable']/tbody/tr");
	public final By COLLAPSE_BUTTON = By.xpath("//a[@class='button-icon jarviswidget-toggle-btn']");
	public final By COLLAPSER_BUTTON_CLASSNAME=By.xpath("//*[@id='wid-id-dmaWiget']");
	public final By NEXT_BUTTON = By.linkText("Next");
	public final By PREVIOUS_BUTTON = By.linkText("Previous");
	public final By VALIDATE_PREVIOUS_BUTTON = By.xpath("//*[@class='table-responsive ng-scope']//div[5]/ul/li[2]/a");
	public final By VALIDATE_NEXT_BUTTON = By.xpath("//*[@class='table-responsive ng-scope']//div[5]//ul//li[3]/a");
	public final By FIELDSETTINGS_BUTTON = By.xpath("//*[@id='show-table-options']");
	public final By SETTINGS_NAME_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li[1]//input");
	public final By SETTINGS_ALL_COLUMNS_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li//input");
	public final By DMA_TABLE_HEADER = By.xpath("//*[@id='dmaTable']//thead//tr//th");
	public final By INVALID_FORMAt_ERROR = By.xpath("//em[@class='invalid ng-binding ng-scope'] ");
	public final By DMA_TABLE_NAME_SORT_BUTTON= By.id("dmaTable_0_2");
	public final By DMA_TABLE_NAME_COLUMN = By.xpath("//*[@id='dmaTable']//tbody//tr//td[2]");
	public final By VALIDATION_ERROR = By.xpath(".//*[@class='toast-message']");
	public final By VALIDATION_ERROR2 = By.xpath(".//*[@class='toast-message']");
	public  final By SEARCH_BUTTON = By.xpath("//*[@id='advanced-search-button']");
	public  final By REMOVE_BUTTON = By.xpath(".//*[@id='advanced-search-remove-button']");
	public  final By ADVANCED_SEARCH_INPUT =By.xpath("//input[@placeholder='Name']");
	public  final By SUGGESTIONS=By.xpath("//label/ul/li/a");
	public final By Edit_Action=By.xpath("//*[@tooltip='Edit']");
	
	/**
	 * MethodName: navigateToDMAPage() 
	 * Description: This method is used to navigate to DMA page
	 */
	 public void navigateToDMAPage(){
			
		 String tmp = getCurrentUrl();
			String tmp1 = tmp.substring(0, tmp.lastIndexOf("#/"));
			driver.navigate().to(tmp1+"#/dma");
			reportInfo("Redirecting to dma page");
			waitForPageToLoad(PAGE_LOADING);
			
		}
	 
	 	/**
		 * MethodName: addNewDMA()
		 * Description: This method is used to add new DMA
	 	 * @throws IOException 
		 */
	 public void addNewDMA(){
		 this.click(ADD_DMA);
		 reportInfo("clicking on Add DMA Button");
		 this.waitForPageToLoad(PAGE_LOADING);
	 }
	 
	 	/**
		 * MethodName: enterDMAName()
		 * Description: This method is used to enter DMA Name field
	 	 * @throws IOException 
		 */
	 public void enterDMAName(String name){
		 this.clear(DMA_NAME_INPUT);
		 this.type(DMA_NAME_INPUT, name);
		 reportInfo("Entering DMA Name. :"+name);
		 this.waitForPageToLoad(PAGE_LOADING);
	 }
	 
	 /**
		 * MethodName: DMA_description()
		 * Description: This method is used to enter description field
	 * @throws IOException 
		 */
	public void DMA_description(String description){
		this.clear(DMA_DESCRIPTION_INPUT);
		 this.type(DMA_DESCRIPTION_INPUT, description);
		 reportInfo("Entering DMA description :"+description);
	}
	
	 /**
	 * MethodName: DMA_zipcodes()
	 * Description: This method is used to enter type field
	 * @throws IOException 
	 */
	public void DMA_zipcodes(String zipcode){
		this.clear(DMA_ZIPCODE_INPUT);
		 this.type(DMA_ZIPCODE_INPUT, zipcode);
		 reportInfo("Entering DMA Zipcode :"+zipcode);
	}
	
	
	/**
	 * MethodName: Extensions_Button()
	 * Description: This method is used to click Extensions_Button field
	 * @throws IOException 
	 */
	public void Extensions_Button(){
		this.click(EXTENSIONS_BUTTON);
		reportInfo("clicking on extensions button");
	}
	
	/**
	 * MethodName: Ok_Button()
	 * Description: This method is used to click Ok_Button field
	 * @throws IOException 
	 */
	public void Ok_Button(){
		this.click(OK_BUTTON);
		//this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("clicking on OK Button ");
	}
	public void NewOk_Button() {
		this.click(OK_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("clicking on OK Button ");
		
	}
	
	/**
	 * MethodName: Cancel_Button()
	 * Description: This method is used to click Cancel_Button field
	 * @throws IOException 
	 */
	 
	public void Cancel_Button(){
		this.click(CANCEL_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("clicking on Cancel Button ");
	}
	
	/**
	 * MethodName: Search_bar()
	 * Description: This method is used to search any field
	 * @throws IOException 
	 */
	public void Search_bar(String search){
		this.clear(SEARCH_BAR);
		 this.type(SEARCH_BAR, search);
		 this.waitForPageToLoad(PAGE_LOADING);
		 reportInfo("Entering search Input:"+search);
	}
	
	
	/**
	 * MethodName: clickOnDMAEditActionButton()
	 * Description: This method is used to click On SegmentEditActionButton
	 * @throws IOException 
	 */
	public void clickOnDMAEditActionButton(){
	
		this.click(Edit_Action);
		reportInfo("Clicking On DMA Edit Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	
	/**
	 * MethodName: clickOnDeleteActionButton()
	 * Description: This method is used to click On DeleteActionButton
	 * @throws IOException 
	 */
	
	public void clickOnDeleteActionButton()
	{
		this.click(DMA_DEL_BUTTON);
		reportInfo("Clicking On Delete Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	
	/**
	 * MethodName: clickOnDeleteYesButton()
	 * Description: This method is used to click On DeleteYesButton
	 * @throws IOException 
	 */
	public void clickOnDeleteYesButton()
	{
		this.click(DMA_DEL_YES_BUTTON);
		reportInfo("Clicking On Delete yes Button");
		
	}
	public String getText(By by,String testData){
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
	/**
	 * MethodName: assertDMAName()
	 * Description: This method is used to assert statements
	 * @throws IOException 
	 */
	public void assertDMAName(String expected, String testType) throws IOException
	{
		reportInfo("Validating DMA Name");
		try {
			if (this.getText(VALIDATE_DMANAME).equals(expected)) {
				Assert.assertEquals(this.getText(VALIDATE_DMANAME), expected);
				reportPassedStatus("Verified DMA Name");
				String successFilePath = elementScreenshot(VALIDATE_DMANAME);
				reportSuccessScreenshot(successFilePath,"DMA Name"); 
			} else {
				String successFilePath = elementScreenshot(VALIDATE_DMANAME);
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
			reportSuccessScreenshot(successFilePath, message);
			
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
	/**
	 * MethodName: validationErrorPopUp() 
	 * Description: This method is used to assert ValiodationError
	 * @param screenshotName
	 * @throws IOException 
	 */
	public void validationErrorPopUp(String testType) throws IOException {
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
	 * MethodName:createDMA() 
	 * Description: This method is used to create DMA
	 * @throws IOException 
	 */

	public HashMap<String, String> createDMA() throws IOException {
		HashMap<String, String> DMAValues = new HashMap<String, String>();
		ReferenceDataDMApojo dma = new ReferenceDataDMApojo();
		DMAValues.put("DMAName", dma.getDMAName());
		DMAValues.put("Description", dma.getDMADescription());
		addNewDMA();
		enterDMAName(dma.getDMAName());
		DMA_description(dma.getDMADescription());
		Ok_Button();
		this.waitForPageToLoad(PAGE_LOADING);
		return DMAValues;
	}
	/**
	 * MethodName:assertDMADeletionPopUp()
	 * Description:This method is used to validate Delete Program Pop Up
	 * @param expected
	 * @param testType
	 * @throws IOException 
	 */
	public void assertDMADeletionPopUp(String expected, String testType) throws IOException {
		reportInfo("Validating DMA Deletion.");
		try {
			if (this.getText(DMA_DELETE_SUCCESSFUL_POP_UP).equals(expected)) {
				Assert.assertEquals(this.getText(DMA_DELETE_SUCCESSFUL_POP_UP), expected);
				reportPassedStatus("Verified DMA Deletion");
				String successFilePath = elementScreenshot(DMA_DELETE_SUCCESSFUL_POP_UP);
				reportSuccessScreenshot(successFilePath,"");
			} else {
				String successFilePath = elementScreenshot(DMA_DELETE_SUCCESSFUL_POP_UP);
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
	 * @throws IOException 
	 */
	public String selectShowEntitiesDropdown(){
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
				List<WebElement> rows = getWebElementList(DMA_TABLE);
				int count = rows.size();
				if(count<=expected){
					flag=true;
				}
			return flag;	
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
		
		public void assertBoolean(Boolean expected, Boolean actual, By by, String message) {
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
		
	/**
	 * MethodName: clickOnCollapseButton() 
	 * Description: This method is used to click on collapse button.
	 * @throws IOException 
	 */
	public void clickOnCollapseButton(){
		this.click(COLLAPSE_BUTTON);
		reportInfo("Clicking On Collapse Button");
		waitForPageToLoad(PAGE_LOADING);
	}
	
	/**
	 * MethodName: validateCollapseButton() 
	 * Description: This method is used to validate on collapse button.
	 * @throws IOException 
	 */
	public void validateCollapseButton(String testType){
		reportInfo("Validating Collapse");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				WebElement ele=driver.findElement(COLLAPSER_BUTTON_CLASSNAME);
				String classname=ele.getAttribute("class");
				if(classname != null && classname.contains("jarviswidget-collapsed")){
					String successFilePath = elementScreenshot(COLLAPSER_BUTTON_CLASSNAME);
					reportSuccessScreenshot(successFilePath,"");
					reportPassedStatus("Verified collapse button");
				} else {
					String successFilePath = elementScreenshot(COLLAPSER_BUTTON_CLASSNAME);
					reportFailureScreenshot(successFilePath);

				}
			}
		}catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Collapse Assertion Failed");
		}
	}
	/**
	 * clickOnNextButton() 
	 * Description: This method is used to click on Next Button
	 * @throws IOException 
	 */
	public void clickOnNextButton(){
		if(driver.findElement(NEXT_BUTTON).isEnabled()){
		this.click(NEXT_BUTTON);
		waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On Next Button to navigate to Next Page");
		}
		else{
			reportInfo("Next Button Is Disabled");
		}
	}
	
	/**
	 * clickOnPreviousButton() 
	 * Description: This method is used to click on Previous Button
	 * @throws IOException 
	 */
	public void clickOnPreviousButton(){
		if(driver.findElement(PREVIOUS_BUTTON).isEnabled()){
		this.click(PREVIOUS_BUTTON);
		reportInfo("Clicking On Previous Button to navigate to Previous Page");
		waitForPageToLoad(PAGE_LOADING);
		}
		else{
			reportInfo("Previous Button Is Disabled");
		}
	}
	/**
	 * validatePreviousButton() 
	 * Description: This method is used to validate Previous Button
	 * @throws IOException 
	 */
	public void validatePreviousButton(String testType) throws IOException{
		reportInfo("Validating Previous Button");
		WebElement ele=driver.findElement(VALIDATE_PREVIOUS_BUTTON);
		String classname=ele.getAttribute("class");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				if(classname != null && classname.contains("active")){
					String successFilePath = elementScreenshot(VALIDATE_PREVIOUS_BUTTON);
					reportSuccessScreenshot(successFilePath,"");
					reportPassedStatus("Verified Previous button");
				} else {
					String successFilePath = elementScreenshot(VALIDATE_PREVIOUS_BUTTON);
					reportFailureScreenshot(successFilePath);
				}
				}
		}catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Previous Button Assertion Failed");
		}
	}
	/**
	 * validateNextButton() 
	 * Description: This method is used to validate Next Button
	 * @throws IOException 
	 */
	public void validateNextButton(String testType) throws IOException{
		reportInfo("Validating Next Button");
		WebElement ele=driver.findElement(VALIDATE_NEXT_BUTTON);
		String classname=ele.getAttribute("class");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				if(classname != null && classname.contains("active")){
					String successFilePath = elementScreenshot(VALIDATE_NEXT_BUTTON);
					reportSuccessScreenshot(successFilePath,"");
					reportPassedStatus("Verified Next button");
				} else {
					String successFilePath = elementScreenshot(VALIDATE_NEXT_BUTTON);
					reportFailureScreenshot(successFilePath);
				}
				}
		}catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Next Button Assertion Failed");
		}
	}
	/**
	 * MethodName: clickOnFieldSettingsButton() 
	 * Description: This method is used to click on field settings button.
	 * @throws IOException 
	 */
	public void clickOnFieldSettingsButton(){
		this.click(FIELDSETTINGS_BUTTON);
		reportInfo("Clicking On Field Settings Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	/**
	 * MethodName: checkNameField() 
	 * Description: This method is used to check the name field in field settings
	 * @throws IOException 
	 */
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

	
	public int DMATableColumns(By by){
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
	/**
	 *MethodName: assertCheckedColumns() 
	 *Description: This method is used to validate visible columns in member table
	 * @throws IOException 
	 */
	public void assertCheckedColumns(String testType){
		reportInfo("Validating Member visible columns in member table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);
				
				System.out.println(checkBoxList.size());
			for(WebElement e:checkBoxList )
			{
				System.out.println(e.getText());
			}
				List<WebElement> DMAColumnList = getWebElementList(DMA_TABLE_HEADER);
				
				for(WebElement e1:DMAColumnList )
				{
					System.out.println(e1.getText());
				}
				System.out.println(DMAColumnList.size());
				Assert.assertEquals(checkBoxList.size(), (DMAColumnList.size() - 1));
				String successFilePath = elementScreenshot(SETTINGS_ALL_COLUMNS_CHECKBOX);
				reportSuccessScreenshot(successFilePath,"");
				for (WebElement w : DMAColumnList) {
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
	 * MethodName: uncheckNameField() 
	 * Description: This method is used to un check the name field in field settings
	 * @throws IOException 
	 */
	public void uncheckNameField(){
		System.out.println(this.getText(SETTINGS_NAME_CHECKBOX));
		this.uncheck(SETTINGS_NAME_CHECKBOX);
		String successFilePath = elementScreenshot(SETTINGS_NAME_CHECKBOX);
		reportSuccessScreenshot(successFilePath,"");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	/**
	 *MethodName: assertUncheckedColumns() 
	 *Description: This method is used to validate Invisible columns in member table
	 * @throws IOException 
	 */
	public void assertUncheckedColumns(String testType) {
		reportInfo("Validating DMA Invisible columns in member table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> memberColumnList = getWebElementList(DMA_TABLE_HEADER);
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
	/**
	 * MethodName: nullValueInmandatoryFieldError() 
	 * Description: This method is used to assert NullValueInMandatoryField
	 * @param screenshotName
	 * @throws IOException 
	 */
	public void nullValueInmandatoryError(String testType){
		reportInfo("Validating Null Value in Mandatory fields");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(INVALID_FORMAt_ERROR);
				reportSuccessScreenshot(successFilePath,"");
			} else {
				String successFilePath = elementScreenshot(INVALID_FORMAt_ERROR);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Test Case Failed");
		}
	}
	/**
	 * MethodName:clickOnDMAPageNameSortButton() 
	 * Description: This method is used to click on Name Sort Button
	 * @throws IOException 
	 */
	public void clickOnDMApageNameSortButton() {
		this.click(DMA_TABLE_NAME_SORT_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On Name Sort Button");
	}
	/**
	 * MethodName:sortingByName()
	 * Description:This method checks member table is sorted by name or not
	 * @return boolean
	 */
	public boolean sortingByName() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> DMATableNameColumn = getWebElementList(DMA_TABLE_NAME_COLUMN);
		for (WebElement element : DMATableNameColumn) {
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
	 * @throws IOException 
		 */
		public void nullValueInmandatoryFieldError(String testType) {
			reportInfo("Validating Null Value in Mandatory fields");
			try {
				if (testType.equalsIgnoreCase("valid")) {
					String successFilePath = elementScreenshot(INVALID_FORMAt_ERROR);
					reportSuccessScreenshot(successFilePath,"");
				} else {
					String successFilePath = elementScreenshot(INVALID_FORMAt_ERROR);
					reportFailureScreenshot(successFilePath);

				}
			} catch (Exception e) {
				String failureFilePath = driverScreenshot();
				reportFailureScreenshot(failureFilePath);
				reportFailedStatus();
				new Exception("Test Case Failed");
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
		public void searchButton(){
			this.click(SEARCH_BUTTON);
			reportInfo("Clicking On Search Button");
			this.waitForPageToLoad(PAGE_LOADING);

		}
		public void clickOnRemoveButton(){
			this.click(REMOVE_BUTTON);
			reportInfo("Clicking on Search Button.");
			this.waitForPageToLoad(PAGE_LOADING);
			
		}
		public void enterAdvancedSearch(String testData) {
			this.type(ADVANCED_SEARCH_INPUT , testData);
			this.waitForPageToLoad(PAGE_LOADING);
			//this.click(SUGGESTIONS);
			//this.waitForPageToLoad(PAGE_LOADING);
			reportInfo("Entering  DMA Type :"+testData);
		}
		public void clickOn_Ok_Button(){
			this.click(OK_BUTTON);
			reportInfo("Clicking On OK Button");
			//test.log(Status.INFO,"DMA Added Successfully.");
			this.waitForPageToLoad(PAGE_LOADING);

		}
}
