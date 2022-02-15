package com.aspire.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aspire.base.Base;
import com.aspire.pages.InventoryPage;
import com.aspire.pages.LoginPage;

public class InventoryPageTestCase extends Base {

	InventoryPage inventoryPage;
	LoginPage loginPage;

	public InventoryPageTestCase() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		inventoryPage = new InventoryPage();
	}

	@Test(priority = 1)
	public void VerifyLoginSuccessful() {
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		String iconTitle = loginPage.inventoryIcon.getText();
		Assert.assertEquals(iconTitle, "Inventory");
	}

	@Test(priority = 2)
	public void CreateNewProduct() {
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		inventoryPage.createProduct();
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
