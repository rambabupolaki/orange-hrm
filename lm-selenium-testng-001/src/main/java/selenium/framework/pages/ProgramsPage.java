package selenium.framework.pages;
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

import lm.rcx.pojo.ProgramsPojo;
import selenium.framework.common.PageControls;

public class ProgramsPage extends PageControls {



	public  final By PROGRAM_LINK = By.xpath("//span[@id='programs']");
	public  final By PROGRAMS_EXPAND_BUTTON = By.xpath("//b[@id='programMenu']/em");
	public  final By PROGRAMS_TABLE = By.xpath("//table[@id='programTable']/tbody/tr");
	/* adding a program */

	public  final By ADD_PROGRAM_BUTTON = By.xpath("//a[@id='addProgramButton']");
	public  final By PROGRAM_NAME_INPUT = By.name("name");
	public  final By INVALID_FORMAt_ERROR = By.xpath("//em[@class='invalid ng-binding ng-scope']");
	public  final By VALIDATION_ERROR = By.xpath("//div[@class='alert alert-danger alert-block']");
	public  final By DESCRIPTION_INPUT = By.name("desc");
	public  final By OK_BUTTON = By.xpath("//button[@class='btn btn-primary ok_button']");
	public  final By CANCEL_BUTTON = By.xpath("//button[@class='btn btn-default cancel_button2']");
	public  final By IMPORT_BUTTON = By.id("import-program-button");
	public  final By PAGE_LOADING = By.xpath("//div[@class='loading' and style='display: block;']");
	public  final By VERIFY_PROGRAM_NAME = By.xpath("//*[@id='programTable']//tr[1]//td[2]");
	/* Importing a program*/

	public  final By IMPORT_PROGRAM_NAME_INPUT = By.id("program-import-name");
	public  final By IMPORT_DATA_INPUT = By.name("file");
	public  final By PUBLISH_PROGRAM_RADIOBUTTON = By.xpath("//label[@class='onoffswitch-title label']");
	public  final By IMPORT_OK_BUTTON = By.xpath("//button[@id='submit-import-file-button']");
	public  final By IMPORT_CANCEL_BUTTON = By.xpath("//button[@id='cancel-import-dialog-button']");

	public  final By PROGRAMS_COLLAPSE_BUTTON = By.xpath("//a[@class='button-icon jarviswidget-toggle-btn']");
	public  final By PROGRAMS_SHOW_DROPDOWN = By.name("programTable_length");
	public  final By PROGRAMS_SEARCH_BUTTON = By.xpath(".//*[@id='advanced-search-button']");
	public final By PROGRAM_NAME_SEARCH_INPUT=By.xpath("//input[@type='text']");
	public  final By SUGGESTION_INPUT=By.xpath("//label/ul/li/a");
	public final By SEARCH_INPUT=By.xpath(".//*[@id='programTable_filter']/label/input");

	/*field settings*/

	public  final By COLUMNVISIBLE_BUTTON = By.xpath("//div[@id='programTable_wrapper']/div/button");
	public  final By FIELD_SETTINGS_BUTTON = By.xpath("//button[@class='ColVis_Button ColVis_MasterButton']");
	public  final By COLUMNVISIBLE_CHECKBOX_LIST = By.xpath("//*[@class='ColVis_collection']//li//input");
	public  final By PROGRAM_TABLE_HEADER = By.xpath("//*[@id='programTable']//thead//tr//th");
	public  final By SETTINGS_FIELD_CHECKBOX = By.xpath("//*[@class='ColVis_collection']//li[1]//input");

	/* programs actions button*/

