package pageClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.UIUtils;

public class TitlePage {

	private By javaCheckBox = By.xpath("//input[@value='Java']");
	private By javaElements = By.xpath("//td[@headers='col_lang' and text()='Java']");

	private By intermediateCheckBox = By.xpath("//input[@value='Intermediate']");
	private By advancedCheckBox = By.xpath("//input[@value='Advanced']");
	private By beginnerElements = By.xpath("//td[@headers='col_level' and text()='Beginner']");

	private By minEnrollField = By.xpath("//span[@class='dropdown-label']");
	private By tenThousandValue = By.xpath("//li[@data-value='10000']");
	private By tenThousandList = By.xpath("//table//tr[not(contains(@style, 'display: none'))]/td[5]");

	private By pythonCheckBox = By.xpath("//input[@value='Python']");
	private By pythonElement = By.xpath("//tr[not(contains(@style,'display: none;'))]/td[3]");
	private By beginnerElement = By.xpath("//table//tr[not(contains(@style,'display: none;'))]/td[4]");

	private By enrolList = By.xpath("//tr[not(contains(@style,'display: none;'))]/td[5]");
	// By combinedFilters=By.xpath("//tr[not(contains(@style,'display:
	// none;'))]/td[3]/following-sibling::td[@data-col='level' or
	// @data-col='enrollments']");
	private By rowData = By.xpath("//table//tr[not(contains(@style, 'display: none'))]/td");

	private By noDataEle = By.id("noData");
	private By beginnerCheckBox = By.xpath("//input[@value='Beginner']");

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

	public void unCheckBeginner() {
		UIUtils.click(beginnerCheckBox, "Beginner check box");
	}

	public List<WebElement> getBeginnerElements() {
		return UIUtils.getListOfElements(beginnerElement, "Beginner elements");
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

	public void selectPython() {
		UIUtils.click(pythonCheckBox, "Python checkbox");
	}

	public List<WebElement> getPythonElements() {
		return UIUtils.getListOfElements(pythonElement, "Python list");
	}

	public List<WebElement> getRowData() {
		return UIUtils.getListOfElements(rowData, "First row all values");
	}

	public String getTextOfNoMatchingResults() {
		return UIUtils.getText(noDataEle, "nodata element text");
	}
}
