package lm.rcx.tests.SmokeTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import lm.rcx.pojo.ReferenceData_Orgs_Pojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebDriverManager;
import selenium.framework.pages.HomePage;
import selenium.framework.pages.LoginPage;
import selenium.framework.pages.OrgsPage;
import selenium.framework.pages.ReferenceDataPage;

public class TS_17_Org_ValidateOrgDetails extends CommonMethods{
String className = this.getClass().getSimpleName();
	
	LoginPage loginPage = null;
	HomePage homePage = null;
	OrgsPage orgsPage = null;
	ReferenceDataPage referencePage = null;

	private WebDriver driver;
	
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
	@BeforeMethod
	public void beforeMethod() {
		referencePage=homePage.clickonReferenceData();
		orgsPage = referencePage.clickonOrgs();
	}
	@AfterMethod
	public void afterMethod() {
	}
	
	@Test(priority=0)
	public void TC_01_VerifyOrgDetails(){
		String testcaseName = new Object(){}.getClass().getEnclosingMethod().getName();
        ReporterTextBold("Executing Test Case : "+testcaseName);
        ReferenceData_Orgs_Pojo org = new ReferenceData_Orgs_Pojo();
       String orgName=orgsPage.getOrgName();
        orgsPage.Search_bar(orgName);
        orgsPage.assertOrgsName(org.getOrgsName(), "valid");
		
	}  
	
}


