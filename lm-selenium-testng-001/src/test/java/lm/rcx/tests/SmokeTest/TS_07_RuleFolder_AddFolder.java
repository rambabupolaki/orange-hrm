package lm.rcx.tests.SmokeTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import lm.rcx.pojo.Rules_Pojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebDriverManager;
import selenium.framework.pages.HomePage;
import selenium.framework.pages.LoginPage;
import selenium.framework.pages.ProgramsPage;
import selenium.framework.pages.RulesPage;

public class TS_07_RuleFolder_AddFolder extends CommonMethods {
	WebDriver driver;
	LoginPage loginPage = null;
	HomePage homePage = null;
	ProgramsPage programsPage=null;
	RulesPage rulePage=null;

	@Test(priority=0)
	public void TC_01_ValidateCreatingRuleFolderWithAllFields(){
		String testcaseName = new Object(){}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : "+testcaseName);
		Rules_Pojo pj=new Rules_Pojo();
		rulePage.clickOnNewRuleFolderButton();
		rulePage.enterRuleFolderName(pj.getRuleName());
		rulePage.enterRuleFolderDescription(pj.getDescription());
		rulePage.ruleOkButton();
		rulePage.scrollDown();
		rulePage.clickOnRulesFolderSearchButton();
		String expected =pj.getRuleName();
		//rulePage.clickOnRuleFolderSearchButton();
		rulePage.enterRuleFolderSearchInput(pj.getRuleName());
		rulePage.ruleOkButton();
		String actual = rulePage.getText(rulePage.VALIDATE_RULE_FOLDER,"Fetching RuleFolder Name.");
		rulePage.assertText(expected, actual, rulePage.VALIDATE_RULE_FOLDER, "Validating RuleFolder NAME");
		Assert.assertEquals(expected, actual, "Validating RuleFolder NAME Failed.");
	}

	@Test(priority=1)
	public void TC_02_ValidateCreatingRuleWithMandatoryFields(){
		String testcaseName = new Object(){}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : "+testcaseName);
		Rules_Pojo pj=new Rules_Pojo();
		rulePage.clickOnNewRuleFolderButton();
		pj.setRuleName(null);
		rulePage.enterRuleFolderName(pj.getRuleName());
		rulePage.ruleOkButton();
		rulePage.clickOnRulesFolderSearchButton();
		String expected =pj.getRuleName();
		rulePage.clickOnRuleFolderSearchButton();
		rulePage.enterRuleFolderSearchInput(pj.getRuleName());
		rulePage.ruleOkButton();
		String actual = rulePage.getText(rulePage.VALIDATE_RULE_FOLDER,"Fetching RuleFolder Name.");
		rulePage.assertText(expected, actual, rulePage.VALIDATE_RULE_FOLDER, "Validating RuleFolder NAME");
		Assert.assertEquals(expected, actual, "Validating RuleFolder NAME Failed.");
	}


	@BeforeMethod
	public void beforeMethod() {
		programsPage = homePage.clickOnProgramsMenuButton();
		rulePage= programsPage.clickOnRulesFolderLink();
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() {
	   driver =  WebDriverManager.getWebDriver();
		loginPage = new LoginPage(driver);
		homePage = loginPage.login();
	}

	@AfterClass(alwaysRun=true)
	public void afterClass() {
		//closeBrowser();
	}

}

