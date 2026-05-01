package utils;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.DriverManager;

public class WaitUtils {

	private static WebDriverWait wait;

	public static void initWait() {

		System.out.println("Initializing wait");

		wait = new WebDriverWait(DriverManager.getDriver(),
				Duration.ofSeconds(Integer.valueOf(BaseUtils.getConfigValue("explicitwait"))));
	}

	public static WebDriverWait getWait() {
		return wait;
	}

	public static void clickElement(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public static List<WebElement> getListOfElements(By locator) {
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}

	public static WebElement getText(By locator) {
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public static String getTextOfList(By locator) {
		List<WebElement> ele = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		String text = null;

		for (WebElement element : ele) {
			text = element.getText();
		}
		return text;

	}
}
