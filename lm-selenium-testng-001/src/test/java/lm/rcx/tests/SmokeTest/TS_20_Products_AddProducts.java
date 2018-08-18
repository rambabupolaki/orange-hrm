package lm.rcx.tests.SmokeTest;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import lm.rcx.pojo.Products_Pojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebDriverManager;
import selenium.framework.pages.HomePage;
import selenium.framework.pages.LoginPage;
import selenium.framework.pages.ProductsPage;
import selenium.framework.pages.ReferenceDataPage;

public class TS_20_Products_AddProducts extends CommonMethods {
String className = this.getClass().getSimpleName();
	
	LoginPage loginPage = null;
	HomePage homePage = null;
	ReferenceDataPage referenceDataPage=null;
	ProductsPage productsPage=null;
	private WebDriver driver;
	@Test(priority=0)
	
	public void TC_01_ValidateAddProductWithAllFields(){
		String testcaseName = new Object(){}.getClass().getEnclosingMethod().getName();
        ReporterTextBold("Executing Test Case : "+testcaseName);
        Products_Pojo product = new Products_Pojo();
        productsPage.addNewProduct();
        productsPage.enterProductSKUName(product.getskuname());
        productsPage.enterName(product.getName());
        productsPage.category(product.getCategory());
        productsPage.subCategory(product.getSubCategory());
        productsPage.style(product.getStyle());
        productsPage.description(product.getDescription());
        productsPage.cost((product.getCost()+""));
        productsPage.Ok_Button();
        productsPage.Search_bar();
        productsPage.productNameSearch(product.getName());
        productsPage.clickOn_Ok_Button();
        String expected = product.getName();
		String actual = productsPage.getText(productsPage.VALIDATE_PRODUCTNAME,"Fetching Product Name.");
		productsPage.assertText(expected, actual, productsPage.VALIDATE_PRODUCTNAME, "Validating Product NAME");
		Assert.assertEquals(expected, actual, "Validating Product NAME Failed.");
	}
	
	@Test(priority=1)
	public void TC_01_ValidateAddProductWithMandatoryFields(){
		String testcaseName = new Object(){}.getClass().getEnclosingMethod().getName();
        ReporterTextBold("Executing Test Case : "+testcaseName);
        Products_Pojo product = new Products_Pojo();
        productsPage.addNewProduct();
        productsPage.enterProductSKUName(product.getProductName());
        productsPage.enterName(product.getName());
        productsPage.Ok_Button();
        productsPage.Search_bar();
        productsPage.productNameSearch(product.getName());
        productsPage.clickOn_Ok_Button();
        String expected = product.getName();
        String actual = productsPage.getText(productsPage.VALIDATE_PRODUCTNAME,"Fetching Product Name.");
		productsPage.assertText(expected, actual, productsPage.VALIDATE_PRODUCTNAME, "Validating Product NAME");
		Assert.assertEquals(expected, actual, "Validating Product NAME Failed.");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		referenceDataPage = homePage.clickonReferenceData();
		productsPage=referenceDataPage.navigateToProductsPage();
	}
	
	@AfterMethod
	public void afterMethod() {
	}
	
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
}
