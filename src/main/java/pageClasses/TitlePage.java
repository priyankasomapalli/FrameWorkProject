package pageClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.UIUtils;

public class TitlePage {

	By javaCheckBox = By.xpath("//input[@value='Java']");
	By javaElements = By.xpath("//td[@headers='col_lang' and text()='Java']");

	By intermediateCheckBox = By.xpath("//input[@value='Intermediate']");
	By advancedCheckBox = By.xpath("//input[@value='Advanced']");
	By beginnerElements = By.xpath("//td[@headers='col_level' and text()='Beginner']");

	By minEnrollField = By.xpath("//span[@class='dropdown-label']");
	By tenThousandValue = By.xpath("//li[@data-value='10000']");
	By tenThousandList = By.xpath("//table//tr[not(contains(@style, 'display: none'))]/td[5]");
	
	
	By pythonCheckBox=By.xpath("//input[@value='Python']");
	By pythonElement=By.xpath("//tr[not(contains(@style,'display: none;'))]/td[3]");
	By beginnerElement=By.xpath("//tr[not(contains(@style,'display: none;'))]/td[4]");
	By enrolList=By.xpath("//tr[not(contains(@style,'display: none;'))]/td[5]");

	public void selectJava() {
		UIUtils.click(javaCheckBox, "Java checkbox");
	}

	public List<WebElement> getJavaElements() {
		return UIUtils.getListOfElements(javaElements, "Java elements");
	}

	public void uncheckIntermediate() {
		UIUtils.click(intermediateCheckBox, "Intermediate checkbox");
	}

	public void uncheckAdvanced() {
		UIUtils.click(advancedCheckBox, "Advanced checkbox");
	}

	public List<WebElement> getBeginnerElements() {
		return UIUtils.getListOfElements(beginnerElements, "Beginner elements");
	}

	public void selectminEnrollment() {
		UIUtils.click(minEnrollField, "MinEnrollField");
	}

	public void selectTenThousandValue() {
		UIUtils.click(tenThousandValue, "tenThousand value");
	}

	public List<WebElement> getMinEnrollmentList() {
		return UIUtils.getListOfElements(tenThousandList, "SortedMin enrollment list");
	}
	
	public void selectPython()
	{
		UIUtils.click(pythonCheckBox, "Python checkbox");
	}
	
	public List<WebElement> getPythonElements()
	{
		return UIUtils.getListOfElements(pythonElement, "Python list");
	}
}
