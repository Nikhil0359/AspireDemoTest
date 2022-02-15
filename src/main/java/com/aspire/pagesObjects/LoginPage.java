package com.aspire.pagesObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aspire.base.Base;

public class LoginPage extends Base {

	public LoginPage() {
		// To initializing page objects
		PageFactory.initElements(driver, this);
	}

	// page factory
	@FindBy(xpath = "//input[@id='login']")
	public WebElement enterUsername;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement enterPassword;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginBtn;

	@FindBy(xpath = "(//div[@class='o_caption'])[2]")
	public WebElement inventoryIcon;


	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
    
	
	public void login(String un, String pw) {
		enterUsername.sendKeys(un);
		enterPassword.sendKeys(pw);
		loginBtn.click();
	}
}
