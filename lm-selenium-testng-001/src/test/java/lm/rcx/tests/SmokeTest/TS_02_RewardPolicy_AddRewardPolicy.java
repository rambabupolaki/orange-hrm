package lm.rcx.tests.SmokeTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import lm.rcx.pojo.RewardPolicyPojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebDriverManager;
import selenium.framework.pages.HomePage;
import selenium.framework.pages.LoginPage;
import selenium.framework.pages.PoliciesPage;
import selenium.framework.pages.ProgramsPage;
import selenium.framework.pages.RewardPoliciesPage;

public class TS_02_RewardPolicy_AddRewardPolicy extends CommonMethods{
	String className = this.getClass().getSimpleName();
	WebDriver driver;
	LoginPage loginPage = null;
	HomePage homePage = null;
	ProgramsPage programsPage=null;
	PoliciesPage policiesPage=null;
	RewardPoliciesPage rewardPoliciesPage=null;
	@Test
	public void TC_01_AddRewardPolicy(){
		String testcaseName = new Object(){}.getClass().getEnclosingMethod().getName();
        ReporterTextBold("Executing Test Case : "+testcaseName);
        RewardPolicyPojo rewardpolicyPojo=new RewardPolicyPojo();
        rewardPoliciesPage.clickOnAddRewardPolicyButton();
        rewardPoliciesPage.enterRewardPolicyName(rewardpolicyPojo.getName());
        rewardPoliciesPage.enterRewardPolicyDescription(rewardpolicyPojo.getDescription());
       rewardPoliciesPage.enterRewardPolicyExpirationHours(rewardpolicyPojo.getFutureDate());
        rewardPoliciesPage.clickOnActivityBasedExpirationRadioButton();
       // rewardPoliciesPage.selectIntendedUse();
        rewardPoliciesPage.clickOnAddRewardPolicyOKButton();
        rewardPoliciesPage.clickOnAdvancedSearchButton();
        rewardPoliciesPage.enterRewardPolicySearchInput(rewardpolicyPojo.getName());
        rewardPoliciesPage.clickOnAddRewardPolicyOKButton();
        String expected=rewardpolicyPojo.getName();
		String actual=rewardPoliciesPage.getText(rewardPoliciesPage.REWARD_POLICY_TABLE_NAME_COLUMN,"Fetching RewardPolicy Name.");
		rewardPoliciesPage.assertText(expected, actual, rewardPoliciesPage.REWARD_POLICY_TABLE_NAME_COLUMN, "Validating RewardPolicy NAME");
		Assert.assertEquals(expected, actual, "Validating RewardPolicy NAME Failed.");
        
	}
	@BeforeMethod
	public void beforeMethod() {
		programsPage = homePage.clickOnProgramsMenuButton();
		programsPage.clickOnRuleFolder();
		policiesPage=programsPage.navigateToPolicies();
		rewardPoliciesPage=policiesPage.clickOnRewardPolicies();
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

	@AfterClass(alwaysRun=true) 
	public void afterClass(){
		closeBrowser();
	}

}
