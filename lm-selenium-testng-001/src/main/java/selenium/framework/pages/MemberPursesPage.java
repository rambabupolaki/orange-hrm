package selenium.framework.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import selenium.framework.common.PageControls;
public class MemberPursesPage extends PageControls{
	public  final By PAGE_LOADING = By.xpath("//div[@class='loading'][@style='display: block;']");
	public  final By PURSE_EDIT=By.xpath("//td[@id='purseTable_1_1']/div/div/span/span/a/i");
	public  final By PRIMARY_BUTTON=By.xpath("//label/span[2]");
	public  final By OK_BUTTON=By.xpath("//*[@class='btn btn-primary ok_button']");
	public  final By VALIDATE_EDIT_SUCCESSFUL=By.xpath(".//*[@class='toast-message']");
	public  final By SEARCH_INPUT=By.xpath("//*[@id='purseTable_filter']//input");
	public  final By VALIDATE_PURSES=By.xpath("//table[@id='purseTable']//tbody//tr//td[7]");
	public  final By ESCROWSIN=By.xpath("//input[@name='escrowsIn']");
	public  final By EXPIRESIN=By.xpath("//input[@name='expiresIn']");
	public  final By OVERDAFTLIMIT=By.xpath("//input[@name='overdraftLimit']");
	public  final By SHOW_ENTITIES_DROPDOWN = By.name("purseTable_length");
	public  final By PURSE_TABLE = By.xpath("//table[@id='purseTable']/tbody/tr");
	public  final By FIELDSETTINGS_BUTTON = By.xpath("//*[@id='purseTable_wrapper']//div//*[@class='ColVis_Button ColVis_MasterButton']");
	public  final By SETTINGS_NAME_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']/li[1]/label/input[1]");
	public final By SETTINGS_PURSESNAME_CHECKBOX=By.xpath("//ul[@class='ColVis_collection']/li[1]//input");
	public  final By SETTINGS_ALL_COLUMNS_CHECKBOX = By.xpath("//ul[@class='ColVis_collection']//li//input");
	public  final By PURSES_TABLE_HEADER = By.xpath("//*[@id='purseTable']//thead//tr//th");
	public  final By PURSE_SORT_BY_NAME=By.xpath("//*[@id='purseTable_0_2']");
	public  final By PURSE_TABLE_NAME_COLUMN=By.xpath("//*[@id='purseTable']//tbody//tr//td[2]");
	public  final By PURSE_SORT_BY_EXPIRESIN=By.xpath("//*[@id='purseTable_0_6']");
	public  final By PURSE_TABLE_EXPIRESIN_COLUMN=By.xpath("//*[@id='purseTable']//tbody//tr//td[6]");
	public  final By PURSE_SORT_BY_OVERDRAFTLIMIT=By.xpath("//*[@id='purseTable_0_7']");
	public  final By PURSE_TABLE_OVERDRAFTLIMIT_COLUMN=By.xpath("//*[@id='purseTable']//tbody//tr//td[7]");
	public  final By NEXT_BUTTON_CLASS_NAME = By.xpath("//li[@id='purseTable_next']");
	public  final By NEXT_BUTTON = By.linkText("Next");
	public  final By VALIDATE_NEXT_BUTTON = By.xpath("//div[@id='purseTable_paginate']//li[3]");
	public  final By PREVIOUS_BUTTON = By.linkText("Previous");
	public  final By PREVIOUS_BUTTON_CLASS_NAME = By.xpath("//li[@id='purseTable_previous']");
	public  final By VALIDATE_PREVIOUS_BUTTON = By.xpath("//div[@id='purseTable_paginate']//li[2]");
	public  final By EDIT_PURSE_SUCCESSFUL=By.xpath(".//*[@class='toast-message']");
	public final By VALIDATE_PURSEOVERDRAFT = By.xpath("//table[@id='purseTable']//tbody//tr//td[8]");
	public final By SELECT_PURSENAME=By.xpath("//*[@name='name']");
	public final By SETTINGS_ALL_COLUMNS_VISIBLE=By.xpath("//ul[@class='ColVis_collection']//li");
	public final By SETTINGS_ALL_COLUMNS=By.xpath("//ul[@class='ColVis_collection']//li");
	
	
	public MemberPursesPage(WebDriver driver) {
		super(driver);	
	}
	
