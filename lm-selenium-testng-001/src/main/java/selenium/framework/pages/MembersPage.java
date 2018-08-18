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

import com.aventstack.extentreports.ExtentTest;

import lm.rcx.pojo.MemberPojo;
import lm.rcx.validations.Success_Validations;
import selenium.framework.common.PageControls;

/**
 * ClassName:MembersPage Description:This class Extends Pagecontrols
 * 
 * @author Mgalla
 *
 */
public class MembersPage extends PageControls {


	public  final By ADD_MEMBER_BUTTON = By.id("add-member");
	public  final By FIRST_NAME_INPUT = By.name("firstName");
	public  final By LAST_NAME_INPUT = By.name("lastName");
	public  final By DATE_OF_BIRTH_INPUT = By.xpath("//*[@id='member-dialog']/div[1]/fieldset/div[2]/dynamic-modal-row/div[3]/section/dynamic-modal-element/div/label[2]/label/input");
	public  final By EMAIL_ADDRESS_INPUT = By.name("email");
	public  final By ADDRESS_INPUT = By.name("address");
	public  final By CITY_INPUT = By.name("city");
	public  final By STATE_INPUT = By.name("state");
	public  final By COUNTRY_INPUT = By.name("country");
	public  final By ZIPCODES_INPUT = By.name("zipCode");
	public  final By PHONE_NUMBER_INPUT = By.name("cellPhone");
	public  final By MEMBER_TYPE_DROPDOWN = By.name("type");
	public  final By UNIQUE_ID_INPUT = By.name("uuid");
	public  final By ENROLL_SOURCE_DROPDOWN = By.xpath("//select[@name='enrollSource']");
	public  final By ENROLL_LOCATION_INPUT = By.name("enrollLocation");
	public  final By REFERRAL_CODE_INPUT = By.name("referralCode");
	public  final By PARTICIPATE_IN_A_PROGRAM_DROPDOWN = By.cssSelector("label.input > select[name='program']");
	public  final By LOYALTY_ID_NAME_DROPDOWN = By.name("name");
	public  final By LOYALTY_ID_CODE_INPUT = By.name("code");
	public  final By OK_BUTTON = By.xpath("//button[@class='btn btn-primary ok_button']");
	public  final By CREATED_NEW_MEMBER_POP_UP = By.xpath(".//*[@class='toast-message']");
	public  final By INVALID_FORMAt_ERROR = By.xpath("//em[@class='invalid ng-binding ng-scope'] ");
	public  final By VALIDATION_ERROR = By.xpath("//*[@id='member-dialog']/div[1]/div/li");
	public  final By CANCEL_BUTTON = By.xpath("//button[@class='btn btn-default cancel_button']");
	public  final By USER_COLLAPSE_BUTTON_CLASSNAME=By.xpath(".//*[@id='wid-id-membersWiget']");
	// public  final By
	// VERIFY_MEMBER_NAME=By.xpath(".//*[@class='ng-scope']//tr[1]//td[2]");
	public  final By VERIFY_MEMBER_ADDRESS = By.xpath(".//*[@class='ng-scope']//tr[1]//td[3]");
	public  final By VERIFY_MEMBER_PHONE = By.xpath(".//*[@class='ng-scope']//tr[1]//td[6]");
	public  final By VERIFY_MEMBER_TYPE = By.xpath(".//*[@class='ng-scope']//tr[1]//td[3]");
	public  final By VERIFY_MEMBER_UUID = By.xpath("//td[@id='memberTable_1_14']");
	public  final By VERIFY_MEMBER_ZIPCODE = By.xpath("//td[@id='memberTable_1_13']");
	public final By MEMBER_TABLE = By.xpath("//table[@id='memberTable']/tbody/tr");
	public final By VERIFY_MEMBER_TABLE_DATA=By.xpath(".//*[@id='memberTable']//tbody//td");
	public  final By UPDATED_MEMBER_POP_UP = By.className("toast-message");
	public  final By MEMBER_EMAIL_INPUT = By.xpath("//td[@id='memberTable_1_9']");
	public  final By MEMBER_FIRSTNAME_INPUT = By.xpath("//td[@id='memberTable_1_10']");
	public  final By MEMBER_LASTNAME_INPUT = By.xpath("//td[@id='memberTable_1_11']");
	public  final By PAGE_LOADING = By.xpath("//div[@class='loading'][@style='display: block;']");
	public  final By NEXT_BUTTON_CLASS_NAME = By.xpath("//li[@id='Table_next']");
	public  final By PREVIOUS_BUTTON_CLASS_NAME = By.xpath("//li[@id='Table_previous']");

