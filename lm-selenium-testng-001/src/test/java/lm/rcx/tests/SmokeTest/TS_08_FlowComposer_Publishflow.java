	package lm.rcx.tests.SmokeTest;
	import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import lm.rcx.services.AddConditionAction;
import lm.rcx.services.CreateProgramService;
import lm.rcx.services.DeleteProgramService;
import lm.rcx.validations.Success_Validations;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebDriverManager;
import selenium.framework.pages.FlowComposerPage;
import selenium.framework.pages.HomePage;
import selenium.framework.pages.LoginPage;
import selenium.framework.pages.ProgramsPage;

	public class TS_08_FlowComposer_Publishflow extends CommonMethods {
		WebDriver driver;
		LoginPage loginPage = null;
		HomePage homePage = null;
		ProgramsPage programsPage = null;
		FlowComposerPage flowcomposerpage = null;
		HashMap<String, String> programDetails = null;
		HashMap<String,String> rulesDetails=null;

		@Test(priority = 0)
		public void TC_01_ValidateFlowcomposerPublishFlow() {
			String testcaseName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			ReporterTextBold("Executing Test Case : " + testcaseName);
			flowcomposerpage.defaultFlowButton();
			flowcomposerpage.deleteFlowOkButton();
			flowcomposerpage.saveFlowButton();
			flowcomposerpage.publishFlowButton();
			String expected=Success_Validations.ValidatePublishFlowPopup;
			String actual=flowcomposerpage.getText(flowcomposerpage.VALIDATE_FLOW_SUCCESSFUL,"Fetching Publish flow Popup text.");
			flowcomposerpage.assertText(expected, actual, flowcomposerpage.VALIDATE_FLOW_SUCCESSFUL, "Validating Publish Flow Popup");
			Assert.assertEquals(expected, actual, "Validating Publish Flow Popup Failed.");

		}

		@BeforeMethod
		public void BeforeMethod() {
			CreateProgramService createProgram = new CreateProgramService();
			try {
				programDetails = createProgram.runCreateProgramWebService();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			AddConditionAction addConditionAction= new AddConditionAction();
			addConditionAction.runCreateConditionActionWebService(programDetails.get("programId"));
			programsPage = homePage.clickOnProgramsMenuButton();
			programsPage.enterSearchInput(programDetails.get("programName"));
			flowcomposerpage=programsPage.clickOnFlowComposerHyperLink();
		}

		@AfterMethod
		public void afterMethod() {
			DeleteProgramService deleteProgram=new DeleteProgramService();
			try {
				deleteProgram.runDeleteProgramWebService(programDetails.get("programId"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		@BeforeClass
		public void beforeClass() {
			driver = WebDriverManager.getWebDriver();
			loginPage = new LoginPage(driver);
			homePage = loginPage.login();

		}

		@AfterClass(alwaysRun=true)
		public void afterClass() {
			closeBrowser();
		}

	
	}

