package com.ShoppersStack_GenericUtility;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Utility {

	Java_Utility javaUtility = new Java_Utility();

	public void takeWebPageScrrenShot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) Base_Class.sdriver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(FrameWorkConstants.screenshotsPath+javaUtility.localDateTime()+".png");
		FileHandler.copy(temp, dest);

	}

	public void takeWebElementScreenShot(WebElement element) throws IOException {
		File temp = element.getScreenshotAs(OutputType.FILE);
		File dest = new File(FrameWorkConstants.screenshotsPath+javaUtility.localDateTime()+".png");
		FileHandler.copy(temp, dest);

	}

	public void selectByValue(WebElement element, String value) {

		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void selectByIndex(WebElement element, int id) {
		Select select = new Select(element);
		select.selectByIndex(id);
	}

	public void selectByVisibleText(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}

	public void deselectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	public void deselectByIndex(WebElement element, int id) {
		Select select = new Select(element);
		select.deselectByIndex(id);
	}

	public void deselectByVisibleText(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.deselectByVisibleText(visibleText);
	}

	public void deselectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	public List<WebElement> getAllSelectedOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		return selectedOptions;
	}

	public WebElement getFirstSelectedOption(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectElement = select.getFirstSelectedOption();
		return firstSelectElement;
	}

	public List<WebElement> getOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}

	public boolean isMultiple(WebElement element) {
		Select select = new Select(element);
		boolean value = select.isMultiple();
		return value;
	}

}
