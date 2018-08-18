package selenium.framework.pages;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import lm.rcx.pojo.UsersPojo;
import lm.rcx.validations.Success_Validations;
import selenium.framework.common.PageControls;

/**
 * 
 * @author Alekhya
 * @className:UsersPage
 *@description:This class extends the pageControls
 */
public class UsersPage extends PageControls  {

	public  final By ADD_USER_BUTTON = By.xpath("//div[@id='content']/div/div/h3/a/span");
	public  final By LOGIN_NAME_INPUT = By.name("login");
	public  final By EMAIL_ADDRESS_INPUT = By.name("email");
	public  final By TOKEN_EXPIRES_IN_MINUTE_INPUT = By.name("tokenExpirationTime");
	public  final By BLOCKED_RADIOBUTTON = By.xpath(".//*[@class='onoffswitch-switch']");
	public  final By ALLOW_MULTIPLE_SESSIONS_RADIOBUTTON = By.xpath("//*[@id='member-dialog']/div[1]/fieldset/div[5]/dynamic-modal-row/div[1]/section/dynamic-modal-element/div/span[1]/label[1]/span[2]");
	public  final By ENABLE_SESSION_MANAGEMENT_RADIOBUTTON = By.xpath("//*[@id='member-dialog']/div[1]/fieldset/div[5]/dynamic-modal-row/div[2]/section/dynamic-modal-element/div/span[1]/label[1]/span[2]");
	public  final By OK_BUTTON = By.xpath("//button[@class='btn btn-primary ok_button']");
	public  final By USER_SUCCESFULLY_ADDED_POPUP = By.xpath(".//*[@class='toast-message']");
	public  final By USER_SUCCESFULLY_DELETE_POPUP = By.xpath(".//*[@class='toast-message']");
	public  final By USER_EMAIL_SUCCESSFULLY_SEND_POPUP = By.xpath(".//*[@class='toast-message']");
	public  final By USER_TABLE = By.id("userTable");
	public  final By USER_NAME_FIELD = By.xpath("//*[@class='ng-scope']//tr[1]//td[3]");
	public  final By USER_EMAIL_FIELD = By.xpath("//*[@class='ng-scope']//tr[1]//td[4]");
	public  final By USER_TOKENEXPIRESINMINUTE_FIELD = By.xpath("//*[@class='ng-scope']//tr[1]//td[6]");
	public  final By DUPLICATE_ERROR = By.xpath(".//*[@class='toast-message']");
	public  final By CANCEL_BUTTON = By.xpath(".//button[@class='btn btn-default cancel_button']");
	public  final By VALIDATION_ERROR = By.xpath(".//em[@class='invalid ng-binding ng-scope']");
	// public  final By SETTINGS_EXPAND_BUTTON=By.xpath("//ul[@id='thelist']/li[4]/a/b/em");
	public  final By USER_COLLAPSE_BUTTON = By.xpath("//*[@id='wid-id-usersWidget']/header/div/a");
	public  final By USER_SHOWENTITIES_DROPDOWN = By.name("userTable_length");
	public  final By USER_SEARCH_BUTTON = By.xpath(".//*[@id='advanced-search-button']");
	public  final By USER_SEARCH_INPUT = By.xpath("//input[@type='text']");
	public  final By SUGGESTION = By.xpath("//label/ul/li/a");
	public  final By USER_REMOVE_BUTTON = By.xpath(".//*[@id='advanced-search-remove-button']/span");
	public  final By USER_EDIT_BUTTON = By.xpath("//a[@tooltip='Edit']");
	public  final By USER_DELETE_BUTTON = By.xpath("//a[@tooltip='Delete']");
	public  final By USER_RESETPASSWORD_BUTTON = By.xpath("//a[@tooltip='Reset Password']");
	public  final By USER_DELETE_OK_BUTTON = By.xpath("//button[@class='btn btn-primary ok_button']");
	public  final By USER_DELETE_CANCEL_BUTTON = By.xpath("//button[@class='btn btn-default cancel_button2']");
	public  final By USER_DELETE_DIALOGUE_CLOSE_BUTTON = By.xpath("//button[@class='close']");
	public  final By USER_SETTINGS_BUTTON = By.xpath("//div[@id='userTable_wrapper']/div/button");
	public  final By USER_SUCCESFULLY_DELETED_POPUP = By.xpath(".//*[@class='toast-message']");
	// public  final By
	// USER_SETTINGS_NAMEFIELDS_CHECKBOX=By.xpath("(//input[@type='checkbox'])[27]");

