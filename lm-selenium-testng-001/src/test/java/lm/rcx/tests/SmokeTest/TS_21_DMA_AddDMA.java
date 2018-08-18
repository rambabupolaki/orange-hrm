package lm.rcx.tests.SmokeTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import lm.rcx.pojo.ReferenceDataDMApojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebDriverManager;
import selenium.framework.pages.DMAPage;
import selenium.framework.pages.HomePage;
import selenium.framework.pages.LoginPage;
import selenium.framework.pages.ReferenceDataPage;

public class TS_21_DMA_AddDMA extends CommonMethods {

	String className = this.getClass().getSimpleName();
	LoginPage loginPage = null;
	HomePage homePage = null;
	DMAPage dmaPage = null;
	ReferenceDataPage referencePage = null;
	String Name;

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
		dmaPage = referencePage.clickonDMA();
	}

	@AfterMethod
	public void afterMethod() {
		dmaPage.clickOnRemoveButton();

	}

	@Test(priority = 1, description = "This test case is related to Creating DMA with all fields", groups = { "mod-DMA",
			"auth-Madhuri" })
	public void TC_02_ValidateCreatingDMAsWithAllFields() {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
		ReferenceDataDMApojo dma = new ReferenceDataDMApojo();
		dmaPage.addNewDMA();
		dmaPage.enterDMAName(dma.getDMAName());
		dmaPage.DMA_description(dma.getDMADescription());
		dmaPage.DMA_zipcodes(dma.getZipcodes());
		dmaPage.NewOk_Button();
		dmaPage.searchButton();
		String expected = dma.getDMAName();
		dmaPage.enterAdvancedSearch(dma.getDMAName());
		dmaPage.clickOn_Ok_Button();
		String actual = dmaPage.getText(dmaPage.VALIDATE_DMANAME, "Fetching DMA Name.");
		dmaPage.assertText(expected, actual, dmaPage.VALIDATE_DMANAME, "Validating DMA NAME");
		Assert.assertEquals(expected, actual, "Validating DMA NAME Failed.");
	}

	@Test(priority = 0, description = "This test case is related to Creating DMA with mandatory fields", groups = {
			"mod-DMA", "auth-Madhuri" })
	public void TC_01_CreatingDMAsWithMandatoryFields() {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
		ReferenceDataDMApojo dma = new ReferenceDataDMApojo();
		dmaPage.addNewDMA();
		dmaPage.enterDMAName(dma.getDMAName());
		dmaPage.NewOk_Button();
		dmaPage.searchButton();
		String expected = dma.getDMAName();
		dmaPage.enterAdvancedSearch(dma.getDMAName());
		dmaPage.clickOn_Ok_Button();
		String actual = dmaPage.getText(dmaPage.VALIDATE_DMANAME, "Fetching DMA Name.");
		dmaPage.assertText(expected, actual, dmaPage.VALIDATE_DMANAME, "Validating DMA NAME");
		Assert.assertEquals(expected, actual, "Validating DMA NAME Failed.");
	}
}