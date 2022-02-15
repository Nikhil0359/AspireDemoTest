package com.aspire.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aspire.base.Base;
import com.aspire.pagesObjects.InventoryPage;
import com.aspire.pagesObjects.LoginPage;

public class InventoryPageTestCase extends Base {

	InventoryPage inventoryPage;
	LoginPage loginPage;

	public InventoryPageTestCase() {
		// call base class constructor
		super();
	}

	//This method will initialize all data in base class
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		inventoryPage = new InventoryPage();
	}
    
	//This method will call createproduct method from InventoryPage class
	@Test
	public void CreateNewProduct() {
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		inventoryPage.createProduct();
	}
 
	//This method will close all browsers
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