	public  final By USER_RESETPASSWORD_OK_BUTTON = By.xpath("//button[@class='btn btn-primary ok_button']");
	public  final By USER_RESETPASSWORD_CANCEL_BUTTON = By
			.xpath("//button[@class='btn btn-default cancel_button2']");
	public  final By USER_COLOUMN__LOGIN_SORT_BUTTON = By.xpath("//*[@id='userTable_0_2']");
	public  final By USER_COLOUMN_EMAIL_SORT_BUTTON = By.xpath("//*[@id='userTable_0_2']");
	public  final By USER_COLOUMN_TOKENEXPIRESIN_SORT_BUTTON = By.xpath("//*[@id='userTable_0_2']");
	public  final By USER_COLOUMN_CREATED_AT_SORT_BUTTON = By.xpath("//*[@id='userTable_0_2']");
	public  final By USER_COLOUMN_UPDATED_AT_SORT_BUTTON = By.xpath("//*[@id='userTable_0_2']");
	public  final By USER_PREVIOUS_BUTTON = By.xpath("//*[@id='userTable_previous']/a");
	public  final By USER_NEXT_BUTTON = By.xpath(".//*[@id='userTable_next']/a");
	public  final By PAGE_LOADING = By.xpath("//div[@class='loading' and style='display: block;']");
    public final By RESETPASSWORD_OKBUTTON=By.xpath("//*[@class='btn btn-primary ok_button']");

	/**
	 * Constructor:UsersPage()
	 * Description: It holds all the element locators for Users Page. 
	 * @param webDriver
	 */

	public UsersPage(WebDriver webDriver) {
		super(webDriver);
		reportInfo("Redirecting to users page.");

	}
	/**
	 * MethodName:clickAddUserButton()
	 * Description:This method is used to click on Add User Button.
	 */

	public void clickAddUserButton() {
		//this.moveToElement(ADD_USER_BUTTON);
		this.click(ADD_USER_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);;
		reportInfo("Clicking on Add User Button.");
	}



	/**
	 * MethodName:enterLoginName()
	 * Description:This method is used for entering Login Name
	 * @param  loginName
	 */

	public void enterLoginName(String loginName) {
		this.type(LOGIN_NAME_INPUT, loginName);
		reportInfo("Entering Login Name. : "+loginName);
	}
	/**
	 * MethodName:enterEmailAddress()
	 * Description:This method is used for entering e-mail.
	 * @param emailAddress
	 */

	public void enterEmailAddress(String emailAddress) {
		this.clear(EMAIL_ADDRESS_INPUT);
		this.type(EMAIL_ADDRESS_INPUT, emailAddress);
		reportInfo("Entering Email Address. : "+emailAddress);
	}
	/**
	 * MethodName:enterTokenExpiresInMinute()
	 * Description:This method is used for entering TokenExpiresInMinute
	 * @param tokenExpiresInMinute
	 */

	public void enterTokenExpiresInMinute(String tokenExpiresInMinute) {
		this.clear(TOKEN_EXPIRES_IN_MINUTE_INPUT);
		this.type(TOKEN_EXPIRES_IN_MINUTE_INPUT, tokenExpiresInMinute);
		reportInfo("Entering TokenExpiresInMinute. : "+tokenExpiresInMinute);
	}

	/**
	 * MethodName:clickOnBlockedRadioButton()
	 * Description:This method is used to click on Blocked radio-button.
	 */


	public void clickOnBlockedRadioButton() {
		this.click(BLOCKED_RADIOBUTTON);
		reportInfo("Clicking on Blocked Radio Button.");
	}

	/**
	 * MethodName: clickOnAllowMutipleSessionsRadioButton()
	 * Description:This method is used to click on  AllowMutipleSessions radio-button.
	 */
	public void clickOnAllowMutipleSessionsRadioButton() {
		this.click(ALLOW_MULTIPLE_SESSIONS_RADIOBUTTON);
		reportInfo("Clicking on Allow Multiple Sessions Radio Button.");
	}
	/**
	 * MethodName: clickOnEnableSessionManagementRadioButton()
	 * Description:This method is used to click on  EnableSessionManagement radio-button.
	 */

	public void clickOnEnableSessionManagementRadioButton() {
		this.click(ENABLE_SESSION_MANAGEMENT_RADIOBUTTON);
		reportInfo("Clicking on Enable Session Management Radio Button.");
	}

	/**
	 * MethodName:clickOnOkButton()
	 * Description:This method is used to click on OK button.
	 */

