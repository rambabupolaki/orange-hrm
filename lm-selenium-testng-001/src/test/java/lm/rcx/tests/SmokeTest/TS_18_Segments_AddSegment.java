package lm.rcx.tests.SmokeTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import lm.rcx.pojo.ReferenceData_Segments_Pojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebDriverManager;
import selenium.framework.pages.HomePage;
import selenium.framework.pages.LoginPage;
import selenium.framework.pages.ReferenceDataPage;
import selenium.framework.pages.ReferenceData_Segments;

public class TS_18_Segments_AddSegment extends CommonMethods {
	String className = this.getClass().getSimpleName();

	LoginPage loginPage = null;
	HomePage homePage = null;
	ReferenceData_Segments segmentPage = null;
	ReferenceDataPage referencePage = null;

	private WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = WebDriverManager.getWebDriver();
		System.out.println(className + " : " + driver);
		loginPage = new LoginPage(driver);
		homePage = loginPage.login();
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowser();
	}

	@BeforeMethod
	public void beforeMethod() {
		referencePage = homePage.clickonReferenceData();
		segmentPage = referencePage.clickonSegments();
	}

	@AfterMethod
	public void afterMethod() {
	}

	@Test(priority=1,description="This testcase is related to Add Segment with mandatory fields",groups={"mod-Segments", "auth-Madhuri"}) 
	public void TC_01_ValidateCreatingSegmentssWithAllFields(){ String testcaseName = new
	Object(){}.getClass().getEnclosingMethod().getName();
	ReporterTextBold("Executing Test Case : "+testcaseName);
	ReferenceData_Segments_Pojo seg = new ReferenceData_Segments_Pojo();
	segmentPage.addNewSegment(); segmentPage.enterName(seg.getSegmentName());
	segmentPage.description(seg.getDescription());
	segmentPage.type(seg.getType());
	segmentPage.Effective_Dt_Input(seg.Effective_Dt());
	segmentPage.Expiry_Dt(seg.Expiry_Dt()); segmentPage.Ok_Button();
	segmentPage.searchButton(); 
	segmentPage.enterAdvancedSearch(seg.getSegmentName());
	segmentPage.clickOn_Ok_Button();
	String expected = seg.getSegmentName();
	String actual = segmentPage.getText(segmentPage.VALIDATE_SEGMENTNAME,"Fetching Segments Name.");
	segmentPage.assertText(expected, actual,segmentPage.VALIDATE_SEGMENTNAME, "Validating Segments NAME");
	Assert.assertEquals(expected, actual,"Validating Segments NAME Failed."); 
	}

	@Test(priority=0,description="This testcase is related to Add Segment with mandatory fields",groups={"mod-Segments", "auth-Madhuri"})
	public void TC_02_CreatingSegmentssWithMandatoryFields() {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
		ReferenceData_Segments_Pojo seg = new ReferenceData_Segments_Pojo();
		segmentPage.addNewSegment();
		segmentPage.enterName(seg.getSegmentName());
		segmentPage.Ok_Button();
		segmentPage.searchButton();
		segmentPage.enterAdvancedSearch(seg.getSegmentName());
		segmentPage.clickOn_Ok_Button();
		String expected = seg.getSegmentName();
		String actual = segmentPage.getText(segmentPage.VALIDATE_SEGMENTNAME,"Fetching Segments Name.");
		segmentPage.assertText(expected, actual,segmentPage.VALIDATE_SEGMENTNAME, "Validating Segments NAME");
		Assert.assertEquals(expected, actual,"Validating Segments NAME Failed."); 

	}

}
