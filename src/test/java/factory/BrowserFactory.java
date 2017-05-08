package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dataProvider.ConfigDataProvider;

public class BrowserFactory 
{
	static WebDriver driver;
	public static WebDriver getBrowser(String browsername)
	{
		if(browsername.equalsIgnoreCase("firefox"))
		{
			
			System.setProperty("webdriver.firefox.marionette",DataProviderFactory.getconfig().getMozillPath());
			//System.setProperty("webdriver.gecko.driver",DataProviderFactory.getconfig().getMozillPath());
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("Chrome"))
		{
			
			System.setProperty("webdriver.gecko.driver",DataProviderFactory.getconfig().getChromePath() );
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("IE"))
		{
			
			System.setProperty("webdriver.gecko.driver",DataProviderFactory.getconfig().getChromePath() );
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	public static void closebrowser(WebDriver driver)
	{
		driver.quit();
	}

}
