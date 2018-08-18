package selenium.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import selenium.framework.common.PageControls;

public class ReferenceDataPage extends PageControls  {

	
	
	private static final By PAGE_LOADING = By.xpath("//div[@class='loading' and style='display: block;']");
	private static final  By REFERENCEDATA_MENU_BUTTON=By.xpath("//ul[@id='thelist']/li[3]/a/b/em");
	public ReferenceDataPage(WebDriver driver){
		super(driver);
		
	}
	public ReferenceData_Segments clickonSegments(){
		 String tmp = getCurrentUrl();
			String tmp1 = tmp.substring(0, tmp.lastIndexOf("#/"));
			driver.navigate().to(tmp1+"#/segments");
			System.out.println("Redirecting to segments page");
			waitForPageToLoad(PAGE_LOADING);
			return new ReferenceData_Segments(driver);
	}
	
	public ReferenceData_LocationsPage navigateToLocationsPage(){
		String tmp = getCurrentUrl();
		String tmp1 = tmp.substring(0, tmp.lastIndexOf("#/"));
		driver.navigate().to(tmp1+"#/locations");
		System.out.println("Redirecting to locations page");
		waitForPageToLoad(PAGE_LOADING);
		return new ReferenceData_LocationsPage(driver);
		}
	public DMAPage clickonDMA(){
		String tmp = getCurrentUrl();
		String tmp1 = tmp.substring(0, tmp.lastIndexOf("#/"));
		driver.navigate().to(tmp1+"#/dma");
		System.out.println("Redirecting to DMA page");
		waitForPageToLoad(PAGE_LOADING);
		return new DMAPage(driver);
	}
	
	public OrgsPage clickonOrgs(){
		String tmp = getCurrentUrl();
		String tmp1 = tmp.substring(0, tmp.lastIndexOf("#/"));
		driver.navigate().to(tmp1+"#/orgs");
		System.out.println("Redirecting to Organizations page");
		waitForPageToLoad(PAGE_LOADING);
		return new OrgsPage(driver);
	}
	public ProductsPage navigateToProductsPage(){
		 
		String tmp = getCurrentUrl();
		String tmp1 = tmp.substring(0, tmp.lastIndexOf("#/"));
		driver.navigate().to(tmp1+"#/products");
		System.out.println("Redirecting to products page");
		waitForPageToLoad(PAGE_LOADING);
		return new ProductsPage(driver);
		 
		}
	public ReferenceData_EnumsPage navigateToEnumPage(){
		String tmp = getCurrentUrl();
		String tmp1 = tmp.substring(0, tmp.lastIndexOf("#/"));
		driver.navigate().to(tmp1+"#/enums");
		System.out.println("Redirecting to Enums page");
		waitForPageToLoad(PAGE_LOADING);
		return new ReferenceData_EnumsPage(driver);
		}
	
}
