package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CxpHomePage {
	
	WebDriver driver;
	public CxpHomePage(WebDriver driver){
		this.driver=driver;
	}
  @FindBy(how=How.LINK_TEXT,using="Accounting")@CacheLookup WebElement Accounting;
  @FindBy(how=How.LINK_TEXT,using="Corporate Sales")@CacheLookup  WebElement CorporateSales;
  @FindBy(how=How.LINK_TEXT,using="Kitchen")@CacheLookup WebElement Kitchen;
  @FindBy(how=How.LINK_TEXT,using="Maintenance")@CacheLookup WebElement Maintenance;
  @FindBy(how=How.LINK_TEXT,using="Sales")@CacheLookup WebElement Salesmodule;
  @FindBy(how=How.LINK_TEXT,using="Scheduling")@CacheLookup WebElement Scheduling;
  @FindBy(how=How.LINK_TEXT,using="Warehouse")@CacheLookup WebElement Warehouse;
  @FindBy(how=How.XPATH,using="//img[@title='Logout']")@CacheLookup WebElement Logout;
  
  
  
 public void clickOnAccountingModuleLink(){
	 Accounting.click();
 }
 public void clickOnCorporateSalesModuleLink(){
	 CorporateSales.click();
 }
 public void clickOnKitchenModuleLink(){
	 Kitchen.click();
 }
 public void clickOnMaintenanceModuleLink(){
	 Maintenance.click();
 }
 public void clickOnSalesModuleLink(){
	 Salesmodule.click();
 }
 public void clickOnSchedulingModuleLink(){
	 Scheduling.click();
 }
 public void clickOnWarehouseModuleLink(){
	 Warehouse.click();
 }
 public void clickLogoutIcon(){
	 Logout.click();
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
