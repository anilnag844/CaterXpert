package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import junit.framework.Assert;
import pages.CxpHomePage;
import pages.CxpLoginPage;

public class VerifyCxpLoginPage {
	WebDriver driver;
	CxpLoginPage login;
	CxpHomePage home;
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeMethod
	public void openbrowser(){
		extent = new ExtentReports("E:\\Automation\\Framework\\com.seyana.caterxpert\\reports\\CxpReport.html", true);
		test = extent.startTest("Cxp test ", "Login test");
		driver=BrowserFactory.getBrowser("firefox");
		driver.get(DataProviderFactory.getconfig().getaplicationurl());
		test.log(LogStatus.INFO, "Application is up and runing");
	}
	
	@Test
	public void TestCxpLoginPage() throws InterruptedException{
		login=PageFactory.initElements(driver, CxpLoginPage.class);
		login.userlogin("administrator", "administrator");
		Thread.sleep(8000);
		String CxpHome=driver.getTitle();
		System.out.println(CxpHome);
		Assert.assertEquals(CxpHome, "CaterXpert - Home");
		test.log(LogStatus.PASS, "Login Sucessfull");
	    home=PageFactory.initElements(driver, CxpHomePage.class);
	    Thread.sleep(8000);
	    //driver.switchTo().defaultContent();
		driver.switchTo().frame("right");
		driver.findElement(By.linkText("Sales")).click();
	}

   @AfterMethod
   public void teardown(){
	  try {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("header");
		Thread.sleep(8000);
		home.clickLogoutIcon();
		extent.endTest(test);
		extent.flush();
	} catch (Exception e) {
		e.printStackTrace();
	}
      BrowserFactory.closebrowser(driver);
}

}
