package lm.rcx.tests.SmokeTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import lm.rcx.pojo.EnumPojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebDriverManager;
import selenium.framework.pages.HomePage;
import selenium.framework.pages.LoginPage;
import selenium.framework.pages.ReferenceDataPage;
import selenium.framework.pages.ReferenceData_EnumsPage;

public class TS_22_Enums_AddEnum  extends CommonMethods {
	WebDriver driver;
	LoginPage loginPage = null;
	HomePage homePage = null;
	ReferenceDataPage referenceDataPage=null;
	ReferenceData_EnumsPage EnumsPage = null;

	@Test(priority=0,description="This testcase is related to add enum",groups={"mod-Enums", "auth-Madhuri"})
	public void TC_01_ValidateCreatingEnumWithAllFields() {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
		EnumPojo enu = new EnumPojo();
		EnumsPage.addNewEnum();
		EnumsPage.enterEnumType(enu.getType());
		EnumsPage.enterEnumValue(enu.getValue());
		EnumsPage.enterEnumLabel(enu.getLabel());
		EnumsPage.enterEnumDescription(enu.getDescription());
		EnumsPage.clickOn_Ok_Button();
		EnumsPage.searchButton();
		String expected = enu.getType();
		EnumsPage.enterAdvancedSearch(enu.getType());
		EnumsPage.clickOn_Ok_Button();
		String actual = EnumsPage.getText(EnumsPage.VALIDATE_ENUM,"Fetching Enum Name.");
		EnumsPage.assertText(expected, actual, EnumsPage.VALIDATE_ENUM, "Validating Enum NAME");
		Assert.assertEquals(expected, actual, "Validating Enum NAME Failed.");

	}

	@Test(priority=1,description="This testcse is related to add enum with mandatory fields",groups={"mod-Enums", "auth-Madhuri"})
	public void TC_02_ValidateCreatingEnumWithMandatoryFields(){
		String testcaseName = new Object(){}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : "+testcaseName);
		EnumPojo enu = new EnumPojo();
		EnumsPage.addNewEnum();
		EnumsPage.enterEnumType(enu.getType());
		EnumsPage.enterEnumValue(enu.getValue());
		EnumsPage.enterEnumLabel(enu.getLabel());
		EnumsPage.clickOn_Ok_Button();
		EnumsPage.searchButton();
		String expected = enu.getType();
		EnumsPage.enterAdvancedSearch(enu.getType());
		EnumsPage.clickOn_Ok_Button();
		String actual = EnumsPage.getText(EnumsPage.VALIDATE_ENUM,"Fetching Enum Name.");
		EnumsPage.assertText(expected, actual, EnumsPage.VALIDATE_ENUM, "Validating Enum NAME");
		Assert.assertEquals(expected, actual, "Validating Enum NAME Failed.");

	}
	@BeforeMethod
	public void beforeMethod() {
		referenceDataPage = homePage.clickonReferenceData();
		EnumsPage=referenceDataPage.navigateToEnumPage();
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