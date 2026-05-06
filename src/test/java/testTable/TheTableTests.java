package testTable;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageClasses.TitlePage;

public class TheTableTests extends BaseTestForFrameWork {

	TitlePage tpObj = new TitlePage();

	@Test
	public void languageFilterTest1() {

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

	public void beginnerLevelTest2() {

		tpObj.uncheckIntermediate();

		tpObj.uncheckAdvanced();

		List<WebElement> beginnerElements = tpObj.getBeginnerElements();

		Assert.assertFalse(beginnerElements.isEmpty(), "No Beginner elements found!");
		for (WebElement ele : beginnerElements) {
			String text = ele.getText();
			System.out.println(text);
			Assert.assertTrue(text.toLowerCase().contains("beginner"),
					"Expected text to contain 'Beginner', and got: " + text);

		}

	}

	@Test

	public void minEnrollTest3() {
		tpObj.selectminEnrollment();
		tpObj.selectTenThousandValue();
		List<WebElement> sortedList = tpObj.getMinEnrollmentList();
		for (WebElement ele : sortedList) {
			String value = ele.getText();
			// String value=value.parseInt(value);
			Assert.assertTrue(Integer.valueOf(value) >= 10000);

		}
		System.out.println("All the values are  greater than 10000");
	}

	@Test
	public void combinedFilterTest4() {
		tpObj.selectPython();
		tpObj.uncheckAdvanced();
		tpObj.uncheckIntermediate();
		tpObj.selectminEnrollment();
		tpObj.selectTenThousandValue();
		List<WebElement> beginnerList = tpObj.getBeginnerElements();
		System.out.println("Size is :" +beginnerList.size());
		for (WebElement ele : beginnerList) {
			String text = ele.getText();
			System.out.println("The text on beginner list is ::" +text);
			Assert.assertEquals(text, "Beginner");

		}

		// Assert.assertEquals(false, null);
		List<WebElement> pythonList = tpObj.getPythonElements();
		for (WebElement ele : pythonList) {
			String text = ele.getText();
			Assert.assertEquals(text, "Python");
		}

		List<WebElement> minEnrollList = tpObj.getMinEnrollmentList();
		for (WebElement ele : minEnrollList) {
			String text = ele.getText();
			Assert.assertTrue(Integer.valueOf(text) >= 10000);
		}

		System.out.println("Only python and beginner elements with enrollments more tha 10000 are visible");

	}
	
	@Test
	
	public void noResultsStateTest5()
	{
		tpObj.selectPython();
	tpObj.unCheckBeginner();
	String text=tpObj.getTextOfNoMatchingResults();
	System.out.println("The text for the above filters is :: " +text);
	Assert.assertTrue(text.contains("No matching courses."));
	
	}
	
}
