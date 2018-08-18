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
import selenium.framework.common.PageControls;
import selenium.framework.pages.MemberPursesPage.SortIgnoreCase;
public class MemberBadgesPage extends PageControls{
	public  final By PAGE_LOADING = By.xpath("//div[@class='loading'][@style='display: block;']");
	public  final By BADGE_EDIT_BUTTON=By.xpath("//table[@id='badgeTable']//tbody//tr[1]//td[1]//a[@class='lm-action-update ios ng-scope']//i");
	public  final By BADGE_ADD_BUTTON=By.xpath("//*[@class='btn btn-default general_button ng-scope']");
	public  final By BADGE_NAME_INPUT=By.xpath("//*[@name='name']");
	public  final By BADGE_DATE_INPUT=By.xpath("//*[@class='lm-date-time-picker ng-pristine ng-untouched ng-valid ng-empty']");
	public  final By OK_BUTTON=By.xpath("//*[@class='btn btn-primary ok_button']");
	public  final By VALIDATE_ADD_SUCCESSFUL=By.xpath(".//*[@class='toast-message']");
	public  final By SEARCH_INPUT=By.xpath("//*[@id='badgeTable_filter']//input");
	public  final By VALIDATE_BADGES=By.xpath("//table[@id='badgeTable']//tbody//tr//td[2]");
	public  final By DELETE_BADGE_BUTTON=By.xpath("//*[@class='lm-action-delete ios ng-scope']");
	public  final By SHOW_ENTITIES_DROPDOWN = By.name("badgeTable_length");
	public  final By BADGE_TABLE = By.xpath("//table[@id='badgeTable']/tbody/tr");
	public  final By FIELDSETTINGS_BUTTON = By.xpath("//*[@id='badgeTable_wrapper']//div//*[@class='ColVis_Button ColVis_MasterButton']");
	public  final By SETTINGS_NAME_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']/li[1]/label/input[1]");
	public final By SETTINGS_BADGESNAME_CHECKBOX=By.xpath("//ul[@class='ColVis_collection']/li[1]");
	public  final By SETTINGS_ALL_COLUMNS_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li//input");
	public final By SETTINGS_ALL_COLUMNS=By.xpath("//ul[@class='ColVis_collection']//li//input");
	public final By SETTINGS_ALL_COLUMNS_VISIBLE=By.xpath("//ul[@class='ColVis_collection']//li");
	public  final By BADGE_TABLE_HEADER = By.xpath("//*[@id='badgeTable']//thead//tr//th");
	public  final By BADGE_SORT_BY_NAME_BUTTON=By.xpath("//table[@id='badgeTable']//thead//tr//th[2]");
	public  final By BADGE_TABLE_NAME_COLUMN_BUTTON=By.xpath("//table[@id='badgeTable']//tbody//tr//td[2]");
	public  final By BADGE_SORT_BY_ACHIVEDON_BUTTON=By.xpath("//*[@id='badgeTable_0_3']");
	public  final By BADGE_TABLE_ACHIVEDON_COLUMN_BUTTON=By.xpath("//*[@id='badgeTable']//tbody//tr//td[3]");
	public  final By BADGE_SORT_BY_CREATEDAT_BUTTON=By.xpath("//*[@id='badgeTable_0_4']");
	public  final By BADGE_TABLE_CREATEDAT_COLUMN_BUTTON=By.xpath("//*[@id='badgeTable']//tbody//tr//td[4]");
	public  final By NEXT_BUTTON_CLASS_NAME = By.xpath("//li[@id='badgeTable_next']/a");
	public  final By NEXT_BUTTON = By.xpath("//li[@id='badgeTable_next']/a");
	public  final By VALIDATE_NEXT_BUTTON = By.xpath("//div[@id='badgeTable_paginate']//li[3]");
	public  final By PREVIOUS_BUTTON = By.xpath("//li[@id='badgeTable_previous']/a");
	public  final By PREVIOUS_BUTTON_CLASS_NAME = By.xpath("//li[@id='badgeTable_previous']");
	public  final By VALIDATE_PREVIOUS_BUTTON = By.xpath("//div[@id='badgeTable_paginate']//li[2]");
	public  final By DELETE_BADGES_YES_BUTTON=By.xpath("//*[@class='btn btn-primary ok_button']");
	public  final By DELETE_BADGES_SUCCESSFUL=By.xpath(".//*[@class='toast-message']");
	public  final By VALIDATION_ERROR = By.xpath("//*[@class='alert alert-danger alert-block']");
	public  final By VALIDATION_DATE_ERROR = By.xpath("//*[@class='invalid ng-binding ng-scope']");
	public final By VALIDATE_MEMBERBADGESNAME=By.xpath("//table[@id='badgeTable']//tbody//tr//td[2]");
	public final By DUPLICATE_ERROR = By.xpath(".//*[@class='toast-message']");

