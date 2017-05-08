package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class SalesModuleHomePage {
	
	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
	public SalesModuleHomePage(WebDriver driver){
		this.driver=driver;
	}
	@FindBy(how=How.LINK_TEXT,using="New Event") @CacheLookup WebElement NewEventLink;
	@FindBy(how=How.LINK_TEXT,using="New Event") @CacheLookup WebElement FilterLink;
	
	public void ClickOnNewEventLink(){
		NewEventLink.click();
	}
	public void ClickOnFilterLink(){
		FilterLink.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
