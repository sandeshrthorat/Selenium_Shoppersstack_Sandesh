package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//Email TF
//Password TF
//Login Button	
	
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "Email")
	            private WebElement emailText;

	public WebElement getEmailText() {
		return emailText;
	}
	
	@FindBy(id = "Password")
	                  private WebElement passText;

	public WebElement getPassText() {
		return passText;
	}
	
	
	@FindBy(id = "Login")
	              private WebElement loginBtn;

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
	
	
	
	
}