	public MemberBadgesPage(WebDriver driver) {
		super(driver);	
	}
	public void clickOnBadgeAddButton(){
		this.click(BADGE_ADD_BUTTON);
		reportInfo("Clicking On Badge Add Button.");
		this.waitForPageToLoad(PAGE_LOADING);

	}
	public String enterNameInput(String testData){
		this.clear(BADGE_NAME_INPUT);
		this.type(BADGE_NAME_INPUT, testData);
		reportInfo("Entering Name. :"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}
	public void enterDateInput(String testData){
		this.clear(BADGE_DATE_INPUT);
		this.type(BADGE_DATE_INPUT, testData);
		reportInfo("Entering Date.:"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnOKButton(){
		this.click(OK_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On OK Button.");		
	}
	public void clickOnNewOKButton(){
		this.click(OK_BUTTON);
		//this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On OK Button.");		
	}
	public void clickNewOnOKButton(){
		this.click(OK_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On OK Button.");		
	}
	public void pageReferesh(){
		driver.navigate().refresh();
		System.out.println("Refreshing Web Page.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void enterSearchInput(String testData){
		this.clear(SEARCH_INPUT);
		this.type(SEARCH_INPUT, testData);
		reportInfo("Entering Search Input.:"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnEditButton(){
		this.click(BADGE_EDIT_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On Badge EDIT Button.");	      
	}
	public void clickOn_DeleteBadge_Button(){
		this.click(DELETE_BADGE_BUTTON );
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOn_DeleteLocationYes_Button(){
		this.click(DELETE_BADGES_YES_BUTTON );
	}
	public void clickOnFieldSettingsButton() {
		this.click(FIELDSETTINGS_BUTTON);
		reportInfo("Clicking On Field Settings Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void checkBadgeNameField() {

		this.check(SETTINGS_BADGESNAME_CHECKBOX);
		reportInfo("Clicking Field Settings Name Checkbox");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public String getText(By by,String testData){
		reportInfo(testData);
		return this.getText(by);
	}
	public String getClassname(By by,String testData){ 
        reportInfo(testData); 
        WebElement ele=driver.findElement(by); 
        String classname=ele.getAttribute("class"); 
        return classname; 
        
}
	public List<String> actualList(By by,String testData){ 
		List<String> list1 = new ArrayList<String>(); 
		List<WebElement> memberTableNameColumn = getWebElementList(BADGE_TABLE_NAME_COLUMN_BUTTON); 
		for (WebElement element : memberTableNameColumn) { 
			list1.add(element.getText()); 
		} 
		reportInfo(testData);
		return list1; 
	} 
	public List<String> expectedList(By by,String testData){ 
		List<String> list1 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(BADGE_TABLE_NAME_COLUMN_BUTTON); 
		for (WebElement element : memberTableNameColumn) { 
			list1.add(element.getText()); 
		} 
		Collections.sort(list1); 
		System.out.println(list1);
		//Collections.reverse(list1); 
		reportInfo(testData);
		return list1; 
	}
	
	public void assertCheckedColumns(String testType) {
		reportInfo("Validating Purse visible columns in Purse table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);
				List<WebElement> memberColumnList = getWebElementList(BADGE_TABLE_HEADER);
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
	public void uncheckNameField() {
		this.uncheck(SETTINGS_NAME_CHECKBOX);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void assertUncheckedColumns(String testType) {
		reportInfo("Validating Badge Invisible columns in badge table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> memberColumnList = getWebElementList(BADGE_TABLE_HEADER);
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

	public String selectShowEntitiesDropdown(){
		String testData=this.getFirstDropDownValue(SHOW_ENTITIES_DROPDOWN);
		this.selectDropdown(SHOW_ENTITIES_DROPDOWN, testData);
		reportInfo("Selecting value from show entities dropdown. :"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}
	public boolean validatePagination(int expected, String testType) {
					boolean flag = false;
					reportInfo("Validating Pagination");
							List<WebElement> rows = getWebElementList(BADGE_TABLE);
							int count = rows.size();
							if(count<=expected){
								flag=true;
							}
					return flag;
				}
	
	public void clickonSortNameButton(){
		this.click(BADGE_SORT_BY_NAME_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public boolean sortingByName() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList(BADGE_TABLE_NAME_COLUMN_BUTTON);
		for (WebElement element : sortingTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		Collections.sort(list1,new SortIgnoreCase());
		//Collections.sort(list2,new SortIgnoreCase());

		//Collections.reverse(list1);
		//System.out.println("After Reverse"+list1);
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
	public void clickonSortAchivedOnButton(){
		this.click(BADGE_SORT_BY_ACHIVEDON_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public boolean sortingByAchivedon() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList(BADGE_TABLE_ACHIVEDON_COLUMN_BUTTON);
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
	public class SortIgnoreCase1 implements Comparator<Object> {
		public int compare(Object o1, Object o2) {
			String s1 = (String) o1;
			String s2 = (String) o2;
			return s1.toLowerCase().compareTo(s2.toLowerCase());
		}
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
	public int badgeTableColumns(){ 
        reportInfo("Fetching number of columns in table."); 
        List<WebElement> tierColumnList = getWebElementList(BADGE_TABLE_HEADER); 
        return tierColumnList.size()-1; 
}
	public void clickonCreatedatButton(){
		this.click(BADGE_SORT_BY_CREATEDAT_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public boolean sortingByCreatedAt() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList(BADGE_TABLE_CREATEDAT_COLUMN_BUTTON);
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
	public class SortIgnoreCase2 implements Comparator<Object> {
		public int compare(Object o1, Object o2) {
			String s1 = (String) o1;
			String s2 = (String) o2;
			return s1.toLowerCase().compareTo(s2.toLowerCase());
		}
	}
	public void assertBadgesPopup(String expected, String testType)
	{
		reportInfo("Validating Badge Delete Or Not");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				Assert.assertEquals(this.getText(DELETE_BADGES_SUCCESSFUL), expected);
				reportPassedStatus("Verified Location Delete Or Not");
				String successFilePath = elementScreenshot(DELETE_BADGES_SUCCESSFUL);
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
	public void assertbadgename(String expected, String testType)
	{
		reportInfo("Validating badge name");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				Assert.assertEquals(this.getText(VALIDATE_BADGES), expected);
				reportPassedStatus("Verified pursepolicies Name");
				String successFilePath = elementScreenshot(VALIDATE_BADGES);
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
	public void assertAddBadgePopup(String expected, String testType) {
		reportInfo("Validating Flow");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				Assert.assertEquals(this.getText(VALIDATE_ADD_SUCCESSFUL), expected);
				reportPassedStatus("Verified Flow");
				String successFilePath = elementScreenshot(VALIDATE_ADD_SUCCESSFUL);
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
	public void validationNovalueErrorPopUp(String testType) {
		/*this.waitForPageToLoad(PAGE_LOADING);*/
		reportInfo("Validating Duplicate Records");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(VALIDATION_DATE_ERROR);
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
	public int clickOnPreviousButton() {
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

	public void assertObject(Object expected, Object actual, String message){
		if(expected.equals(actual)){
			reportPassedStatus("Expected [ "+expected+" ] ");
			reportPassedStatus(" Actual [ "+actual+" ]");
			this.scrollDown();

		}else{
			reportFailedStatus("Expected [ "+expected+" ] ");
			reportFailedStatus(" Actual [ "+actual+" ]");

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
	public void assertBoolean(Boolean expected, Boolean actual, By by, String message){
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