	public void clickOnAddUserOkButton() {
		this.click(OK_BUTTON);
		/*this.waitForPageToLoad(PAGE_LOADING);*/
		reportInfo("Clicking on OK Button.");
	}
	public void clickOnAddUserOkButton(boolean flag) {
		this.click(OK_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING, flag);
		reportInfo("Clicking on OK Button.");
	}
	/**
	 * MethodName:clickOnCancelButton()
	 * Description:This method is used to click on cancel button.
	 */

	public void clickOnAddUserCancelButton() {
		this.click(CANCEL_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on Cancel Button.");
	}
	/**
	 * MethodName:ClickOnSettingsButton()
	 * Description:This method is used to click on Settings button.
	 */

	public void ClickOnSettingsButton() {
		this.click(USER_SETTINGS_BUTTON);
		reportInfo("Clicking on Users Settings Button.");
	}
	/**
	 * MethodName:clickOnuserCollapseButton()
	 * Description:This method is used  to click on collapse button
	 */
	public void clickOnuserCollapseButton() {
		this.click(USER_COLLAPSE_BUTTON);
		reportInfo("Clicking on User Collapse Button.");
	}
	/**
	 * MethodName:selectFromShowEntitiesDropDownButton()
	 * Description:This method is used to select entities from the drop-down
	 * @param by
	 * @param testData
	 */

	public void selectFromShowEntitiesDropDownButton(By by, String testData) {
		this.selectDropdown(USER_SHOWENTITIES_DROPDOWN, testData);
		reportInfo("Selecting Show Entities Dropdown. : "+testData);
	}
	/**
	 * MethodName:enterSearchInput()
	 * Description:This method is used for entering the search input
	 * @param searchInput
	 */
	public void clickOnSearchButton(){
		this.click(USER_SEARCH_BUTTON);
		reportInfo("Clicking on Search Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnRemoveButton(){
		this.click(USER_REMOVE_BUTTON);
		reportInfo("Clicking on Remove Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void enterSearchInput(String searchInput) {
		this.type(USER_SEARCH_INPUT, searchInput);
		this.waitForPageToLoad(PAGE_LOADING);
		//this.click(SUGGESTION);
		//this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering Search Input. : "+searchInput);
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



	/**
	 * MethodName:clickOnEditButton()
	 * Description:This method is used to click on edit button.
	 */

	public void clickOnEditButton() {
		this.click(USER_EDIT_BUTTON);
		reportInfo("Clicking on Edit User Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	/**
	 * MethodName: clickOnUserDeleteButton()
	 * Description:This method is used to click on delete button.
	 */

	public void clickOnUserDeleteButton() {
		this.click(USER_DELETE_BUTTON);
		reportInfo("Clicking on Delete User Button.");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	/**
	 * MethodName: clickOnUserResetPasswordButton()
	 * Description:This method is used to click on Reset Password button.
	 */

	public void clickOnUserResetPasswordButton() {
		this.click(USER_RESETPASSWORD_BUTTON);
		reportInfo("Clicking on User Reset Password Button.");
	}
	/**
	 * MethodName: clickUserDeleteOkButton()
	 * Description:This method is used to click on Delete Ok button.
	 */

	public void clickUserDeleteOkButton() {
		this.click(USER_DELETE_OK_BUTTON);
		reportInfo("Clicking on Delete Confirmation OK Button.");
	}
	/**
	 * MethodName: clickUserDeleteCancelButton()
	 * Description:This method is used to click on Delete Cancel button.
	 */

	public void clickUserDeleteCancelButton() {
		this.click(USER_DELETE_CANCEL_BUTTON);
		reportInfo("Clicking on Delete Confirmation Cancel Button.");
	}
	/**
	 * MethodName: clickOnDeleteDialogueboxCloseButton()
	 * Description:This method is used to click on Delete Dialoguebox close button.
	 */

	public void clickOnDeleteDialogueboxCloseButton() {
		this.click(USER_DELETE_DIALOGUE_CLOSE_BUTTON);
		reportInfo("Clicking on Delete Confirmation OK Button.");
	}
	/**
	 * MethodName: clickOnUserResetPasswordOkButton()
	 * Description:This method is used to click on Reset password Ok button.
	 */

	public void clickOnUserResetPasswordOkButton() {
		this.click(USER_RESETPASSWORD_OK_BUTTON);
		reportInfo("Clicking on Reset Password Confirmation OK Button.");
	}
	/**
	 * MethodName: clickOnUserResetPasswordCancelButton()
	 * Description:This method is used to click on Reset password Cancel button.
	 */

	public void clickOnUserResetPasswordCancelButton() {
		this.click(USER_RESETPASSWORD_CANCEL_BUTTON);
		reportInfo("Clicking on Reset Password Confirmation Cancel Button.");
	}
	/**
	 * MethodName:clickOnLoginSortButton()
	 * Description:This method is used to click on LoginSort button.
	 */

	public void clickOnLoginSortButton() {
		this.click(USER_COLOUMN__LOGIN_SORT_BUTTON);
		reportInfo("Clicking on Sort By Login Button.");
	}
	/**
	 * MethodName:clickOnEmailSortButton()
	 * Description:This method is used to click on Emailsort button.
	 */
	public void clickOnEmailSortButton() {
		this.click(USER_COLOUMN_EMAIL_SORT_BUTTON);
		reportInfo("Clicking on Sort By Email Button.");
	}
	/**
	 * MethodName:clickOnExpiresInSortButton()
	 * Description:This method is used to click on ExpiresIn sort button.
	 */

	public void clickOnExpiresInSortButton() {
		this.click(USER_COLOUMN_TOKENEXPIRESIN_SORT_BUTTON);
		reportInfo("Clicked on Sort By Token Expires In Minute Button.");
	}
	/**
	 * MethodName: clickOnCreatedAtSortButton()
	 * Description:This method is used to click on CreatedAt sort button.
	 */

	public void clickOnCreatedAtSortButton() {
		this.click(USER_COLOUMN_CREATED_AT_SORT_BUTTON);
		reportInfo("Clicking on Sort By Created At Button.");
	}
	/**
	 * MethodName: clickOnUpdatedAtSortButton()
	 * Description:This method is used to click on UpdatedAt sort button.
	 */

	public void clickOnUpdatedAtSortButton() {
		this.click(USER_COLOUMN_UPDATED_AT_SORT_BUTTON);
		reportInfo("Clicked on Sort By Updated At Button.");
	}
	/**
	 * MethodName:clickOnUserPreviousButton()
	 * Description:This method is used to click on previous button.
	 */

	public void clickOnUserPreviousButton() {
		this.click(USER_PREVIOUS_BUTTON);
		reportInfo("Clicking on Previous Button.");
	}
	/**
	 * MethodName:clickOnUserNextButton()
	 * Description:This method is used to click on Next button.
	 */

	public void clickOnUserNextButton() {
		this.click(USER_NEXT_BUTTON);
		reportInfo("Clicking on Next Button.");


	}
	/**
	 * MethodName:assertEmailAddressIsInvalidError()
	 * Description:This method is used to validate the EmailAddress with invalid email format and taking screenshot
	 * @param ScreenshotName
	 */

	public void assertEmailAddressIsInvalidError(String expected,String testType) {
		reportInfo("Validating Invalid Email Address");
		try {
			if (this.getText(VALIDATION_ERROR).equals(expected)) {
				Assert.assertEquals(this.getText(VALIDATION_ERROR), expected);
				String successFilePath = elementScreenshot(VALIDATION_ERROR);
				reportSuccessScreenshot(successFilePath,"");
				reportPassedStatus("Invalid Email");
			} else {
				String successFilePath = elementScreenshot(VALIDATION_ERROR);
				reportFailureScreenshot(successFilePath);

			}
		}
		catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}

	}


	public HashMap<String, String> addUser(){
		HashMap<String,String> userCredentials=new HashMap<String,String>();
		UsersPojo up=new UsersPojo();
		clickAddUserButton();
		enterLoginName(up.getName());
		enterEmailAddress(up.getEmail());
		enterTokenExpiresInMinute(up.getTokenExpiresInMinute());
		userCredentials.put("UserName",up.getName() );
		userCredentials.put("UserEmail", up.getEmail());
		userCredentials.put("Token", up.getTokenExpiresInMinute());
		clickOnAddUserOkButton();
		String expected=Success_Validations.UserCreatePopUp;
		String actual=getText(USER_SUCCESFULLY_ADDED_POPUP, "Fetching User Creation popup.");
		assertText(expected, actual, USER_SUCCESFULLY_ADDED_POPUP, "Validating User Creation popup");
		return userCredentials;
	}
public void clickOnResetPasswordOKButton(){
	this.waitForPageToLoad(PAGE_LOADING);
	this.click(RESETPASSWORD_OKBUTTON);
	reportInfo("Clicking on ResetPassword OK Button.");
}

}
