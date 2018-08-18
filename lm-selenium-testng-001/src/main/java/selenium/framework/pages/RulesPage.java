package selenium.framework.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import lm.rcx.pojo.Rules_Pojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.PageControls;

public class RulesPage  extends PageControls {

	/**
	 *  Description:This is programs page constructor. It holds all the element locators in programs page
	 * @param webDriver
	 */

	public RulesPage(WebDriver driver) {
		super(driver);

	}
	/* Rule folder hyper link */

	public  final By RULEFOLDER_HYPERLINK = By.xpath("//td[@id='programTable_1_8']");
	public  final By RULE_FOLDER_PUBLISH_BUTTON = By.linkText("//section[@id='widget-grid']/div/div[2]/lm-rules/div/div/div/h3/a[2]/span");
	public  final By NEWRULE_BUTTON = By.xpath("//a[@id='newRule']");
	public  final By RULE_NAME_INPUT = By.name("name");
	public  final By RULEDESCRIPTION_INPUT = By.name("desc");
	public  final By RULEEFFECTIVEFROM_INPUT = By.xpath("(//input[@type='text'])[1]");
	public  final By RULEEFFECTIVETO_INPUT = By.xpath("(//input[@type='text'])[2]");
	public  final By RULEPRIORITY = By.name("priority");
	public  final By OK_BUTTON = By.xpath("//button[@class='btn btn-primary ok_button']");
	public  final By CANCEL_BUTTON = By.xpath("//button[@class='btn btn-default cancel_button2']");
	//advanced search in Rules
	public  final By PAGE_LOADING = By.xpath("//div[@class='loading' and style='display: block;']");
	public  final By RULES_ADVANCED_SEARCH_BUTTON = By.xpath(".//*[@id='advanced-search-button']");
	public  final By RULESFOLDER_ADVANCED_SEARCH_BUTTON=By.xpath("(//*[@id='advanced-search-button'])[2]");
	public  final By SEARCH_RULENAME_INPUT = By.xpath("//input[@placeholder='Rule']");
	public final By SEARCH_RULEFOLDER_INPUT=By.xpath("//input[@placeholder='Rule Folder']");
	public final By SUGGESTIONS_CLICK=By.xpath("//li[@role='option']//a");
	public  final By SEARCH_RULEFOLDER_BUTTON = By.xpath("//div[@id='wid-id-ruleFoldersWiget']//*[@id='advanced-search-button']");
	public  final By SEARCH_DESCRIPTION_INPUT = By.xpath("//input[@placeholder='Description']");
	public  final By SEARCH_RULEPRIORITY_INPUT = By.name("//input[@placeholder='Priority']");
	public  final By EFFECTIVE_FROM_DATE_INPUT = By.xpath("//form[@id='advanced-search-dialog']/div/fieldset/div[2]/section[2]/label[2]/label/i");
	public  final By EFFECTIVE_TO_DATE_INPUT = By.xpath("//form[@id='advanced-search-dialog']/div/fieldset/div[3]/section/label[2]/label/i");
	public  final By SEARCH_REMOVE_BUTTON = By.id("advanced-search-remove-button");
	public  final By PRIORITY_ERROR_MESSAGE = By.xpath("//div[@class='alert alert-danger alert-block']");
	public  final By SETTINGS_NAME_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li[1]//label//input[@type='checkbox']");
	public  final By SETTINGS_ALL_COLUMNS_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li//input");
	public  final By RULE_TABLE_HEADER = By.xpath("//*[@id='ruleTable']//thead//tr//th");
	public  final By RULE_FOLDER_TABLE_HEADER=By.xpath("//*[@id='ruleFolderTable']//thead//tr//th");
	// field settings in Rules

