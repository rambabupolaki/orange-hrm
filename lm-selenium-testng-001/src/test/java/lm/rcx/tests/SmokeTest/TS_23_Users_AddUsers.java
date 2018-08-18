package lm.rcx.tests.SmokeTest;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import lm.rcx.pojo.UsersPojo;
import lm.rcx.validations.Success_Validations;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebDriverManager;
import selenium.framework.pages.HomePage;
import selenium.framework.pages.LoginPage;
import selenium.framework.pages.SettingsPage;
import selenium.framework.pages.UsersPage;

public class TS_23_Users_AddUsers extends CommonMethods{
	String className = this.getClass().getSimpleName();
	WebDriver driver;
	LoginPage loginPage = null;
	HomePage homePage = null;
	UsersPage usersPage = null;
	SettingsPage settingsPage = null;

	String name, email;

	@Test(priority=0,description="This testcse is related to create user with all fields",groups={"mod-Users", "auth-Madhuri"})
	public void TC_01_CreatingUserWithAllFields() {
		String testcaseName = new Object(){}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : "+testcaseName);
		UsersPojo userPojo= new UsersPojo();
		settingsPage = homePage.clickOnSettingsMenuButton();
		usersPage = settingsPage.navigateToUsersPage();
		usersPage.clickAddUserButton();
		usersPage.enterLoginName(userPojo.getName());
		usersPage.enterEmailAddress(userPojo.getEmail());
		//usersPage.enterTokenExpiresInMinute(userPojo.getTokenExpiresInMinute());
		usersPage.clickOnBlockedRadioButton();
		usersPage.clickOnAllowMutipleSessionsRadioButton();
		usersPage.clickOnEnableSessionManagementRadioButton();
		usersPage.clickOnAddUserOkButton();
		usersPage.clickOnResetPasswordOKButton();
		//String expected=Success_Validations.UserCreatePopUp;
		//String actual=usersPage.getText(usersPage.USER_SUCCESFULLY_ADDED_POPUP, "Fetching User Creation popup.");
		//usersPage.assertText(expected, actual, usersPage.USER_SUCCESFULLY_ADDED_POPUP, "Validating User Creation popup");
		usersPage.clickOnSearchButton();
		usersPage.enterSearchInput(userPojo.getName());
		usersPage.clickOnAddUserOkButton(true);
		String expectedName=userPojo.getName();
		String actualName=usersPage.getText(usersPage.USER_NAME_FIELD, "Fetching User Name.");
		usersPage.assertText(expectedName, actualName, usersPage.USER_NAME_FIELD, "Validating User NAME");
		String expectedEmail=userPojo.getEmail();
		String actualEmail=usersPage.getText(usersPage.USER_EMAIL_FIELD, "Fetching User Email.");
		usersPage.assertText(expectedEmail, actualEmail, usersPage.USER_NAME_FIELD, "Validating User Email");
		Assert.assertEquals(expectedEmail, actualEmail, "Validating User Email Failed.");
		//Assert.assertEquals(expected, actual, "Validating User Creation popup Failed.");
		Assert.assertEquals(expectedName, actualName, "Validating User NAME Failed.");
	}

	@Test(priority=1,description="This testcse is related to create user with mandatory fields",groups={"mod-Users", "auth-Madhuri"})
	public void TC_02_CreateUserWithMandatoryFields() {
		String testcaseName = new Object(){}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : "+testcaseName);
		UsersPojo userPojo= new UsersPojo();
		
		usersPage.clickAddUserButton();
		usersPage.enterLoginName(userPojo.getName());
		usersPage.enterEmailAddress(userPojo.getEmail());
		//usersPage.enterTokenExpiresInMinute(userPojo.getTokenExpiresInMinute());
		usersPage.clickOnAddUserOkButton();
		usersPage.clickOnResetPasswordOKButton();
		//String expected=Success_Validations.UserCreatePopUp;
		//String actual=usersPage.getText(usersPage.USER_SUCCESFULLY_ADDED_POPUP, "Fetching User Creation popup.");
		//usersPage.assertText(expected, actual, usersPage.USER_SUCCESFULLY_ADDED_POPUP, "Validating User Creation popup");
		usersPage.clickOnSearchButton();
		usersPage.enterSearchInput(userPojo.getName());
		usersPage.clickOnAddUserOkButton(true);
		String expectedName=userPojo.getName();
		String actualName=usersPage.getText(usersPage.USER_NAME_FIELD, "Fetching User Name.");
		usersPage.assertText(expectedName, actualName, usersPage.USER_NAME_FIELD, "Validating User NAME");
		String expectedEmail=userPojo.getEmail();
		String actualEmail=usersPage.getText(usersPage.USER_EMAIL_FIELD, "Fetching User Email.");
		usersPage.assertText(expectedEmail, actualEmail, usersPage.USER_NAME_FIELD, "Validating User Email");
		Assert.assertEquals(expectedEmail, actualEmail, "Validating User Email Failed.");
		//Assert.assertEquals(expected, actual, "Validating User Creation popup Failed.");
		Assert.assertEquals(expectedName, actualName, "Validating User NAME Failed.");

	}


	@BeforeMethod
	public void beforeMethod() {

	}
	@AfterMethod
	public void afterMethod() {
		email = "";
		name = "";
		usersPage.clickOnRemoveButton();
	}

	@BeforeClass
	public void beforeClass() {
		driver =  WebDriverManager.getWebDriver();
		System.out.println(className+" : "+driver);
		loginPage = new LoginPage(driver);
		homePage = loginPage.login();
	}

	@AfterClass(alwaysRun=true)
	public void afterClass(){
		closeBrowser();
	}

}
