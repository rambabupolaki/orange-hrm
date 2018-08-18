package selenium.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import selenium.framework.common.PageControls;

public class SettingsPage extends PageControls {
	
	private static final By MY_ACCOUNT_LINK = By.xpath("//a[@href='#/ussettings']");
	private static final By USERS_LINK = By.xpath("//a[@href='#/users']");
	private static final By SECURITY_SETUP_LINK = By.xpath(".//a[@href='#/acl']");
	private static final By PAGE_LOADING = By.xpath("//div[@class='loading' and style='display: block;']");
	
	/**
	 * Constructor:SettingsPage()
	 * Description: It holds all the element locators for Settings Page. 
	 * @param driver
	 */
	public SettingsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/**
	 * MethodName:clickOnMyAccountLink()
	 * Description:This method is used to click on MyAccount link
	 */
	public void clickOnMyAccountLink() {
		click(MY_ACCOUNT_LINK);
	}
	/**
	 * MethodName: navigateToMyAccountPage()
	 * Description:This method is used to navigate to MyAccount Page
	 * @return MyAccountPage
	 */
    public MyAccountPage navigateToMyAccountPage(){
		
		String href=getAttribute(MY_ACCOUNT_LINK, "href");
		driver.navigate().to(href);
		return new MyAccountPage(driver);
	}
    /**
     * MethodName: clickUsersLink()
	 * Description:This method is used to click on Users link
     */
    
    public void clickUsersLink() {
		System.out.println("click User");
		click(USERS_LINK);

	}
    /**
     * MethodName: navigateToUsersPage()
	 * Description:This method is used to navigate to Users Page
     * @return
     */

	public UsersPage navigateToUsersPage(){
		String href=getAttribute(USERS_LINK, "href");
		driver.navigate().to(href);
		this.waitForPageToLoad(PAGE_LOADING);
		return new UsersPage(driver);
		
	}
	/**
	 * MethodName: clickSecuritySetupLink()
	 * Description:This method is used to click on SecuritySetup link
	 */
	 public SecuritySetUpPage clickSecuritySetupLink() {
		 String href=getAttribute(SECURITY_SETUP_LINK, "href");
			driver.navigate().to(href);
			reportInfo("SecuritySetUp Page Instantiated");
			this.waitForPageToLoad(PAGE_LOADING);
			return new SecuritySetUpPage(driver);
		}
	 /**
	  * MethodName: navigateToSecuritySetupPage()
	  * Description:This method is used to navigate to SecuritySetup
	  */

		public void navigateToSecuritySetupPage(){
			
			String href=getAttribute(SECURITY_SETUP_LINK, "href");
			driver.navigate().to(href);
		}
}