	public  final By SUGGESTION_INPUT=By.xpath("//label[@class='input']//ul[1]");
	// All elements in members page
	public  final By PROGRAM_DROPDOWN = By.name("program");
	public  final By COLLAPSE_BUTTON = By.xpath("//a[@class='button-icon jarviswidget-toggle-btn']");
	public  final By COLLAPSER_BUTTON_CLASSNAME=By.xpath("//*[@id='wid-id-membersWiget']");
	public  final By SEARCH_CRITERIA_DROPDOWN = By.id("s_o");
	public  final By WILDCARD_CHECKBOX = By.cssSelector("span..firepath-matching-node");
	public  final By QUICK_SEARCH_INPUT = By.xpath("//input[@type='text']");
	public  final By GO_BUTTON = By.xpath("//button[@id='quick-search-button']");
	public  final By REMOVE_BUTTON = By.xpath(".//*[@id='clear-search-button']");
	public  final By ADVANCED_BUTTON = By.xpath("//*[@id='advanced-search-button']");
	public  final By ADVANCEDSEARCH_FIRSTNAME_INPUT = By.xpath("(//input[@type='text'])[2]");
	public  final By ADVANCEDSEARCH_LASTNAME_INPUT = By.xpath("(//input[@type='text'])[3]");
	public  final By ADVANCEDSEARCH_EMAIL_ADDRESS_INPUT = By.xpath("(//input[@type='text'])[4]");
	public  final By ADVANCEDSEARCH_PHONE_NUMBER_INPUT = By.xpath("(//input[@type='text'])[5]");
	public  final By ADVANCEDSEARCH_ZIPCODE_INPUT = By.xpath("(//input[@type='text'])[6]");
	public  final By ADVANCEDSEARCH_MAILING_ADDRESS_INPUT = By.xpath("(//input[@type='text'])[7]");
	public  final By ADVANCEDSEARCH_LOYALTYID_NAME_INPUT = By.xpath("(//input[@type='text'])[8]");
	public  final By ADVANCEDSEARCH_LOYALTYID_CODE_INPUT = By.xpath("(//input[@type='text'])[9]");
	public  final By ADVANCEDSEARCH_TYPE_DROPDOWN = By.id("type");
	public  final By ADVANCEDSEARCH_OK_BUTTON = By.xpath("//form[@id='advanced-search-dialog']/div[2]/footer/button[2]");
	public  final By ADVANCEDSEARCH_CANCEL_BUTTON = By.xpath("//form[@id='advanced-search-dialog']/div[2]/footer/button[1]");
	public  final By SHOW_ENTITIES_DROPDOWN = By.name("memberTable_length");
	public  final By FIELDSETTINGS_BUTTON = By.xpath("//a[@id='show-table-options']/i");
	public  final By SETTINGS_ALL_COLUMNS_CHECKBOX = By.xpath("//ul[@id='spec']//li//input");
	public  final By SETTINGS_NAME_CHECKBOX = By.xpath("// *[@name='columns-firstName']");////ul[@id='spec']//li[1]
	public  final By SETTINGS_ADDRESS_CHECKBOX = By.name("columns-address");
	public  final By REFERENCEDATA_NAME_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']/li[1]");
	public  final By MEMBER_TABLE_HEADER = By.xpath("//*[@id='memberTable']//thead//tr//th");
	public  final By EDIT_BUTTON = By.xpath("(//*[@tooltip='Edit'])[1]");
	public  final By EDIT_CLOSE_BUTTON = By.xpath("xpath=//button[@class='close']");
	public  final By EDIT_OK_BUTTON = By.xpath("//button[@class='btn btn-primary ok_button']");
	public  final By EDIT_CANCEL_BUTTON = By.xpath("//form[@id='member-dialog']/div[2]/footer/button");
	public  final By DETAILS_BUTTON = By.xpath("//td[@id='memberTable_1_2']/div/div/span[1]/span/a/i");
	public  final By MEMBERS_TABLE_NAME_SORT_BUTTON = By.id("memberTable_0_2");
	public  final By MEMBERS_TABLE_ADDRESS_SORT_BUTTON = By.id("memberTable_0_3");
	public  final By MEMBERS_TABLE_PHONE_SORT_BUTTON = By.id("memberTable_0_4");
	public  final By NEXT_BUTTON = By.linkText("Next");
	public  final By PREVIOUS_BUTTON = By.linkText("Previous");
	public  final By CELLPHONE_INPUT = By.xpath("//td[@id='memberTable_1_6']/div/div/div");
	public  final By MEMBER_TABLE_NAME_COLUMN = By.xpath("//*[@id='memberTable']//tbody//tr//td[2]");
	public  final By MEMBER_TABLE_ADDRESS_COLUMN = By.xpath("//*[@id='memberTable']//tbody//tr//td[3]");
	public  final By MEMBER_TABLE_PHONE_COLUMN = By.xpath("//*[@id='memberTable']//tbody//tr//td[4]");
	public  final By VALIDATE_PREVIOUS_BUTTON = By.xpath("//*[@class='ng-isolate-scope']//div[2]/ul/li[2]");
	public  final By VALIDATE_NEXT_BUTTON = By.xpath("//*[@class='ng-isolate-scope']//div[2]/ul/li[3]");
	// Member Achievements--->REWARDS

