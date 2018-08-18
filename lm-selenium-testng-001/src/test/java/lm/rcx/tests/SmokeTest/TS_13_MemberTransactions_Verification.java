package lm.rcx.tests.SmokeTest;
import org.openqa.selenium.WebDriver;
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
import selenium.framework.pages.MemberTranscationsPage;
import selenium.framework.pages.MembersPage;

		public class TS_13_MemberTransactions_Verification extends CommonMethods {
			String className = this.getClass().getSimpleName();

			LoginPage loginPage = null;
			HomePage homePage = null;
			MembersPage membersPage = null;
			String testData;
			MemberAchievementsPage memberachievementspage = null;
			MemberTranscationsPage membertransctionspage=null;
			private WebDriver driver;

			@Test(priority = 0)
			public void TC_01_ValidateTransactionsTab() {
				String testcaseName = new Object() {
				}.getClass().getEnclosingMethod().getName();
				ReporterTextBold("Executing Test Case : " + testcaseName);
				membertransctionspage=memberachievementspage.clickOnMemberTranscationButton();
				membertransctionspage.validationErrorPopUp("valid");
				
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


			 @AfterClass public void afterClass(){ closeBrowser(); 
			 
			 }
			 
		}




