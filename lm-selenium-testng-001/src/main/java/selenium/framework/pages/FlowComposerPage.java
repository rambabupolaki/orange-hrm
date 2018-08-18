package selenium.framework.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import selenium.framework.common.PageControls;

public class FlowComposerPage  extends PageControls {

	/**
	 *  Description:This is programs page constructor. It holds all the element locators in programs page
	 * @param webDriver
	 */

	public FlowComposerPage(WebDriver driver) {
		super(driver);
	}
	/* Rule folder hyper link */
	public  final By NEWRULE_BUTTON = By.xpath("//*[@id='newRule']");
	public  final By RULE_NAME_INPUT = By.name("name");
	public  final By RULEDESCRIPTION_INPUT = By.name("desc");
	public  final By RULEEFFECTIVEFROM_INPUT = By.xpath("(//input[@type='text'])[2]");
	public  final By RULEEFFECTIVETO_INPUT = By.xpath("(//input[@type='text'])[3]");
	public  final By RULEPRIORITY = By.name("priority");
	public  final By OK_BUTTON = By.xpath("//button[@class='btn btn-primary ok_button']");
	public  final By CANCEL_BUTTON = By.xpath("//button[@class='btn btn-default cancel_button2']");
	// rule folder 
	public  final By NEW_RULE_FOLDER_BUTTON = By.id("newRuleFolder");
	public  final By RULE_FOLDER_PROGRAM_INPUT = By.name("program");
	public  final By RULE_FOLDER_NAME_INPUT = By.name("name");
	public  final By RULE_FOLDER_DESCRIPTION_INPUT = By.name("desc");
	//advanced search in Rules
	public  final By PAGE_LOADING = By.xpath("//div[@class='loading' and style='display: block;']");
	//public  final By RULES_ADVANCED_SEARCH_BUTTON = By.id("id=advanced-search-button");
	public  final By RULES_ADVANCED_SEARCH_BUTTON = By.linkText("Search");
	public  final By SEARCH_BUTTON = By.xpath("//div[@id='ruleTable_length']/lm-advanced-search/a");
	public  final By SEARCH_RULENAME_INPUT = By.xpath("//input[@placeholder='Rule']");
	public  final By SEARCH_DESCRIPTION_INPUT = By.xpath("//input[@placeholder='Description']");
	public  final By SEARCH_RULEPRIORITY_INPUT = By.name("//input[@placeholder='Priority']");
	public  final By EFFECTIVE_FROM_DATE_INPUT = By.xpath("//form[@id='advanced-search-dialog']/div/fieldset/div[2]/section[2]/label[2]/label/i");
	public  final By EFFECTIVE_TO_DATE_INPUT = By.xpath("//form[@id='advanced-search-dialog']/div/fieldset/div[3]/section/label[2]/label/i");
	public  final By SEARCH_REMOVE_BUTTON = By.id("advanced-search-remove-button");
	public  final By PRIORITY_ERROR_MESSAGE = By.xpath("//div[@class='alert alert-danger alert-block']");
	public  final By VALIDATE_ADVANCED_SEARCH_RULENAME=By.xpath("//*[@id='ruleTable_1_2']");
	public  final By CLEAR_FLOW =By.xpath("//div[@id='content']/div/div/a[5]");
	public  final By VALIDATE_CLEAR_FLOW=By.xpath("//*[@id='wid-id-flowWidget']");
	public  final By VALIDATE_FLOW_ERROR=By.xpath("//*[@class='alert alert-warning ng-binding ng-scope']");
	public  final By DELETE_FLOWCONNECTION =By.cssSelector("#v-290");
	public  final By VALIDATE_FLOW =By.xpath("//*[@class='btn btn-sm btn-info pull-right']");
	public  final By VALIDATE_FLOW_SUCCESSFUL = By.xpath(".//*[@class='toast-message']");
	public  final By SAVE_FLOW =By.xpath("//*[@id='flowSave']");
	public  final By DEFAULT_FLOW =By.xpath("//*[@class='btn btn-sm btn-warning pull-right']//span");
	public  final By PUBLISH_FLOW =By.xpath("//*[@class='btn btn-success pull-right']");
	public  final By VALIDATE_DEFAULT_FLOW=By.xpath("//*[@id='wid-id-flowWidget']");

