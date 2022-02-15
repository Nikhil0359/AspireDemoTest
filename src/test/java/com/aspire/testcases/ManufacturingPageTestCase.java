package com.aspire.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aspire.base.Base;
import com.aspire.pages.LoginPage;
import com.aspire.pages.ManufacturingPage;

public class ManufacturingPageTestCase extends Base {

	LoginPage loginPage;
	ManufacturingPage manufacturingPage;

	public ManufacturingPageTestCase() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		 loginPage=new LoginPage();
		 manufacturingPage=new ManufacturingPage();
	}
	
	@Test(priority = 1)
	public void verifyLoginSuccessful() {
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		String iconTitle = loginPage.inventoryIcon.getText();
		Assert.assertEquals(iconTitle, "Inventory");
	}

	@Test(priority = 2)
	public void verifyManufacutureCreated()    {
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		manufacturingPage.createManufacture();
		String OrdDone=manufacturingPage.orderDone.getText();
		Assert.assertEquals(OrdDone, "Aspire Demo Product");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

}
