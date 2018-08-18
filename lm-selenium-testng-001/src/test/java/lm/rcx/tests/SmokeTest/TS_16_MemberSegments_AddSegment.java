package lm.rcx.tests.SmokeTest;

import java.awt.AWTException;

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
import selenium.framework.pages.MemberSegmentsPage;
import selenium.framework.pages.MembersPage;

public class TS_16_MemberSegments_AddSegment extends CommonMethods {
	String className = this.getClass().getSimpleName();

	LoginPage loginPage = null;
	HomePage homePage = null;
	MembersPage membersPage = null;
	String testData;
	MemberAchievementsPage memberachievementspage = null;
	MemberSegmentsPage membersegmentspage = null;
	private WebDriver driver;

	@Test(priority = 0)
	public void TC_01_ValidateAddMembersSegmentsWithAllFields() throws InterruptedException, AWTException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
		testData=getCurrentDate();
		membersegmentspage = memberachievementspage.clickOnMemberSegmentsButton();
		membersegmentspage.addSegments();
        membersegmentspage.effectiveDate(testData);
		membersegmentspage.clickOnOKButton();
		membersegmentspage.clickOn_Search_Button();
		membersegmentspage.effectiveDateStart(testData);
		membersegmentspage.effectiveDateEnd(getFutureDate());
		membersegmentspage.clickOnOKButton();
		String expected =testData;
		String actual = membersegmentspage.getText(membersegmentspage.VALIDATE_SEGMENTEFFECTIVEDATE, "Fetching Member Segment Name.");
		membersegmentspage.assertText(expected, actual, membersegmentspage.VALIDATE_SEGMENTEFFECTIVEDATE, "Validating Member Segment Name");
		Assert.assertEquals(expected, actual, "Validating Segments NAME Failed.");
	}

	@BeforeMethod
	public void beforeMethod() {
		MemberPojo mp = new MemberPojo();
		membersPage = homePage.clickOnMembersMenuButton();
		membersPage.selectProgram();
		memberachievementspage = membersPage.clickOnMemberDetailsButton();
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