	public  final By RULENAME_CHECKBOX = By.name("columns-name");
	public  final By RULE_EDIT_BUTTON = By.xpath("(//a[@tooltip='Update'])[1]");
	public  final By RULE_FOLDER_EDIT_BUTTON = By.xpath(".//*[@id='ruleFolderTable_1_1']/div/div/ng-include/a[1]");
	public  final By RULE_FOLDER_DELETE_BUTTON=By.xpath(".//*[@id='ruleFolderTable_1_1']/div/div/ng-include/a[4]");
	public  final By RULE_DELETE_BUTTON=By.xpath("(//a[@tooltip='Delete'])[1]");
	public  final By RULE_SHOW_DROPDOWN = By.name("ruleTable_length");
	public  final By RULE_DELETE_SUCCESSFUL_POP_UP = By.xpath(".//*[@class='toast-message']");
	public  final By FIELDSETTINGS_BUTTON = By.xpath("//*[@id='show-table-options']");
	public  final By FIELDSTTINGS_BUTTON_RULEFOLDER = By.xpath("//div[@id='ruleFolderTable_length']//*[@id='show-table-options']");
	// rule folder 
	public  final By RULEFOLDER_DELETE_SUCCESSFUL_POP_UP = By.xpath(".//*[@class='toast-message']");
	public  final By NEW_RULE_FOLDER_BUTTON = By.id("newRuleFolder");
	public  final By RULE_FOLDER_PROGRAM_INPUT = By.name("program");
	public  final By RULE_FOLDER_NAME_INPUT = By.name("name");
	public  final By RULE_FOLDER_DESCRIPTION_INPUT = By.name("desc");
	

	// Rule Folder show drop down
	public  final By VALIDATION_ERROR = By.xpath("//*[@class='alert alert-danger alert-block']");

	// Rule Folder Advanced search
	public  final By VALIDATE_RULE = By.xpath("//table[@id='ruleTable']//tbody//tr//td[3]");
	public  final By VALIDATE_RULE_FOLDER=By.xpath("//table[@id='ruleFolderTable']//tbody//tr//td[3]");
	// Rule Folder Field settings
	public  final By RULE_TABLE = By.xpath("//table[@id='ruleTable']/tbody/tr");
	public  final By RULE_FOLDER_TABLE = By.xpath("//table[@id='ruleFolderTable']/tbody/tr");
	public  final By RULEFOLDER_NAME_CHECKBOX = By.name("columns-name");
	public  final By SHOW_ENTITIES_DROPDOWN = By.name("ruleTable_length");
	public  final By SHOW_ENTITIES_DROPDOWN_RULEFOLDER=By.name("ruleFolderTable_length");
	public  final By RULE_DEL_YES_BUTTON = By.xpath("//*[@class='modal-footer']//button[1]");
	public  final By RULEFOLDER_TABLE_NAME_SORT_BUTTON=  By.id("ruleFolderTable_0_2");
	public final By DUPLICATE_RULENAME_VALIDATION= By.xpath(".//*[@class='toast-message']");
	public final By PROGRAM_NAME=By.xpath("//table[@id='programTable']//tbody//tr[1]//td[2]");
	