	public  final By PROGRAMS_EDIT_BUTTON = By.xpath("(//a[@class='ios ng-scope'])[1]");
	public  final By PROGRAMS_OPTIONS_BUTTON = By.xpath("(//a[@class='ios ng-scope'])[3]");
	public  final By PROGRAMS_AUTOENROLL_BUTTON = By.xpath("(//label[@class='onoffswitch-label'])[2]");
	public  final By PROGRAMS_ENROLLMENTBONUS_BUTTON = By.xpath("(//label[@class='onoffswitch-label'])[1]");
	public  final By AUTOENROLL_CLASS_NAME=By.xpath("(//span[@class='onoffswitch']//input)[2]");
	public  final By PRIMARY_PURSE_POLICY_DROPDOWN = By.name("primaryPursePolicy");
	public  final By PRIMARY_TIER_POLICY_DROPDOWN = By.name("primaryTierPolicy");	
	public  final By PROGRAMS_AUTOENROLL_RADIOBUTTON = By.xpath("//*[@id='programTable']//tr[1]//td[1]//a[4]");
	public  final By PROGRAMS_DELETE_BUTTON = By.xpath("(//a[@class='ios ng-scope'])[2]");
	public  final By PROGRAMS_DELETE_YES_BUTTON = By.xpath("//*[@class='modal-footer']//button[1]");
	public  final By PROGRAMS_DELETE_SUCCESSFUL_POP_UP = By.xpath(".//	*[@class='toast-message']");
	public  final By PROGRAM_EXPORT_BUTTON = By.xpath("//*[@id='programTable_1_1']/div/div/ng-include/a[3]");
	public  final By PROGRAM_PUBLISH_BUTTON = By.xpath("//*[@id='programTable_1_1']/div/div/ng-include/button");
	public  final By DUPLICATE_PROGRAM_VALIDATION_ERROR = By.xpath("//*[@class='alert alert-danger alert-block']");

	/* Auto enrolling a member */

	public  final By AUTOENROLL_BUTTON = By.xpath("//td[@id='programTable_1_5']");
	public  final By AUTOENROLL_RADIOBUTTON = By.xpath("//span[@class='onoffswitch-switch']");
	public  final By AUTOENROLL_PRIMARYPURSEPOLICY_INPUT = By.xpath("//select[@name='primaryPursePolicy']");
	public  final By AUTOENROLL_PRIMARYTIERPOLICY_INPUT = By.xpath("//select[@name='primaryTierPolicy']");

	/* Rule folder hyper link */

	public  final By RULEFOLDER_HYPERLINK = By.xpath("//table[@id='programTable']//tbody//tr[1]//td[7]");
	public  final By RULE_FOLDER_PUBLISH_BUTTON = By.linkText("//section[@id='widget-grid']/div/div[2]/lm-rules/div/div/div/h3/a[2]/span");
	public  final By NEWRULE_BUTTON = By.xpath("//a[@id='newRule']/i");
	public  final By RULE_NAME_INPUT = By.name("name");
	public  final By RULEDESCRIPTION_INPUT = By.name("desc");
	public  final By RULEEFFECTIVEFROM_INPUT = By.xpath("(//input[@type='text'])[2]");
	public  final By RULEEFFECTIVETO_INPUT = By.xpath("(//input[@type='text'])[3]");
	public  final By RULEPRIORITY = By.name("priority");
	public  final By HYPERLINK_SCREENSHOT = By.xpath(".//*[@id='ribbon']/ol");

	//advanced search in Rules

	//public  final By RULES_ADVANCED_SEARCH_BUTTON = By.id("id=advanced-search-button");
	public  final By RULES_ADVANCED_SEARCH_BUTTON = By.cssSelector("#advanced-search-button > span");
	public  final By SEARCH_RULENAME_INPUT = By.xpath("//input[@placeholder='Rule']");
	public  final By SEARCH_DESCRIPTION_INPUT = By.xpath("//input[@placeholder='Description']");
	public  final By SEARCH_RULEPRIORITY_INPUT = By.name("//input[@placeholder='Priority']");
	public  final By EFFECTIVE_FROM_DATE_INPUT = By.xpath("//form[@id='advanced-search-dialog']/div/fieldset/div[2]/section[2]/label[2]/label/i");
	public  final By EFFECTIVE_TO_DATE_INPUT = By.xpath("//form[@id='advanced-search-dialog']/div/fieldset/div[3]/section/label[2]/label/i");
	public  final By SEARCH_REMOVE_BUTTON = By.id("advanced-search-remove-button");
	public  final By PRIORITY_ERROR_MESSAGE = By.xpath("//div[@class='alert alert-danger alert-block']");

	// field settings in Rules

