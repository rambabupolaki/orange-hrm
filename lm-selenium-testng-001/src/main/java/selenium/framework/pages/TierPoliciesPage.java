package selenium.framework.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.google.common.collect.Ordering;

import selenium.framework.common.PageControls;

public class TierPoliciesPage extends PageControls {

	public  final By PAGE_LOADING = By.xpath("//div[@class='loading' and style='display: block;']");
	public  final By PURSE_POLICIES = By.linkText("Purse Policies");
	public  final By PROGRAM_TABLE = By.xpath("//table[@id='programTable']");
	public  final By PROGRAM_RULE_FOLDER = By.xpath("//table[@id='programTable']//tbody//tr[1]//td[8]");
	public  final By ADD_TIER_POLICY_BUTTON = By.id("dialog");
	public  final By NAME_INPUT = By.xpath("//*[@name='name']");
	public  final By LEVELNAME_INPUT = By.xpath("//*[@class='form-control ng-pristine ng-valid ng-scope ng-isolate-scope ng-empty ng-touched']");
	public  final By DESCRIPTION_INPUT = By.xpath("//*[@name='desc']");
	public  final By ESCROWSIN_INPUT = By.xpath("//*[@name='escrowDays']");
	public  final By SELECT_EXPIRY_UNIT = By.xpath("//select[@placeholder='Expiry Unit']");
	public  final By OFFSET_INPUT = By.xpath("//input[@name='expiryOffset']");
	public  final By SELECT_EXPIRATION_SNAP_TO = By.xpath("//select[@placeholder='Expiration Snap To']");
	public  final By ADDRANGE_BUTTON = By.xpath("//*[@id='colors']");
	public  final By STARTRANGE_INPUT = By.xpath("//*[@name='start']");
	public  final By ENDRANGE_INPUT = By.xpath("//*[@name='end']");
	public  final By COLOR_INPUT = By.xpath("//*[@name='color']");
	public  final By LEVEL_OK_BUTTON = By.xpath("(//button[@class='btn btn-primary ok_button'])[2]");
	public  final By OK_BUTTON = By.xpath("//button[@class='btn btn-primary ok_button']");
	public  final By ADDLEVEL_BUTTON = By.xpath("//button[@id='levels']");
	public  final By SEARCH_INPUT = By.xpath("//*[@id='tierPolicyTable_filter']//input");
	public  final By CUSTOMIZATION_SEARCH_INPUT = By.xpath("//*[@id='tierPolicyTable_filter']//input");
	public  final By VALIDATE_TIERPOLICIES = By.xpath("//table[@id='tierPolicyTable']//tbody//tr//td[2]");
	public  final By VALIDATE_CUSTOMIZATION_TIERPOLICIES = By.xpath("//table[@id='tierPolicyTable']//tbody//tr[1]//td[2]");
	public  final By EDIT_TIERPOLICIES = By.xpath("//*[@class='lm-action-update ios ng-scope']");
	public  final By EDIT_CUSTOMIZATION_TIERPOLICIES = By.xpath("(//td[@id='tierPolicyTable_1_1']/div/div/span/span/a/i)[3]");
	public  final By DELETE_TIERPOLICIES = By.xpath("//*[@class='lm-action-delete ios ng-scope']");
	public  final By DELETE_CUSTOMIZATION_TIERPOLICIES = By.xpath("(//td[@id='tierPolicyTable_1_1']/div/div/span/span/a/i)[4]");
	public  final By DELETE_PURSEPOLICIES_YES = By.xpath("//*[@class='btn btn-primary ok_button']");
	public  final By DELETE_PURSEPOLICIES_SUCCESSFUL = By.xpath(".//*[@class='toast-message']");
	public  final By SHOW_ENTITIES_DROPDOWN = By.name("tierPolicyTable_length");
	public  final By TIERPOLICY_TABLE = By.xpath("//table[@id='tierPolicyTable']/tbody/tr");
	public  final By FIELDSETTINGS_BUTTON = By.xpath("//*[@class='ColVis_Button ColVis_MasterButton']");
	public  final By CUSTOMIZATION_FIELDSETTINGS_BUTTON = By.xpath("//div[@id='tierPolicylevelsTable_wrapper']/div/button");
	public  final By SETTINGS_NAME_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']/li[1]/label/input[1]");
	public  final By TIERPOLICY_TABLE_HEADER = By.xpath("//*[@id='tierPolicyTable']//thead//tr//th");
	public  final By TIERPOLICY_LEVELS_TABLE_HEADER = By.xpath("//*[@id='tierPolicylevelsTable']//thead//tr//th");
	public  final By SETTINGS_ALL_COLUMNS_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li");
	public  final By TIERPOLICY_SORT_BY_NAME = By.xpath("//*[@id='tierPolicyTable_0_2']");
	public  final By TIERPOLICYLEVELS_SORT_BY_NAME = By.xpath("//table[@id='tierPolicylevelsTable']//thead//tr//th[2]");
	public  final By TIERPOLICY_TABLE_NAME_COLUMN = By.xpath("//*[@id='tierPolicyTable']//tbody//tr//td[2]");
	public  final By TIERPOLICY_LEVELS_TABLE_NAME_COLUMN = By.xpath("//*[@id='tierPolicylevelsTable']//tbody//tr//td[2]");
	public  final By TIERPOLICY_SORT_BY_CREATED = By.xpath("//*[@id='tierPolicyTable_0_3']");
	public  final By TIERPOLICYLEVELS_SORT_BY_COLOR = By.xpath("//table[@id='tierPolicylevelsTable']//thead//tr//th[3]");
	public  final By TIERPOLICY_TABLE_CREATED_COLUMN = By.xpath("//*[@id='tierPolicyTable']//tbody//tr//td[3]");
	public  final By TIERPOLICY_LEVELS_TABLE_COLOR_COLUMN = By.xpath("//*[@id='tierPolicylevelsTable']//tbody//tr//td[3]");
	public  final By TIERPOLICY_SORT_BY_UPDATED = By.xpath("//*[@id='tierPolicyTable_0_4']");
	public  final By TIERPOLICYLEVELS_SORT_BY_COLORPREVIEW = By.xpath("//table[@id='tierPolicylevelsTable']//thead//tr//th[4]");
	public  final By VALIDATE_TIERPOLICIES_NAME = By.xpath("//*[@class='invalid ng-binding ng-scope']");
	public  final By VALIDATE_TIERPOLICIES_CUSTOMIZATION_ERROR = By.xpath("//*[@class='modal-header ng-scope ui-draggable-handle']");
	public  final By TIERPOLICY_LEVELS_TABLE_COLORPREVIEW_COLUMN = By.xpath("//*[@id='tierPolicylevelsTable']//tbody//tr//td[4]");
	public  final By TIERPOLICY_TABLE_UPDATED_COLUMN = By.xpath("//*[@id='tierPolicyTable']//tbody//tr//td[4]");
	public  final By VALIDATION_ERROR = By.xpath("//*[@class='alert alert-danger alert-block']");
	public  final By VALIDATION_ERROR_POPUP = By.xpath(".//*[@class='toast-message']");
	

