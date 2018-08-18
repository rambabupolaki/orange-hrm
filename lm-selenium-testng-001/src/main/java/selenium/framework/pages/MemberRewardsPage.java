package selenium.framework.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import selenium.framework.common.PageControls;

public class MemberRewardsPage extends PageControls{

	public MemberRewardsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public  final By ADD_REWARD_BUTTON = By.xpath("//*[@class='btn btn-default general_button ng-scope']");
	public  final By PAGE_LOADING = By.xpath("//div[@class='loading'][@style='display: block;']");
	public  final By SELECT_NAME = By.name("name");
	public  final By DESCRIPTION_INPUT = By.name("desc");
	public  final By USES_LEFT_INPUT = By.name("usesLeft");
	public  final By EXPIRES_ON_INPUT = By.xpath("(//input[@type='text'])[3]");
	public  final By EFFECTIVE_DATEINPUT = By.xpath("(//input[@type='text'])[5]");
	public  final By CODE_INPUT = By.name("code");
	public  final By OK_BUTTON = By.xpath("//div[@class='modal-footer']//button[1]");
	public  final By SEARCH_INPUT = By.xpath("//div[@id='rewardTable_filter']//input");
	public  final By REWARD_TABLE_CODE_COLUMN = By.xpath("//table[@id='rewardTable']//tbody//tr//td[7]");
	public  final By EDIT_REWARD_BUTTON = By.xpath("//table[@id='rewardTable']//a[@class='lm-action-update ios ng-scope']//i");
	public  final By DELETE_REWARD_BUTTON = By.xpath("//table[@id='rewardTable']//a[@class='lm-action-delete ios ng-scope']//i");
	public  final By DELETE_REWARD_OK_BUTTON = By.xpath("//div[@class='modal-footer']//button[1]");
	public  final By DELETE_REWARD_CANCEL_BUTTON = By.xpath("//div[@class='modal-footer']//button[2]");
	public  final By DELETE_REWARD_POPUP = By.xpath(".//*[@class='toast-message']");
	public  final By SHOW_ENTITIES_DROPDOWN = By.xpath("//div[@id='rewardTable_length']//select[1]");
	public  final By REWARD_TABLE = By.xpath("//table[@id='rewardTable']//tbody//tr");
	public  final By FIELD_SETTINGS_BUTTON = By.xpath("//*[@id='show-table-options']");
	public  final By REWARD_NAME_CHECKBOX = By.cssSelector("input[type='checkbox']");
	public  final By SETTINGS_ALL_COLUMNS_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li//input");
	public  final By REWARDS_TABLE_HEADER = By.xpath("//table[@id='rewardTable']//thead//tr//th");
	public final By SETTINGS_ALL_COLUMNS_VISIBLE=By.xpath("//ul[@class='ColVis_collection']//li");
	public  final By REWARDS_NAME_BOX = By.xpath("//ul[@class='ColVis_collection']//li[1]");
	public  final By NEXT_BUTTON_CLASS_NAME = By.xpath("//li[@id='Table_next']");
	public  final By NEXT_BUTTON = By.linkText("Next");
	public  final By PREVIOUS_BUTTON = By.linkText("Previous");
	public  final By PREVIOUS_BUTTON_CLASS_NAME = By.xpath("//li[@id='Table_previous']");
	public  final By VALIDATE_PREVIOUS_BUTTON = By.xpath("//*[@class='ng-isolate-scope']//div[2]/ul/li[2]");
	public  final By VALIDATE_NEXT_BUTTON = By.xpath("//*[@class='ng-isolate-scope']//div[2]/ul/li[3]");
	public  final By NAME_SORT_BUTTON = By.xpath("//table[@id='rewardTable']//thead//tr//th[3]");
	public  final By REWARD_NAME_COLUMN = By.xpath("//table[@id='rewardTable']//tbody//tr//td[2]");
	public  final By VALIDATION_ERROR = By.xpath("//div[@class='alert alert-danger alert-block']");
	public  final By INVALID_FORMAT_ERROR = By.xpath("//em[@class='invalid ng-binding ng-scope']");
	public final By VALIDATE_MEMBERREWARDCODE=By.xpath("//table[@id='rewardTable']//tbody//tr//td[8]");
	public final By MEMBERREWARD_DELETE_SUCCESSFUL_POP_UP = By.xpath(".//*[@class='toast-message']");
	public final By DUPLICATE_ERROR = By.xpath("//*[@class='alert alert-danger alert-block']");
	public final By SETTINGS_ALL_COLUMNS=By.xpath("//ul[@class='ColVis_collection']//li");
	public final By ADVANCE_SEARCH_BUTTON=By.xpath("//*[@id='advanced-search-button']");
	public final By REMOVE_BUTTON=By.xpath(".//*[@id='advanced-search-remove-button']");
	public final By ADVANCED_SEARCH_CODE=By.xpath("//*[@placeholder='Code']");
	public  final By SUGGESTIONS=By.xpath("//label/ul/li/a");
	public final By ADVANCED_OK_BUTTON=By.xpath("//*[@class='btn btn-primary ok_button']");
	public final By TABLE_REWARD = By.xpath("//table[@id='rewardTable']/tbody/tr");
	
