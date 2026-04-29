package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BaseUtils {

	public static String getConfigValue(String key) {
		Properties property = new Properties();

		FileInputStream file = null;

		try {

			file = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/data/config.properties");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		try {
			property.load(file);
		} catch (IOException e) {

			e.printStackTrace();
		}

		return property.getProperty(key);

	}

	public static String getScreenShotPath(WebDriver driver, String pageName) throws IOException {

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String path = System.getProperty("user.dir") + "/targetImage_" + pageName + ".png";

		FileUtils.copyFile(source, new File(path));

		return path;

	}

}
