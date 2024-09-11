package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressFormPage {

	
	public AddressFormPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "Office")
	   private WebElement officeBtn;	
	public WebElement getOfficeBtn() {
		return officeBtn;
	}
	
	
	@FindBy(id = "Name")
	      private WebElement nameField;

	public WebElement getNameField() {
		return nameField;
	}
	
	@FindBy(id = "House/Office Info")
	          private WebElement houseInfo;

	public WebElement getHouseInfo() {
		return houseInfo;
	}
	
	
	@FindBy(id = "Street Info")
	          private WebElement streetInfo;

	public WebElement getStreetInfo() {
		return streetInfo;
	}
	
	@FindBy(id = "Landmark")
	           private WebElement landmark;

	public WebElement getLandmark() {
		return landmark;
	}
	
	
	@FindBy(xpath = "//select[@id='Country']")
	                  private WebElement countryDroppdown;

	public WebElement getCountryDroppdown() {
		return countryDroppdown;
	}
	
	
	@FindBy(xpath = "//select[@id='State']")
	                private WebElement stateDroppdown;

	public WebElement getStateDroppdown() {
		return stateDroppdown;
	}
	
	
	@FindBy(xpath = "//select[@id='City']")
	                   private WebElement cityDropdown;

	public WebElement getCityDropdown() {
		return cityDropdown;
	}
	
	
	@FindBy(xpath = "//input[@name='Pincode']")
	                private WebElement pincode;

	public WebElement getPincode() {
		return pincode;
	}
	
	
   @FindBy(xpath = "//input[@id='Phone Number']")
                         private WebElement phoneNo;

      public WebElement getPhoneNo() {
    	return phoneNo;
     }
      
     // @FindAll({@FindBy(xpath = "//button[@id='btnDisabled']"),@FindBy(id = "addAddress")})
      
      @FindBy(xpath = "//button[@id='btnDisabled' or @id='addAddress']")
                     private WebElement addAddressButton;

	public WebElement getAddAddressButton() {
		return addAddressButton;
	}
      
   
	
	
	
	
	
	
	
}
