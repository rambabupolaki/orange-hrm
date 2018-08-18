package lm.rcx.tests.SmokeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebDriverManager;
import selenium.framework.pages.HomePage;
import selenium.framework.pages.LoginPage;
import selenium.framework.pages.MemberAchievementsPage;
import selenium.framework.pages.MemberRewardsPage;
import selenium.framework.pages.MembersPage;

public class TS_10_MemberRewards_AddReward extends CommonMethods {
	WebDriver driver;
	LoginPage loginPage = null;
	HomePage homePage = null;
	MembersPage membersPage = null;
	MemberAchievementsPage memberAchievementsPage = null;
	MemberRewardsPage memberRewardsPage = null;
	String program;

	@Test(priority = 0)
	public void TC_01_ValidateAddRewardWithMandatoryFields() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
		String code = generateRandomExpirationHours();
		membersPage = homePage.clickOnMembersMenuButton();
		program = membersPage.selectProgram();
		memberAchievementsPage = membersPage.clickOnMemberDetailsButton();
		memberRewardsPage = memberAchievementsPage.clickOnMemberRewardsButton();
		memberRewardsPage.clickOnAddRewardButton();
		memberRewardsPage.selectRewardName();
		String expected=memberRewardsPage.enterRewardCodeInput(code);
		memberRewardsPage.clickOnOKButton();
		memberRewardsPage.clickOnAdvanceSearchButton();
		memberRewardsPage.enterAdvancedSearchCode(code);
		memberRewardsPage.clickingOnAdvancedSearchOKButton();
		String actual = memberRewardsPage.getText(memberRewardsPage.VALIDATE_MEMBERREWARDCODE, "Fetching Member Reward Code.");
		memberRewardsPage.assertText(expected, actual, memberRewardsPage.VALIDATE_MEMBERREWARDCODE, "Validating Member Reward Code");
		Assert.assertEquals(expected, actual, "Validating Member Reward NAME Failed.");
	}

	@Test(priority = 1)
	public void TC_02_ValidateAddRewardWithAllFields() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
		String code = generateRandomExpirationHours();
		String ExpirationDate = "12/29/2017";
		String str = generateRandomExpirationHours();
		System.out.println(str);
		String Usesleft = str.substring(0,1);
		memberRewardsPage.clickOnAddRewardButton();
		memberRewardsPage.selectRewardName();
		memberRewardsPage.enterDescriptionInput("You Earn a Reward");
		memberRewardsPage.enterUsesLeftInput(Usesleft);
		String expected=memberRewardsPage.enterRewardCodeInput(code);
		memberRewardsPage.enterExpiresOnInput(ExpirationDate);
		memberRewardsPage.clickOnOKButton();
		memberRewardsPage.clickOnAdvanceSearchButton();
		memberRewardsPage.enterAdvancedSearchCode(code);
		memberRewardsPage.clickingOnAdvancedSearchOKButton();
		String actual = memberRewardsPage.getText(memberRewardsPage.VALIDATE_MEMBERREWARDCODE, "Fetching Reward Code.");
		memberRewardsPage.assertText(expected, actual, memberRewardsPage.VALIDATE_MEMBERREWARDCODE, "Validating Reward Code");
		Assert.assertEquals(expected, actual, "Validating Reward NAME Failed.");
	}

	@BeforeMethod
	public void beforeMethod() {

	}

	@AfterMethod
	public void afterMethod() {

	}

	@BeforeClass
	public void beforeClass() {
		driver = WebDriverManager.getWebDriver();
		loginPage = new LoginPage(driver);
		homePage = loginPage.login();

	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		//closeBrowser();
	}

}