	public void clickOnPurseEditButton(){
        this.click(PURSE_EDIT);
        reportInfo("Clicking On Purse Edit Button.");
        this.waitForPageToLoad(PAGE_LOADING);
	
}
	public void enterEscrossInInput(String testData){
		this.type(ESCROWSIN, testData);
		  reportInfo("Clicking On EscrowIn.");
	        this.waitForPageToLoad(PAGE_LOADING);
	}
	public void enterExpiresInInput(String testData){
		this.type(EXPIRESIN, testData);
		  reportInfo("Clicking On ExpiresIn.");
	        this.waitForPageToLoad(PAGE_LOADING);
	}
	public String enterOverdraftLimitInput(String testData){
		this.clear(OVERDAFTLIMIT);
		this.type(OVERDAFTLIMIT, testData);
		  reportInfo("Entering On OverdraftLimit."+testData);
	        this.waitForPageToLoad(PAGE_LOADING);
	        return testData;
	}
	public void clickOnPrimaryButton(){
        this.click(PRIMARY_BUTTON);
        reportInfo("Clicking On Primary Button.");
        this.waitForPageToLoad(PAGE_LOADING);
	
}
	public void clickOnOKButton(){
        this.click(OK_BUTTON);
        reportInfo("Clicking On OK Button.");
 
}
	public void enterSearchInput(String testData){
		this.clear(SEARCH_INPUT);
		this.type(SEARCH_INPUT, testData);
		 reportInfo("Clicking On Search Input."+testData);
	        this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickOnFieldSettingsButton() {
		this.click(FIELDSETTINGS_BUTTON);
		reportInfo("Clicking On Field Settings Button");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void checkPursesNameField() {

		this.check(SETTINGS_PURSESNAME_CHECKBOX);
		reportInfo("Clicking Field Settings Name Checkbox");
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void uncheckNameField() {
		this.uncheck(SETTINGS_NAME_CHECKBOX);
		this.waitForPageToLoad(PAGE_LOADING);
	}
	public void clickonSortNameButton(){
		this.click(PURSE_SORT_BY_NAME);
		this.waitForPageToLoad(PAGE_LOADING);
		}
	public int checkedColumns(){ 
        int count=0; 
        reportInfo("Fetching number of checked columns."); 
        List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX); 
        for(WebElement l:checkBoxList){ 
                boolean flag=l.isSelected(); 
                if(flag==true){ 
                        count=count+1; 
                } 
        } 
        return count; 
}
	public int purseTableColumns(){ 
        reportInfo("Fetching number of columns in table."); 
        List<WebElement> tierColumnList = getWebElementList(PURSES_TABLE_HEADER); 
        return tierColumnList.size()-1; 
}
	
	public boolean sortingByName() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<WebElement> sortingTableNameColumn = getWebElementList(PURSE_TABLE_NAME_COLUMN);
		for (WebElement element : sortingTableNameColumn) {
		list1.add(element.getText());
		list2.add(element.getText());
		}
		Collections.sort(list1,new SortIgnoreCase());
		//Collections.sort(list2,new SortIgnoreCase());

		Collections.reverse(list1);
		System.out.println("After Reverse"+list1);
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
		 public void clickonSortExpiresInButton(){
				this.click(PURSE_SORT_BY_EXPIRESIN);
				this.waitForPageToLoad(PAGE_LOADING);
				}
		 public boolean sortingByExpiresIn() {
				List<String> list1 = new ArrayList<String>();
				List<String> list2 = new ArrayList<String>();
				List<WebElement> sortingTableNameColumn = getWebElementList(PURSE_TABLE_EXPIRESIN_COLUMN);
				for (WebElement element : sortingTableNameColumn) {
				list1.add(element.getText());
				list2.add(element.getText());
				}
				Collections.sort(list1,new SortIgnoreCase());
				//Collections.sort(list2,new SortIgnoreCase());

				Collections.reverse(list1);
				System.out.println("After Reverse"+list1);
				System.out.println("List1 is"+list1);
				boolean sorted=list2.equals(list1);
				return sorted;
				}
				 public class SortIgnoreCase1 implements Comparator<Object> {
				       public int compare(Object o1, Object o2) {
				           String s1 = (String) o1;
				           String s2 = (String) o2;
				           return s1.toLowerCase().compareTo(s2.toLowerCase());
				       }
				}
		 public void clickonOverdraftlimitButton(){
						this.click(PURSE_SORT_BY_OVERDRAFTLIMIT);
						this.waitForPageToLoad(PAGE_LOADING);
				 }
		 public boolean sortingByOverdraftlimit() {
				List<String> list1 = new ArrayList<String>();
				List<String> list2 = new ArrayList<String>();
				List<WebElement> sortingTableNameColumn = getWebElementList(PURSE_TABLE_OVERDRAFTLIMIT_COLUMN);
				for (WebElement element : sortingTableNameColumn) {
				list1.add(element.getText());
				list2.add(element.getText());
				}
				Collections.sort(list1,new SortIgnoreCase());
				//Collections.sort(list2,new SortIgnoreCase());

				Collections.reverse(list1);
				System.out.println("After Reverse"+list1);
				System.out.println("List1 is"+list1);
				boolean sorted=list2.equals(list1);
				return sorted;
				}
				 public class SortIgnoreCase2 implements Comparator<Object> {
				       public int compare(Object o1, Object o2) {
				           String s1 = (String) o1;
				           String s2 = (String) o2;
				           return s1.toLowerCase().compareTo(s2.toLowerCase());
				       }
				}
				 
	public String selectShowEntitiesDropdown() {
		String testData=this.getFirstDropDownValue(SHOW_ENTITIES_DROPDOWN);
		this.selectDropdown(SHOW_ENTITIES_DROPDOWN, testData);
		reportInfo("Selecting value from show entities dropdown. :"+testData);
		this.waitForPageToLoad(PAGE_LOADING);
		return testData;
	}
	
		public boolean validatePagination(int expected, String testType) {
			boolean flag = false;
			reportInfo("Validating Pagination");
					List<WebElement> rows = getWebElementList(PURSE_TABLE);
					int count = rows.size();
					if(count<=expected){
						flag=true;
					}
			return flag;
		}
	public void assertCheckedColumns(String testType) {
		reportInfo("Validating Purse visible columns in Purse table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> checkBoxList = getWebElementList(SETTINGS_ALL_COLUMNS_CHECKBOX);
				List<WebElement> memberColumnList = getWebElementList(PURSES_TABLE_HEADER);
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
			} else if (testType.equalsIgnoreCase("invalid")) {

			}
		} catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Assertion Failed");
		}
	}
	public void assertUncheckedColumns(String testType) {
		reportInfo("Validating Purse Invisible columns in purse table");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				List<WebElement> memberColumnList = getWebElementList(PURSES_TABLE_HEADER);
				String count = "0";
				for (WebElement w : memberColumnList) {
					if (w.getText() == "Name") {
						count = count + 1;
					}
					Assert.assertEquals(count, "0");
					String successFilePath = driverScreenshot();
					reportSuccessScreenshot(successFilePath,"");
					
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

	public void assertpurseOverdraft(String expected, String testType)
	{
	reportInfo("Validating purse Overdraft");
	try {
	if (testType.equalsIgnoreCase("valid")) {
	Assert.assertEquals(this.getText(VALIDATE_PURSES), expected);
	reportPassedStatus("Verified pursepolicies Name");
	String successFilePath = elementScreenshot(VALIDATE_PURSES);
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
	public void assertEditPursePopup(String expected, String testType) {
		reportInfo("Validating Flow");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				Assert.assertEquals(this.getText(VALIDATE_EDIT_SUCCESSFUL), expected);
				reportPassedStatus("Verified Flow");
				String successFilePath = elementScreenshot(VALIDATE_EDIT_SUCCESSFUL);
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
	public int clickOnNextButton() {
		int count=0;
		WebElement ele=driver.findElement(NEXT_BUTTON_CLASS_NAME);
		String classname=ele.getAttribute("class");
		if(classname != null && classname.contains("disabled")){
			reportInfo("Next Button Is Disabled");
		}
		else{
		this.click(NEXT_BUTTON);
		waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On Next Button to navigate to Next Page");
		count++;
		
		}
		return count;
	}
	public int clickOnPreviousButton() {
		int count=0;
		WebElement ele=driver.findElement(PREVIOUS_BUTTON_CLASS_NAME);
		String classname=ele.getAttribute("class");
		if(classname != null && classname.contains("disabled")){
			reportInfo("Previous Button Is Disabled");
		}
		else{
		this.click(PREVIOUS_BUTTON);
		waitForPageToLoad(PAGE_LOADING);
		reportInfo("Clicking On Previous Button to navigate to previous Page");
		count++;
		
		}
		return count;
	}
	public void validateNextButton(String testType){
		reportInfo("Validating Next Button");
		WebElement ele=driver.findElement(VALIDATE_NEXT_BUTTON);
		String classname=ele.getAttribute("class");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				if(classname != null && classname.contains("active")){
					String successFilePath = elementScreenshot(NEXT_BUTTON);
					reportSuccessScreenshot(successFilePath,"");
					reportPassedStatus("Verified Next button");
				} else if (testType.equalsIgnoreCase("invalid")) {
				}
				}
		}catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Next Button Assertion Failed");
		}
	}
	public void validatePreviousButton(String testType){
		reportInfo("Validating Previous Button");
		WebElement ele=driver.findElement(VALIDATE_PREVIOUS_BUTTON);
		String classname=ele.getAttribute("class");
		try {
			if (testType.equalsIgnoreCase("valid")) {
				if(classname != null && classname.contains("active")){
					String successFilePath = elementScreenshot(PREVIOUS_BUTTON);
					reportSuccessScreenshot(successFilePath,"");
					reportPassedStatus("Verified Previous button");
				} else if (testType.equalsIgnoreCase("invalid")) {
				}
				}
		}catch (Exception e) {
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
			reportFailedStatus();
			new Exception("Previous Button Assertion Failed");
		}
	}
	public String getText(By by ,String testData){
		reportInfo(testData);
		return this.getText(by);
		}
	public void assertText(String expected, String actual, By by, String message){
		if(expected.equalsIgnoreCase(actual)){
		reportPassedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
		this.scrollDown();
		String successFilePath = elementScreenshot(by);
		reportSuccessScreenshot(successFilePath,message);
		}else{
		reportFailedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
		this.scrollDown();
		String failureFilePath = driverScreenshot();
		reportFailureScreenshot(failureFilePath);
		}
		}
	public void assertBoolean(Boolean expected, Boolean actual, By by, String message){
		if(expected==actual){
			reportPassedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			this.scrollDown();
			String successFilePath = elementScreenshot(by);
			reportSuccessScreenshot(successFilePath,message);
		}else{
			reportFailedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			this.scrollDown();
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
		}
	}
	
	public void assertInt(int expected, int actual, By by, String message){
		if(expected==actual){
			reportPassedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			this.scrollDown();
			String successFilePath = elementScreenshot(by);
			reportSuccessScreenshot(successFilePath,message);
		}else{
			reportFailedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			this.scrollDown();
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
		}
	}
	public List<String> expectedList(By by,String testData){ 
		List<String> list1 = new ArrayList<String>();
		List<WebElement> memberTableNameColumn = getWebElementList(PURSE_TABLE_NAME_COLUMN); 
		for (WebElement element : memberTableNameColumn) { 
			list1.add(element.getText()); 
		} 
		Collections.sort(list1); 
		System.out.println(list1);
		Collections.reverse(list1); 
		reportInfo(testData);
		return list1; 
	}
	public List<String> actualList(By by,String testData){ 
		List<String> list1 = new ArrayList<String>(); 
		List<WebElement> memberTableNameColumn = getWebElementList(PURSE_TABLE_NAME_COLUMN); 
		for (WebElement element : memberTableNameColumn) { 
			list1.add(element.getText()); 
		} 
		reportInfo(testData);
		return list1; 
	} 
	
	public void assertObject(Object expected, Object actual, String message){
     if(expected.equals(actual)){
			reportPassedStatus("Expected [ "+expected+" ] ");
			reportPassedStatus(" Actual [ "+actual+" ]");
			this.scrollDown();

		}else{
			reportFailedStatus("Expected [ "+expected+" ] ");
			reportFailedStatus(" Actual [ "+actual+" ]");

		}
	}
	public String getClassname(By by,String testData){ 
        reportInfo(testData); 
        WebElement ele=driver.findElement(by); 
        String classname=ele.getAttribute("class"); 
        return classname; 
        
}
}
