package lm.rcx.tests.SmokeTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import lm.rcx.pojo.PursePoliciesPojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebDriverManager;
import selenium.framework.pages.HomePage;
import selenium.framework.pages.LoginPage;
import selenium.framework.pages.PoliciesPage;
import selenium.framework.pages.ProgramsPage;
import selenium.framework.pages.PursePoliciesPage;

public class TS_03_PursePolicies_AddPolicies extends CommonMethods {
	WebDriver driver;
	LoginPage loginPage = null;
	HomePage homePage = null;
	ProgramsPage programspage=null;
	PursePoliciesPage pursepoliciespage = null;
	PoliciesPage policiesPage=null;

	@Test(priority = 0)
	public void TC_01_ValidateCreatingPursrpoliciesWithAllFields() {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
		
		PursePoliciesPojo pursepolicypojo=new PursePoliciesPojo();
		String testData=pursepolicypojo.getName();
		pursepoliciespage=policiesPage.clickOnPursePolicies();
		pursepoliciespage.clickOnAddPursePolicyButton();
		pursepoliciespage.enterName(testData);
		pursepoliciespage.enterDescription(pursepolicypojo.getdescription());
		/*pursepoliciespage.enterEscrowsIn(pursepolicypojo.getEscrowsIn());
		pursepoliciespage.enterExpiresIn(pursepolicypojo.getExpiresIn());*/
		pursepoliciespage.clickOnAddRangeButton();
		pursepoliciespage.enterStartRange(pursepolicypojo.getStartRange());
		pursepoliciespage.enterEndRange(pursepolicypojo.getEndRange());
		pursepoliciespage.enterColorInput(pursepolicypojo.getColor());
		pursepoliciespage.clickOnOkButton();
		pursepoliciespage.clickOnAdvancedSearchButton();
		pursepoliciespage.enterSearchInput(testData);
		pursepoliciespage.clickOnOkButton();
		String expected=pursepolicypojo.getName();
		String actual=pursepoliciespage.getPursePolicyText(pursepoliciespage.VALIDATE_PURSEPOLICIES, "Fetching purse policy name");
		pursepoliciespage.assertText(expected, actual, pursepoliciespage.VALIDATE_PURSEPOLICIES, "Validating PursePolicy NAME");
		Assert.assertEquals(expected, actual, "Validating PursePolicy NAME Failed.");
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

	@AfterClass(alwaysRun=true) 
	public void afterClass() {
		closeBrowser();
	}

}