	//public  final By SHOW_TABLE_OPTIONS_BUTTON = By.id("show-table-options");
	public  final By RULE_SHOW_TABLE_OPTIONS_BUTTON = By.cssSelector("i.fa.fa-gear");
	public  final By RULENAME_CHECKBOX = By.name("columns-name");
	public  final By RULE_DESCRIPTION_CHECKBOX = By.name("columns-desc");
	public  final By RULE_PRIORITY_CHECKBOX = By.name("columns-priority");
	public  final By RULE_EFFECTIVE_FROM_CHECKBOX = By.name("columns-effectiveFrom");
	public  final By RULE_EFFECTIVE_TO_CHECKBOX = By.name("columns-effectiveTo");
	public  final By RULE_CREATED_BY_CHECKBOX = By.name("columns-createdBy");
	public  final By RULE_CREATED_AT_CHECKBOX = By.name("columns-createdAt");
	public  final By RULE_UPDATED_BY = By.name("columns-updatedBy");
	public  final By RULE_UPDATED_AT = By.name("columns-updatedAt");

	//Rule show drop down

	public  final By RULE_SHOW_DROPDOWN = By.name("ruleTable_length");


	// rule folder 

	public  final By NEW_RULE_FOLDER_BUTTON = By.id("newRuleFolder");
	public  final By RULE_FOLDER_PROGRAM_INPUT = By.name("program");
	public  final By RULE_FOLDER_NAME_INPUT = By.name("name");
	public  final By RULE_FOLDER_DESCRIPTION_INPUT = By.name("desc");

	// Rule Folder show drop down

	public  final By RULE_FOLDER_SHOW_DROPDOWN = By.name("ruleFolderTable_length");

	// Rule Folder Advanced search

	public  final By RULE_FOLDER_ADVANCEDSEARCH = By.cssSelector("#ruleFolderTable_length > lm-advanced-search.ng-scope.ng-isolate-scope > #advanced-search-button");
	public  final By SEARCH_RULEFOLDER_INPUT = By.xpath("//input[@placeholder='Rule Folder']");
	public  final By SEARCH_RULE_FOLDER_DESCRIPTION_INPUT = By.xpath("//input[@placeholder='Description']");
	public  final By RULEFOLDER_SEARCH_REMOVE_BUTTON = By.id("advanced-search-remove-button");

	// Rule Folder Field settings

	public  final By RULEFOLDER_SHOW_OPTIONS_BUTTON = By.cssSelector("#ruleFolderTable_length > div.ng-scope > #show-table-options > i.fa.fa-gear");
	public  final By RULEFOLDER_FOLDER_CHECKBOX = By.className("columns-foldersCount");
	public  final By RULEFOLDER_RULES_CHECKBOX = By.className("columns-rulesCount");
	public  final By RULEFOLDER_NAME_CHECKBOX = By.name("columns-name");
	public  final By RULEFOLDER_DESCRIPTION_CHECKBOX = By.name("columns-desc");
	public  final By RULEFOLDER_CREATED_BY_CHECKBOX = By.name("columns-createdBy");
	public  final By RULEFOLDER_CREATED_AT_CHECKBOX = By.name("columns-createdAt");
	public  final By RULEFOLDER_UPDATED_BY = By.name("columns-updatedBy");
	public  final By RULEFOLDER_UPDATED_AT = By.name("columns-updatedAt");

	// dailog box close botton

	public  final By CLOSE_BUTTON = By.className("close");


	/* flow composer */

	public  final By FLOW_HYPERLINK = By.xpath("//table[@id='programTable']//tbody//tr//td[8]");
	public  final By ADDBLOCK_BUTTON = By.xpath("//div[@id='content']/div/div/a[6]/span[2]");
	public  final By UNUSED_CHECKBOX = By.id("unUsedOnly");
	public  final By SEARCHRULE_INPUT = By.id("serachRuleTextConrol");
	public  final By PROGRAM_MENU_BUTTON = By.xpath("(//b[@id='programMenu'])[2]");
	public  final By VALIDATEFLOW_BUTTON = By.xpath("//div[@id='content']/div/div/a[4]/span[2]");
	public  final By VALIDFLOW_NOCONNECTIONS_ERROR = By.xpath("//div[@id='content']/div[2]");
	public  final By DEFUALTFLOW_BUTTON = By.xpath("//div[@id='content']/div/div/a[2]/span[2]");
	public  final By CLEARFLOW_BUTTON = By.xpath("//div[@id='content']/div/div/a[5]/span[2]");
	public  final By SAVEFLOW_BUTTON = By.xpath("//a[@id='flowSave']/span[2]");
	public  final By FLOW_PUBLISH_BUTTON = By.xpath("//div[@id='content']/div[1]/div/a[1]/span");

