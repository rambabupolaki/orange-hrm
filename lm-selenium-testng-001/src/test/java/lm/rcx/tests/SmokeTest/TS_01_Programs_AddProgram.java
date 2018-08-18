package lm.rcx.tests.SmokeTest;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import lm.rcx.pojo.ProgramsPojo;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebDriverManager;
import selenium.framework.pages.HomePage;
import selenium.framework.pages.LoginPage;
import selenium.framework.pages.ProgramsPage;

public class TS_01_Programs_AddProgram extends CommonMethods {
	WebDriver driver;
	LoginPage loginPage = null;
	HomePage homePage = null;
	ProgramsPage programsPage=null;
	HashMap<String, String> programDetails = null;
	String className = this.getClass().getSimpleName();
	String programName;

	@Test(priority=0,description="This testcase is related to Create program with all fields",groups={"mod-Programs", "auth-Rambabu"})
	public void TC_01_ValidateCreatingProgramWithAllFields(){
		String testcaseName = new Object(){}.getClass().getEnclosingMethod().getName();
        ReporterTextBold("Executing Test Case : "+testcaseName);
		ProgramsPojo program=new ProgramsPojo();
		programsPage.clickOnAddLoyaltyProgramButton();
		programsPage.enterLoyaltyProgramNameInput(program.getProgramName());
		programsPage.enterProgramDescriptionInput(program.getDescription());
		programsPage.clickOnOkButton();
		programsPage.enterSearchInput(program.getProgramName());
		String expected = program.getProgramName();
		String actual = programsPage.getText(programsPage.VALIDATE_PROGRAMS, "Fetching Program Name.");
		programsPage.assertText(expected, actual, programsPage.VALIDATE_PROGRAMS, "Validating Programs NAME");
		Assert.assertEquals(expected, actual, "Validating Programs NAME Failed.");

}

	@BeforeMethod
	public void beforeMethod() {
		programsPage= homePage.clickOnProgramsMenuButton();

	}
	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() {
		driver =  WebDriverManager.getWebDriver();
		loginPage = new LoginPage(driver);
		homePage = loginPage.login();
		/*CreateProgramService createProgram = new CreateProgramService();
		try {
			programDetails = createProgram.runCreateProgramWebService();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CreateTierPolicyService createTierPolicy=new CreateTierPolicyService();
		try {
			createTierPolicy.runCreateTierPolicyWebService(programDetails.get("programId"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CreatePursePolicyServices createPursePolicy=new CreatePursePolicyServices();
		createPursePolicy.runCreatePursePolicyWebService(programDetails.get("programId"));
*/
	}

	@AfterClass(alwaysRun=true)
	public void afterClass(){
		closeBrowser();
	}



}

