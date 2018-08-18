package lm.rcx.tests.SmokeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import lm.rcx.pojo.MemberPojo;
import lm.rcx.services.CreateProgramService;
import lm.rcx.services.GetAllProgramsService;
import lm.rcx.validations.Success_Validations;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebDriverManager;
import selenium.framework.pages.HomePage;
import selenium.framework.pages.LoginPage;
import selenium.framework.pages.MembersPage;

public class TS_09_Members_AddMember extends CommonMethods {
	String className = this.getClass().getSimpleName();

	LoginPage loginPage = null;
	HomePage homePage = null;
	MembersPage membersPage=null;
	CreateProgramService reactorCxCreateProgram=null;
	private WebDriver driver;
	String expected1=null;
	
	@Test(priority=0)
	public void TC_01_ValidateCreatingMembersWithAllFields(){
		String testcaseName = new Object(){}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : "+testcaseName);
		MemberPojo mp = new MemberPojo();
		membersPage.clickOnAddMemberButton();
		membersPage.selectParticipateInAProgramDropdown();
		membersPage.enterFirstNameInput(mp.getFirstName());
		membersPage.enterLastNameInput(mp.getLastName());
		membersPage.enterDateOfBirthInput(mp.getDateOfBirth());
		membersPage.enterEmailAddressInput(mp.getEmail());
		membersPage.enterAddressInput(mp.getAddress());
		membersPage.enterCityInput(mp.getCity());
		membersPage.enterStateInput(mp.getState());
		membersPage.enterCountryInput(mp.getCountry());
		membersPage.enterZipCodeInput(mp.getZipCode());
		membersPage.enterPhoneNumberInput(mp.getPhoneNumber());
		membersPage.enterReferralCodeInput(mp.getReferralCode());
		membersPage.selectMemberTypeDropdown(mp.getMemberType());
		membersPage.selectEnrollSourceDropdown();
		membersPage.clickOnAddMemberOkButton();
		/*String expected = Success_Validations.MemberCreatePopUp;
		String actual = membersPage.getText(membersPage.VALIDATION_ADD, "Fetching Add new Member PopUp.");
		membersPage.assertText(expected, actual, membersPage.VALIDATION_ADD, "Validating Add new Member popUp");*/
		expected1 = mp.getFirstName();
		membersPage.enterQuickSearchInput(mp.getFirstName());
		membersPage.clickOnSearchGoButton();
		membersPage.clickOnDetailsButton();
		String actual1 = membersPage.getText(membersPage.VALIDATE_MEMBERNAME,"Fetching Member Name.");
		membersPage.assertText(expected1, actual1, membersPage.VALIDATE_MEMBERNAME, "Validating Member NAME");
		Assert.assertEquals(expected1, actual1, "Validating Members NAME Failed.");
		//Assert.assertEquals(expected, actual, "Validating Add New Member Failed.");
	}

	@Test(priority=1)
	public void TC_02_CreatingMembersWithMandatoryFields(){
		String testcaseName = new Object(){}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : "+testcaseName);
		MemberPojo mp = new MemberPojo();
		membersPage.clickOnAddMemberButton();
		membersPage.selectParticipateInAProgramDropdown();
		membersPage.enterFirstNameInput(mp.getFirstName());
		membersPage.enterLastNameInput(mp.getLastName());
		membersPage.selectMemberTypeDropdown(mp.getMemberType());
		membersPage.selectEnrollSourceDropdown();
		membersPage.clickOnAddMemberOkButton();
		/*String expected = Success_Validations.MemberCreatePopUp;
		String actual = membersPage.getText(membersPage.VALIDATION_ADD, "Fetching Add new Member PopUp.");
		membersPage.assertText(expected, actual, membersPage.VALIDATION_ADD, "Validating Add new Member popUp");
		Assert.assertEquals(expected, actual, "Validating Add New Member Failed.");*/
		expected1 = mp.getFirstName();
		membersPage.enterQuickSearchInput(mp.getFirstName());
		membersPage.clickOnSearchGoButton();
		membersPage.clickOnDetailsButton();
		String actual1 = membersPage.getText(membersPage.VALIDATE_MEMBERNAME,"Fetching Member Name.");
		membersPage.assertText(expected1, actual1, membersPage.VALIDATE_MEMBERNAME, "Validating Member NAME");
		Assert.assertEquals(expected1, actual1, "Validating Members NAME Failed.");
	}

	@BeforeMethod
	public void beforeMethod() {
		GetAllProgramsService getProgram=new GetAllProgramsService();
		try {
			boolean flag=getProgram.runGetAllProgramsWebService();
			if(flag==true){
				CreateProgramService createProgram=new CreateProgramService();
				createProgram.runCreateProgramWebService();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		membersPage= homePage.clickOnMembersMenuButton();
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
