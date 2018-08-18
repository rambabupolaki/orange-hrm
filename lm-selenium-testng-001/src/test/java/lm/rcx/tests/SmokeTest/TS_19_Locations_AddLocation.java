package lm.rcx.tests.SmokeTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import lm.rcx.pojo.LocationPojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebDriverManager;
import selenium.framework.pages.HomePage;
import selenium.framework.pages.LoginPage;
import selenium.framework.pages.ReferenceDataPage;
import selenium.framework.pages.ReferenceData_LocationsPage;

public class TS_19_Locations_AddLocation extends CommonMethods {
	WebDriver driver;
	LoginPage loginPage = null;
	HomePage homePage = null;
	ReferenceDataPage referenceDataPage=null;
	ReferenceData_LocationsPage locationPage = null;
	LocationPojo location = new LocationPojo();
	String Name;
	
	

	@Test(priority=0,description="This test case is related to Creating Location with all fields",groups={"mod-Locations", "auth-Madhuri"})
	public void TC_01_ValidateCreatingLocationWithAllFields() {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
		LocationPojo pj = new LocationPojo();
		locationPage.addNewLocations();
		locationPage.enterLocationName(pj.getName());
		locationPage.enterLocationNumber(pj.getNumber());
		locationPage.enterDescription(pj.getdescription());
		locationPage.enterCity(pj.getcity());
		locationPage.enterState(pj.getstate());
		locationPage.enterZipcode(pj.getzipCode());
		locationPage.enterCountry(pj.getcountry());
		locationPage.clickOn_Ok_Button();
		locationPage.clickOn_Search_Button();
		String expected = pj.getName();
		locationPage.enterAdvancedSearch(pj.getName());
		locationPage.clickOn_Ok_Button();
		String actual = locationPage.getText(locationPage.VALIDATE_LOCATIONNAME,"Fetching Location Name.");
		locationPage.assertText(expected, actual, locationPage.VALIDATE_LOCATIONNAME, "Validating Location NAME");
		Assert.assertEquals(expected, actual, "Validating Location NAME Failed.");
	}
	
	@Test(priority=1,description="This test case is related to Creating Location with all fields",groups={"mod-Locations", "auth-Madhuri"})
	public void TC_02_ValidateCreatingLocationWithMandatoryFields(){
		String testcaseName = new Object(){}.getClass().getEnclosingMethod().getName();
        ReporterTextBold("Executing Test Case : "+testcaseName);
        LocationPojo pj=new LocationPojo();
		locationPage.addNewLocations();
		locationPage.enterLocationName(pj.getName());
		locationPage.enterLocationNumber(pj.getNumber());
		locationPage.clickOn_Ok_Button();
		locationPage.clickOn_Search_Button();
		String expected = pj.getName();
		locationPage.enterAdvancedSearch(pj.getName());
		locationPage.clickOn_Ok_Button();
		String actual = locationPage.getText(locationPage.VALIDATE_LOCATIONNAME,"Fetching Location Name.");
		locationPage.assertText(expected, actual, locationPage.VALIDATE_LOCATIONNAME, "Validating Location NAME");
		Assert.assertEquals(expected, actual, "Validating Location NAME Failed.");
}
	@BeforeMethod
	public void beforeMethod() {
		referenceDataPage = homePage.clickonReferenceData();
		locationPage=referenceDataPage.navigateToLocationsPage();

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
