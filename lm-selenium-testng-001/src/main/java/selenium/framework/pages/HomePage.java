package selenium.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import selenium.framework.common.PageControls;


/**
 * ClassName:HomePage
 * Description:This class extends PageControls
 * @author Mgalla
 *
 */


public class HomePage extends PageControls{
	
	private static final String HOME_TITLE = "Reactor CX | Login";
	private static final  By MEMBERS_MENU_BUTTON=By.xpath("//li[@id='redirectToMembers']//a");
	private static final  By SETTINGS_MENU_BUTTON=By.linkText("Settings");
	private static final  By SEARCH_MENU_INPUT=By.id("serachMenuTextConrol");
	private static final  By PROGRAMS_MENU_BUTTON=By.id("programs");
	private static final  By REFERENCEDATA_MENU_BUTTON=By.xpath("//ul[@id='thelist']/li[3]/a/b/em");
	private static final  By ANALYTICS_MENU_BUTTON=By.xpath("//ul[@id='thelist']/li[5]/a/b/em");
	private static final  By HOMEPAGE_LINK=By.xpath("//*[@id='ribbon']//*[@href='#/']");
	private static final  By HIDECONTENT_BUTTON=By.xpath("//aside[@id='left-panel']/span/i");
	private static final  By COLLAPSE_MENU_BUTTON=By.id("hide-menu");
	private static final  By SIGNOUT_BUTTON=By.id("logout");
	private static final By PAGE_LOADING = By.xpath("//div[@class='loading' and style='display: block;']");
	private static final By REFERENCE_DATA_LNK = By.xpath("//a[@href='#/referenceData']");
	/**
	 * Description:This is HomePage constructor. It holds all the element locators in HomePage
	 * @param webDriver
	 */
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	/**
	 * MethodName:getInstance()
	 * Description: This method used get the instance of HomePage
	 * @return HomePage 
	 */
	HomePage getInstance(){
		new HomePage(this.driver).homePageLoaded();
		return new HomePage(this.driver);
	}
/**
 * homePageLoaded()
	 * Description: This method wait until settingsMenuButton is displayed
 * @return Boolean
 */
	public  boolean homePageLoaded(){
	return waitForElement(SETTINGS_MENU_BUTTON).isDisplayed();
	}
	/**
	 * MethodName:clickOnMembersMenuButton()
	 * Description:This method is used to click on membersMenuButton
	 * @return MembersPage
	 */
	public MembersPage clickOnMembersMenuButton(){
		String tmp = getCurrentUrl();
		String tmp1 = tmp.substring(0, tmp.lastIndexOf("#/"));
		System.out.println(tmp1+"#/");
		driver.navigate().to(tmp1+"#/");
		System.out.println("Redirecting to members page");
		waitForPageToLoad(PAGE_LOADING);
		this.pause(4000);
		return new MembersPage(this.driver);
	}
	/**
	 * MethodName:clickOnSettingsMenuButton()
	 * Description:This method is used to click on SettingsMenuButton
	 * @return SettingsPage
	 */
	public SettingsPage clickOnSettingsMenuButton(){
		String tmp = getCurrentUrl();
		String tmp1 = tmp.substring(0, tmp.lastIndexOf("#/"));
		driver.navigate().to(tmp1+"#/settings");
		System.out.println("Redirecting to settings page");
		waitForPageToLoad(PAGE_LOADING);
		return new SettingsPage(driver);
	}
	/**
	 * MethodName:enterSearchMenuInput()
	 * Description:This method is used to enter search input
	 */
	public void enterSearchMenuInput(){
		type(SEARCH_MENU_INPUT, "ReferenceData");
	}
	/**
	 * MethodName:clickOnProgramsMenuButton()
	 * Description:This method is used to click on ProgramsMenuButton
	 * @return 
	 * @return ProgramsPage
	 */
	public ProgramsPage clickOnProgramsMenuButton(){
		String tmp = getCurrentUrl();
		String tmp1 = tmp.substring(0, tmp.lastIndexOf("#/"));
		driver.navigate().to(tmp1+"#/programs");
		waitForPageToLoad(PAGE_LOADING);
		System.out.println("Redirecting to programs page");
		//waitForPageToLoad(PAGE_LOADING);
		return new ProgramsPage(driver);
	}
	
	public ReferenceDataPage clickonReferenceData(){
		String tmp = getCurrentUrl();
		String tmp1 = tmp.substring(0, tmp.lastIndexOf("#/"));
		this.waitForPageToLoad(PAGE_LOADING);
		driver.navigate().to(tmp1+"#/referenceData");
		System.out.println("Redirecting to referenceData page");
		this.waitForPageToLoad(PAGE_LOADING);
		return new ReferenceDataPage(driver);
	}
	/**
	 * MethodName:clickOnReferenceDataMenuButton()
	 * Description:This method is used to click on ReferenceDataMenuButton
	 * @return 
	 */
	
	/**
	 * clickOnAnalyticsMenuButton()
	 * Description:This method is used to click on AnalyticsMenuButton
	 */
	public void clickOnAnalyticsMenuButton(){
		click(ANALYTICS_MENU_BUTTON);
	}
	/**
	 * MethodName:clickOnHomepageLink()
	 * Description:This method is used to click on HomePage link
	 */
	public void clickOnHomepageLink(){
		click(HOMEPAGE_LINK);
	}
	/**
	 * clickOnHideContentButton()
	 * Description:This method is used to click on HideContent Button
	 */
	public void clickOnHideContentButton(){
		click(HIDECONTENT_BUTTON);
	}
	/**
	 * clickOnCollapseMenuButton()
	 * Description:This method is used to click on Collapse Button
	 */
	public void clickOnCollapseMenuButton(){
		click(COLLAPSE_MENU_BUTTON);
	}
	/**
	 * MethodName:clickOnSignOutButton()
	 * Description:This method is used to click on SignOut Button
	 */
	public void clickOnSignOutButton(){
		click(SIGNOUT_BUTTON);
	}

/**
 * MethodName:verifyHomePage()
 * Description: This method is used to verify HomePage Title
 */
	public void verifyHomePage(){
		System.out.println(driver.getTitle());
		Assert.assertEquals(HOME_TITLE, driver.getTitle());
	}
	
}
