package com.ShoppersStack_GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners_Utility implements ITestListener {

	Java_Utility javaUtility = new Java_Utility();

	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts = (TakesScreenshot) Base_Class.sdriver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(FrameWorkConstants.screenshotsPath+javaUtility.localDateTime()+".png");
		try {
			FileHandler.copy(temp, temp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
