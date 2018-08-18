package selenium.framework.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import selenium.framework.common.PageControls;
public class MembersbyDMA extends PageControls{
	
	private static final By Analytics_link=By.linkText("Analytics");
	private static final By Members_by_DMA_hyperlink=By.linkText("Members by DMA");
	private static final By Start_date=By.xpath("//*[@id='analytics-filter']/div/div/section/div[1]/label[2]/label/input");
	private static final By End_date=By.xpath("//*[@id='analytics-filter']/div/div/section/div[2]/label[2]/label/input");
	private static final By Program_filter=By.xpath(".//*[@id='analytics-filter']/div/div/section/div[3]/label[2]/div/div/button");
	private static final By Program_check_all=By.id("selectAll");
	private static final By Program_uncheck_all=By.id("deselectAll");
	private static final By Program_search_input=By.xpath("//*[@id='analytics-filter']/div/div/section/div[3]/label[2]/div/div/ul/li[4]/div/input");
	private static final By Location_filter_button=By.id("location-filter-button");
	private static final By Location_advance_search=By.id("advanced-search-button");
	private static final By	Advance_search_ok_button=By.xpath("//form[@id='advanced-search-dialog']/div[2]/footer/button[2]");
	private static final By Advance_search_cancel_button=By.xpath("//form[@id='advanced-search-dialog']/div[2]/footer/button[1]");
	private static final By Location_filter_ok_button=By.xpath("html/body/div[10]/div/div/form/div[2]/footer/button[1]");
	private static final By Location_filter_cancel_button=By.xpath("html/body/div[10]/div/div/form/div[2]/footer/button[2]");
	private static final By Segment_filter=By.xpath("//*[@id='analytics-filter']/div/div/section/div[5]/label[2]/div/div/button");
	private static final By Segment_check_all=By.id("selectAll");
	private static final By Segment_uncheck_all=By.id("deselectAll");
	private static final By Segment_search_input=By.xpath("//*[@id='analytics-filter']/div/div/section/div[5]/label[2]/div/div/ul/li[4]/div/input");
	private static final By Filter_collapse_button=By.xpath("//*[@id='analytics-filter']/header/div/a/i");
	private static final By Graphs_collapse_button=By.xpath("//*[@id='member-dma-count']/header/div/a/i");
	private static final By Export_to_CSV=By.xpath("//*[@id='content']/div/div/h1/a[2]/span");
	private static final By Export_charts=By.xpath("//*[@id='content']/div/div/h1/a[1]/span");
	
	public MembersbyDMA(WebDriver webDriver) {
		super(webDriver);
	}
	public void clickOnMembersByDmaHyperlink()
	{
		this.click(Members_by_DMA_hyperlink);
	}
	public void startDateInput()
	{
		this.type(Start_date, "12/29/2015 12:00 PM");
	}
	public void endDateInput()
	{
		this.type(End_date, "12/29/2017 12:00 PM");
	}
	public void clickOnProgramDropdown()
	{
		this.click(Program_filter);
	}
	public void clickOnProgramCheckall()
	{
		this.click(Segment_check_all);
	}
	public void clickOnProgramUncheckall()
	{
		this.click(Program_uncheck_all);
	}
	public void programSearchInput()
	{
		this.type(Program_search_input, "program");
	}
	public void clickOnLocationfilterButton()
	{
		this.click(Location_filter_button);
	}
	public void clickOnAdvanceSearchButton()
	{
		this.click(Location_advance_search);
	}
	public void clickOnAdvanceSearchOkButton()
	{
		this.click(Advance_search_ok_button);
	}
	public void clickOnAdvanceSearchCancelButton()
	{
		this.click(Advance_search_cancel_button);
	}
	public void clickOnLocationFilterOkButton()
	{
		this.click(Location_filter_ok_button);
	}
	public void clickOnLocationFilterCancelButton()
	{
		this.click(Location_filter_cancel_button);
	}
	public void clickOnSegmentDropdown()
	{
		this.click(Segment_filter);
	}
	public void clickOnSegmentCheckallButton()
	{
		this.click(Segment_check_all);
	}
	public void clickOnSegmentUncheckallButton()
	{
		this.click(Segment_uncheck_all);
	}
	public void segmentSearchInput()
	{
		this.type(Segment_search_input, "Open");
	}
	public void clickOnFilterCollapseButton()
	{
		this.click(Filter_collapse_button);
	}
	public void clickOnGraphsCollapseButton()
	{
		this.click(Graphs_collapse_button);
	}
	public void clickOnExportToCsvButton()
	{
		this.click(Export_to_CSV);
	}
	public void clickOnExportChartsButton()
	{
		this.click(Export_charts);
	}
	
}
	
	
	