	public  final By REWARDS_BUTTON = By.linkText("Rewards");
	public  final By REWARDS_SHOW_ENTITIES_DROPDOWN = By.name("rewardTable_length");
	public  final By REWARDS_ADD_REWARD_BUTTON = By.linkText("Add Reward");
	public  final By REWARDS_NAME_DROPDOWN = By.name("name");
	public  final By REWARDS_DESCRIPTION_INPUT = By.name("desc");
	public  final By REWARDS_USESLEFT_INPUT = By.name("usesLeft");
	public  final By REWARDS_EXPIRES_ON_INPUT = By.xpath("(//input[@type='text'])[3]");
	public  final By REWARDS_CODE_INPUT = By.name("code");
	public  final By REWARDS_EFFECTIVE_DATE_INPUT = By.xpath("(//input[@type='text'])[5]");
	public  final By REWARDS_OK_BUTTON = By.xpath("html/body/div[10]/div/div/form/div[2]/footer/button[1]");
	public  final By REWARDS_CANCEL_BUTTON = By.xpath("//button[@class='btn btn-default cancel_button']");
	public  final By REWARDS_CANCEL_DROPDOWN = By.xpath("html/body/div[10]/div/div/form/div[2]/footer/button[2]");
	public  final By REWARDS_NEXT_BUTTON = By.id("rewardTable_next");
	public  final By REWARDS_PREVIOUS_BUTTON = By.id("rewardTable_previous");
	public  final By REWARDS_FIELD_SETTINGS_BUTTON = By.xpath("//div[@id='rewardTable_wrapper']/div/button");
	public  final By REWARDS_COLUMNS_COLLECTION_CHECKBOX_LIST = By.cssSelector("ul.ColVis_collection.firepath-matching-node");
	public  final By REWARDS_SORT_BUTTON = By.id("rewardTable_0_2");
	public  final By REWARDS_SEARCH_BUTTON = By.xpath("(//input[@type='search'])[3]");
	public final By VALIDATION_ADD = By.xpath(".//*[@class='toast-message']");
	public final By VALIDATE_MEMBERNAME = By.xpath("//table[@id='memberTable']//tbody//tr//td[10]");
	public final By VALIDATE_MEMBERLASTNAME = By.xpath("//table[@id='memberTable']//tbody//tr//td[11]");
	public final By VALIDATE_MEMBERTYPE = By.xpath("//table[@id='memberTable']//tbody//tr//td[3]");
	public final By VALIDATION_ERROR2 = By.xpath(".//*[@class='toast-message']");



	/**
	 * Description:This is members page constructor. It holds all the element locators in members page
	 * 
	 * @param webDriver
	 */
	public MembersPage(WebDriver driver) {
		super(driver);

	}

	/**
	 * MethodName:clickOnAddMemberButton() 
	 * Description: This method is used to click on Add Member button
	 */
	public void clickOnAddMemberButton() {

		this.click(ADD_MEMBER_BUTTON);
		waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on Add Member Button.");
	}

	/**
	 * MethodName:enterFirstNameInput() 
	 * Description: This method is used to enter FirstName
	 * @param firstName
	 */
	public void enterFirstNameInput(String firstName) {
		this.clear(FIRST_NAME_INPUT);
		this.type(FIRST_NAME_INPUT, firstName);
		reportInfo("Entering First Name :"+firstName);
	}

	/**
	 * MethodName: enterLastNameInput() 
	 * Description: This method is used to enter LastName
	 * @param lastName
	 */
	public void enterLastNameInput(String lastName) {
		this.clear(LAST_NAME_INPUT);
		this.type(LAST_NAME_INPUT, lastName);
		reportInfo("Entering Last Name :"+lastName);
	}

	/**
	 * MethodName: enterDateOfBirthInput() 
	 * Description: This method is used to enter DateOfBirth
	 *
	 * 
	 * @param dateOfBirth
	 */
	public void enterDateOfBirthInput(String dateOfBirth) {
		this.clear(DATE_OF_BIRTH_INPUT);
		this.type(DATE_OF_BIRTH_INPUT, dateOfBirth);
		reportInfo("Entering Date Of Birth :"+dateOfBirth);
	}

	/**
	 * MethodName: enterEmailAddressInput() 
	 * Description: This method is used to enter EmailAddress
	 * 
	 * 
	 * @param emailAddress
	 */
	public void enterEmailAddressInput(String emailAddress) {
		this.clear(EMAIL_ADDRESS_INPUT);
		this.type(EMAIL_ADDRESS_INPUT, emailAddress);
		reportInfo("Entering Email Address :"+emailAddress);
	}

