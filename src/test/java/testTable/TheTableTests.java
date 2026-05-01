package testTable;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageClasses.TitlePage;

public class TheTableTests extends BaseTestForFrameWork {

	TitlePage tpObj = new TitlePage();

	@Test
	public void languageFilterTest() {

		tpObj.selectJava();

		List<WebElement> javaElements = tpObj.getJavaElements();
		Assert.assertFalse(javaElements.isEmpty(), "No Java elements found!");

		for (WebElement ele : javaElements) {
			String text = ele.getText();
			System.out.println(text);

			Assert.assertTrue(text.toLowerCase().contains("java"), "Expected text to contain 'Java', and got: " + text);
		}

	}

	@Test

	public void beginnerLevelTest() {

		tpObj.deselectIntermediate();

		tpObj.deselectAdvanced();

		List<WebElement> beginnerElements = tpObj.getBeginnerElements();

		Assert.assertFalse(beginnerElements.isEmpty(), "No Beginner elements found!");
		for (WebElement ele : beginnerElements) {
			String text = ele.getText();
			System.out.println(text);
			Assert.assertTrue(text.toLowerCase().contains("beginner"),
					"Expected text to contain 'Beginner', and got: " + text);

		}

	}

}
