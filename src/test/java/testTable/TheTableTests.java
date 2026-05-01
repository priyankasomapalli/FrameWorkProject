package testTable;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageClasses.TitlePage;

public class TheTableTests extends BaseTestForFrameWork {

	TitlePage tpObj = new TitlePage();

	@Test
	public void languageFilterTest() {

		tpObj.clickJavaCheckBox();

		tpObj.getJavaElementList("Java elements");

		String text = tpObj.getJavaEleText("Java elements text");

		System.out.println("Text of Java elements is ::  " + text);

		Assert.assertTrue(true, "Java");

	}

	@Test

	public void beginnerLevelTest() {

		tpObj.clcikAdvancedCheckBox();

		tpObj.clcikIntermediateCheckBox();

		tpObj.getBeginnerElementList("BeginnerElements");

		String text = tpObj.getBegginerElementsText("Beginner level elements text");

		System.out.println("Text of Beginner elements is ::  " + text);

		Assert.assertTrue(true, "Beginner");
	}

}