	/**
	 * MethodName: enterAddressInput() 
	 * Description: This method is used to enter Address
	 * 
	 * 
	 * @param address
	 */
	public void enterAddressInput(String address) {
		this.clear(ADDRESS_INPUT);
		this.type(ADDRESS_INPUT, address);
		reportInfo("Entering Address :"+address);
	}

	/**
	 * MethodName: enterCityInput() 
	 * Description: This method is used to enter City
	 * 
	 * 
	 * @param city
	 */
	public void enterCityInput(String city) {
		this.clear(CITY_INPUT);
		this.type(CITY_INPUT, city);
		reportInfo("Entering City :"+city);
	}

	/**
	 * MethodName: enterStateInput() 
	 * Description: This method is used to enter State
	 * @param state
	 */
	public void enterStateInput(String state) {
		this.clear(STATE_INPUT);
		this.type(STATE_INPUT, state);
		reportInfo("Entering State :"+state);
	}

	/**
	 * MethodName: enterCountryInput() 
	 * Description: This method is used to enter Country
	 * 
	 * 
	 * @param country
	 */
	public void enterCountryInput(String country) {
		this.clear(COUNTRY_INPUT);
		this.type(COUNTRY_INPUT, country);
		reportInfo("Entering Country :"+country);
	}

	/**
	 * MethodName: enterZipCodeInput() 
	 * Description: This method is used to enter ZipCode
	 * 
	 * 
	 * @param zipCode
	 */
	public void enterZipCodeInput(String zipCode) {
		this.clear(ZIPCODES_INPUT);
		this.type(ZIPCODES_INPUT, zipCode);
		reportInfo("Entering Zip Code :"+zipCode);
	}

	/**
	 * MethodName: enterPhoneNumberInput() 
	 * Description: This method is used to enter PhoneNumber
	 * 
	 * 
	 * @param Phone
	 */
	public void enterPhoneNumberInput(String Phone) {
		this.clear(PHONE_NUMBER_INPUT);
		this.type(PHONE_NUMBER_INPUT, Phone);
		reportInfo("Entering Phone Number :"+Phone);
	}

	/**
	 * MethodName: clickOnEditMemberButton() 
	 * Description: This method is used to click On Edit Member Button
	 * 
	 */
	public void clickOnEditMemberButton() {
		this.click(EDIT_BUTTON);
		reportInfo("Clicking on Edit Member Button.");
	}

	/**
	 * MethodName: clickOnEditCloseButton() 
	 * Description: This method is used to click On Edit Close Button
	 * 
	 */
	public void clickOnEditCloseButton() {
		this.click(EDIT_CANCEL_BUTTON);
		reportInfo("Clicking On Cancel Button.");
	}

