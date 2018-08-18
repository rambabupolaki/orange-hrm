package selenium.framework.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import selenium.framework.common.PageControls;
import selenium.framework.pages.MemberLoyaltyIDsPage.SortIgnoreCase;
public class MemberSegmentsPage extends PageControls{
	public  final By PAGE_LOADING = By.xpath("//div[@class='loading'][@style='display: block;']");
	public  final By ADDMEMBERSEGMENTS_BUTTON=By.xpath("//*[@class='btn btn-default general_button ng-scope']");
	public  final By SEGMENTS_DROPDOWN=By.xpath("//*[@class='form-control ng-pristine ng-valid ng-isolate-scope ng-empty ng-touched']");
	public  final By EFFECTIVEDATE_INPUT=By.xpath("//*[@class='lm-date-time-picker ng-pristine ng-valid ng-empty ng-touched']");
	public  final By EXPIRATIONDATE_INPUT=By.xpath("//*[@class='lm-date-time-picker ng-pristine ng-untouched ng-valid ng-empty']");
	public  final By OK_BUTTON=By.xpath("//*[@class='btn btn-primary ok_button']");
	public  final By SEGMENTS_TABLE_NAME_COLUMN_BUTTON=By.xpath("//*[@id='membersegmentTable']//tbody//tr//td[2]");
	public  final By SEGMENTS_NAME_BUTTON=By.xpath("//*[@id='membersegmentTable_0_2']");
	public  final By SEGMENTS_TABLE_NAME_CLOUMN_BUTTON=By.xpath("//*[@id='membersegmentTable']//tbody//tr//td[6]");
	public  final By SEGMENTS_TYPE_BUTTON=By.xpath("//*[@id='membersegmentTable_0_4']");
	public  final By SEGMENTS_TABLE_TYPE_CLOUMN_BUTTON=By.xpath("//*[@id='membersegmentTable']//tbody//tr//td[4]");
	public  final By SEGMENTS_EFFECTIVEDATE_BUTTON=By.xpath("//*[@id='membersegmentTable_0_6']");
	public  final By SEGMENTS_TABLE_EFFECTIVEDATE_CLOUMN_BUTTON=By.xpath("//*[@id='membersegmentTable']//tbody//tr//td[5]");
	public  final By SHOW_ENTITIES_DROPDOWN = By.name("membersegmentTable_length");
	public  final By MEMBERSEGMENT_TABLE = By.xpath("//table[@id='membersegmentTable']/tbody/tr");
	public  final By FIELDSETTINGS_BUTTON = By.xpath("//*[@id='show-table-options']");
	public  final By SETTINGS_CODE_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']/li[1]/label/input[1]");
	public  final By SETTINGS_ALL_COLUMNS_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li//input");
	public  final By MEMBERSEGMENT_TABLE_HEADER = By.xpath("//*[@id='membersegmentTable']//thead//tr//th");
	public  final By SETTINGS_NAME_CHECKBOX = By.xpath("//li[1][@class='ng-scope']//label//input");
	public  final By MEMBERSEGMENTHEADER=By.xpath("//*[@class='modal-header ui-draggable-handle']");
	public  final By SEARCH_BAR = By.xpath("//input[@aria-controls='membersegmentTable']");
	public final By VALIDATE_SEGMENTEFFECTIVEDATE = By.xpath("//table[@id='membersegmentTable']//tbody//tr//td[6]");
	public final By VALIDATE_SEGMENTNAME = By.xpath("//table[@id='membersegmentTable']//tbody//tr//td[3]");
	public  final By SEARCH_BUTTON = By.xpath("//*[@id='advanced-search-button']");
	public final By EFFECTIVE_INPUT=By.xpath("(//input[@type='text'])[3]");
	public final By SETTINGS_MEMBERSEGMENTNAME_CHECKBOX=By.xpath("//input[@name='columns-name']");
	public final By SETTINGS_ALL_COLUMNS_VISIBLE=By.xpath("//ul[@class='ColVis_collection']//li");
	public  final By ADD_MEMBERSEGMENTS_BUTTON = By.xpath("//*[@class='btn btn-default general_button ng-scope']");
	public final By VALIDATION_ERROR = By.xpath(".//*[@class='toast-message']");
	public  final By MEMBERSEGMENT_NAME = By.xpath("//table[@id='membersegmentTable']//tbody//tr[1]//td[2]");
	public final By MEMBERDUPLICATE_NAME=By.xpath("//*[@class='invalid ng-binding ng-scope']");
	public final By VALIDATIONERROR=By.xpath("//*[@class='invalid ng-binding ng-scope']");
	
