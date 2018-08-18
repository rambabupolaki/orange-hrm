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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import selenium.framework.common.PageControls;
import selenium.framework.pages.MemberBadgesPage.SortIgnoreCase;
public class MemberActivityPage extends PageControls{
	public  final By PAGE_LOADING = By.xpath("//div[@class='loading'][@style='display: block;']");
	public  final By ACTIVITY_BUTTON=By.linkText("Activity");
	public  final By PROCESSACTIVITY_BUTTON=By.xpath("//*[@id='proccesActivityButton']");
	public  final By LINEITEMSADD_BUTTON=By.xpath("//*[@id='addLineItemButton']");
	public  final By PRODUCTNAME_INPUT=By.xpath("//*[@placeholder='Product name']");
	public  final By SUGGESTION_INPUT=By.xpath("//label[2]/ul/li/a");
	public  final By COUPONCODE_INPUT=By.xpath("//*[@ng-model='line.couponCode']");
	public  final By PRICE_INPUT=By.xpath("//*[@ng-model='line.itemPrice']");
	public  final By TENDERITEMSADD_BUTTON=By.xpath("//*[@id='addTenderItemButton']");
	public  final By TYPE_INPUT=By.xpath("//*[@ng-model='tender.type']");
	public  final By NUMBER_INPUT=By.xpath("//*[@ng-model='tender.itemNo']");
	public  final By VALUE_INPUT=By.xpath("//*[@ng-model='tender.value']");
	public  final By PROCESSACTIVITYOK_BUTTON=By.xpath("//*[@class='btn btn-primary ok_button']");
	public  final By LOG=By.xpath("//*[@class='modal-body']");
	public  final By ACTIVITY_SORT_BY_DATE_BUTTON=By.xpath("//*[@id='activityhistoryTable_0_6']");
	public  final By ACTIVITY_TABLE_NAME_COLUMN_BUTTON=By.xpath("//*[@id='activityhistoryTable']//tbody//tr//td[6]");
	public  final By SHOW_ENTITIES_DROPDOWN=By.name("activityhistoryTable_length");
	public  final By ACCRUALS_SHOW_ENTITIES_DROPDOWN=By.name("accrualTable_length");
	public  final By REDEMPTIONS_SHOW_ENTITIES_DROPDOWN=By.name("redemptionItemTable_length");
	public  final By ACTIVITY_TABEL=By.xpath("//table[@id='activityhistoryTable']/tbody/tr");
	public  final By ACCRUALS_TABEL=By.xpath("//table[@id='accrualTable']/tbody/tr ");
	public  final By REDEMPTIONS_TABEL=By.xpath("//table[@id='redemptionItemTable']/tbody/tr ");
	public  final By FIELDSETTINGS_BUTTON=By.xpath("//*[@id='show-table-options']");
	public  final By ACCURAL_FIELDSETTINGS_BUTTON=By.xpath("//div[@id='accrualTable_wrapper']/div/button");
	public  final By REDEMPTIONS_FIELDSETTINGS_BUTTON=By.xpath("//div[@id='redemptionItemTable_wrapper']/div/button");
	public  final By SETTINGS_TYPE_CHECKBOX=By.xpath("//ul[@class='ColVis_collection']/li[1]/label/input[1]");
	public  final By SETTINGS_ACCRUEDPOINTS_CHECKBOX=By.xpath("//ul[@class='ColVis_collection']/li[1]/label/input[1]");
	public  final By SETTINGS_ALL_COLUMNS_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li//input");
	public  final By ACTIVITY_TABLE=By.xpath("//table[@id='activityhistoryTable']");
	public  final By ACCRUALS_TABLE_HEADER=By.xpath("//*[@id='accrualTable']//thead//tr//th");
	public  final By REDEMPTIONS_TABLE_HEADER=By.xpath("//*[@id='redemptionItemTable']//thead//tr//th");
	public  final By COLLAPSE_BUTTON = By.xpath("//div[2]/div/header/div/a/i");
	public  final By COLLAPSER_BUTTON_CLASSNAME=By.xpath("//div[@id='wid-id-achievementsWidget']");
	public final By ACTIVITY_CLASSNAME=By.xpath("//li[@id='red_s8']");
	public final By ACTIVITY_CLOSE=By.xpath("//*[@class='btn btn-default cancel_button2']");
	public final By DATE_COLUMN=By.xpath("//table[@id='activityhistoryTable']//tbody//tr[1]//td[6]");
	public final By ACTIVITY_NAME_COLUMN=By.xpath("//table[@id='activityhistoryTable']//tbody//tr//td[2]");
	public  final By SETTINGS_CODE_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']/li[1]/label/input[1]");
	public  final By ACTIVITY_TABLE_HEADER = By.xpath("//*[@id='activityhistoryTable']//thead//tr//th");
	public  final By ACCRUALS_SETTINGS_ALL_COLUMNS_CHECKBOX=By.xpath("//ul[@class='ColVis_collection']//li//input");
	public final By SETTINGS_ALL_COLUMNS_VISIBLE=By.xpath("//ul[@class='ColVis_collection']//li");
	public final By SETTINGS_ALL_COLUMNS=By.xpath("//ul[@class='ColVis_collection']//li");
	private static final By QUANTITY_INPUT=By.xpath("//*[@ng-model='line.quantity']");
	private static final By EXTERNAL_TRANSACTION_ID=By.xpath("(//input[@type='text'])[6]");
	public MemberActivityPage(WebDriver driver) {
		super(driver);	
	}

