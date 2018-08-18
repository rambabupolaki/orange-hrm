package lm.rcx.tests.SmokeTest;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import lm.rcx.pojo.PartnersPojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebDriverManager;
import selenium.framework.pages.HomePage;
import selenium.framework.pages.LoginPage;
import selenium.framework.pages.PartnersPage;
import selenium.framework.pages.PoliciesPage;
import selenium.framework.pages.ProgramsPage;

public class TS_05_Partners_AddPartner extends CommonMethods {
	WebDriver driver;
	LoginPage loginPage = null;
	HomePage homePage = null;
	ProgramsPage programspage = null;
	PartnersPage partnerspage = null;
	PoliciesPage policiesPage = null;
	HashMap<String,String> programDetails=null;
	HashMap<String,String> partnerDetails=null;
	
	@Test(priority = 0)
	public void TC_01_ValidateCreatingPartnersWithAllFields() {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
		PartnersPojo partnerpojo = new PartnersPojo();
		partnerspage = policiesPage.clickOnPartners();
		partnerspage.clickOnAddPartnerButton();
		partnerspage.enterStatus("Active");
		partnerspage.enterName(partnerpojo.getName());
		partnerspage.enterCode(partnerpojo.getCode());
		partnerspage.enterEmail(partnerpojo.getEmail());
		partnerspage.enterPhone(partnerpojo.getPhone());
		partnerspage.enterContatctFirst(partnerpojo.getContactFirst());
		partnerspage.enterContactLast(partnerpojo.getContactLast());
		partnerspage.clickOnAdvancedSearchButton();
		System.out.println(partnerpojo.getName());
		partnerspage.enterSearchInput(partnerpojo.getName());
		partnerspage.clickOnOkButton();
		String expected = partnerpojo.getName();
		String actual = partnerspage.getText(partnerspage.VALIDATE_PARTNERS, "Fetching Partners Name.");
		partnerspage.assertText(expected, actual, partnerspage.VALIDATE_PARTNERS, "Validating Partners Name");
		Assert.assertEquals(expected, actual, "Validating Partners NAME Failed.");

	}

	@BeforeMethod
	public void BeforeMethod() {
		programspage=homePage.clickOnProgramsMenuButton();
		programspage.clickOnRuleFolder();
		policiesPage=programspage.navigateToPolicies();

	}

	@BeforeClass
	public void beforeClass() {
		driver = WebDriverManager.getWebDriver();
		loginPage = new LoginPage(driver);
		homePage = loginPage.login();

	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowser();
	}

}
