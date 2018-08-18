package lm.rcx.tests.SmokeTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import lm.rcx.pojo.SecuritySetUpPojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebDriverManager;
import selenium.framework.pages.HomePage;
import selenium.framework.pages.LoginPage;
import selenium.framework.pages.SecuritySetUpPage;
import selenium.framework.pages.SettingsPage;
import selenium.framework.pages.UsersPage;

public class TS_24_SecuritySetUp_AddRole extends CommonMethods {
	String className = this.getClass().getSimpleName();
	WebDriver driver;
	LoginPage loginPage = null;
	HomePage homePage = null;
	UsersPage userspage=null;
	SettingsPage settingsPage=null;
	SecuritySetUpPage securitySetUpPage=null;
	
	@Test
	public void TC_01_ValidateAddRole(){
		String testcaseName = new Object(){}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : "+testcaseName);
		SecuritySetUpPojo securitypojo= new SecuritySetUpPojo();
		securitySetUpPage.clickOnAddRoleButton();
		securitySetUpPage.enterRoleName(securitypojo.getRoleName());
		securitySetUpPage.clickOnAddRoleOKButton();
		securitySetUpPage.enterSearchInput(securitypojo.getRoleName());
		String expected=securitypojo.getRoleName();
		String actual=securitySetUpPage.getText(securitySetUpPage.VALIDATE_ROLE_NAME, "Fetching Role Name.");
		securitySetUpPage.assertText(expected, actual, securitySetUpPage.VALIDATE_ROLE_NAME, "Validating Role NAME");
		Assert.assertEquals(expected, actual, "Validating Role NAME Failed.");
	}
	@BeforeMethod
	public void beforeMethod() {
		settingsPage =  homePage.clickOnSettingsMenuButton();
		securitySetUpPage=settingsPage.clickSecuritySetupLink();
	}
	@AfterMethod
	public void afterMethod() {
	}
	@BeforeClass
	public void beforeClass() {
		driver =  WebDriverManager.getWebDriver();
		System.out.println(className+" : "+driver);
		loginPage = new LoginPage(driver);
		
			homePage = loginPage.login();
		
	}

	@AfterClass
	public void afterClass(){
		closeBrowser();
	}


}