	public TierPoliciesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickOnPursePolicieslink() {
		this.click(PURSE_POLICIES);
		waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on Rulefolder LINK");
	}

	public void clickOnAddTierPolicyButton() {
		this.click(ADD_TIER_POLICY_BUTTON);
		waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on Add Tier Policy Button ");
	}

	public void enterSearchInput(String testData) {
		this.clear(SEARCH_INPUT);
		this.type(SEARCH_INPUT, testData);
		reportInfo("Entering Search Input :" + testData);
	}
	public void enterCustomizationSearchInput(String testData) {
		this.clear( CUSTOMIZATION_SEARCH_INPUT);
		this.type( CUSTOMIZATION_SEARCH_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering Customization Search Input :" + testData);
	}

	public void enterName(String testData) {
		try {
			clickOnRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.clear(NAME_INPUT);
		this.type(NAME_INPUT, testData);
		reportInfo("Entering  Name :" + testData);
	}
	public void enterNameNull(String testData) {
		this.clear(NAME_INPUT);
		this.type(NAME_INPUT, testData);
		this.type(NAME_INPUT, Keys.ENTER);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering Null Name :" + testData);
	}
	public void enterLevelName(String testData) {
		this.clear(LEVELNAME_INPUT);
		this.type(LEVELNAME_INPUT, testData);
		reportInfo("Entering  Name :" + testData);
	}
	

	public void enterDescription(String testData) {
		this.clear(DESCRIPTION_INPUT);
		this.type(DESCRIPTION_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering  Description :" + testData);
	}

	public void enterEscrowsIn(String testData) {
		this.clear(ESCROWSIN_INPUT);
		this.type(ESCROWSIN_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering  EscrowsIn :" + testData);
	}

	public void selectExpiryUnit() {
		String testData=this.getFirstDropDownLabel(SELECT_EXPIRY_UNIT);
		this.selectDropdown(SELECT_EXPIRY_UNIT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Selecting Expiry Unit" + testData);
	}
	public void enterOffsetValue(String testData){
		this.clear(OFFSET_INPUT);
		this.type(OFFSET_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering Offset Value :"+testData);
	}
	public void selectExpirationSnapTo() {
		String testData=this.getFirstDropDownLabel(SELECT_EXPIRATION_SNAP_TO);
		this.selectDropdown(SELECT_EXPIRATION_SNAP_TO, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Selecting Expiation Snap TO" + testData);
	}

	public void clickOnAddRangeButton() {
		this.click(ADDRANGE_BUTTON);
		waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on Add Range Button ");
	}

	public void enterStartRange(String testData) {
		this.clear(STARTRANGE_INPUT);
		this.type(STARTRANGE_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering  StartRange :" + testData);
	}

	public void enterEndRange(String testData) {
		this.clear(ENDRANGE_INPUT);
		this.type(ENDRANGE_INPUT, testData);
		this.waitForPageToLoad(PAGE_LOADING);
		reportInfo("Entering  StartRange :" + testData);
	}

	public void enterColorInput(String testData) {
		this.clear(COLOR_INPUT);
		this.type(COLOR_INPUT, testData);
		reportInfo("Entering  Color :" + testData);
	}

	public void clickOnOkButton() {
		this.click(OK_BUTTON);
		//waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on OK Button ");
	}
	public void clickOnLevelOkButton(boolean flag) {
		this.click(LEVEL_OK_BUTTON);
		waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on Level OK Button ");
	}
	public void clickOnOKButton(){
		this.click(OK_BUTTON);
		reportInfo("Clicking On OK Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void clickOnEditButton() {
		this.click(EDIT_TIERPOLICIES);
		waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on OK Button ");

	}
	public void clickOnCustomizationEditButton() {
		this.click(EDIT_CUSTOMIZATION_TIERPOLICIES);
		waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on OK Button ");

	}

	public void clickOn_Delete_Button() {
		this.click(DELETE_TIERPOLICIES);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOn_Customization_Delete_Button() {
		this.click(DELETE_CUSTOMIZATION_TIERPOLICIES);
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void clickOn_DeleteYes_Button() {
		this.click(DELETE_PURSEPOLICIES_YES);
	}
	public void clickOnAddlevelButton() {
		this.click(ADDLEVEL_BUTTON);
		//waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking on Add level  Button ");
	}
	public void clickOnRobot() throws AWTException, InterruptedException{
		Robot robot = new Robot();
		// Simulate key Events
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(100);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_TAB);		
	}
	public String selectShowEntitiesDropdown() {
		String testData=getFirstDropDownLabel(SHOW_ENTITIES_DROPDOWN);
		this.selectDropdown(SHOW_ENTITIES_DROPDOWN, testData);
		reportInfo("Clicking On Show Entities DropDown");
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}

	public void clickOnFieldSettingsButton() {
		this.click(FIELDSETTINGS_BUTTON);
		reportInfo("Clicking On Field Settings Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnCustomizationFieldSettingsButton() {
		this.click(CUSTOMIZATION_FIELDSETTINGS_BUTTON);
		reportInfo("Clicking On Field Settings Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void checkNameField() {

		this.check(SETTINGS_NAME_CHECKBOX);
		reportInfo("Clicking Field Settings Name Checkbox");
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void uncheckNameField() {
		this.uncheck(SETTINGS_NAME_CHECKBOX);
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public void clickonSortNameButton() {
		this.click(TIERPOLICY_SORT_BY_NAME);
		reportInfo("Clicking On Sort By Name Button");
		this.waitForPageToLoad(PAGE_LOADING);
		
	}
	public void clickonLevelsSortNameButton() {
		this.click(TIERPOLICYLEVELS_SORT_BY_NAME);
		reportInfo("Clicking On Sort By Name Button");
		this.waitForPageToLoad(PAGE_LOADING);
		
	}

	public boolean sortingByName() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList(TIERPOLICY_TABLE_NAME_COLUMN);
		for (WebElement element : sortingTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		Collections.sort(list1, new SortIgnoreCase());
		// Collections.sort(list2,new SortIgnoreCase());

		Collections.reverse(list1);
		System.out.println("After Reverse" + list1);
		System.out.println("List1 is" + list1);
		boolean sorted = list2.equals(list1);
		return sorted;
	}

	public class SortIgnoreCase implements Comparator<Object> {
		public int compare(Object o1, Object o2) {
			String s1 = (String) o1;
			String s2 = (String) o2;
			return s1.toLowerCase().compareTo(s2.toLowerCase());
		}
	}
	public boolean sortingByNameLevels() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList(TIERPOLICY_LEVELS_TABLE_NAME_COLUMN);
		for (WebElement element : sortingTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		Collections.sort(list1, new SortIgnoreCase());
		// Collections.sort(list2,new SortIgnoreCase());

		Collections.reverse(list1);
		System.out.println("After Reverse" + list1);
		System.out.println("List1 is" + list1);
		boolean sorted = list2.equals(list1);
		return sorted;
	}

	public class SortIgnoreCase3 implements Comparator<Object> {
		public int compare(Object o1, Object o2) {
			String s1 = (String) o1;
			String s2 = (String) o2;
			return s1.toLowerCase().compareTo(s2.toLowerCase());
		}
	}

	public void clickonSortCreatedButton() {
		this.click(TIERPOLICY_SORT_BY_CREATED);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickonLevelsSortColorButton() {
		this.click(TIERPOLICYLEVELS_SORT_BY_COLOR);
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public boolean sortingByLevelsColor() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList(TIERPOLICY_LEVELS_TABLE_COLOR_COLUMN);
		for (WebElement element : sortingTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		Collections.sort(list1, new SortIgnoreCase());
		// Collections.sort(list2,new SortIgnoreCase());

		Collections.reverse(list1);
		System.out.println("After Reverse" + list1);
		System.out.println("List1 is" + list1);
		boolean sorted = list2.equals(list1);
		return sorted;
	}

	 public boolean sortingByCreated() {
			List<String> list1 = new ArrayList<String>();
			List<String> list2 = new ArrayList<String>();
			List<WebElement> sortingTableNameColumn = getWebElementList(TIERPOLICY_TABLE_CREATED_COLUMN);
			for (WebElement element : sortingTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
			}
			/*Collections.sort(list1,new SortIgnoreCase());
			System.out.println("After Reverse"+list1);
			System.out.println("List2 is"+list2);*/
			System.out.println(list1);
			boolean sorted=Ordering.natural().isOrdered(list1);
			return sorted;
			}

	public void clickonSortUpdated() {
		this.click(TIERPOLICY_SORT_BY_UPDATED);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickonSortLevelColorPreviewButton() {
		this.click(TIERPOLICYLEVELS_SORT_BY_COLORPREVIEW);
		this.waitForPageToLoad(PAGE_LOADING);
	}

	public boolean sortingByLevelsColorPreview() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList(TIERPOLICY_LEVELS_TABLE_COLORPREVIEW_COLUMN);
		for (WebElement element : sortingTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
		}
		Collections.sort(list1, new SortIgnoreCase());
		// Collections.sort(list2,new SortIgnoreCase());

		Collections.reverse(list1);
		System.out.println("After Reverse" + list1);
		System.out.println("List1 is" + list1);
		boolean sorted = list2.equals(list1);
		return sorted;
	}

	public class SortIgnoreCase4 implements Comparator<Object> {
		public int compare(Object o1, Object o2) {
			String s1 = (String) o1;
			String s2 = (String) o2;
			return s1.toLowerCase().compareTo(s2.toLowerCase());
		}
	}

	public boolean sortingByUpdated() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList(TIERPOLICY_TABLE_UPDATED_COLUMN);
		for (WebElement element : sortingTableNameColumn) {
			list1.add(element.getText());
			list2.add(element.getText());
			}
			/*Collections.sort(list1,new SortIgnoreCase());
			System.out.println("After Reverse"+list1);
			System.out.println("List2 is"+list2);*/
		System.out.println(list1);
			boolean sorted=Ordering.natural().isOrdered(list1);
			return sorted;
			}

	public class SortIgnoreCase5 implements Comparator<Object> {
		public int compare(Object o1, Object o2) {
			String s1 = (String) o1;
			String s2 = (String) o2;
			return s1.toLowerCase().compareTo(s2.toLowerCase());
		}
	}
	public void assertTierPoliciesError(String testType) {
		reportInfo("Validating Enum Type");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(VALIDATE_TIERPOLICIES_NAME);
				reportSuccessScreenshot(successFilePath,"");
			} else if (testType.equalsIgnoreCase("invalid")) {

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}
	
	public String getTierPolicyText(By by,String testData){
		reportInfo(testData);
		return this.getText(by);
	}
	

	public void assertText(String expected, String actual, By by, String message){
		if(expected.equalsIgnoreCase(actual)){
			reportPassedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			String successFilePath = elementScreenshot(by);
			reportSuccessScreenshot(successFilePath,message);
		}else{
			reportFailedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
		}
	}
	public void validationErrorPopUp(String testType) {
		/* this.waitForPageToLoad(PAGE_LOADING); */
		reportInfo("Validating Duplicate Records");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(VALIDATION_ERROR);
				reportSuccessScreenshot(successFilePath,"");
				reportPassedStatus("Duplicate Record Error");
			} else if (testType.equalsIgnoreCase("invalid")) {

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Test Case Failed");
		}

	}

	public void assertCheckedColumns(String testType) {
		reportInfo("Validating PursePolicies visible columns in PursePolicies table");
		try {
				List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);
				List<WebElement> memberColumnList = getWebElementList(TIERPOLICY_TABLE_HEADER);
				if(checkBoxList.size()== (memberColumnList.size())){
				Assert.assertEquals(checkBoxList.size(), (memberColumnList.size() - 1));
				String successFilePath = elementScreenshot(SETTINGS_ALL_COLUMNS_CHECKBOX);
				reportSuccessScreenshot(successFilePath,"");
				for (WebElement w : memberColumnList) {
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
				}
			else  {
				String successFilePath = elementScreenshot(SETTINGS_ALL_COLUMNS_CHECKBOX);
				reportFailureScreenshot(successFilePath);

			}
		}
		 catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}
	public void assertCheckedLevelsColumns(String testType) {
		reportInfo("Validating LevelsColoumn visible columns in Tierlevels Policies table");
		try {
				List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);
				List<WebElement> memberColumnList = getWebElementList(TIERPOLICY_LEVELS_TABLE_HEADER);
				if(checkBoxList.size()== (memberColumnList.size())){
				Assert.assertEquals(checkBoxList.size(), (memberColumnList.size() - 1));
				String successFilePath = elementScreenshot(SETTINGS_ALL_COLUMNS_CHECKBOX);
				reportSuccessScreenshot(successFilePath,"");
				for (WebElement w : memberColumnList) {
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
			}else  {
				String successFilePath = elementScreenshot(SETTINGS_ALL_COLUMNS_CHECKBOX);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}

	public void assertUncheckedColumns(String testType) {
		reportInfo("Validating PursePolicies Invisible columns in location table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> memberColumnList = getWebElementList(TIERPOLICY_TABLE_HEADER);
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
	public void assertUncheckedLevelsColumns(String testType) {
		reportInfo("Validating PursePolicies Invisible columns in location table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> memberColumnList = getWebElementList(TIERPOLICY_LEVELS_TABLE_HEADER);
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
	public void validatePagination(int expected, String testType) {
		reportInfo("Validating Pagination");
		try {
				List<WebElement> rows = getWebElementList(TIERPOLICY_TABLE);
				int count = rows.size();
				if(count<=expected){
				reportPassedStatus("Verified Member Pagination");
				String successFilePath = elementScreenshot(SHOW_ENTITIES_DROPDOWN);
				reportSuccessScreenshot(successFilePath,"");
			} else {
				String successFilePath = elementScreenshot(SHOW_ENTITIES_DROPDOWN);
				reportFailureScreenshot(successFilePath);

			}
			
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Pagination Assertion Failed");
		}
	}






	public void assertLocationPopup(String expected, String testType) {
		reportInfo("Validating Location Delete Or Not");
		try {
			if (this.getText(DELETE_PURSEPOLICIES_SUCCESSFUL).equals(expected)) {
				Assert.assertEquals(this.getText(DELETE_PURSEPOLICIES_SUCCESSFUL), expected);
				reportPassedStatus("Verified Location Delete Or Not");
				String successFilePath = elementScreenshot(DELETE_PURSEPOLICIES_SUCCESSFUL);
				reportSuccessScreenshot(successFilePath,"");
			} else  {
				String successFilePath = elementScreenshot(DELETE_PURSEPOLICIES_SUCCESSFUL);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}

	public void asserttierpoliciesName(String expected, String testType) {
		reportInfo("Validating tierpolicies Name");
		try {
			if (this.getText(VALIDATE_TIERPOLICIES).equals(expected)) {
				Assert.assertEquals(this.getText(VALIDATE_TIERPOLICIES), expected);
				reportPassedStatus("Verified TIERpolicies Name");
				String successFilePath = elementScreenshot(VALIDATE_TIERPOLICIES);
				reportSuccessScreenshot(successFilePath,"");
			} else {
				String successFilePath = elementScreenshot(VALIDATE_TIERPOLICIES);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}

	}
	public void asserttierpolicylevelName(String expected, String testType) {
		reportInfo("Validating tierpolicies Name");
		try {
			if (this.getText(VALIDATE_CUSTOMIZATION_TIERPOLICIES).equals(expected)) {
				Assert.assertEquals(this.getText(VALIDATE_CUSTOMIZATION_TIERPOLICIES), expected);
				reportPassedStatus("Verified TIERpolicies Name");
				String successFilePath = elementScreenshot(VALIDATE_CUSTOMIZATION_TIERPOLICIES);
				reportSuccessScreenshot(successFilePath,"");
			} else {
				String successFilePath = elementScreenshot(VALIDATE_CUSTOMIZATION_TIERPOLICIES);
				reportFailureScreenshot(successFilePath);

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}

	}
	public void assertTierPoliciesCustomizationError(String testType) {
		reportInfo("Validating Enum Type");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				String successFilePath = elementScreenshot(VALIDATE_TIERPOLICIES_CUSTOMIZATION_ERROR);
				reportSuccessScreenshot(successFilePath,"");
			} else if (testType.equalsIgnoreCase("invalid")) {

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}
}
