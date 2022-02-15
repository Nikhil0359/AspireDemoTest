package com.aspire.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aspire.base.Base;

public class InventoryPage extends Base{
    
	// To initializing page objects
	public InventoryPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[@class='o_caption'])[2]")
	public WebElement inventoryIcon;
	
	@FindBy(xpath = "//span[@data-section='120']")
	public WebElement productone;
	
	@FindBy(xpath = "//a[@data-section='124']")
	public WebElement producttwo;
	
	@FindBy(xpath = "//button[@title='Create record']")
	public WebElement Creatbtn;
	
	@FindBy(xpath = "//input[@name='name']")
	public WebElement productName;
	
	@FindBy(xpath = "//select[@name='detailed_type']")
	public WebElement producttype;
	
	@FindBy(xpath = "//input[@id='o_field_input_353']")
	public WebElement unitMeasure;
	
	@FindBy(xpath = "(//button[@class='btn btn-secondary'])[2]")
	public WebElement updateQuantitybtn;
	
	@FindBy(xpath = "//button[@data-original-title='Create record']")
	public WebElement createManufacturebtn;
	
	@FindBy(xpath = "//input[@name='inventory_quantity']")
	public WebElement updateManufQuantity;
	
	@FindBy(xpath = "//button[@title='Save record']")
	public WebElement manfactureSavebtn;
	
	
	public void createProduct(){
		inventoryIcon.click();
		productone.click();
		producttwo.click();
		Creatbtn.click();
		productName.sendKeys("AspireTestProductOn");
		producttype.click();
		Select prodtype=new Select(producttype);
		prodtype.selectByValue("\"product\"");
		updateQuantitybtn.click();
		createManufacturebtn.click();
		updateManufQuantity.clear();
		updateManufQuantity.sendKeys("10");
		manfactureSavebtn.click();
	}
		
}
