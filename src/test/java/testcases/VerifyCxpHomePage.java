package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import junit.framework.Assert;
import pages.CxpLoginPage;
import utility.Helper;

public class VerifyCxpHomePage {
	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
	@BeforeMethod
	public void openbrowser(){
		extent = new ExtentReports("E:\\Automation\\Framework\\com.seyana.caterxpert\\reports\\CxpLoginReport.html", true);
		test = extent.startTest("Cxp Login test ", "Login test");
		test.log(LogStatus.INFO, "Browser is up and runing");
		driver=BrowserFactory.getBrowser("firefox");
		driver.get(DataProviderFactory.getconfig().getaplicationurl());
		String loginscreentitle=driver.getTitle();
		System.out.println(loginscreentitle);
		Assert.assertEquals(loginscreentitle, "CaterXpert - Login");
		test.log(LogStatus.PASS, "Login Sucessfull");
	}
	
	@Test
	public void TestCxpLoginPage(){
		CxpLoginPage login=PageFactory.initElements(driver, CxpLoginPage.class);
		login.userlogin("administrator", "admintrator");
	}

   @AfterMethod
   public void teardown(ITestResult result){
	   
	   if(result.getStatus()==ITestResult.FAILURE){
		   String path = Helper.capturescreenshot(driver, result.getName());
		   test.log(LogStatus.FAIL, test.addScreenCapture(path));
	   }
		    
	   
   BrowserFactory.closebrowser(driver);
   extent.endTest(test);
   extent.flush();
   
   
}

}