	/* Sorting */

	public  final By LOYALTYPROGRAM_SORTING = By.xpath("//table[@id='programTable']//thead//th[2]");
	public  final By DESCRIPTION_SORTING = By.xpath("//th[@id='programTable_0_3']");
	public  final By VER_SORTING = By.xpath("//th[@id='programTable_0_6']");
	public  final By LASTPUBLISHEDDATE_SORTING = By.xpath("//th[@id='programTable_0_7']");
	public  final By CREATEDAT_SORTING = By.xpath("//th[@id='programTable_0_11']");
	public  final By UPDATEDAT_SORTING = By.xpath("//th[@id='programTable_0_13']");
	//public  final By CREATEDBY_SORTING = By.xpath("//th[@id='programTable_0_10']");
	//public  final By UPDATEDBY_SORTING = By.xpath("//th[@id='programTable_0_12']");
	public  final By PROGRAM_TABLE_NAME_COLUMN = By.xpath("//*[@id='programTable']//tbody//tr//td[2]");
	/* pagination */

	public  final By PROGRAMS_PREVIOUS_BUTTON = By.xpath("//li[@id='programTable_previous']");
	public  final By PROGRAMS_NEXT_BUTTON = By.xpath("//li[@id='programTable_next']");
	public  final By PROGRAM_TABLE_LENGTH = By.xpath("//table[@id='programTable']//tbody//tr");
	public  final By PROGRAM_RULE_FOLDER = By.xpath("//table[@id='programTable']//tbody//tr[1]//td[7]");
	public  final By VALIDATE_PROGRAMS = By.xpath("//table[@id='programTable']//tbody//tr//td[2]");
	public final By DUPLICATE_ERROR=By.xpath(".//*[@class='toast-message']");
	public final By PROGRAM_NAME=By.xpath("//table[@id='programTable']//tbody//tr[1]//td[2]");
	/**
	 *  Description:This is programs page constructor. It holds all the element locators in programs page
	 * @param webDriver
	 */

