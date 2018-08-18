package lm.rcx.tests.SmokeTest;
	import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import lm.rcx.pojo.TierPoliciesPojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebDriverManager;
import selenium.framework.pages.HomePage;
import selenium.framework.pages.LoginPage;
import selenium.framework.pages.PoliciesPage;
import selenium.framework.pages.ProgramsPage;
import selenium.framework.pages.TierPoliciesPage;

	public class TS_04_TierPolicies_AddTierPolicy extends CommonMethods {
		WebDriver driver;
		LoginPage loginPage = null;
		HomePage homePage = null;
		ProgramsPage programspage=null;
		TierPoliciesPage tierpoliciespage = null;
		PoliciesPage policiesPage=null;

		@Test(priority = 0)
		public void TC_01_ValidateCreatingTierpoliciesWithAllFields() {
			String testcaseName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			ReporterTextBold("Executing Test Case : " + testcaseName);
			TierPoliciesPojo tierpolicypojo=new TierPoliciesPojo();
			tierpoliciespage=policiesPage.clickOnTierPolicies();
			tierpoliciespage.clickOnAddTierPolicyButton();
			tierpoliciespage.enterName(tierpolicypojo.getName());
			tierpoliciespage.clickOnAddlevelButton();
			tierpoliciespage.enterColorInput(tierpolicypojo.getColor());
			tierpoliciespage.enterLevelName(tierpolicypojo.getName());
			tierpoliciespage.selectExpiryUnit();
			tierpoliciespage.selectExpirationSnapTo();
			//tierpoliciespage.enterOffsetValue(generateRandomNumbers(2));
			tierpoliciespage.clickOnLevelOkButton(true);
			tierpoliciespage.clickOnOKButton();
			tierpoliciespage.enterSearchInput(tierpolicypojo.getName());
			String expected=tierpolicypojo.getName();
			String actual=tierpoliciespage.getTierPolicyText(tierpoliciespage.VALIDATE_TIERPOLICIES, "Fetching tier policy name");
			tierpoliciespage.assertText(expected, actual, tierpoliciespage.VALIDATE_TIERPOLICIES, "Validating TierPolicy NAME");
			Assert.assertEquals(expected, actual, "Validating TierPolicy NAME Failed.");
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


