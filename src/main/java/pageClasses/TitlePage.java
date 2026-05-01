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

	By beginnerElements = By.xpath("//td[@headers='col_level' and text()='Beginner']");

	public void selectJava() {
		UserInterfaceActionsUtils.click(javaCheckBox, "Java checkbox");
	}

	public List<WebElement> getJavaElements() {
		return UserInterfaceActionsUtils.getListOfElements(javaElements, "Java elements");
	}

	public void deselectIntermediate() {
		UserInterfaceActionsUtils.click(intermediateCheckBox, "Intermediate checkbox");
	}

	public void deselectAdvanced() {
		UserInterfaceActionsUtils.click(advancedCheckBox, "Advanced checkbox");
	}

	public List<WebElement> getBeginnerElements() {
		return UserInterfaceActionsUtils.getListOfElements(beginnerElements, "Beginner elements");
	}
}
