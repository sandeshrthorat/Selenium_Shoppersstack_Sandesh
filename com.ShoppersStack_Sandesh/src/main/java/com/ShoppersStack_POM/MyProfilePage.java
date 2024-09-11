package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {
//My Address button
	public MyProfilePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath = "//div[text()='My Addresses']")
	             private WebElement myaddBtn;

	public WebElement getMyaddBtn() {
		return myaddBtn;
	}
	
	
	
	
	
}