	public ProgramsPage(WebDriver driver) {
		super(driver);

	}
	public void clickOnRuleFolder(){
		/*List<WebElement> programTable = getWebElementList(PROGRAM_TABLE_LENGTH);
		if(programTable.size()==0){
			addProgram();
		}*/
		this.click(PROGRAM_RULE_FOLDER);
		reportInfo("Clicking On Rule Folder Link");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public PoliciesPage navigateToPolicies(){
		String tmp = getCurrentUrl();
		String tmp1 = tmp.substring(0, tmp.lastIndexOf("/rules"));
		driver.navigate().to(tmp1+"/policies");
		System.out.println("Redirecting to policies page.");
		waitForPageToLoad(PAGE_LOADING);
		return new PoliciesPage(driver);

	}
	public RulesPage clickOnRulesFolderLink(){
		this.click(RULEFOLDER_HYPERLINK);
		waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on RuleFolder Link.");
		
		return new RulesPage(this.driver);
	}
	/**
	 * MethodName:clickOnAddLoyaltyProgramButton() 
	 * Description: This method is used to click on Add Loyalty Program button
	 */
	public void clickOnAddLoyaltyProgramButton()
	{
		this.click(ADD_PROGRAM_BUTTON);
		waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on Add Program Button.");
	}
	/**
	 * MethodName: enterLoyaltyProgramNameInput()
	 * Description: This method used to enter Program Name
	 * @param programName
	 */
	public void enterLoyaltyProgramNameInput(String programName)
	{
		this.clear(PROGRAM_NAME_INPUT);
		this.type(PROGRAM_NAME_INPUT , programName );
		reportInfo("Entering Program Name. :"+programName );
		this.waitForPageToLoad(PAGE_LOADING);
	}
	/**
	 * MethodName: enterProgramDescriptionInput()
	 * Description: This method used to enter Program description
	 * @param description
	 */
	public void enterProgramDescriptionInput(String description)
	{
		this.clear(DESCRIPTION_INPUT);
		this.type(DESCRIPTION_INPUT , description);
		reportInfo("Entering Program Description. :"+description );
	}
	public void clickOnOkButton(){
		this.click(OK_BUTTON);
		reportInfo("Clicking On OK button." );
		waitForPageToLoad(PAGE_LOADING);
	}
	/**
	 * MethodName:clickOnOkButton() 
	 * Description: This method is used to click on Add Program OK button
	 */
	public int clickOnAutoEnrollOkButton()
	{
		int count=0;
		WebElement ele=driver.findElement(CANCEL_BUTTON);
		this.click(OK_BUTTON);
		reportInfo("Clicking On OK button." );
		waitForPageToLoad(PAGE_LOADING);
		if(ele.isDisplayed()){
			this.click(CANCEL_BUTTON);
			reportInfo("Auto enroll is already enabled on a different program.");
			count=count+1;
		}
		return count;

	}
	public void clickOnNewOkButton()
	{
		this.click(OK_BUTTON);
		reportInfo("Clicking On Add Program OK button." );
		//waitForPageToLoad(PAGE_LOADING);
	}
	/**
	 * MethodName:clickOnCancelButton() 
	 * Description: This method is used to click on Add Program Cancel button
	 */
	public void clickOnCancelButton()
	{
		this.click(CANCEL_BUTTON);
		reportInfo("Clicking On Cancel button." );
	}
	/**
	 * MethodName: programsSearchInput()
	 * Description: This method is used to enter search input in search field
	 * @param testData
	 */
	
	public void enterSearchInput(String testData){
		this.clear(SEARCH_INPUT);
		this.type(SEARCH_INPUT, testData);
		reportInfo("Entering SearchInput:"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	
	public void clickOnProgramsSearchButton()
	{
		this.click(PROGRAMS_SEARCH_BUTTON);
		reportInfo("Clicking On Search Button.");
		waitForPageToLoad(PAGE_LOADING);
	}
	public void enterProgramNameSearchInput(String testData){
		this.clear(PROGRAM_NAME_SEARCH_INPUT);
		this.type(PROGRAM_NAME_SEARCH_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		//reportInfo("Entering Search Input :"+testData);
		this.click(SUGGESTION_INPUT);
		reportInfo("Entering Search Input :"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	
	/**
	 * MethodName:clickOnProgramEditActionButton() 
	 * Description: This method is used to click on Edit Program button
	 */
	public void clickOnProgramEditActionButton()
	{
		this.click(PROGRAMS_EDIT_BUTTON);
		reportInfo("Clicking On Program Edit Button");
		this.waitForPageToLoad(PAGE_LOADING);

	}
	public void clickOnProgramOptionsButton()
	{
		this.click(PROGRAMS_OPTIONS_BUTTON);
		reportInfo("Clicking On Options Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void getAttributeValue(By by){
		WebElement ele=driver.findElement(AUTOENROLL_CLASS_NAME);
		if(ele.getAttribute("class").contains("ng-not-empty")){
			reportInfo("Auto Enroll ia enable to this program.");
		}
		else{
			reportInfo("Auto enroll is already enabled on a different program.");
		}
	}
	public void clickOnAutoEnrollButton()
	{
		this.click(PROGRAMS_AUTOENROLL_BUTTON);
		reportInfo("Enable Auto Enroll Button");
		this.waitForPageToLoad(PAGE_LOADING);

	}
	public void clickOnEnrollmentBonusButton()
	{
		this.click(PROGRAMS_ENROLLMENTBONUS_BUTTON);
		reportInfo("Enable Enrollment Bonus Button");
		this.waitForPageToLoad(PAGE_LOADING);

	}
	public String selectPrimaryPursePolicy(){
		String testData=this.getFirstDropDownLabel(PRIMARY_PURSE_POLICY_DROPDOWN);
		this.selectDropdown(PRIMARY_PURSE_POLICY_DROPDOWN, testData);
		reportInfo("Selecting Primary Purse Policy :"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}
	public String selectPrimaryTierPolicy(){
		String testData=this.getFirstDropDownLabel(PRIMARY_TIER_POLICY_DROPDOWN);
		this.selectDropdown(PRIMARY_TIER_POLICY_DROPDOWN, testData);
		reportInfo("Selecting Primary Tier Policy :"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}
	public void clickOnProgramAutoEnrollRadioButton()
	{
		this.click(PROGRAMS_AUTOENROLL_RADIOBUTTON);
		reportInfo("Clicking On Auto Enroll Radio Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	/**
	 * MethodName:clickOnProgramDeleteActionButton() 
	 * Description: This method is used to click on Delete Program button
	 */
	public void clickOnProgramDeleteActionButton()
	{
		this.click(PROGRAMS_DELETE_BUTTON);
		reportInfo("Clicking On Delete Program Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	/**
	 *  MethodName:clickOnDeleteYesButton() 
	 * Description: This method is used to click on Delete Program Yes button to conform the deletion
	 */
	public void clickOnDeleteYesButton(){
		this.click(PROGRAMS_DELETE_YES_BUTTON);
	}
	/**
	 * MethodName:assertProgramName()
	 * Description:This method is used to assert program name
	 * @param expected
	 * @param testType
	 */
	public void assertProgramName(String expected, String testType) {
		reportInfo("Validating Program Name.");
		try {
			if (this.getText(VERIFY_PROGRAM_NAME).equals(expected)) {
				Assert.assertEquals(this.getText(VERIFY_PROGRAM_NAME), expected);
				reportPassedStatus("Verified Program Name");
				String successFilePath = elementScreenshot(VERIFY_PROGRAM_NAME);
				reportSuccessScreenshot(successFilePath,"");
			} else {
				String successFilePath = elementScreenshot(VERIFY_PROGRAM_NAME);
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
	 * MethodName:assertProgramDeletionPopUp()
	 * Description:This method is used to validate Delete Program Pop Up
	 * @param expected
	 * @param testType
	 */
	public void assertProgramDeletionPopUp(String expected, String testType) {
		reportInfo("Validating Program Deletion.");
		try {
			if (this.getText(PROGRAMS_DELETE_SUCCESSFUL_POP_UP).equals(expected)) {
				Assert.assertEquals(this.getText(PROGRAMS_DELETE_SUCCESSFUL_POP_UP), expected);
				reportPassedStatus("Verified Program Deletion");
				String successFilePath = elementScreenshot(PROGRAMS_DELETE_SUCCESSFUL_POP_UP);
				reportSuccessScreenshot(successFilePath,"");
			} else {
				String successFilePath = elementScreenshot(PROGRAMS_DELETE_SUCCESSFUL_POP_UP);
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
	 * MethodName: clickOnImportButton() 
	 * Description: This method is used to click on Program Import button
	 */
	public void clickOnImportButton()
	{
		this.click(IMPORT_BUTTON);
		reportInfo("Clicking On import Program Button." );
	}
	/**
	 *MethodName: enterImportProgramNameInput()
	 * Description: This method used to enter Program Name while import
	 * @param programName
	 */
	public void enterImportProgramNameInput(String testData)
	{
		this.clear(IMPORT_PROGRAM_NAME_INPUT);
		this.type(IMPORT_PROGRAM_NAME_INPUT, testData);
		reportInfo("Entering Program Name While Import:"+testData);

	}
	/**
	 * MethodName: clickOnImportDataBrowseButton() 
	 * Description: This method is used to click on Import Data Input button
	 */
	public void clickOnImportDataBrowseButton()
	{
		this.click(IMPORT_DATA_INPUT);
		reportInfo("Clicking On Import Data Input Button.");
	}
	/**
	 * MethodName: clickOnPublicProgramAfterImportRadioButton() 
	 * Description: This method is used to click on Program After Import Radio Button
	 */
	public void clickOnPublicProgramAfterImportRadioButton()
	{
		this.click(PUBLISH_PROGRAM_RADIOBUTTON);
		reportInfo("Clicking On Publish Program After Import Button.");
	}
	/**
	 * MethodName: clickOnImportOkButton() 
	 * Description: This method is used to click on Import OK button
	 */
	public void clickOnImportOkButton()
	{
		this.click(IMPORT_OK_BUTTON);
		reportInfo("Clicking On Import OK Button.");

	}
	/**
	 * MethodName: clickOnImportCancelButton() 
	 * Description: This method is used to click on Import Cancel button
	 */
	public void clickOnImportCancelButton()
	{
		this.click(IMPORT_CANCEL_BUTTON);
		reportInfo("Clicking On Import Cancel Button.");
	}
	/**
	 * MethodName: dailogBoxCloseButton()
	 * Description: This method is used to close the dialog box
	 */
	public void dailogBoxCloseButton()
	{
		this.click(CLOSE_BUTTON);
	}
	/**
	 * MethodName: clickProgramsCollapseButton()
	 * Description: This method is used to click on collapse button.
	 */
	public void clickProgramsCollapseButton()
	{
		this.click(PROGRAMS_COLLAPSE_BUTTON);
	}
	/**
	 * MethodName: selectProgramsShowDropDownInput()
	 * Description: This method is used to select the number in show entities drop down.
	 * @param testData
	 */
	public String selectProgramsShowDropDownInput()
	{
		String testData=this.getFirstDropDownLabel(PROGRAMS_SHOW_DROPDOWN);
		this.click(PROGRAMS_SHOW_DROPDOWN);
		this.selectDropdown(PROGRAMS_SHOW_DROPDOWN, testData);
		return testData;

	}

	public void clickOnLoyaltyProgramSort()
	{
		this.click(LOYALTYPROGRAM_SORTING);
		reportInfo("Clicking On Sort Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void clickOnFlowHyperlink()
	{
		this.click(FLOW_HYPERLINK);
		reportInfo("Clicking On Flow Hyperlink.");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void clickOnRuleFolderHyperLink()
	{
		this.click(RULEFOLDER_HYPERLINK);
		reportInfo("Clicking on Rulefolder Hyperlink.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnRuleFolderPublishButton()
	{
		this.click(RULE_FOLDER_PUBLISH_BUTTON);
		reportInfo("Clicking on Rulefolder publish Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnNewRuleButton()
	{
		this.click(NEWRULE_BUTTON);
		reportInfo("Clicking on Newrule Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}


	public FlowComposerPage clickOnFlowComposerHyperLink()
	{
		this.click(FLOW_HYPERLINK);
		reportInfo("Clicking On FlowComposer Hyperlink.");
		this.waitForPageToLoad(PAGE_LOADING);
		return new FlowComposerPage(driver);
	}

	public String getText(By by,String testData){
		reportInfo(testData);
		return this.getText(by);
	}

	public HashMap<String, String> addProgram(){
		HashMap<String, String> programValues = new HashMap<String, String>();
		ProgramsPojo pj=new ProgramsPojo();
		programValues.put("ProgramName", pj.getProgramName());
		programValues.put("Description", pj.getDescription());
		clickOnAddLoyaltyProgramButton();
		enterLoyaltyProgramNameInput(pj.getProgramName());
		enterProgramDescriptionInput(pj.getDescription());
		clickOnOkButton();
		return programValues;
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
		Collections.sort(list1,new SortIgnoreCase1()); 
		System.out.println(list1);
		Collections.reverse(list1); 
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

	/**
	 * MethodName:sortByProgramName() 
	 * Description: This method is used to click on Program Name
	 */
	public boolean sortByProgramName()
	{
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(PROGRAM_TABLE_NAME_COLUMN);
		String successFilePath = elementScreenshot(PROGRAM_TABLE_NAME_COLUMN);
		reportSuccessScreenshot(successFilePath,"");
		for (WebElement element : memberTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		System.out.println("Actual List"+list1);
		//Collections.sort(list2);
		Collections.sort(list2,new SortIgnoreCase1());
		System.out.println("before sort"+list2);
		Collections.reverse(list2);
		System.out.println("After sort"+list2);
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
	public boolean validatePagination(int expected) {
		boolean flag=false;
		List<WebElement> rows = getWebElementList(PROGRAMS_TABLE);
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

	public void clickOnFieldSettings(){
		this.click(FIELD_SETTINGS_BUTTON);
		reportInfo("Clicking On Program Field Settings Button." );
		this.waitForPageToLoad(PAGE_LOADING);
	}

	/**
	 * MethodName: checkNameField() 
	 * Description: This method is used to check the name field in field settings
	 */
	public void checkLoyaltyProgramField() {

		this.check(COLUMNVISIBLE_CHECKBOX_LIST);
		reportInfo("Check Field Settings Loyalty program Checkbox");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	/**
	 * MethodName: checkLoyaltyProgram() 
	 * Description: This method is used to check the Loyalty Programs field in field settings
	 */
	public void checkLoyaltyProgram() {

		this.check(SETTINGS_FIELD_CHECKBOX);
		reportInfo("Check Field Settings First Column Checkbox");
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

	public int programTableColumns(By by){
		int count=0;
		reportInfo("Fetching number of columns in table.");
		List<WebElement> transactionColumnList = getWebElementList(by);
		/*for(WebElement tr:transactionColumnList){
			if(tr.getAttribute("class").equalsIgnoreCase("ng-scope sorting_disabled")){
				
			}
			else{
				count=count+1;
			}
		}
		return count-1;*/
		return transactionColumnList.size()-1;
	}
	/**
	 *MethodName: assertCheckedColumns() 
	 *Description: This method is used to validate visible columns in Program table
	 */
	public void assertCheckedColumns(String testType) {
		reportInfo("Validating Loyalty Program visible columns in Program table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> checkBoxList = getWebElementList(COLUMNVISIBLE_CHECKBOX_LIST);
				List<WebElement> memberColumnList = getWebElementList(PROGRAM_TABLE_HEADER);
				Assert.assertEquals(checkBoxList.size(), (memberColumnList.size() - 1));
				String successFilePath = elementScreenshot(COLUMNVISIBLE_CHECKBOX_LIST);
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

	public boolean assertRuleFolderUrl(){
		boolean flag=false;
		if(getCurrentUrl().contains("rules")){
			reportInfo("Navigate to rules page successfully");
			flag=true;
		}
		return flag;
	}

	public boolean clickOnFlowComposerHyperLink(String testType){
		boolean flag=false;
		if(getCurrentUrl().contains("flow")){
			reportInfo("Navigate to Flow Composer page successfully");
			flag=true;
		}
		return flag;

	}
	public boolean assertFlowComposerUrl(){
		boolean flag=false;
		if(getCurrentUrl().contains("flow")){
			reportInfo("Navigate to Flow Composer page successfully");
			flag=true;
		}
		return flag;

	}
	public void assertDuplicateProgram(String testType){
		reportInfo("Validating Duplicate Records");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(DUPLICATE_PROGRAM_VALIDATION_ERROR);
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
	 * MethodName: nullValueInmandatoryFieldError() 
	 * Description: This method is used to assert NullValueInMandatoryField
	 * @param screenshotName
	 */
	public void assertNullValue(String testType) {
		reportInfo("Validating Null Value in Mandatory fields");
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
	 * MethodName: unCheckLoyaltyProgram() 
	 * Description: This method is used to uncheck the Loyalty Programs field in field settings
	 */
	public void unCheckLoyaltyProgram() {

		this.uncheck(SETTINGS_FIELD_CHECKBOX);
		reportInfo("Clicking Field Settings First Checkbox");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void assertUnCheckedColumns(String testType) {
		reportInfo("Validating Product Invisible columns in Program table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> productList = getWebElementList(PROGRAM_TABLE_HEADER);
				String successFilePath = elementScreenshot(COLUMNVISIBLE_CHECKBOX_LIST);
				reportSuccessScreenshot(successFilePath,"");
				String count = "0";
				for (WebElement w : productList) {
					if (w.getText() == "Loyalty Program") {
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
	public String getProgramId(){ 
		String url=this.getCurrentUrl(); 
		String r=url.substring(url.lastIndexOf("programs/")+9); 
		String programId=r.substring(0, 24); 
		System.out.println(programId);
		return programId;         
	}
}
