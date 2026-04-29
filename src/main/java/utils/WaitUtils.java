package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.DriverManager;

public class WaitUtils {

	private static WebDriverWait wait;

	public static void initWait() {

		wait = new WebDriverWait(DriverManager.getDriver(),
				Duration.ofSeconds(Integer.valueOf(BaseUtils.getConfigValue("explicitwait"))));
	}

	public static WebDriverWait getWait() {
		return wait;
	}
	
	public static void clickElement(By locator)
	{
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

}
