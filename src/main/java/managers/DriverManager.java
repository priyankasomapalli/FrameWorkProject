package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.BaseUtils;

public class DriverManager {

	private static WebDriver driver;

	public static void initDriver()

	{
		String browser = BaseUtils.getConfigValue("browser");

		switch (browser.toLowerCase()) {
		case "chrome":

			driver = new ChromeDriver();

			ExtentTestManager.log.info("Chrome was launched");

			break;

		case "firefox":

			driver = new FirefoxDriver();

			ExtentTestManager.log.info("firefox was launched");

			break;

		case "edge":

			driver = new EdgeDriver();

			ExtentTestManager.log.info("Edge was launched");

			break;

		}

		driver.manage().window().maximize();
		
		

		ExtentTestManager.log.info("Window is maximized");

	}

	public static WebDriver getDriver() {
		
		return driver;

	}

	public static void goToUrl(String url) {
		driver.get(url);

		ExtentTestManager.log.info("URL: " + url);

	}

	public static void quitDriver() {
		driver.quit();

		ExtentTestManager.log.info("Browser was closed  !!");
	}

}