	public void clickOnProcessActivityButton(){
		this.click(PROCESSACTIVITY_BUTTON);
		reportInfo("Clicking On Process Activity Button.");
		this.waitForPageToLoad(PAGE_LOADING);
		this.pause(1000);
	}
	public void clickOnLineItemsAddButton(){
		this.click(LINEITEMSADD_BUTTON);
		reportInfo("Clicking On Line Item Add Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void enterProductname(String testData){
		//this.moveToElement(PRODUCTNAME_INPUT);
		this.clear(PRODUCTNAME_INPUT);
		//this.click(PRODUCTNAME_INPUT);
		this.type(PRODUCTNAME_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		this.click(SUGGESTION_INPUT);
		reportInfo("Entering Product Name:"+testData);
	}


	public void enterCouponCode(String testData){
		this.clear(COUPONCODE_INPUT);
		this.type(COUPONCODE_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering Coupan Code"+testData);
	}
	public void enterExternalTransactionId(String testData){
		this.clear(EXTERNAL_TRANSACTION_ID);
		this.type(EXTERNAL_TRANSACTION_ID, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering Eternal Transaction Id:"+testData);
	}
	public void enterQuantity(String testData){
		this.clear(QUANTITY_INPUT);
		this.type(QUANTITY_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering Quantity:"+testData);
	}
	public void enterPrice(String testData){
		this.clear(PRICE_INPUT);
		this.type(PRICE_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering Price"+testData);
	}
	public void clickOnTenderItemsAddButton(){
		this.click(TENDERITEMSADD_BUTTON);
		reportInfo("Clicking On Tender Item Add Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void selectTypeinput(){
		String testData=this.getFirstDropDownValue(TYPE_INPUT);
		this.selectDropdown(TYPE_INPUT, testData);
		reportInfo("Selecting Type Input:"+testData);
		this.waitForPageToLoad(PAGE_LOADING);

	}
	public void enterNumberinput(String testData){
		this.clear(NUMBER_INPUT);
		this.type(NUMBER_INPUT, testData);
		reportInfo("Entering Number Input"+testData);
		this.waitForPageToLoad(PAGE_LOADING);

	}
	public void enterValueinput(String testData){
		this.clear(VALUE_INPUT);
		this.type(VALUE_INPUT, testData);
		reportInfo("Entering Value Input"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnProcessActivityOkButton(){
		this.click(PROCESSACTIVITYOK_BUTTON);
		reportInfo("Clicking on Process Activity OK Button" );
		this.waitForPageToLoad(PAGE_LOADING);


	}
	public void clickOnCloseActivityButton(){
		this.click(ACTIVITY_CLOSE);
		reportInfo("Clicking on Close Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnFieldSettingsButton() {
		this.click(FIELDSETTINGS_BUTTON);
		reportInfo("Clicking On Field Settings Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnAccuralFieldSettingsButton() {
		this.click(ACCURAL_FIELDSETTINGS_BUTTON);
		reportInfo("Clicking On Field Settings Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnRedemptionsFieldSettingsButton() {
		this.click(REDEMPTIONS_FIELDSETTINGS_BUTTON);
		reportInfo("Clicking On Field Settings Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void checkRedemptionscheckField(){
		this.check(SETTINGS_TYPE_CHECKBOX);
		reportInfo("Clicking Field Settings Rule Checkbox");
		this.waitForPageToLoad(PAGE_LOADING);

	}
	public void checkTypeField() {

		this.check(SETTINGS_TYPE_CHECKBOX);
		reportInfo("Clicking Field Settings Name Checkbox");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void checkAccruedPointsField() {

		this.check(SETTINGS_ACCRUEDPOINTS_CHECKBOX);
		reportInfo("Clicking Field Settings Accured Points Checkbox");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public String getText(By by,String testData){
		reportInfo(testData);
		return this.getText(by);
	}
	public int activityTableColumns(){ 
		reportInfo("Fetching number of columns in table."); 
		List<WebElement> tierColumnList = getWebElementList(ACTIVITY_TABLE); 
		System.out.println(tierColumnList.size());
		return tierColumnList.size(); 
	}
	public String getClassname(By by,String testData){ 
		reportInfo(testData); 
		WebElement ele=driver.findElement(by); 
		String classname=ele.getAttribute("class"); 
		return classname; 

	}
	public void assertCheckedColumns(String testType) {
		reportInfo("Validating visible columns in Activity table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);
				List<WebElement> memberColumnList = getWebElementList(ACTIVITY_TABLE);
				Assert.assertEquals(checkBoxList.size(), (memberColumnList.size()));
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
	public List<String> expectedList(){
		List<String> list1 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(ACTIVITY_NAME_COLUMN);
		for (WebElement element : memberTableNameColumn) {
			list1.add(element.getText());
		}
		Collections.sort(list1);
		Collections.reverse(list1);
		return list1;
	}
	public List<String> actualList(){
		List<String> list1 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(ACTIVITY_NAME_COLUMN);
		for (WebElement element : memberTableNameColumn) {
			list1.add(element.getText());
		}
		return list1;
	}
	public void AccuraluncheckAccuredPointsField() {
		this.uncheck(SETTINGS_ACCRUEDPOINTS_CHECKBOX);
		reportInfo("Clicking Field Settings Accured Points UnCheckbox");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void redemptionuncheckAccuredPointsField() {
		this.uncheck(SETTINGS_TYPE_CHECKBOX);
		reportInfo("Clicking Field Settings Accured Points UnCheckbox");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public String selectShowEntiesDropdown(){
		String testData=this.getFirstDropDownLabel(SHOW_ENTITIES_DROPDOWN);//getFirstDropDownValue(SHOW_ENTITIES_DROPDOWN);
		this.selectDropdown(SHOW_ENTITIES_DROPDOWN, testData);
		reportInfo("Selecting value from show entities Dropdown. :"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}
	public void checkCodeField() {
		this.check(SETTINGS_CODE_CHECKBOX);
		reportInfo("Clicking Field Settings Code Checkbox");
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
	public int checkedColumnsNew(){ 
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
	public int activityTableColumns(By by){
		int count=0;
		reportInfo("Fetching number of columns in table.");
		List<WebElement> transactionColumnList = getWebElementList(by);
		for(WebElement l:transactionColumnList){
			if(l.getAttribute("class").equalsIgnoreCase("ng-scope")){
				count=count+1;
			}
		}
		return count;
	}
	public int activityTablecheckColumns(){ 
		reportInfo("Fetching number of columns in table."); 
		List<WebElement> tierColumnList = getWebElementList(ACCRUALS_TABLE_HEADER); 
		return tierColumnList.size(); 
	}
	public int activityTableuncheckColumns(){ 
		reportInfo("Fetching number of columns in table."); 
		List<WebElement> tierColumnList = getWebElementList(ACCRUALS_TABLE_HEADER); 
		return tierColumnList.size(); 
	}
	public int activityTableredemptioncheckColumns(){ 
		reportInfo("Fetching number of columns in table."); 
		List<WebElement> tierColumnList = getWebElementList(REDEMPTIONS_TABLE_HEADER); 
		return tierColumnList.size(); 
	}
	public int activityTableredemptionuncheckColumns(){ 
		reportInfo("Fetching number of columns in table."); 
		List<WebElement> tierColumnList = getWebElementList(REDEMPTIONS_TABLE_HEADER); 
		return tierColumnList.size(); 
	}
	public void accuredassertUncheckedColumns(String testType) {
		reportInfo("Validating Invisible columns in location table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> memberColumnList = getWebElementList(ACCRUALS_TABLE_HEADER);
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
	public void redemptionsassertUncheckedColumns(String testType) {
		reportInfo("Validating Invisible columns in location table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> memberColumnList = getWebElementList(REDEMPTIONS_TABLE_HEADER);
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
	public void accuralassertCheckedColumns(String testType) {
		reportInfo("Validating visible columns in Accurals table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);
				List<WebElement> memberColumnList = getWebElementList(ACCRUALS_TABLE_HEADER);
				Assert.assertEquals(checkBoxList.size(), (memberColumnList.size()));
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
	public void redemptionsassertCheckedColumns(String testType) {
		reportInfo("Validating visible columns in Accurals table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);
				List<WebElement> memberColumnList = getWebElementList(REDEMPTIONS_TABLE_HEADER);
				Assert.assertEquals(checkBoxList.size(), (memberColumnList.size()));
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
	public void uncheckNameField() {
		this.uncheck(SETTINGS_TYPE_CHECKBOX);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void assertUncheckedColumns(String testType) {
		reportInfo("Validating Invisible columns in Activity table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> memberColumnList = getWebElementList(ACTIVITY_TABLE);
				String count = "0";
				for (WebElement w : memberColumnList) {
					if (w.getText() == "Name") {
						count = count + 1;
					}
					Assert.assertEquals(count, "0");
					String successFilePath = driverScreenshot();
					reportSuccessScreenshot(successFilePath,"");

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
	public void clickOnCollapseButton() {
		this.click(COLLAPSE_BUTTON);
		reportInfo("Clicking On Collapse Button");
		waitForPageToLoad(PAGE_LOADING);
	}
	public String selectShowEntitiesDropdown() {
		String testData=this.getFirstDropDownLabel(SHOW_ENTITIES_DROPDOWN);
		this.selectDropdown(SHOW_ENTITIES_DROPDOWN, testData);
		reportInfo("Clicking On Show Entities DropDown");
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}
	public boolean validatePagination(int expected, String testType) {
		reportInfo("Validating Pagination");
		boolean flag = false;

		List<WebElement> rows = getWebElementList(ACTIVITY_TABLE);
		int count = rows.size();
		if(count<=expected){
			flag=true;
		}
		return flag;
	}
	public String selectAccrualsShowEntitiesDropdown() {
		String testData=this.getFirstDropDownLabel(ACCRUALS_SHOW_ENTITIES_DROPDOWN);
		this.selectDropdown(ACCRUALS_SHOW_ENTITIES_DROPDOWN, testData);
		reportInfo("Clicking On Accural Show Entities DropDown");
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}
	public boolean validateAccuralPagination(int expected, String testType) {
		reportInfo("Validating Pagination");
		boolean flag = false;

		List<WebElement> rows = getWebElementList(ACCRUALS_TABEL);
		int count = rows.size();
		if(count<=expected){
			flag=true;
		}
		return flag;
	}

	public String selectRedemptionsShowEntitiesDropdown() {
		String testData=this.getFirstDropDownLabel(REDEMPTIONS_SHOW_ENTITIES_DROPDOWN);
		this.selectDropdown(REDEMPTIONS_SHOW_ENTITIES_DROPDOWN, testData);
		reportInfo("Clicking On Accural Show Entities DropDown");
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}
	public boolean validateRedemptionsPagination(int expected, String testType) {
		reportInfo("Validating Pagination");
		boolean flag = false;

		List<WebElement> rows = getWebElementList(REDEMPTIONS_TABEL);
		int count = rows.size();
		if(count<=expected){
			flag=true;
		}
		return flag;
	}

	public void clickonSortDateButton(){
		this.click(ACTIVITY_SORT_BY_DATE_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public boolean sortingByName() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList(ACTIVITY_TABLE_NAME_COLUMN_BUTTON);
		for (WebElement element : sortingTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		//Collections.sort(list1,new SortIgnoreCase());
		Collections.sort(list2,new SortIgnoreCase());

		Collections.reverse(list2);
		System.out.println("After Reverse"+list2);
		System.out.println("List1 is"+list2);
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
	public void validationErrorPopUp(String testType) {

		reportInfo("Validating Transcations Link");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(ACTIVITY_BUTTON);
				reportSuccessScreenshot(successFilePath,"");
				reportPassedStatus("Clicked on Transactions Link");
			} else if (testType.equalsIgnoreCase("invalid")) {

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Test Case Failed");
		}

	}
	public void validatingassertionPopUp(String testType) {

		reportInfo("Validating Process Activity tab");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(LOG);
				reportSuccessScreenshot(successFilePath,"");
				reportPassedStatus("Clicked on Transactions Link");
			} else if (testType.equalsIgnoreCase("invalid")) {

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Test Case Failed");
		}

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
	public void assertInt(int expected, int actual, By by, String message){
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
	public String clickOnMemberActivityButton(){
		this.click(ACTIVITY_BUTTON);
		reportInfo("Clicking On Member Activity Button.");
		this.waitForPageToLoad(PAGE_LOADING);
		return clickOnMemberActivityButton();
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
	public boolean validateCollapseButton(){
		boolean flag=false;
		WebElement ele=driver.findElement(COLLAPSER_BUTTON_CLASSNAME);
		String classname=ele.getAttribute("class");
		if(classname != null && classname.contains("jarviswidget-collapsed")){
			flag=true;
		}

		return flag;


	}
}