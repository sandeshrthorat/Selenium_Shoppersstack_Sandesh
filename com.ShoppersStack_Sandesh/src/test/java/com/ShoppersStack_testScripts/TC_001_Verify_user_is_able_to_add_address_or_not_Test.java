package com.ShoppersStack_testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.ShoppersStack_GenericUtility.Base_Class;
import com.ShoppersStack_POM.AddressFormPage;
import com.ShoppersStack_POM.MyAddressPage;
import com.ShoppersStack_POM.MyProfilePage;
import com.aventstack.extentreports.Status;

public class TC_001_Verify_user_is_able_to_add_address_or_not_Test extends Base_Class {
	@Test
	public void addAddress() throws EncryptedDocumentException, IOException, InterruptedException {
		test = reports.createTest("AddAddress");
		test.log(Status.PASS, "Login Done Successfully");

		homepage.getSettBtn().click();
		homepage.getMyProfileBtn().click();

		test.log(Status.INFO, "Navigate to Profile Page");

		MyProfilePage myProfilePage = new MyProfilePage(driver);
		myProfilePage.getMyaddBtn().click();

		test.log(Status.INFO, "Navigate to MyAddress Page");

		MyAddressPage myAddressPage = new MyAddressPage(driver);
		myAddressPage.getAddAddressBtn().click();

		test.log(Status.INFO, "Navigate to AddressForm Page");

		AddressFormPage addressFormPage = new AddressFormPage(driver);
		addressFormPage.getOfficeBtn().click();
		addressFormPage.getNameField().sendKeys(file.readExcelData("Sheet1", 1, 0));
		addressFormPage.getHouseInfo().sendKeys(file.readExcelData("Sheet1", 1, 1));
		addressFormPage.getStreetInfo().sendKeys(file.readExcelData("Sheet1", 1, 2));
		addressFormPage.getLandmark().sendKeys(file.readExcelData("Sheet1", 1, 3));

		webdriverUtility.selectByValue(addressFormPage.getCountryDroppdown(), file.readExcelData("Sheet1", 1, 4));
		webdriverUtility.selectByValue(addressFormPage.getStateDroppdown(), file.readExcelData("Sheet1", 1, 5));
		webdriverUtility.selectByValue(addressFormPage.getCityDropdown(), file.readExcelData("Sheet1", 1, 6));

		addressFormPage.getPincode().sendKeys(file.readExcelData("Sheet1", 1, 7));
		addressFormPage.getPhoneNo().sendKeys(file.readExcelData("Sheet1", 1, 8));
		addressFormPage.getAddAddressButton().click();

		test.log(Status.PASS, "Add Address Succesfully");
		Thread.sleep(3000);

		webdriverUtility.takeWebPageScrrenShot();

	}
}
