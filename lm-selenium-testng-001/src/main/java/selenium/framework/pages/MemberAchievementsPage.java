package selenium.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import selenium.framework.common.PageControls;

public class MemberAchievementsPage extends PageControls {

	private static final By PAGE_LOADING = By.xpath("//div[@class='loading'][@style='display: block;']");
	private static final By MEMBER_REWARDS_BUTTON =By.linkText("Rewards");
	private static final By MEMBER_PURSES_BUTTON=By.linkText("Purses");
	private static final By MEMBER_BADGES_BUTTON=By.linkText("Badges");
	private static final By MEMBER_LOYALTYIDS_BUTTON=By.linkText("Loyalty IDs");
	private static final By MEMBER_REFERRALS_BUTTON=By.xpath("//div[2]/ul/li[6]/a");
	private static final By MEMBER_SEGMENTS_BUTTON=By.linkText("Segments");
	private static final By MEMBER_OFFERS_BUTTON=By.linkText("Offers");
	private static final By MEMBER_TRANSACTIONS_BUTTON=By.linkText("Transactions");
	private static final By MEMBER_TIERS_BUTTON = By.linkText("Tiers");
	private static final By MEMBER_ACTIVITY_BUTTON=By.linkText("Activity");
	private static final By MEMBER_PREFERENCES_BUTTON = By.linkText("Preferences");

	public MemberAchievementsPage(WebDriver driver) {
		super(driver);	
	}

	public MemberRewardsPage clickOnMemberRewardsButton(){
		this.scrollDown();
		this.click(MEMBER_REWARDS_BUTTON);
		reportInfo("Clicking On Member Rewards Button.");
		this.waitForPageToLoad(PAGE_LOADING);
		return new MemberRewardsPage(driver);
	}

	public MemberPursesPage clickOnMemberPursesButton(){
		this.click(MEMBER_PURSES_BUTTON);
		reportInfo("Clicking On Member Purses Button.");
		this.waitForPageToLoad(PAGE_LOADING);
		this.scrollDown();
		return new MemberPursesPage(driver);

	}
	public MemberBadgesPage clickOnMemberBadgesButton(){
		this.scrollDown();
		this.click(MEMBER_BADGES_BUTTON);
		reportInfo("Clicking On Member Badges Button.");
		this.waitForPageToLoad(PAGE_LOADING);
		return new MemberBadgesPage(driver);

	}
	public MemberLoyaltyIDsPage clickOnMemberLoyaltyIDsButton(){
		this.scrollDown();
		this.click(MEMBER_LOYALTYIDS_BUTTON);
		reportInfo("Clicking On Member LoyaltyIDs Button.");
		this.waitForPageToLoad(PAGE_LOADING);
		return new MemberLoyaltyIDsPage(driver);

	}
	public MemberReferralsPage clickOnMemberReferralsButton(){
		this.scrollDown();
		this.click(MEMBER_REFERRALS_BUTTON);
		reportInfo("Clicking On Member Referrals Button.");
		this.waitForPageToLoad(PAGE_LOADING);
		return new MemberReferralsPage(driver);

	}
	public MemberSegmentsPage clickOnMemberSegmentsButton(){
		this.scrollDown();
		this.click(MEMBER_SEGMENTS_BUTTON);
		reportInfo("Clicking On Member Segments Button.");
		this.waitForPageToLoad(PAGE_LOADING);
		return new MemberSegmentsPage(driver);
	}

	public MemberTranscationsPage clickOnMemberTranscationButton(){
		this.scrollDown();
		this.click(MEMBER_TRANSACTIONS_BUTTON);
		reportInfo("Clicking On Member Transactions Button.");
		this.waitForPageToLoad(PAGE_LOADING);
		return new MemberTranscationsPage(driver);
	}
	public MemberTiersPage clickOnMemberTiersButton(){
		this.scrollDown();
		this.click(MEMBER_TIERS_BUTTON);
		reportInfo("Clicking On Member Tiers Button.");
		this.waitForPageToLoad(PAGE_LOADING);
		return new MemberTiersPage(driver);
	}
	public MemberActivityPage clickOnMemberActivityButton(){
		this.scrollDown();
		this.click(MEMBER_ACTIVITY_BUTTON);
		reportInfo("Clicking On Member Activity Button.");
		this.waitForPageToLoad(PAGE_LOADING);
		return new MemberActivityPage(driver);
	}
	public MemberPreferencesPage clickOnMemberPreferencesButton(){ 
		this.scrollDown();
		this.click(MEMBER_PREFERENCES_BUTTON); 
		reportInfo("Clicking On Member Preferences Button."); 
		this.waitForPageToLoad(PAGE_LOADING); 
		return new MemberPreferencesPage(driver); 
	}
	public String getMemberId(){ 
		String url=this.getCurrentUrl(); 
		String r=url.substring(url.lastIndexOf("details/")+8); 
		String memberId=r.substring(0, 24); 
		return memberId;                 }

}

