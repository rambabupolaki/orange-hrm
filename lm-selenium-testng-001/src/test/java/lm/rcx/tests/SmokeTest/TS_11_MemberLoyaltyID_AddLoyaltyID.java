package lm.rcx.tests.SmokeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import lm.rcx.pojo.MemberPojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebDriverManager;
import selenium.framework.pages.HomePage;
import selenium.framework.pages.LoginPage;
import selenium.framework.pages.MemberAchievementsPage;
import selenium.framework.pages.MemberLoyaltyIDsPage;
import selenium.framework.pages.MembersPage;

public class TS_11_MemberLoyaltyID_AddLoyaltyID extends CommonMethods {
	String className = this.getClass().getSimpleName();

	LoginPage loginPage = null;
	HomePage homePage = null;
	MembersPage membersPage = null;
	String testData;
	MemberAchievementsPage memberachievementspage = null;
	MemberLoyaltyIDsPage memberloyaltyidspage=null;
	private WebDriver driver;

	@Test(priority = 0)
	public void TC_01_ValidateAddMembersLoyaltyIDsWithAllFields(){
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
		MemberPojo memberPojo=new MemberPojo();
		String loyaltycode=memberPojo.getLoyaltyIdCode();
		memberloyaltyidspage=memberachievementspage.clickOnMemberLoyaltyIDsButton();
		memberloyaltyidspage.clickOnAddLoyaltyIDButton();
		memberloyaltyidspage.selectLoyaltyIdName();
		memberloyaltyidspage.enterCodeInput(memberPojo.getLoyaltyIdCode());
		memberloyaltyidspage.clickOnnewOKButton();
		memberloyaltyidspage.clickOnSearchButton();
		memberloyaltyidspage.enterAdvancedSearch(loyaltycode);
		memberloyaltyidspage.clickOnnewOKButton();
		String expected=loyaltycode;
		String actual=memberloyaltyidspage.getText(memberloyaltyidspage.MEMBER_LOYALTYIDCODE, "Fetching Loyalty Id Code.");
		memberloyaltyidspage.assertText(expected, actual,memberloyaltyidspage.MEMBER_LOYALTYIDCODE, "Validating LoyaltyId Code");
		Assert.assertEquals(expected, actual, "Validating Loyalty Id Code Failed.");
	}
	
	@BeforeMethod
	public void beforeMethod(){
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


	@AfterClass(alwaysRun=true)
	public void afterClass(){
		closeBrowser(); 
	}


}
