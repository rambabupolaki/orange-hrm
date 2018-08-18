package lm.rcx.tests.SmokeTest;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import lm.rcx.services.GetAllProducts;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebDriverManager;
import selenium.framework.pages.HomePage;
import selenium.framework.pages.LoginPage;
import selenium.framework.pages.MemberAchievementsPage;
import selenium.framework.pages.MemberActivityPage;
import selenium.framework.pages.MembersPage;

public class TS_14_Activity_AddProcessActivity extends CommonMethods{
	String className = this.getClass().getSimpleName();

	LoginPage loginPage = null;
	HomePage homePage = null;
	MembersPage membersPage = null;
	String testData;
	MemberAchievementsPage memberachievementspage = null;
	MemberActivityPage memberactivitypage=null;
	private WebDriver driver;
	HashMap<String,String> productDetails=null;

	@Test(priority = 0)
	public void TC_01_ValidateMembersAddProcessActivity() {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
		memberactivitypage=memberachievementspage.clickOnMemberActivityButton();
		memberactivitypage.clickOnProcessActivityButton();
		memberactivitypage.clickOnLineItemsAddButton();
		memberactivitypage.enterProductname(productDetails.get("productName"));
		memberactivitypage.enterCouponCode(generateRandomNumbers(3));
		memberactivitypage.enterExternalTransactionId(generateRandomNumbers(5));
		memberactivitypage.enterQuantity(generateRandomNumbers(3));
		memberactivitypage.enterPrice(generateRandomNumbers(2));
		memberactivitypage.clickOnTenderItemsAddButton();
		memberactivitypage.selectTypeinput();
		memberactivitypage.enterNumberinput(generateRandomNumbers(3));
		memberactivitypage.enterValueinput(generateRandomNumbers(2));
		memberactivitypage.clickOnProcessActivityOkButton();
		memberactivitypage.validatingassertionPopUp("valid");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		membersPage = homePage.clickOnMembersMenuButton();
		membersPage.selectProgram();
		memberachievementspage=membersPage.clickOnMemberDetailsButton();
		GetAllProducts getAllproducts=new GetAllProducts();
		try {
			productDetails=getAllproducts.runGetAllProductsService();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	@AfterClass 
	public void afterClass(){ 
	closeBrowser(); 

	}

}
