package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddressPage {
//Add Address button
	//Delete button
	//Yes button
	
	public MyAddressPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//button[text()='Add Address']")
	             private WebElement addAddressBtn;

	public WebElement getAddAddressBtn() {
		return addAddressBtn;
	}

	public void setAddAddressBtn(WebElement addAddressBtn) {
		this.addAddressBtn = addAddressBtn;
	}
	
	
	@FindBy(xpath = "(//span[contains(@class,'MuiButton-startIcon MuiButton')])[2]")
	        private WebElement deleteButton;

	public WebElement getDeleteButton() {
		return deleteButton;
	}
	
	@FindBy(xpath = "(//button[text()='Yes'])[1]")
	  private WebElement yesBtn;

	public WebElement getYesBtn() {
		return yesBtn;
	}
	
	
	
	
}
