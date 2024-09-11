package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//setting button
//My Profile
//Logout	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//span[contains(@class,'BaseBadge-badge MuiBadge-badge')]")
	             private WebElement settBtn;

	public WebElement getSettBtn() {
		return settBtn;
	}
	
	@FindBy(xpath = "//li[text()='My Profile']")
	                  private WebElement myProfileBtn;

	public WebElement getMyProfileBtn() {
		return myProfileBtn;
	}
	
	
	@FindBy(xpath = "//li[text()='Logout']")
	              private WebElement logoutBtn;

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	
	
	
	
	
}