	public MemberSegmentsPage(WebDriver driver) {
		super(driver);	
	}
	public void clickOnAddMemberSegmentButton(){
		this.click(ADDMEMBERSEGMENTS_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On Add Member Segments Button.");

	}
	public void selectSegmentsDropdown() {
		String testData=getFirstDropDownValue(SEGMENTS_DROPDOWN);
		this.selectDropdown(SEGMENTS_DROPDOWN, testData);
		reportInfo("Selecting Segments Dropdown. :"+testData);
	}
	public void clickOnOKButton(){
		this.click(OK_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On OK Buttons.");

	}
	public void clickOnnewOKButton(boolean testData){
		this.click(OK_BUTTON);
		reportInfo("Clicking On OK Button.");
		//this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnAddSegmentsButton(){
		this.click(ADD_MEMBERSEGMENTS_BUTTON);
		reportInfo("Clicking On Add Preference Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void selectPreferenceName(List<WebElement> l1){
		String testData=getSegmentName(l1);
		this.selectDropdown(SEGMENTS_DROPDOWN, testData);

	}
	public String addSegments() throws AWTException, InterruptedException{ 
		String testData=null; 
		List<String> list1 = new ArrayList<String>(); 
		List<String> list2 = new ArrayList<String>(); 
		List<WebElement> preferences=getWebElementList(SEGMENTS_TABLE_NAME_COLUMN_BUTTON); 
		this.click(ADDMEMBERSEGMENTS_BUTTON); 
		this.waitForPageToLoad(PAGE_LOADING);
			Robot robot = new Robot();
			// Simulate key Events
			robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_ALT);
			robot.keyRelease(KeyEvent.VK_TAB);	
			robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_ALT);
			robot.keyRelease(KeyEvent.VK_TAB);	
			robot.keyRelease(KeyEvent.VK_ALT);
			robot.keyRelease(KeyEvent.VK_TAB);	
		Select select = new Select(waitForElement(SEGMENTS_DROPDOWN)); 
		List<WebElement> options = select.getOptions(); 
		for (WebElement e : options) { 

			list1.add(e.getAttribute("label")); 

		} 
		for(WebElement e :preferences){ 
			list2.add(e.getText()); 
		} 
		list1.removeAll(list2); 
		if(list1.size()>0){ 	
			testData=list1.get(1); 
			System.out.println(testData); 
			if(testData!=null){ 
				this.selectDropdown(SEGMENTS_DROPDOWN, testData); 
				System.out.println("selecting dropdown. :"+testData);
			}
		}else{
			reportInfo("All existing segments are added to member.");
		}
		return testData;
	}
	public String selectShowEntiesDropdown(){
		String testData=this.getFirstDropDownLabel(SHOW_ENTITIES_DROPDOWN);//getFirstDropDownValue(SHOW_ENTITIES_DROPDOWN);
		this.selectDropdown(SHOW_ENTITIES_DROPDOWN, testData);
		reportInfo("Selecting value from show entities dropdown. :"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}

	public List<WebElement> getMemberSegments(){
		List<WebElement> C = getWebElementList(SEGMENTS_TABLE_NAME_COLUMN_BUTTON);
		return C;
	}
	public String getExistingmemberSegmentname(){
		String testData=this.getText(MEMBERSEGMENT_NAME);
		return testData;
	}
	public String getSegmentName(List<WebElement> l1){
		List<WebElement> S = getWebElementList(SEGMENTS_DROPDOWN);
		for (WebElement C1: l1){
			System.out.println(C1.getText());
			for (WebElement S1 : S) {	
				System.out.println(S1.getText());
				if(C1.getText()==S1.getText()){
					System.out.println(C1.getText());
					break;
				}else{
					return C1.getText();
				}

			}
		}

		return getSegmentName(S);
	}
	public void clickonSortNameButton(){
		this.click(SEGMENTS_NAME_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public boolean sortingByName() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList(SEGMENTS_TABLE_NAME_CLOUMN_BUTTON);
		for (WebElement element : sortingTableNameColumn) {
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
	public class SortIgnoreCase implements Comparator<Object> {
		public int compare(Object o1, Object o2) {
			String s1 = (String) o1;
			String s2 = (String) o2;
			return s1.toLowerCase().compareTo(s2.toLowerCase());
		}
	}
	public void clickonSortTypeButton(){
		this.click( SEGMENTS_TYPE_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public boolean sortingByType() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList( SEGMENTS_TABLE_TYPE_CLOUMN_BUTTON);
		for (WebElement element : sortingTableNameColumn) {
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
	public List<String> expectedList(By by,String testData){
		List<String> list1 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(by);
		for (WebElement element : memberTableNameColumn) {
			list1.add(element.getText());
		}
		Collections.sort(list1);
		//Collections.reverse(list1);
		reportInfo(testData);
		return list1;
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
	public void clickonSortEffectiveDateButton(){
		this.click(SEGMENTS_EFFECTIVEDATE_BUTTON);
		reportInfo("CLicking on Sort by EffectiveDate Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public boolean sortingByEffectiveDate() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList(SEGMENTS_TABLE_EFFECTIVEDATE_CLOUMN_BUTTON);
		for (WebElement element : sortingTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		Collections.sort(list1,new SortIgnoreCase());
		System.out.println("After Reverse"+list1);
		System.out.println("List2 is"+list2);
		boolean sorted=list2.equals(list1);
		return sorted;

	}
	public String selectShowEntitiesDropdown() {
		String testData=this.getFirstDropDownLabel(SHOW_ENTITIES_DROPDOWN);
		this.selectDropdown(SHOW_ENTITIES_DROPDOWN, testData);
		reportInfo("Clicking On Show Entities DropDown.");
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}
	public boolean validatePagination(int expected, String testType) {
		reportInfo("Validating Pagination");
		boolean flag = false;
		
				List<WebElement> rows = getWebElementList(MEMBERSEGMENT_TABLE);
				int count = rows.size();
				if(count<=expected){
					flag=true;
				}
				return flag;
	}
				
				
	public void clickOnFieldSettingsButton() {
		this.click(FIELDSETTINGS_BUTTON);
		reportInfo("Clicking On Field Settings Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void checkmemberSegmentNameField() {

		this.check(SETTINGS_MEMBERSEGMENTNAME_CHECKBOX);
		reportInfo("Check Field Settings Name Checkbox");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void checkCodeField() {
		this.check(SETTINGS_CODE_CHECKBOX);
		reportInfo("Check Field Settings Code Checkbox");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public int checkedColumns(){
		int count=0;
		reportInfo("Fetching number of checked columns in Fieldsettings.");
		List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);
		for(WebElement l:checkBoxList){
			boolean flag=l.isSelected();
			if(flag==true){
				count=count+1;
			}
		}
		return count;
	}

	public int memberSegmentTableColumns(){
		reportInfo("Fetching number of columns in table.");
		List<WebElement> tierColumnList = getWebElementList(MEMBERSEGMENT_TABLE_HEADER);
		return tierColumnList.size()-1;
	}
	public void assertCheckedColumns(String testType) {
		reportInfo("Validating visible columns in table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);
				List<WebElement> memberReferralsColumnList = getWebElementList(MEMBERSEGMENT_TABLE_HEADER);
				Assert.assertEquals(checkBoxList.size(), (memberReferralsColumnList.size()-1));
				String successFilePath = elementScreenshot(SETTINGS_ALL_COLUMNS_CHECKBOX);
				reportSuccessScreenshot(successFilePath,"");
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
	public void uncheckNameField() {
		this.uncheck(SETTINGS_NAME_CHECKBOX);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public int memberSegmentTableColumns(By by){
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
	public void assertUncheckedColumns(String testType) {
		reportInfo("Validating Invisible columns in table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> memberColumnList = getWebElementList(MEMBERSEGMENT_TABLE_HEADER);
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
	public void clickOn_Search_Button(){
		this.click(SEARCH_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on Search Button");
	}
		
	
	public void effectiveDate(String testData){
		this.clear(EFFECTIVE_INPUT);
		this.type(EFFECTIVE_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering Effective Date :"+testData);
		
	}
	public void effectiveDateStart(String testData){
		this.clear(EFFECTIVE_INPUT);
		this.waitForPageToLoad(PAGE_LOADING);
		this.type(EFFECTIVE_INPUT, testData);
		reportInfo("Entering Effective Start Date :"+testData);
		
	}
	public void effectiveDateEnd(String testData){
		this.clear(EFFECTIVE_INPUT);
		this.type(EFFECTIVE_INPUT, testData);
		reportInfo("Entering Effective End  Date :"+testData);
		
	}
	public void enterSegmentname(String testData)throws AWTException, InterruptedException{
		//this.clear(SEGMENTS_DROPDOWN);
		Thread.sleep(1000);
		Robot robot = new Robot();
		// Simulate key Events
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(100);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_TAB);	
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(100);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_TAB);	
		this.waitForPageToLoad(PAGE_LOADING);
		this.type(SEGMENTS_DROPDOWN, testData);
		reportInfo("Entering Duplicate Member Segment Name :"+testData);
		
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
	
	}

