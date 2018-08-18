package lm.rcx.tests.SmokeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebDriverManager;
import selenium.framework.pages.HomePage;
import selenium.framework.pages.LoginPage;
import selenium.framework.pages.MemberAchievementsPage;
import selenium.framework.pages.MemberPreferencesPage;
import selenium.framework.pages.MembersPage;

public class TS_15_MemberPreferences_AddPreference extends CommonMethods{
	String className = this.getClass().getSimpleName();
	WebDriver driver;
	LoginPage loginPage = null;
	HomePage homePage = null;
	MembersPage membersPage=null;
	MemberAchievementsPage memberAchievementsPage=null;
	MemberPreferencesPage memberPreferencePage=null;
	String program;
	@Test(priority=0,description="This test case is related to Creating Member Preferences with all fields",groups={"mod-Member Preferences", "auth-Rambabu"})
	public void TC_01_AddPreference(){
		String testcaseName = new Object(){}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : "+className+" : "+testcaseName);
		String value=generateRandomName();
		String testData=memberPreferencePage.addPreference();
		if(testData!=null){
		memberPreferencePage.selectPreferenceValue();
		memberPreferencePage.enterPreferenceExpirationDate(getFutureDate());
		memberPreferencePage.enterPreferenceOptInDate(getCurrentDate());
		memberPreferencePage.clickOnOKButton();
		/*String expected=Success_Validations.PreferenceAddedSuccessfullyPopUp;
		String actual=memberPreferencePage.getText(memberPreferencePage.PREFERENCE_ADDED_SUCCESSFULLY_POP_UP, "Fetching Add Preference PopUp.");
		memberPreferencePage.assertText(expected, actual, memberPreferencePage.PREFERENCE_ADDED_SUCCESSFULLY_POP_UP, "Validating Add Preference PopUp.");
		Assert.assertEquals(expected, actual, "Validating Add Preference PopUp Failed.");*/
		memberPreferencePage.clickOnAvancedSearchButton();
		memberPreferencePage.enterAdvancedSearchNameInput(testData);
		memberPreferencePage.clickOnAvancedSearchOKButton();
		String expectedname=testData;
		String actualname=memberPreferencePage.getText(memberPreferencePage.PREFERENCE_NAME_COLUMN, "Fetching Preference Name.");
		memberPreferencePage.assertText(expectedname, actualname, memberPreferencePage.PREFERENCE_NAME_COLUMN, "Validating Preference Name.");
		Assert.assertEquals(expectedname, actualname, "Validating Preference Name Failed.");
		}
		else{
			reportInfo("All existing Preferences are added to member");
		}
	}
	@BeforeMethod
	public void beforeMethod() {

		membersPage=homePage.clickOnMembersMenuButton();
		program=membersPage.selectProgram();
		memberAchievementsPage=membersPage.clickOnMemberDetailsButton();
		memberPreferencePage=memberAchievementsPage.clickOnMemberPreferencesButton();
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

