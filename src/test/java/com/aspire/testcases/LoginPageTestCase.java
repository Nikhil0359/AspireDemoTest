package com.aspire.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.aspire.base.Base;
import com.aspire.pagesObjects.LoginPage;


public class LoginPageTestCase extends Base {

	LoginPage loginPage;
	String sheetname = "Credential";

	public LoginPageTestCase() {
		// call base class constructor
		super();
	}
	//This method will initialize all data in base class
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
    
	//This method will verify login page title
	@Test(priority = 1)
	public void VerifyLoginPageTitle() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Odoo");
	}
 
	//This method will verify is login successful
	@Test(priority = 2)
	public void VerifyLoginSuccessful() {
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		String iconTitle = loginPage.inventoryIcon.getText();
		Assert.assertEquals(iconTitle, "Inventory");
	}

	//This method will close all browsers
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
