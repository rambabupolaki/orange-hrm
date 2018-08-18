package selenium.framework.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import selenium.framework.common.PageControls;

public class LoginPage extends PageControls {
	
	
	public static final String username = "sev/admin";
	public static final String password = "wint00l$@";
	
	private static final By USERNAME_INPUT = By.name("username");
	private static final By PASSWORD_INPUT = By.name("password");
	private static final By SIGN_IN_BUTTON = By.id("login_button");
	private static final By PAGE_LOADING = By.xpath("//div[@class='loading' and style='display: block;']");

	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	
	public HomePage loginAs(String username, String password){
		type(USERNAME_INPUT, username);
		type(PASSWORD_INPUT, password);
		click(SIGN_IN_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		return new HomePage(driver);
	}
	
	public HomePage login(){
		type(USERNAME_INPUT, username);
		type(PASSWORD_INPUT, password);
		click(SIGN_IN_BUTTON); 
		
		this.waitForPageToLoad(PAGE_LOADING);
		return new HomePage(driver).getInstance();
	}
	
}