package pageClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.UserInterfaceActionsUtils;

public class TitlePage {

	By javaCheckBox = By.xpath("//input[@value='Java']");

	By javaElements = By.xpath("//td[@headers='col_lang' and text()='Java']");

	By intermediateCheckBox = By.xpath("//input[@value='Intermediate']");

	By advancedCheckBox = By.xpath("//input[@value='Advanced']");

	By beginnerElements = By.xpath(
			"//thead/tr/th[@id='col_level']/following::" + "tbody/tr/td[@headers='col_level' and text()='Beginner']");

	public void clickJavaCheckBox() {
		UserInterfaceActionsUtils.click(javaCheckBox, "Java");
	}

	public void getJavaElementList(String title) {
		UserInterfaceActionsUtils.getListOfElements(javaElements, title);
	}

	public String getJavaEleText(String title) {
		return UserInterfaceActionsUtils.getTextOfList(javaElements, title);
	}

	public void clcikIntermediateCheckBox() {
		UserInterfaceActionsUtils.click(intermediateCheckBox, "intermediate checkbox");
	}

	public void clcikAdvancedCheckBox() {
		UserInterfaceActionsUtils.click(intermediateCheckBox, "Advanced check box");
	}

	public List<WebElement> getBeginnerElementList(String title) {
		return UserInterfaceActionsUtils.getListOfElements(beginnerElements, title);
	}

	public String getBegginerElementsText(String title) {
		return UserInterfaceActionsUtils.getTextOfList(beginnerElements, title);
	}
}
