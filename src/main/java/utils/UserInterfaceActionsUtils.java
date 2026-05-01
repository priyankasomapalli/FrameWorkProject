package utils;

import org.openqa.selenium.By;

import managers.ExtentTestManager;

public class UserInterfaceActionsUtils {

	public static void click(By locator, String name) {
		WaitUtils.clickElement(locator);

		ExtentTestManager.log.info("Clicked on  " + name + " link");
	}

}