	public void clickOnNewRuleButton()
	{
		this.click(NEWRULE_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void enterRuleName(String testData){
		this.type(RULE_NAME_INPUT ,testData);
		reportInfo("Entering Rule Name Input.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void enterRuleDescription(String testData){
		this.type(RULEDESCRIPTION_INPUT ,testData);
		reportInfo("Entering Search Input.");
	}
	public void setRuleEffectiveFromInput(String testData)
	{
		this.type(RULEEFFECTIVEFROM_INPUT , testData);
		reportInfo("Entering Effectivefrom Input.");
	}
	public void setRuleEffectiveToInput(String testData)
	{
		this.type(RULEEFFECTIVETO_INPUT , testData);
		reportInfo("Entering EffectiveTo Input.");
	}
	public void setRulePriorityInput()
	{
		this.type(RULEPRIORITY , "0");
		this.type(RULEPRIORITY, Keys.ENTER);
	}
	public void deleteFlowOkButton()
	{
		this.click(OK_BUTTON);
		reportInfo("Clicking on OK Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void ruleCancelButton()
	{
		this.click(CANCEL_BUTTON);
	}
	public void clickOnRuleSearchButton()
	{
		this.click(SEARCH_BUTTON);
	}
	public void setSearchRuleNameInput(String testData)
	{
		this.type(SEARCH_RULENAME_INPUT , testData);
		reportInfo("Entering Search Rule Name Input.");
	}
	public void setSearchDescriptionInput()
	{
		this.type(SEARCH_DESCRIPTION_INPUT , "");
	}
	public void setSearchEffectiveFromInput()
	{
		this.type(EFFECTIVE_FROM_DATE_INPUT , "");
	}
	public void setSearchRulePriorityInput()
	{
		this.type(SEARCH_RULEPRIORITY_INPUT , "");
	}
	public void setSearchEffectiveToInput()
	{
		this.type(EFFECTIVE_TO_DATE_INPUT , "");
	}
	public void setSearchPriorityError()
	{
		this.elementHighlighter(PRIORITY_ERROR_MESSAGE);
		this.elementScreenshot(PRIORITY_ERROR_MESSAGE);
	}
	public void clickSearchRemoveButton()
	{
		this.click(SEARCH_REMOVE_BUTTON);
	}
	public void clearFlowButton()
	{
		this.click(CLEAR_FLOW);
		reportInfo("Clicking On Clear Flow Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void validateFlowButton()
	{
		this.click(VALIDATE_FLOW);
		reportInfo("Clicking On Validate Flow Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void saveFlowButton()
	{
		this.click(SAVE_FLOW);
		reportInfo("Clicking On SaveFlow Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void defaultFlowButton()
	{
		this.click(DEFAULT_FLOW);
		this.click(DEFAULT_FLOW);
		reportInfo("Clicking On Default Flow Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void publishFlowButton()
	{
		this.waitForPageToLoad(PAGE_LOADING);
		this.click(PUBLISH_FLOW);
		reportInfo("Clicking On Publish Flow Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public String getText(By by ,String testData){
		reportInfo(testData);
		return this.getText(by);
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
	
	public void clickOnNewFolderButton()
	{
		this.click(NEW_RULE_FOLDER_BUTTON);
		reportInfo("Clicking On New Rule Folder Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void DeleteFlowConnection()
	{
		this.click(DELETE_FLOWCONNECTION);
		reportInfo("Clicking On Default Flow Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void setRuleFolderProgramInput()
	{
		this.type(RULE_FOLDER_PROGRAM_INPUT , "");
	}
	public void setRuleFolderNameInput()
	{
		this.type(RULE_FOLDER_NAME_INPUT , "");
	}

	public void setRuleFolderDescriptionInput()
	{
		this.type( RULE_FOLDER_DESCRIPTION_INPUT , "");
	}
	public void clickOn_Search_Button(){
		this.click(RULES_ADVANCED_SEARCH_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on Searchbutton");
	}
	public void enterAdvancedSearch(String testData){
		this.clear(SEARCH_RULENAME_INPUT );
		this.type(SEARCH_RULENAME_INPUT , testData);
		this.waitForPageToLoad(PAGE_LOADING);
		List<WebElement> lst = driver.findElements(By.xpath("//label[@class='input']//ul[1]"));
		lst.get(0).click();
		this.type(SEARCH_RULENAME_INPUT,Keys.ENTER);
		reportInfo("Entering  Rule Name :"+testData);
	}
	public void assertAdvancedSearchRuleName(String expected, String testType)
	{
		reportInfo("Validating partners Name");
		try {
			if (this.getText(VALIDATE_ADVANCED_SEARCH_RULENAME).equals(expected)) {
				Assert.assertEquals(this.getText(VALIDATE_ADVANCED_SEARCH_RULENAME), expected);
				reportPassedStatus("Verified pursepolicies Name");
				String successFilePath = elementScreenshot(VALIDATE_ADVANCED_SEARCH_RULENAME);
				reportSuccessScreenshot(successFilePath,""); 
			} else{
				String successFilePath = elementScreenshot(VALIDATE_ADVANCED_SEARCH_RULENAME);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}

	}
	public void validationClearFlow(String testType) {
		/* this.waitForPageToLoad(PAGE_LOADING); */
		reportInfo("Validating the ClearFlow");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(VALIDATE_CLEAR_FLOW);
				reportSuccessScreenshot(successFilePath,"Clear Flow Screenshot");
				
			} else {
				String successFilePath = elementScreenshot(VALIDATE_CLEAR_FLOW);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Test Case Failed");
		}

	}
	public void validateFlowError() {
		reportInfo("Validating the ValidateFlowError");
				String successFilePath = elementScreenshot(VALIDATE_FLOW_ERROR);
				reportSuccessScreenshot(successFilePath,"");
				reportPassedStatus("Validate the Flow");
	}
	public void validationDefaultFlow(String testType) {
		/* this.waitForPageToLoad(PAGE_LOADING); */
		reportInfo("Validating the DefaultFlow");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(VALIDATE_DEFAULT_FLOW);
				reportSuccessScreenshot(successFilePath,"Validate Default Flow.");
			} else {
				String successFilePath = elementScreenshot(VALIDATE_DEFAULT_FLOW);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Test Case Failed");
		}

	}
	public void assertValidateFlowPopup(String expected, String testType) {
		reportInfo("Validating Flow");
		try {
			if (this.getText(VALIDATE_FLOW_SUCCESSFUL).equals(expected)) {
				Assert.assertEquals(this.getText(VALIDATE_FLOW_SUCCESSFUL), expected);
				reportPassedStatus("Verified Flow");
				String successFilePath = elementScreenshot(VALIDATE_FLOW_SUCCESSFUL);
				reportSuccessScreenshot(successFilePath,"");
			} else {
				String successFilePath = elementScreenshot(VALIDATE_FLOW_SUCCESSFUL);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}
	public void assertSaveFlowPopup(String expected, String testType) {
		reportInfo("Validating Flow");
		try {
			if (this.getText(VALIDATE_FLOW_SUCCESSFUL).equals(expected)) {
				Assert.assertEquals(this.getText(VALIDATE_FLOW_SUCCESSFUL), expected);
				reportPassedStatus("Verified Flow");
				String successFilePath = elementScreenshot(VALIDATE_FLOW_SUCCESSFUL);
				reportSuccessScreenshot(successFilePath,"");
			} else {
				String successFilePath = elementScreenshot(VALIDATE_FLOW_SUCCESSFUL);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}
	public void assertValidatePublishFlowPopup(String expected, String testType) {
		reportInfo("Validating Flow");
		try {
			if (getText(VALIDATE_FLOW_SUCCESSFUL).equals(expected)) {
				Assert.assertEquals(this.getText(VALIDATE_FLOW_SUCCESSFUL), expected);
				reportPassedStatus("Verified Flow");
				String successFilePath = elementScreenshot(VALIDATE_FLOW_SUCCESSFUL);
				reportSuccessScreenshot(successFilePath,"");
			} else {
				String successFilePath = elementScreenshot(VALIDATE_FLOW_SUCCESSFUL);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}
}