	public void clickOnRuleFolderHyperLink()
	{
		this.click(RULEFOLDER_HYPERLINK);
		waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnRuleFolderPublishButton()
	{
		this.click(RULE_FOLDER_PUBLISH_BUTTON);
	}
	public void clickOnNewRuleButton()
	{
		this.waitForPageToLoad(PAGE_LOADING);
		this.click(NEWRULE_BUTTON);
		reportInfo("Clicking On New Rule Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnNewRuleFolderButton()
	{
		this.scrollDown();
		this.click(NEW_RULE_FOLDER_BUTTON);
		reportInfo("Clicking On Add New Rule folder Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void enterRuleName(String testData){
		this.type(RULE_NAME_INPUT ,testData);
		reportInfo("Entering Rule Name. :"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void enterRuleFolderName(String testData){
		this.clear(RULE_FOLDER_NAME_INPUT);
		this.type(RULE_FOLDER_NAME_INPUT ,testData);
		reportInfo("Entering Rule Folder Name.:"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void enterRuleDescription(String testData){
		this.type(RULEDESCRIPTION_INPUT ,testData);
		reportInfo("Entering Description Input. :"+testData);
	}
	public void enterRuleFolderDescription(String testData){
		this.type(RULE_FOLDER_DESCRIPTION_INPUT ,testData);
		reportInfo("Entering Rule Folder Description Input. :"+testData);
	}
	public void enterRuleEffectiveFromInput(String testData)
	{
		this.clear(RULEEFFECTIVEFROM_INPUT);
		this.type(RULEEFFECTIVEFROM_INPUT , testData);
		reportInfo("Entering Effective From Date:"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void setRuleEffectiveFromInputDate(String testData)
	{
		this.clear(RULEEFFECTIVEFROM_INPUT);
		this.type(RULEEFFECTIVEFROM_INPUT , testData);
		reportInfo("Entering Effective From Date."+testData);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void setRuleEffectiveToInput(String testData)
	{
		this.clear(RULEEFFECTIVETO_INPUT);
		this.type(RULEEFFECTIVETO_INPUT , testData);
		reportInfo("Entering Effective To Date :"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void setRulePriorityInput(String testData)
	{
		this.clear(RULEPRIORITY);
		this.type(RULEPRIORITY ,testData);
		reportInfo("Entering Priority Input:"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void ruleOkButton()
	{
		this.click(OK_BUTTON);
		reportInfo("Clicking on Ok Button.");
		this.waitForPageToLoad(PAGE_LOADING);

	}
	public void rulenewOkButton()
	{
		this.click(OK_BUTTON);
		reportInfo("clicking on Ok Button");
		//this.waitForPageToLoad(PAGE_LOADING);

	}

	public void ruleCancelButton()
	{
		this.click(CANCEL_BUTTON);
		reportInfo("clicking on Cancel Button");
	}
	public void selectRuleShowDropDown(String testData)
	{
		this.click(RULE_SHOW_DROPDOWN);
		this.selectDropdown(RULE_SHOW_DROPDOWN, testData);

	}
	public void clickOnRuleSearchButton()
	{
		this.click(RULES_ADVANCED_SEARCH_BUTTON);
	}
	public void setSearchRuleNameInput()
	{
		this.type(SEARCH_RULENAME_INPUT , "");
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
		reportInfo("Clicking On Search Remove Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnNewFolderButton()
	{
		this.click(NEW_RULE_FOLDER_BUTTON);
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

	public void clickOnSearchButton(){
		this.waitForPageToLoad(PAGE_LOADING);
		this.click(RULES_ADVANCED_SEARCH_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on Search Button");
	}

	public void clickOnRulesFolderSearchButton(){
		this.click(RULESFOLDER_ADVANCED_SEARCH_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on Search button");
	}
	public void enterAdvancedSearch(String testData){
		this.clear(SEARCH_RULENAME_INPUT);
		this.type(SEARCH_RULENAME_INPUT , testData);
		reportInfo("Entered search input Rule Name :"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
		//this.click(SUGGESTIONS_CLICK);
		//this.waitForPageToLoad(PAGE_LOADING);
	}

	public void clickOnRuleFolderSearchButton(){
		this.click(SEARCH_RULEFOLDER_BUTTON);
		reportInfo("Clicking On Search Input.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void enterRuleFolderSearchInput(String testData){
		this.clear(SEARCH_RULEFOLDER_INPUT);
		this.type(SEARCH_RULEFOLDER_INPUT,testData);
		reportInfo("Entering Rule Name :"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
		this.click(SUGGESTIONS_CLICK);
		this.waitForPageToLoad(PAGE_LOADING);


	}
	public void AdvancedSearchDescriptionRuleFolder(String testData){
		this.clear(SEARCH_DESCRIPTION_INPUT);
		this.type(SEARCH_DESCRIPTION_INPUT,testData);
		this.waitForPageToLoad(PAGE_LOADING);
		this.type(SEARCH_DESCRIPTION_INPUT, Keys.TAB);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering  description :"+testData);
	}
	public void assertRuleName(String expected, String testType)
	{
		reportInfo("Validating Rule Name");
		try {
			if (this.getText(VALIDATE_RULE).equals(expected)) {
				Assert.assertEquals(this.getText(VALIDATE_RULE), expected);
				reportPassedStatus("Verified Rule Name");
				String successFilePath = elementScreenshot(VALIDATE_RULE);
				reportSuccessScreenshot(successFilePath,""); 
			} else {
				String successFilePath = elementScreenshot(VALIDATE_RULE);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}

	}
	public void assertRuleFolderName(String expected, String testType)
	{
		reportInfo("Validating RuleFolder Name");
		try {
			if (this.getText(VALIDATE_RULE_FOLDER).equals(expected)) {
				Assert.assertEquals(this.getText(VALIDATE_RULE_FOLDER), expected);
				reportPassedStatus("Verified Rule Name");
				String successFilePath = elementScreenshot(VALIDATE_RULE_FOLDER);
				reportSuccessScreenshot(successFilePath,""); 
			} else {
				String successFilePath = elementScreenshot(SHOW_ENTITIES_DROPDOWN_RULEFOLDER);
				reportSuccessScreenshot(successFilePath,""); 

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}

	}

	/**
	 * MethodName:createRule() 
	 * Description: This method is used to create Rule
	 */

	public HashMap<String,String> createRule() {
		HashMap<String,String> ruleValues = new HashMap<String,String>();
		Rules_Pojo pj=new Rules_Pojo();
		CommonMethods commonMethod=new CommonMethods();
		ruleValues.put("RuleName",pj.getRuleName());
		ruleValues.put("Description",pj.getDescription());
		clickOnNewRuleButton();
		enterRuleName(pj.getRuleName());
		enterRuleEffectiveFromInput(commonMethod.getCurrentDate());
		ruleOkButton();
		this.waitForPageToLoad(PAGE_LOADING);
		return ruleValues;
	}
	/**
	 * MethodName:createRuleFolder() 
	 * Description: This method is used to create Rule
	 */

	public HashMap<String,String> createRuleFolder() {
		HashMap<String,String> ruleValues = new HashMap<String,String>();
		Rules_Pojo pj=new Rules_Pojo();
		ruleValues.put("RuleFolderName",pj.getRuleName());
		ruleValues.put("Description",pj.getDescription());
		clickOnNewRuleFolderButton();
		enterRuleFolderName(pj.getRuleName());
		ruleOkButton();
		this.waitForPageToLoad(PAGE_LOADING);
		return ruleValues;
	}
	/**
	 * MethodName:  clickOnRuleEditActionButton()
	 * Description: This method is used to click On SegmentEditActionButton
	 */
	public void clickOnRuleEditActionButton(){

		this.click(RULE_EDIT_BUTTON);
		reportInfo("Clicking On rule Edit Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	/**
	 * MethodName:  clickOnRuleFolderEditActionButton()
	 * Description: This method is used to click On SegmentEditActionButton
	 */
	public void clickOnRuleFolderEditActionButton(){

		this.click(RULE_FOLDER_EDIT_BUTTON);
		reportInfo("Clicking On Edit Rule Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	/**
	 * MethodName:  clickOnDeleteActionButton()
	 * Description: This method is used to click On DeleteActionButton
	 */

	public void clickOnDeleteActionButton()
	{
		this.click(RULE_DELETE_BUTTON);
		reportInfo("Clicking On Delete Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	/**
	 * MethodName:  clickOnDeleteActionRuleFolderButton()
	 * Description: This method is used to click On DeleteActionButton
	 */

	public void clickOnDeleteActionRuleFolderButton()
	{
		this.click(RULE_FOLDER_DELETE_BUTTON);
		reportInfo("Clicking On Delete Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	/**
	 * MethodName:  clickOnDeleteYesButton()
	 * Description: This method is used to click On DeleteYesButton
	 */
	public void clickOnDeleteYesButton()
	{
		this.click(RULE_DEL_YES_BUTTON);
		reportInfo("Clicking On Delete yes Button");

	}

	/**
	 * MethodName:assertRuleDeletionPopUp()
	 * Description:This method is used to validate Delete Program Pop Up
	 * @param expected
	 * @param testType
	 */
	public void assertRuleDeletionPopUp(String expected, String testType) {
		reportInfo("Validating Segment Deletion.");
		try {
			if (this.getText(RULE_DELETE_SUCCESSFUL_POP_UP).equals(expected)) {
				Assert.assertEquals(this.getText(RULE_DELETE_SUCCESSFUL_POP_UP), expected);
				reportPassedStatus("Verified Segment Deletion");
				String successFilePath = elementScreenshot(RULE_DELETE_SUCCESSFUL_POP_UP);
				reportSuccessScreenshot(successFilePath,"");
			} else {
				String successFilePath = elementScreenshot(RULE_DELETE_SUCCESSFUL_POP_UP);
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
	 *  MethodName: selectDropdown() 
	 * Description:This method used to select the value in showEntities DropDown
	 * @param testData
	 */
	public String dropdownEntities() 
	{
		String testData=this.getFirstDropDownLabel(SHOW_ENTITIES_DROPDOWN);
		this.selectDropdown(SHOW_ENTITIES_DROPDOWN, testData);
		reportInfo("Clicking On Show Entities DropDown");
		return testData;
	}

	/**
	 *  MethodName: selectDropdownRuldeFolder() 
	 * Description:This method used to select the value in showEntities DropDown
	 * @param testData
	 */
	public String dropdownEntitiesRuleFolder() 
	{
		String testData=getFirstDropDownLabel(SHOW_ENTITIES_DROPDOWN_RULEFOLDER);
		this.selectDropdown(SHOW_ENTITIES_DROPDOWN_RULEFOLDER, testData);
		reportInfo("Clicking On Show Entities DropDown");
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}
	/**
	 * MethodName: verifyPagination() 
	 * Description: This method is used to Validate Pagination
	 */
	public void verifyPagination (int expected, String testType1) {
		reportInfo("Validating Pagination");
		try {
				List<WebElement> rows = getWebElementList(RULE_TABLE);
				int count = rows.size();
				if(count<=expected){
					reportPassedStatus("Verified Rule Pagination");
					String successFilePath = elementScreenshot(SHOW_ENTITIES_DROPDOWN);
					reportSuccessScreenshot(successFilePath,"");
				} else {
					String successFilePath = elementScreenshot(SHOW_ENTITIES_DROPDOWN);
					reportFailureScreenshot(successFilePath);

				}
			
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Pagination Assertion Failed");
		}
	}
	/**
	 * MethodName: verifyPaginationRuleFolder() 
	 * Description: This method is used to Validate Pagination
	 */
	public void verifyPaginationRuleFolder (int expected1, String testType1) {
		reportInfo("Validating Pagination");
		try {
				List<WebElement> rows = getWebElementList(RULE_FOLDER_TABLE);
				int count = rows.size();
				if(count<=expected1){
					reportPassedStatus("Verified Rule Pagination");
					String successFilePath = elementScreenshot(SHOW_ENTITIES_DROPDOWN_RULEFOLDER);
					reportSuccessScreenshot(successFilePath,"");
				} else {
					String successFilePath = elementScreenshot(SHOW_ENTITIES_DROPDOWN_RULEFOLDER);
					reportFailureScreenshot(successFilePath);

				}
			
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Pagination Assertion Failed");
		}
	}
	/**
	 * MethodName: clickOnFieldSettingsButton() 
	 * Description: This method is used to click on field settings button.
	 */
	public void clickOnFieldSettingsButton() {
		this.click(FIELDSETTINGS_BUTTON);
		reportInfo("Clicking On Field Settings Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	/**
	 * MethodName: clickOnFieldSettingsButtoninRulesFolder() 
	 * Description: This method is used to click on field settings button.
	 */
	public void clickOnFieldSettingsButtoninRulesFolder() {
		this.click(FIELDSTTINGS_BUTTON_RULEFOLDER);
		reportInfo("Clicking On Field Settings Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	/**
	 * MethodName: checkNameField() 
	 * Description: This method is used to check the name field in field settings
	 */
	public void checkRuleNameField() {

		this.check(RULENAME_CHECKBOX);
		reportInfo("Check Field Settings Name Checkbox");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	/**
	 * MethodName: checkNameField() 
	 * Description: This method is used to check the name field in field settings
	 */
	public void checkRuleFolderNameField() {

		this.check(RULEFOLDER_NAME_CHECKBOX);
		reportInfo("Check Field Settings Name Checkbox");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	/**
	 *MethodName: assertCheckedColumns() 
	 *Description: This method is used to validate visible columns in member table
	 */
	public void assertCheckedColumns(String testType) {
		reportInfo("Validating Member visible columns in member table");
		try {
				List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);

				System.out.println(checkBoxList.size());
				for(WebElement e:checkBoxList )
				{
					System.out.println(e.getText());
				}
				List<WebElement> segmentColumnList = getWebElementList(RULE_TABLE_HEADER);

				for(WebElement e1:segmentColumnList )
				{
					System.out.println(e1.getText());
				}
				System.out.println(segmentColumnList.size());
				if(checkBoxList.size()== (segmentColumnList.size())){
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
				}
			else {

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}
	/**
	 *MethodName: assertCheckedColumnsRuleFolder() 
	 *Description: This method is used to validate visible columns in member table
	 */
	public void assertCheckedColumnsRuleFolder(String testType) {
		reportInfo("Validating Member visible columns in member table");
		try {
				List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);

				System.out.println(checkBoxList.size());
				for(WebElement e:checkBoxList )
				{
					System.out.println(e.getText());
				}
				List<WebElement> segmentColumnList = getWebElementList(RULE_FOLDER_TABLE_HEADER);

				for(WebElement e1:segmentColumnList )
				{
					System.out.println(e1.getText());
				}
				System.out.println(segmentColumnList.size());
				if(checkBoxList.size()==(segmentColumnList.size())){
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
			
		}else{

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}
	/**
	 * MethodName: uncheckRuleNameField() 
	 * Description: This method is used to un check the name field in field settings
	 */
	public void uncheckRuleNameField() {
		System.out.println(this.getText(SETTINGS_NAME_CHECKBOX));
		this.uncheck(SETTINGS_NAME_CHECKBOX);
		String successFilePath = elementScreenshot(SETTINGS_NAME_CHECKBOX);
		reportSuccessScreenshot(successFilePath,"");
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
				List<WebElement> memberColumnList = getWebElementList(RULE_TABLE_HEADER);
				int count = 0;
				for (WebElement w : memberColumnList) {
					if (w.getText() == "Name") {
						count = count + 1;
					}
				}
				if(count==0){
					Assert.assertEquals(count, 0);
				}
			}
			 else {

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Test Case Failed");
		}
	}
	/**
	 *MethodName: assertUncheckedColumnsRuleFolder() 
	 *Description: This method is used to validate Invisible columns in member table
	 */
	public void assertUncheckedColumnsRuleFolder(String testType) {
		reportInfo("Validating Segment Invisible columns in member table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> memberColumnList = getWebElementList(RULE_FOLDER_TABLE_HEADER);
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
	 * clickOnRuleFolderSortButton() 
	 * Description: This method is used to click on Name Sort Button
	 */
	public void clickOnRuleFolderSortButton() {
		this.click(RULEFOLDER_TABLE_NAME_SORT_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On Sort By Name Button");
	}
	/**
	 * MethodName: sortingByRuleFolder()
	 * Description:This method checks member table is sorted by name or not
	 * @return boolean
	 */
	public boolean sortingByRuleFolder() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> RuleFolderTableNameColumn = getWebElementList(RULEFOLDER_TABLE_NAME_SORT_BUTTON);
		for (WebElement element : RuleFolderTableNameColumn) {
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
	public String getText(By by,String testData){
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
	public String selectShowEntitiesDropdown() {
		String testData=this.getFirstDropDownLabel(SHOW_ENTITIES_DROPDOWN);
		this.selectDropdown(SHOW_ENTITIES_DROPDOWN, testData);
		reportInfo("Clicking On Show Entities DropDown");
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}
	public String ruleFolderselectShowEntitiesDropdown() {
		String testData=this.getFirstDropDownLabel(SHOW_ENTITIES_DROPDOWN_RULEFOLDER);
		this.selectDropdown(SHOW_ENTITIES_DROPDOWN_RULEFOLDER, testData);
		reportInfo("Clicking On Show Entities DropDown");
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}
	public boolean validatePagination(int expected) {
		boolean flag=false;
			List<WebElement> rows = getWebElementList(RULE_TABLE);
			int count = rows.size();
			if(count<=expected){
				flag=true;
			}
		return flag;	
	}
	public boolean ruleFoldervalidatePagination(int expected) {
		boolean flag=false;
			List<WebElement> rows = getWebElementList(RULE_FOLDER_TABLE);
			int count = rows.size();
			if(count<=expected){
				flag=true;
			}
		return flag;	
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
	
	public int ruleTableColumns(By by){
		reportInfo("Fetching number of columns in table.");
		List<WebElement> ruleColumnList = getWebElementList(by);
		
		return ruleColumnList.size()-1;
	}
	public int ruleFolderTableColumns(By by){
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
	public List<String> expectedNameList(By by,String testData){ 
		List<String> list1 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(by); 
		for (WebElement element : memberTableNameColumn) { 
			list1.add(element.getText()); 
		} 
		Collections.sort(list1); 
		Collections.reverse(list1); 
		return list1; 
	}
	public boolean sortingByName() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(RULEFOLDER_TABLE_NAME_SORT_BUTTON);
		for (WebElement element : memberTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		Collections.sort(list2);
		Collections.reverse(list2);
		boolean sorted=list1.equals(list2);
		return sorted;
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
	public void assertObject(Object expected, Object actual, String message){
		if(expected.equals(actual)){
			reportPassedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");

		}else{
			reportFailedStatus("Expected [ "+expected+" ] ");
			reportFailedStatus(" Actual [ "+actual+" ]");

		}
	}
	public String get(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	public void pageReferesh(){ 
        driver.navigate().refresh(); 
        System.out.println("Refreshing Web Page."); 
        this.waitForPageToLoad(PAGE_LOADING); 
}
	
}
