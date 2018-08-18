package selenium.framework.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import selenium.framework.common.PageControls;

public class OrgsPage extends PageControls{

	/**
	 * Description:This is DMA page constructor. It holds all the element locators in DMA page
	 * 
	 * @param webDriver
	 */
	public  OrgsPage(WebDriver driver){
		super(driver);

	}


	private static final By SEARCH_BAR = By.xpath("//input[@aria-controls='orgTable']");
	private static final By PAGE_LOADING = By.xpath("//div[@class='loading' and style='display: block;']");
	private static final By VALIDATE_ORGNAME = By.xpath("//table[@id='orgTable']//tbody//tr//td[2]");


	private static final By SHOW_ENTITIES_DROPDOWN = By.name("orgTable_length");
	private static final By ORG_TABLE = By.xpath("//table[@id='orgTable']/tbody/tr");
	private static final By COLLAPSE_BUTTON = By.xpath("//a[@class='button-icon jarviswidget-toggle-btn']");
	private static final By COLLAPSER_BUTTON_CLASSNAME=By.xpath("//*[@id='wid-id-organizaionWiget']");
	private static final By FIELDSETTINGS_BUTTON = By.xpath("//button[@class='ColVis_Button ColVis_MasterButton']");
	private static final By SETTINGS_NAME_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li[1]//label//input[@type='checkbox']");
	private static final By SETTINGS_ALL_COLUMNS_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li//label");
	private static final By ORG_TABLE_HEADER = By.xpath("//*[@id='orgTable']//thead//tr//th");
	private static final By ORG_TABLE_NAME_SORT_BUTTON=  By.id("orgTable_0_2");
	private static final By ORG_TABLE_NAME_COLUMN = By.xpath("//*[@id='orgTable']//tbody//tr//td[2]");
	private static final By GET_ORG_NAME = By.xpath("//table[@id='orgTable']//tbody//tr[1]//td[2]");
	/**
	 * MethodName:  navigateToDMAPage() 
	 * Description: This method is used to navigate to DMA page
	 */
	public void navigateToDMAPage(){

		String tmp = getCurrentUrl();
		String tmp1 = tmp.substring(0, tmp.lastIndexOf("#/"));
		driver.navigate().to(tmp1+"#/orgs");
		reportInfo("Redirecting to Organizations page");
		waitForPageToLoad(PAGE_LOADING);

	}



	/**
	 * MethodName:  Search_bar()
	 * Description: This method is used to search any field
	 */
	public void Search_bar(String search){
		this.clear(SEARCH_BAR);
		this.type(SEARCH_BAR, search);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering  search :"+search);
	}

	public String getOrgName(){
		return this.getText(GET_ORG_NAME);
	}



