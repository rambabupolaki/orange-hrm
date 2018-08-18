package selenium.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import selenium.framework.common.PageControls;

public class MyAccountPage extends PageControls {

	private static final By MY_ACCOUNT_LINK = By.xpath("//a[@href='#/ussettings']");
	private static final By CHANGE_PASSWORD_BUTTON = By.xpath(".//*[@id='content']/div/div/h3/a[2]");
	private static final By RESET_UI_BUTTON = By.xpath(".//*[@id='content']/div/div/h3/a[1]");
	private static final By OLD_PASSWORD_INPUT = By.name("oldPassword");
	private static final By PASSWORD_INPUT = By.name("password");
	private static final By REPEAT_PASSWORD_INPUT = By.name("password2");
	private static final By OK_BUTTON = By.xpath("//button[@class='btn btn-primary ok_button']");
	private static final By CANCEL_BUTTON = By.xpath("//button[@class='btn btn-default cancel_button']");
	private static final By MY_ACCOUNT_COLLAPSE_BUTTON = By.xpath(".//*[@id='wid-id-myAccountWiget']/header/div/a/i");
	private static final By INVALID_ERROR = By.xpath(".//em[@class='invalid ng-binding ng-scope']");
	private static final By PAGE_LOADING = By.xpath("//div[@class='loading' and style='display: block;']");
	private static final By PASSWORD_CHANGED_SUCCESSFULLY_POPUP = By.xpath(".//*[@class='toast-message']");
	private static final By ERROR_VALIDATIONS = By.xpath("//*[@class='invalid ng-binding ng-scope']");

	public MyAccountPage(WebDriver webDriver) {
		super(webDriver);
	}


	public void clickOnMyAccountLink() {
		click(MY_ACCOUNT_LINK);
	}
	public void navigateToMyAccountPage(){

		String href=getAttribute(MY_ACCOUNT_LINK, "href");
		driver.navigate().to(href);
	}

	public void clickOnChangePassword() {
		click(CHANGE_PASSWORD_BUTTON);
		reportInfo("Clicked on Change Password Button");
		waitForPageToLoad(PAGE_LOADING);

	}
	public void enterOldPassword(String oldpassword) {
		type(OLD_PASSWORD_INPUT, oldpassword);
		reportInfo("Entered Old Password. :"+oldpassword);
	}

	public void enterPassword(String password) {
		type(PASSWORD_INPUT, password);
		reportInfo("Password Entered. :"+password);
	}
	public void enterRepeatPassword(String repeatPassword) {
		type(REPEAT_PASSWORD_INPUT,repeatPassword);
		reportInfo("Password Re-Entered. :"+repeatPassword);
	}

	public void clickOnResetUI() {
		click(RESET_UI_BUTTON);
		reportInfo("Clicked on Reset UI Button");
		waitForPageToLoad(PAGE_LOADING);
	}

	public void clickOnOkButton() {
		click(OK_BUTTON);
		reportInfo("Clicked on Reset Password OK Button");
		//waitForPageToLoad(PAGE_LOADING);
	}

	public void clickOnCancelButton() {
		click(CANCEL_BUTTON);
	}
	public void clickOnMyAccountCollapse()
	{
		click(MY_ACCOUNT_COLLAPSE_BUTTON);
	}

	public void screenshotOfInvalidError(String filepath) {
		elementHighlighter(INVALID_ERROR);
		elementScreenshot(INVALID_ERROR);
	}
	public void assertChangePasswordpopUp(String expected, String testType){
		reportInfo("Asserting Change Password PopUP.");
		System.out.println(this.getText(PASSWORD_CHANGED_SUCCESSFULLY_POPUP));
		try {
			if (this.getText(PASSWORD_CHANGED_SUCCESSFULLY_POPUP).equals(expected)) {
				Assert.assertEquals(this.getText(PASSWORD_CHANGED_SUCCESSFULLY_POPUP), expected);
				reportPassedStatus("Password Changed successfully");
				String successFilePath = elementScreenshot(PASSWORD_CHANGED_SUCCESSFULLY_POPUP);
				reportSuccessScreenshot(successFilePath,"");
			}

			else {
				String successFilePath = elementScreenshot(PASSWORD_CHANGED_SUCCESSFULLY_POPUP);
				reportFailureScreenshot(successFilePath);

			}

		} catch(Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Change Password Assertion Failed");
		}


	}
	public void assertErrorValidation(String testType){
		reportInfo("Checking Error Message");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(ERROR_VALIDATIONS);
				reportSuccessScreenshot(successFilePath,"");
				reportPassedStatus("Error Message Handled.");
			}
			else if (testType.equalsIgnoreCase("invalid")) {
			}
		} catch(Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}
}

