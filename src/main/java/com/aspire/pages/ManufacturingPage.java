package com.aspire.pages;



import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aspire.base.Base;



public class ManufacturingPage extends Base{
     
	// To initializing page objects
	 public ManufacturingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[@class='o_caption'])[3]")
	public WebElement manufacturingbtn;
	
	@FindBy(xpath = "//button[@data-original-title=\"Create record\"]")
	public WebElement CreateManufacturingbtn;
	
	@FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
	public WebElement autoSelectProduct;
	
	@FindBy(xpath = "//a[@id='ui-id-254']")
	public List<WebElement> selectProduct;
	
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public WebElement confirmBtn;
	
	@FindBy(xpath = "(//button[@name='button_mark_done'])[4]")
	public WebElement markAsDoneBtn;
	
	@FindBy(xpath = "(//button[@class='btn btn-primary'])[2]")
	public WebElement okBtn;
	
	@FindBy(xpath = "//button[@name='process']")
	public WebElement applyBtn;
	
	@FindBy(xpath = "//button[@title='Save record']")
	public WebElement saveBtn;
	
	@FindBy(xpath = "//a[@name='product_id']")
	public WebElement orderDone;
	
	
	//Create New manufacture for created product
	public void createManufacture() {
		manufacturingbtn.click();
		CreateManufacturingbtn.click();
		selectproductDropDown();
		confirmBtn.click();
		//Explicit wait to load element
		WebDriverWait waitforMarkAsDoneBtn = new WebDriverWait(driver, Duration.ofSeconds(3));
		waitforMarkAsDoneBtn.until(ExpectedConditions.visibilityOf(markAsDoneBtn));
		markAsDoneBtn.click();
		WebDriverWait waitforOkBtn = new WebDriverWait(driver, Duration.ofSeconds(3));
		waitforOkBtn.until(ExpectedConditions.visibilityOf(okBtn));
		okBtn.click();
		WebDriverWait waitforApplyBtn = new WebDriverWait(driver, Duration.ofSeconds(3));
		waitforApplyBtn.until(ExpectedConditions.visibilityOf(applyBtn));
		applyBtn.click();
		saveBtn.click();
	}
	
	//To select product name
	public void selectproductDropDown() {
		autoSelectProduct.sendKeys("Aspire");
		List<WebElement> prod=selectProduct;
		for (WebElement productlist : prod) 
		{
			if(productlist.getText().equalsIgnoreCase("Aspire Demo Product"))
			{
				productlist.click();
				break;
			}
			
		}

	}
		
}