	public void clickOnAddRewardButton(){
		this.click(ADD_REWARD_BUTTON);
		reportInfo("Clicking On Add Rewards Button.");
		this.waitForPageToLoad(PAGE_LOADING);

	}
	public String selectRewardName(){
		String testData=this.getFirstDropDownValue(SELECT_NAME);
		this.selectDropdown(SELECT_NAME, testData);
		reportInfo("Slecting Reward Name. :"+testData);
		return testData;
	}
	public String enterName(String testData){
		this.type(SELECT_NAME, testData);
		reportInfo("Slecting Reward Name. :"+testData);
		return testData;
		
	}
	public void enterDescriptionInput(String testData){
		this.type(DESCRIPTION_INPUT, testData);
		reportInfo("Entering Description. :"+testData);
	}
	public void enterUsesLeftInput(String testData){
		this.type(USES_LEFT_INPUT, testData);
		reportInfo("Entering UsesLeft. :"+testData);
	}
	public String enterRewardCodeInput(String testData){
		this.clear(CODE_INPUT);
		this.type(CODE_INPUT, testData);
		reportInfo("Entering Reward Code. :"+testData);
		return testData;
	}
	public void enterExpiresOnInput(String testData){
		this.clear(EXPIRES_ON_INPUT);
		this.type(EXPIRES_ON_INPUT, testData);
		reportInfo("Entering Expires On Value. :"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void enterEffectiveDateInput(String testData){
		this.clear(EFFECTIVE_DATEINPUT);
		this.type(EFFECTIVE_DATEINPUT, testData);
		reportInfo("Entering Effective Date. :"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnOKButton(){
		this.click(OK_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On Reward OK Button.");
	}
	public void clickNewOnOKButton(){
		this.click(OK_BUTTON);
		//this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On OK Button.");
	}
	
	public void clickOnEditRewardButton(){
		this.click(EDIT_REWARD_BUTTON);
		reportInfo("Clicking On Edit Rewards Button.");
		this.waitForPageToLoad(PAGE_LOADING);

	}
	public void clickOnDeleteRewardButton(){
		this.click(DELETE_REWARD_BUTTON);
		reportInfo("Clicking On Delete Reward Button.");
		this.waitForPageToLoad(PAGE_LOADING);

	}

	public void clickOnDeleteRewardOKButton(){
		this.click(DELETE_REWARD_OK_BUTTON);
		reportInfo("Clicking On Delete Reward OK Button.");
		//this.waitForPageToLoad(PAGE_LOADING);

	}

	public String selectShowEntitiesDropdown(){
		String testData=this.getFirstDropDownLabel(SHOW_ENTITIES_DROPDOWN);
		this.selectDropdown(SHOW_ENTITIES_DROPDOWN, testData);
		reportInfo("Selecting value from show entities dropdown. :"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}
	public void clickOnFieldSettingsButton(){
		this.click(FIELD_SETTINGS_BUTTON);
		reportInfo("Clicking On Field Settings Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void checkRewardName(){
		this.check(REWARDS_NAME_BOX);
		reportInfo("Reward Name Column is checked.");
		this.waitForPageToLoad(PAGE_LOADING);
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
	public int rewardTableColumns(By by){ 
		int count=0;
		reportInfo("Fetching number of columns in table.");
		List<WebElement> preferenceColumnList = getWebElementList(by);
		for(WebElement l:preferenceColumnList){
			if(l.getAttribute("class").equalsIgnoreCase("ng-scope") || l.getAttribute("class").equalsIgnoreCase("ng-scope dragtable-drag-boundary")){
				count=count+1;
			}
		}
		return count-1;
	}
		
	public void unCheckRewardName(){
		this.uncheck(REWARDS_NAME_BOX);
		reportInfo("Reward Name Column is unchecked.");
		this.waitForPageToLoad(PAGE_LOADING);
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
	public String getClassname(By by,String testData){ 
        reportInfo(testData); 
        WebElement ele=driver.findElement(by); 
        String classname=ele.getAttribute("class"); 
        return classname; 
        
}
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
	public void clickOnNameSortButton(){
		this.click(NAME_SORT_BUTTON);
		reportInfo("Clicking On sort By Name Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public String getText(By by,String testData){
		reportInfo(testData);
		return this.getText(by);
	}

	public List<String> actualList(By by,String testData){ 
		List<String> list1 = new ArrayList<String>(); 
        List<WebElement> memberTableNameColumn = getWebElementList(REWARD_NAME_COLUMN); 
        for (WebElement element : memberTableNameColumn) { 
                list1.add(element.getText()); 
        } 
        reportInfo(testData);
        return list1; 
} 
public List<String> expectedList(By by,String testData){ 
	List<String> list1 = new ArrayList<String>();
	 List<WebElement> memberTableNameColumn = getWebElementList(REWARD_NAME_COLUMN); 
        for (WebElement element : memberTableNameColumn) { 
                list1.add(element.getText()); 
        } 
        Collections.sort(list1); 
        Collections.reverse(list1); 
        reportInfo(testData);
        return list1; 
}


	public void validateRewardCode(String expected,String testType){
		reportInfo("Validating Reward Code");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				Assert.assertEquals(this.getText(REWARD_TABLE_CODE_COLUMN), expected);
				reportPassedStatus("Verified Reward Code");
				String successFilePath = elementScreenshot(REWARD_TABLE_CODE_COLUMN);
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
	public void validateDeleteReward(String expected,String testType){
		reportInfo("Validating Delete Reward");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				Assert.assertEquals(this.getText(DELETE_REWARD_POPUP), expected);
				reportPassedStatus("Delete Reward Verified");
				String successFilePath = elementScreenshot(DELETE_REWARD_POPUP);
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
	/**
	 * MethodName: validatePagination() 
	 * Description: This method is used to Validate Pagination
	 */
	public boolean validatePagination(int expected, String testType) {
		boolean flag = false;
		reportInfo("Validating Pagination");
				List<WebElement> rows = getWebElementList(REWARD_TABLE);
				int count = rows.size();
				if(count<=expected){
					flag=true;
				}
		return flag;
	}
	public void assertCheckedColumns(String testType) {
		reportInfo("Validating Member visible columns in member table.");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);
				List<WebElement> memberColumnList = getWebElementList(REWARDS_TABLE_HEADER);
				String successFilePath = elementScreenshot(SETTINGS_ALL_COLUMNS_CHECKBOX);
				reportSuccessScreenshot(successFilePath,"");
				for (WebElement w : memberColumnList) {
					System.out.println(w.getText());
					if (!w.getText().equals(this.getText(REWARDS_NAME_BOX))) {
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
		reportInfo("Validating Member Invisible columns in member table.");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> memberColumnList = getWebElementList(REWARDS_TABLE_HEADER);
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
	public boolean sortingByName() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(REWARD_NAME_COLUMN);
		for (WebElement element : memberTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		System.out.println(list1);
		Collections.sort(list2);
		Collections.reverse(list2);
		System.out.println(list2);
		boolean sorted=list2.equals(list1);
		return sorted;
	}
	public void assertValidationError(String testType){
		reportInfo("Validating Previous Button");

		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(VALIDATION_ERROR);
				reportSuccessScreenshot(successFilePath,"");
			} else if (testType.equalsIgnoreCase("invalid")) {
			}

		}catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}
	public void assertInValidFormatError(String testType){
		reportInfo("Validating Previous Button");

		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(INVALID_FORMAT_ERROR);
				reportSuccessScreenshot(successFilePath,"");
			} else if (testType.equalsIgnoreCase("invalid")) {
			}

		}catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
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
	public void assertObject(Object expected, Object actual, String message){
		if(expected==actual){
			reportPassedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			this.scrollDown();
			
		}else{
			reportFailedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			
		}
	}
	public void pageReferesh(){ 
        driver.navigate().refresh(); 
        System.out.println("Refreshing Web Page."); 
        this.waitForPageToLoad(PAGE_LOADING); 
}
	
	public void clickOnAdvanceSearchButton(){
		this.click(ADVANCE_SEARCH_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On advanced Search button");
		System.out.println("Clicking On advanced Search button");
	}
	public void clickOnRemoveButton(){
		this.click(REMOVE_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On Remove button");
	}
	
	
	public void enterAdvancedSearchCode(String testData){
		this.clear(ADVANCED_SEARCH_CODE );
		this.type(ADVANCED_SEARCH_CODE , testData);
		this.waitForPageToLoad(PAGE_LOADING);
		/*this.click(SUGGESTIONS);
		this.waitForPageToLoad(PAGE_LOADING);*/
		reportInfo("Entering  Members CODE :"+testData);
	}
	public void clickingOnAdvancedSearchOKButton(){
		this.click(ADVANCED_OK_BUTTON);
		reportInfo("Clicking on Advanced Search OK Button");
		this.waitForPageToLoad(PAGE_LOADING);
		
	}
	public void assertTextContains(String expected, String actual, By by, String message){
		if(actual.contains(expected)){
			reportPassedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			String successFilePath = elementScreenshot(by);
			reportSuccessScreenshot(successFilePath,message);
		}else{
			reportFailedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
		}
	}
	public int getProductTableRowsSize(){
		return getRowSize(TABLE_REWARD);
	}
}