	/**
	 * MethodName:  assertORGName()
	 * Description: This method is used to assert statements
	 */
	public void assertOrgsName(String expected, String testType)
	{
		reportInfo("Validating ORG Name");
		try {
			if (this.getText(VALIDATE_ORGNAME).equals(expected)) {
				Assert.assertEquals(this.getText(VALIDATE_ORGNAME), expected);
				reportPassedStatus("Verified ORG Name.");
				String successFilePath = elementScreenshot(VALIDATE_ORGNAME);
				reportSuccessScreenshot(successFilePath,"Validating Org Name."); 
			} else {
				String successFilePath = elementScreenshot(VALIDATE_ORGNAME);
				reportFailureScreenshot(successFilePath);			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}




	/**
	 * MethodName:selectShowEntitiesDropdown() 
	 * Description:This method used to select the value in showEntities DropDown
	 * @param testData
	 */
	public String selectShowEntitiesDropdown() {
		String testData=this.getFirstDropDownValue(SHOW_ENTITIES_DROPDOWN);
		this.selectDropdown(SHOW_ENTITIES_DROPDOWN, testData);
		reportInfo("Clicking On Show Entities DropDown");
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}
	/**
	 * MethodName: validatePagination() 
	 * Description: This method is used to Validate Pagination
	 */
	public void validatePagination(int expected, String testType) {
		reportInfo("Validating Pagination");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> rows = getWebElementList(ORG_TABLE);
				int count = rows.size();
				//Assert.assertEquals(count, expected);
				if(count<=expected){
					reportPassedStatus("Verified ORGS Pagination");
					String successFilePath = elementScreenshot(SHOW_ENTITIES_DROPDOWN);
					reportSuccessScreenshot(successFilePath,"");
				} else if (testType.equalsIgnoreCase("invalid")) {

				}
			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Pagination Assertion Failed");
		}
	}
	/**
	 * MethodName: clickOnCollapseButton() 
	 * Description: This method is used to click on collapse button.
	 */
	public void clickOnCollapseButton() {
		this.click(COLLAPSE_BUTTON);
		reportInfo("Clicking On Collapse Button");
		waitForPageToLoad(PAGE_LOADING);
	}

	/**
	 * MethodName: validateCollapseButton() 
	 * Description: This method is used to validate on collapse button.
	 */
	public void validateCollapseButton(String testType){
		reportInfo("Validating Collapse");
		try {
				WebElement ele=driver.findElement(COLLAPSER_BUTTON_CLASSNAME);
				String classname=ele.getAttribute("class");
				if(classname != null && classname.contains("jarviswidget-collapsed")){
					String successFilePath = elementScreenshot(COLLAPSER_BUTTON_CLASSNAME);
					reportSuccessScreenshot(successFilePath,"");
					reportPassedStatus("Verified collapse button");
				} else {
					String successFilePath = elementScreenshot(COLLAPSER_BUTTON_CLASSNAME);
					reportFailureScreenshot(successFilePath);

				}
		}catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Collapse Assertion Failed");
		}
	}
	/**


	/**
	 * MethodName: clickOnFieldSettingsButton() 
	 * Description: This method is used to click on field settings button.
	 */
	public void clickOnFieldSettingsButton() {
		this.click(FIELDSETTINGS_BUTTON);
		reportInfo("Clicking On Field Settings Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	/**
	 * MethodName: checkNameField() 
	 * Description: This method is used to check the name field in field settings
	 */
	public void checkNameField() {

		this.check(SETTINGS_NAME_CHECKBOX);
		reportInfo("Clicking Field Settings Name Checkbox");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	/**
	 *MethodName: assertCheckedColumns() 
	 *Description: This method is used to validate visible columns in member table
	 */
	public void assertCheckedColumns(String testType) {
		reportInfo("Validating Member visible columns in member table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);

				System.out.println(checkBoxList.size());
				for(WebElement e:checkBoxList )
				{
					System.out.println(e.getText());
				}
				List<WebElement> DMAColumnList = getWebElementList(ORG_TABLE_HEADER);

				for(WebElement e1:DMAColumnList )
				{
					System.out.println(e1.getText());
				}
				System.out.println(DMAColumnList.size());
				Assert.assertEquals(checkBoxList.size(), (DMAColumnList.size() - 1));
				String successFilePath = elementScreenshot(SETTINGS_ALL_COLUMNS_CHECKBOX);
				reportSuccessScreenshot(successFilePath,"");
				for (WebElement w : DMAColumnList) {
					System.out.println(w.getText());
					if (!w.getText().equals("Actions")) {
						for (WebElement e : checkBoxList) {
							if (e.isSelected()) {
								Assert.assertEquals(e.getText(), w.getText());
								reportPassedStatus("Verified" + " " + e.getText() + " " + "Column");
								System.out.println("selected");
								break;

							}
						}
					}
				}
			} else if (testType.equalsIgnoreCase("invalid")) {

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}
	/**
	 * MethodName: uncheckNameField() 
	 * Description: This method is used to un check the name field in field settings
	 */
	public void uncheckNameField() {
		System.out.println(this.getText(SETTINGS_NAME_CHECKBOX));
		this.uncheck(SETTINGS_NAME_CHECKBOX);
		String successFilePath = elementScreenshot(SETTINGS_NAME_CHECKBOX);
		reportSuccessScreenshot(successFilePath,"");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	/**
	 *MethodName: assertUncheckedColumns() 
	 *Description: This method is used to validate Invisible columns in member table
	 */
	public void assertUncheckedColumns(String testType) {
		reportInfo("Validating DMA Invisible columns in member table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> memberColumnList = getWebElementList(ORG_TABLE_HEADER);
				String count = "0";

				for (WebElement w : memberColumnList) {
					if (w.getText() == "Name") {
						count = count + 1;
					}
					Assert.assertEquals(count, "0");
				}
			} else if (testType.equalsIgnoreCase("invalid")) {

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Test Case Failed");
		}
	}

	/**
	 * MethodName:clickOnDMAPageNameSortButton() 
	 * Description: This method is used to click on Name Sort Button
	 */
	public void clickOnDMApageNameSortButton() {
		this.click(ORG_TABLE_NAME_SORT_BUTTON);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On Name Sort Button");
	}
	/**
	 * MethodName:sortingByName()
	 * Description:This method checks member table is sorted by name or not
	 * @return boolean
	 */
	public boolean sortingByName() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> ORGTableNameColumn = getWebElementList(ORG_TABLE_NAME_COLUMN);
		for (WebElement element : ORGTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		Collections.sort(list2,new SortIgnoreCase());
		System.out.println("after 1st sort:"+list2);
		Collections.reverse(list2);
		System.out.println("After Reverse"+list2);
		System.out.println("List1 is"+list1);
		boolean sorted=list2.equals(list1);
		return sorted;
	}
	public class SortIgnoreCase implements Comparator<Object> {
		public int compare(Object o1, Object o2) {
			String s1 = (String) o1;
			String s2 = (String) o2;
			return s1.toLowerCase().compareTo(s2.toLowerCase());
		}

	}


}

