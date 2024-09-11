package com.ShoppersStack_testScripts;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.ShoppersStack_GenericUtility.Base_Class;
import com.ShoppersStack_POM.MyAddressPage;
import com.ShoppersStack_POM.MyProfilePage;
import com.aventstack.extentreports.Status;

public class TC_002_Verify_user_is_able_to_delete_address_or_not_Test extends Base_Class {
	@Test
	public void deleteAddress() throws InterruptedException, IOException {
//		test = reports.createTest("AddAddress");
//		test.log(Status.PASS, "Login Done Successfully");

		homepage.getSettBtn().click();
		homepage.getMyProfileBtn().click();

//		test.log(Status.INFO, "Navigate to Profile Page");

		MyProfilePage myProfilePage = new MyProfilePage(driver);
		myProfilePage.getMyaddBtn().click();

//		test.log(Status.INFO, "Navigate to MyAddress Page");

		MyAddressPage myAddressPage = new MyAddressPage(driver);

		myAddressPage.getDeleteButton().click();
		Thread.sleep(2000);
		myAddressPage.getYesBtn().click();
//		Thread.sleep(3000);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
//		test.log(Status.PASS, "Delete Address Successfully");

		Thread.sleep(2000);

		webdriverUtility.takeWebPageScrrenShot();

	}
}
