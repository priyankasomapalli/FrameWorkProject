package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import managers.ExtentTestManager;

public class UIUtils {

	public static void click(By locator, String name) {
		WaitUtils.clickElement(locator);

		ExtentTestManager.log.info("Clicked on  " + name + " link");
	}

	public static String getTextOfList(By locator, String name) {
		ExtentTestManager.log.info("Fetching text from list: " + name);
		

		return WaitUtils.getTextOfList(locator);

		
	}
	
	public static List<WebElement> getListOfElements(By locator, String title)
	{
		ExtentTestManager.log.info("Getting the list of elements:  " +title);

		return WaitUtils.getListOfElements(locator);
	}
}
