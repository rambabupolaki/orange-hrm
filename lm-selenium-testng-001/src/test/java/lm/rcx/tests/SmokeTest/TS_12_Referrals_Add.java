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
import selenium.framework.pages.MemberReferralsPage;
import selenium.framework.pages.MembersPage;

	public class TS_12_Referrals_Add extends CommonMethods {
		String className = this.getClass().getSimpleName();

		LoginPage loginPage = null;
		HomePage homePage = null;
		MembersPage membersPage = null;
		String testData;
		String testData1;
		MemberAchievementsPage memberachievementspage = null;
		MemberReferralsPage memberreferralspage=null;
		private WebDriver driver;

		@Test(priority = 0)
		public void TC_01_ValidateAddMembersReferralsWithAllFields() {
			String testcaseName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			ReporterTextBold("Executing Test Case : " + testcaseName);
		    testData=randomNameGenerator();
		    testData1= generateRandomNumbers(10);
			memberreferralspage=memberachievementspage.clickOnMemberReferralsButton();
			memberreferralspage.clickOnAddReferralsButton();
			memberreferralspage.enterNameInput(testData);
			memberreferralspage.enterContactInput(testData1);
			memberreferralspage.enterHandleInput(testData);
			memberreferralspage.clickOnOKButton();
			memberreferralspage.clickOn_Search_Button();
			String expected=testData;
			memberreferralspage.enterAdvancedSearch(testData);
			memberreferralspage.clickOn_Ok_Button();
			String actual=memberreferralspage.getText(memberreferralspage.VALIDATE_REFERRALS, "Fetching Referral Name.");
			memberreferralspage.assertText(expected, actual,memberreferralspage.VALIDATE_REFERRALS, "Validating Referral Name");
			Assert.assertEquals(expected, actual, "Validating Referral Name Failed.");
		}
		
		@BeforeMethod
		public void beforeMethod() {
			membersPage = homePage.clickOnMembersMenuButton();
			membersPage.selectProgram();
			memberachievementspage=membersPage.clickOnMemberDetailsButton();
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


		 @AfterClass (alwaysRun=true)
		 public void afterClass(){
			 closeBrowser();
			 }
		 

	}