	/**
	 * MethodName: selectMemberTypeDropdown() 
	 * Description: This method is used to select MemberType
	 * 
	 * 
	 * @param testData
	 */
	public void selectMemberTypeDropdown(String testData) {

		this.selectDropdown(MEMBER_TYPE_DROPDOWN, testData);
		reportInfo("Selecting Member Type :"+testData);
	}
	/**
	 * MethodName: enterEnrollLocation() 
	 * Description: This method is used to enter Location
	 * 
	 * 
	 * @param Location
	 */
	public void enterEnrollLocation(String testData){
		this.clear(ENROLL_LOCATION_INPUT);
		this.type(ENROLL_LOCATION_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		this.click(SUGGESTION_INPUT);
		reportInfo("Location Enrolled.");
	}

	/**
	 * MethodName: enterUniqueIdInput() 
	 * Description: This method is used to enter UniqueId
	 * 
	 * 
	 * @param uniqueId
	 */
	public void enterUniqueIdInput(String uniqueId) {
		this.clear(UNIQUE_ID_INPUT);
		this.type(UNIQUE_ID_INPUT, uniqueId);
		reportInfo("Entering Unique Id :"+uniqueId);

	}

	/**
	 * MethodName: selectEnrollSourceDropdown() 
	 * Description: This method is used to select EnrollSource
	 * 
	 * 
	 * @param testData
	 */
	public void selectEnrollSourceDropdown() {
		String testData=this.getFirstDropDownValue(ENROLL_SOURCE_DROPDOWN);
		//this.selectDropdown(PARTICIPATE_IN_A_PROGRAM_DROPDOWN, testData);
		this.selectDropdown(ENROLL_SOURCE_DROPDOWN, testData);
		reportInfo("Selecting Enroll Source :"+testData);
	}

	/**
	 * MethodName: enterEnrollLocationInput() 
	 * Description: This method is used to select EnrollLocation
	 * 
	 * 
	 * @param location
	 */
	public void enterEnrollLocationInput(String location) {
		this.type(ENROLL_LOCATION_INPUT, location);
		reportInfo("Entering Enroll Location :"+location);
	}

	/**
	 * MethodName: enterReferralCodeInput() 
	 * Description: This method is used to enter ReferralCode
	 * 
	 * 
	 * @param referralCode
	 */
	public void enterReferralCodeInput(String referralCode) {
		this.type(REFERRAL_CODE_INPUT, referralCode);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering Referral Code :"+referralCode);
	}

	/**
	 * MethodName: selectParticipateInAProgramDropdown() 
	 * Description: This method is used to select Program Name
	 * 
	 * 
	 * @param testData
	 */
	public void selectParticipateInAProgramDropdown() {
		String testData=this.getFirstDropDownValue(PARTICIPATE_IN_A_PROGRAM_DROPDOWN);
		if(testData==null){
			System.out.println("Creating program");
			HomePage homePage = new HomePage(this.driver);
			homePage.clickOnMembersMenuButton();
			ProgramsPage programPage = homePage.clickOnProgramsMenuButton();
			programPage.addProgram();
			MembersPage membersPage = homePage.clickOnMembersMenuButton();
			membersPage.clickOnAddMemberButton();
			/*testData=this.getFirstDropDownValue(PARTICIPATE_IN_A_PROGRAM_DROPDOWN);
			this.selectDropdown(PARTICIPATE_IN_A_PROGRAM_DROPDOWN, testData);
			reportInfo("Selecting Program Name. :"+testData);*/
		}
		testData=this.getFirstDropDownValue(PARTICIPATE_IN_A_PROGRAM_DROPDOWN);
		this.selectDropdown(PARTICIPATE_IN_A_PROGRAM_DROPDOWN, testData);
		reportInfo("Selecting Program Name :"+testData);
	}

	/**
	 * MethodName: selectLoyaltyIdNameDropdown() 
	 * Description: This method is used to select LoyaltyIdName
	 * 
	 * 
	 * @param testData
	 */
	public void selectLoyaltyIdNameDropdown() {
		String testData=this.getFirstDropDownValue(LOYALTY_ID_NAME_DROPDOWN);
		this.selectDropdown(LOYALTY_ID_NAME_DROPDOWN, testData);
		reportInfo("Selecting Loyalty Id :"+testData);
	}

	/**
	 * MethodName: enterLoyaltyIdCodeInput() 
	 * Description: This method is used to  enter LoyaltyIdCode
	 *
	 * 
	 * @param loyaltyIdCode
	 */
	public void enterLoyaltyIdCodeInput(String loyaltyIdCode) {
		this.type(LOYALTY_ID_CODE_INPUT, loyaltyIdCode);
		reportInfo("Entering Loyalty Id Code :"+loyaltyIdCode);
	}

	/**
	 * MethodName: clickOnOkButton() 
	 * Description: This method is used to click On OK button
	 * 
	 */
	public void clickOnAddMemberOkButton() {
		this.click(OK_BUTTON);
		reportInfo("Clicking on OK Button.");

	}
	public void clickOnAddMemberOkButton(boolean flag) {
		this.click(OK_BUTTON);
		reportInfo("Clicking on OK Button.");
		this.waitForPageToLoad(PAGE_LOADING, flag);
	}

	/**
	 * MethodName: clickOnRemoveButton() 
	 * Description: This method is used to click On Remove button
	 * 
	 */
	public void clickOnRemoveButton() {
		this.click(REMOVE_BUTTON);
		reportInfo("Clicking on Search Remove Button.");
	}

	/**
	 * MethodName: clickOnCancelButton() 
	 * Description: This method is used to click On Cancel button
	 * 
	 */
	public void clickOnAddMemberCancelButton() {
		this.waitForElement(PAGE_LOADING);
		this.click(CANCEL_BUTTON);
		reportInfo("Clicking on Cancel Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void selectSearchCriteria(String testData) {
		this.selectDropdown(SEARCH_CRITERIA_DROPDOWN, testData);
		reportInfo("Selecting Search Criteria :"+testData);
	}

	/**
	 * MethodName: enterQuickSearchInput() 
	 * Description: This method is used to enter QuickSearch Input
	 * @param testdata
	 */
	public void enterQuickSearchInput(String testdata) {
		this.clear(QUICK_SEARCH_INPUT);
		this.type(QUICK_SEARCH_INPUT, testdata);
		reportInfo("Entering Search input :"+testdata);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void refresh(){
		driver.navigate().refresh();
		reportInfo("Refreshing the page.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	/**
	 * MethodName: clickOnGoButton() 
	 * Description: This method is used to click On Go button
	 * 
	 */
	public void clickOnSearchGoButton() {
		this.click(GO_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On Search Go Button.");
	}


	/**
	 * MethodName: clickOnEditOkButton() Description: This method is used to
	 * click On Edit Ok button
	 */
	public void clickOnEditOkButton() {
		this.click(EDIT_OK_BUTTON);
		reportInfo("Clicking On Edit Ok Button.");
	}
	public String getText(By by,String testData){
		reportInfo(testData);
		return this.getText(by);
	}

	/**
	 * MethodName: clickOnEditCancelButton() Description: This method is used to
	 * click On Edit Cancel button
	 */
	public void clickOnEditCancelButton() {
		this.click(EDIT_CANCEL_BUTTON);
		reportInfo("Clicking On Edit Cancel Button.");
	}

	/**
	 * MethodName: clickOnDetailsButton() Description: This method is used to
	 * click On Details button
	 */
	public MemberAchievementsPage clickOnDetailsButton() {
		this.click(DETAILS_BUTTON);
		reportInfo("Clicking On Member Details Button.");
		this.waitForPageToLoad(PAGE_LOADING);
		return new MemberAchievementsPage(this.driver);
	}

	/**
	 * MethodName: assertMemberCreationPopUP() 
	 * Description: This method is used to assert MemberCreationPopUp and take Screenshot
	 * @param screenshotName
	 * @param testType
	 */
	public void assertMemberCreationPopUP(String expected, String testType) {
		reportInfo("Assert to check Member Creation PopUp");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				Assert.assertEquals(this.getText(CREATED_NEW_MEMBER_POP_UP), expected);
				reportPassedStatus("Created new member");
				String successFilePath = elementScreenshot(CREATED_NEW_MEMBER_POP_UP);
				reportSuccessScreenshot(successFilePath,"");
			} else if (testType.equalsIgnoreCase("invalid")) {

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Member Creation Assertion Failed");
		}
		this.waitForPageToLoad(PAGE_LOADING);
	}

	/**
	 * MethodName: assertEditMemberPopUP() 
	 * Description: This method is used to assert EditMemberPopUp and take Screenshot
	 * @param expected
	 * @param testType
	 */

	public void assertEditMemberPopUP(String expected, String testType) {
		reportInfo("Validating Edit Member ");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				Assert.assertEquals(this.getText(UPDATED_MEMBER_POP_UP), expected);
				reportPassedStatus("Member Updated successfully");
				String successFilePath = elementScreenshot(UPDATED_MEMBER_POP_UP);
				reportSuccessScreenshot(successFilePath,"");
			} else if (testType.equalsIgnoreCase("invalid")) {

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Edit Member Assertion Failed");
		}
	}


	/**
	 * MethodName: nullValueInmandatoryFieldError() 
	 * Description: This method is used to assert NullValueInMandatoryField
	 * @param screenshotName
	 */
	public void nullValueInmandatoryFieldError(String testType) {
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
	 * MethodName: validatePagination() 
	 * Description: This method is used to Validate Pagination
	 */
	public boolean validatePagination(int expected) {
		boolean flag = false;
		reportInfo("Validating Pagination");
		List<WebElement> rows = getWebElementList(MEMBER_TABLE);
		int count = rows.size();
		if(count<=expected){
			flag=true;
		}
		return flag;
	}
	public boolean validateCollapseButton(){
		boolean flag=false;
		WebElement ele=driver.findElement(USER_COLLAPSE_BUTTON_CLASSNAME);
		String classname=ele.getAttribute("class");
		if(classname != null && classname.contains("jarviswidget-collapsed")){
			flag=true;
		}

		return flag;
	}
	public void validateNextButton(String testType){
		reportInfo("Validating Next Button");
		WebElement ele=driver.findElement(VALIDATE_NEXT_BUTTON);
		String classname=ele.getAttribute("class");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				if(classname != null && classname.contains("active")){
					String successFilePath = elementScreenshot(VALIDATE_NEXT_BUTTON);
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
					String successFilePath = elementScreenshot(VALIDATE_PREVIOUS_BUTTON);
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



	/**
	 * MethodName:createMember() 
	 * Description: This method is used to create member
	 */

	public HashMap<String, String> createMember() {
		HashMap<String, String> memberValues = new HashMap<String, String>();
		MemberPojo mp = new MemberPojo();
		clickOnAddMemberButton();
		selectParticipateInAProgramDropdown();
		enterFirstNameInput(mp.getFirstName());
		memberValues.put("FirstName", mp.getFirstName());
		memberValues.put("LastName", mp.getLastName());
		memberValues.put("Email", mp.getEmail());
		memberValues.put("Phone", mp.getPhoneNumber());
		memberValues.put("ZipCode", mp.getZipCode());
		memberValues.put("MemberType", mp.getMemberType());
		enterLastNameInput(mp.getLastName());
		enterDateOfBirthInput(mp.getDateOfBirth());
		enterEmailAddressInput(mp.getEmail());
		enterAddressInput(mp.getAddress());
		enterCityInput(mp.getCity());
		enterStateInput(mp.getState());
		enterCountryInput(mp.getCountry());
		enterZipCodeInput(mp.getZipCode());
		enterPhoneNumberInput(mp.getPhoneNumber());
		//selectMemberTypeDropdown(mp.getMemberType());
		//enterEnrollLocation("Bode Inc");
		selectEnrollSourceDropdown();
		enterReferralCodeInput(mp.getReferralCode());
		clickOnAddMemberOkButton();
	//	assertMemberCreationPopUP(Success_Validations.MemberCreatePopUp, "valid");
		return memberValues;
	}
	public HashMap<String, String> createGroupMember() {
		HashMap<String, String> memberValues = new HashMap<String, String>();
		MemberPojo mp = new MemberPojo();
		clickOnAddMemberButton();
		enterFirstNameInput(mp.getFirstName());
		memberValues.put("FirstName", mp.getFirstName());
		memberValues.put("LastName", mp.getLastName());
		memberValues.put("Email", mp.getEmail());
		memberValues.put("Phone", mp.getPhoneNumber());
		memberValues.put("ZipCode", mp.getZipCode());
		memberValues.put("MemberType", mp.getMemberType());
		enterLastNameInput(mp.getLastName());
		enterDateOfBirthInput(mp.getDateOfBirth());
		enterEmailAddressInput(mp.getEmail());
		enterAddressInput(mp.getAddress());
		enterCityInput(mp.getCity());
		enterStateInput(mp.getState());
		enterCountryInput(mp.getCountry());
		enterZipCodeInput(mp.getZipCode());
		enterPhoneNumberInput(mp.getPhoneNumber());
		selectMemberTypeDropdown("Group");
		selectEnrollSourceDropdown();
		enterReferralCodeInput(mp.getReferralCode());
		clickOnAddMemberOkButton();
		assertMemberCreationPopUP(Success_Validations.MemberCreatePopUp, "valid");
		return memberValues;
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
	 * MethodName: checkWildcardCheckbox() 
	 * Description: This method is used to check wildCard checkBox.
	 */
	public void checkWildcardCheckbox() {
		this.check(WILDCARD_CHECKBOX);
		reportInfo("Clicking On WildCard Checkbox.");
	}
	/**
	 * MethodName: clickOnAdvancedButton() 
	 * Description: This method is used to click on advanced search button
	 */
	public void clickOnAdvancedButton() {
		this.click(ADVANCED_BUTTON);
		reportInfo("Clicking On Advanced button.");
	}

	/**
	 * MethodName: enterAdvancedSearchFirstNameInput() 
	 * Description: This method is used to Enter firstName in advanced search lastName field.
	 */
	public void enterAdvancedSearchFirstNameInput(String testData) {
		this.type(ADVANCEDSEARCH_FIRSTNAME_INPUT, testData);
		reportInfo("Entering FirstName in Advanced Search.");
	}
	/**
	 * MethodName: enterAdvancedSearchLastNameInput() 
	 * Description: This method is used to Enter lastName in advanced search lastName field.
	 */
	public void enterAdvancedSearchLastNameInput(String testData) {
		this.type(ADVANCEDSEARCH_LASTNAME_INPUT, testData);
		reportInfo("Entering LastName in Advanced Search.");
	}

	/**
	 * MethodName: clickOnAdvancedSearchOkButton() 
	 * Description: This method is used to click on advanced search OK button.
	 */
	public void clickOnAdvancedSearchOkButton() {
		this.click(ADVANCEDSEARCH_OK_BUTTON);
		reportInfo("Clicking On Advanced Search Ok Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	/**
	 * MethodName: clickOnAdvancedSearchCancelButton() 
	 * Description: This method is used to click on advanced search cancel button.
	 */
	public void clickOnAdvancedSearchCancelButton() {
		this.click(ADVANCEDSEARCH_CANCEL_BUTTON);
		reportInfo("Clicking On Advanced Search Cancel Button.");
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
		reportInfo("Clicking Field Settings Name Checkbox.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	/**
	 * MethodName: uncheckNameField() 
	 * Description: This method is used to uncheck the name field in field settings
	 */
	public void uncheckNameField() {
		System.out.println(this.getText(SETTINGS_NAME_CHECKBOX));
		this.uncheck(SETTINGS_NAME_CHECKBOX);
		this.waitForPageToLoad(PAGE_LOADING);
	}

	/**
	 * MethodName:clickOnNameSortButton() 
	 * Description: This method is used to click on Name Sort Button
	 */
	public void clickOnMemberspageNameSortButton() {
		this.click(MEMBERS_TABLE_NAME_SORT_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On Sort By Name Button.");
	}

	/**
	 * MethodName:clickOnAddressSortButton() 
	 * Description: This method is used to click on Address Sort Button in memberTable
	 */
	public void clickOnMemberspageAddressSortButton() {
		this.click(MEMBERS_TABLE_ADDRESS_SORT_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On Sort By Address Button.");
	}
	/**
	 * MethodName:clickOnAddressSortButton() 
	 * Description: This method is used to click on Phone Sort Button in memberTable
	 */
	public void clickOnMemberspagePhoneSortButton() {
		this.click(MEMBERS_TABLE_PHONE_SORT_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On Sort By Phone Button.");
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

	public int memberTableColumns(By by){
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

	public int clickOnPreviousButton(){
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
	 * MethodName:selectShowEntitiesDropdown() 
	 * Description:This method used to select the value in showEntities DropDown
	 * @param testData
	 */
	public String selectShowEntitiesDropdown() {
		String testData=this.getFirstDropDownLabel(SHOW_ENTITIES_DROPDOWN);
		this.selectDropdown(SHOW_ENTITIES_DROPDOWN, testData);
		reportInfo("Clicking On Show Entities DropDown.");
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}

	/*
	 * MethodName:sortingByName()
	 * Description:This method checks member table is sorted by name or not
	 * @return boolean
	 */
	public boolean sortingByName() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(MEMBER_TABLE_NAME_COLUMN);
		for (WebElement element : memberTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		Collections.sort(list2);
		Collections.reverse(list2);
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
	 * MethodName:sortingByName()
	 * Description:This method checks member table is sorted by address or not
	 * @return boolean
	 */
	public boolean sortingByAddress() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(MEMBER_TABLE_ADDRESS_COLUMN);
		for (WebElement element : memberTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		Collections.sort(list2,new SortIgnoreCase());
		//Collections.reverse(list2);
		boolean sorted=list2.equals(list1);
		return sorted;
	}
	/**
	 * MethodName:sortingByName()
	 * Description:This method checks member table is sorted by phone number or not
	 * @return boolean
	 */
	public boolean sortingByPhoneNumber() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(MEMBER_TABLE_PHONE_COLUMN);
		for (WebElement element : memberTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		Collections.sort(list2,new SortIgnoreCase());
		//Collections.reverse(list2);
		boolean sorted=list2.equals(list1);
		return sorted;
	}

	public String selectProgram(){
		String testData=this.getFirstDropDownValue(PROGRAM_DROPDOWN);
		this.selectDropdown(PROGRAM_DROPDOWN, testData);
		reportInfo("Selecting a program. :"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}

	public String selectProgram(String testData){
		this.selectDropdown(PROGRAM_DROPDOWN, testData);
		reportInfo("Selecting a program. :"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}

	/**
	 * MethodName: selectEnrollSourceDropdown() 
	 * Description: This method is used to select EnrollSource
	 * 
	 * 
	 * @param testData
	 */
	public void selectEnrollSourceDropdown(String testData) {
		this.selectDropdown(ENROLL_SOURCE_DROPDOWN, testData);
		reportInfo("Selecting Enroll Source. :"+testData);
	}

	public String getClassname(By by,String testData){
		reportInfo(testData);
		WebElement ele=driver.findElement(by);
		String classname=ele.getAttribute("class");
		return classname;
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

	public void assertText(String expected, String actual, String message){
		if(expected.equalsIgnoreCase(actual)){
			reportPassedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			reportInfo(message);
		}else{
			reportFailedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
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

	public MemberAchievementsPage clickOnMemberDetailsButton() {
		String data=this.getText(VERIFY_MEMBER_TABLE_DATA);
		System.out.println(data);
		if(data.equalsIgnoreCase("No data available in table")){

			createMember();
			//this.refresh();
		}
		this.click(DETAILS_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On Member Details Button.");
		this.waitForPageToLoad(PAGE_LOADING);
		return new MemberAchievementsPage(driver);
	}

	public List<String> actualList(By by){
		List<String> list1 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(by);
		for (WebElement element : memberTableNameColumn) {
			list1.add(element.getText());
		}
		return list1;
	}

	public List<String> expectedList(By by){
		List<String> list1 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(by);
		for (WebElement element : memberTableNameColumn) {
			list1.add(element.getText());
		}
		Collections.sort(list1);
		//Collections.reverse(list1);
		return list1;
	}

	public List<String> expectedList1(By by){
		List<String> list1 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(by);
		for (WebElement element : memberTableNameColumn) {
			list1.add(element.getText());
		}
		Collections.sort(list1);
		Collections.reverse(list1);
		return list1;
	}

	public void assertObject(Object expected, Object actual,String message){
		if(expected.equals(actual)){
			reportPassedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");

		}else{
			reportFailedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
		}
	}
}
