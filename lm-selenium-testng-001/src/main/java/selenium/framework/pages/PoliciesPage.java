package selenium.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import selenium.framework.common.PageControls;

public class PoliciesPage extends PageControls{
	
	private static final By PAGE_LOADING = By.xpath("//div[@class='loading' and style='display: block;']");
	private static final By PURSEPOLICIES = By.linkText("Purse Policies");
	private static final By TIERPOLICIES = By.linkText("Tier Policies");
	private static final By PARTNERS=By.linkText("Partners");
	
	/**
	 * Description:This is members page constructor. It holds all the element locators in members page
	 * 
	 * @param webDriver
	 */
	public PoliciesPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public RewardPoliciesPage clickOnRewardPolicies(){
		String tmp=this.getCurrentUrl();
		driver.navigate().to(tmp);
		//this.pause(1000);
		reportInfo("Redirecting to Reward Policies");
		this.waitForPageToLoad(PAGE_LOADING);
		return new RewardPoliciesPage(driver);
	}
	public PursePoliciesPage clickOnPursePolicies(){

		this.click(PURSEPOLICIES);
		reportInfo("Clicking On PursePolices button." );
		waitForPageToLoad(PAGE_LOADING);
		return new PursePoliciesPage(driver);
	}
	public TierPoliciesPage clickOnTierPolicies(){
		this.click(TIERPOLICIES);
		reportInfo("Clicking On TierPolices button.");
		waitForPageToLoad(PAGE_LOADING);
		return new TierPoliciesPage(driver);
	}
	public PartnersPage clickOnPartners(){

		this.click(PARTNERS);
		reportInfo("Clicking On Partners button." );
		waitForPageToLoad(PAGE_LOADING);
		return new PartnersPage(driver);
		
		
	}
}
