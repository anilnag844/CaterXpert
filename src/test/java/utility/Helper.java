package utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Helper {
	
	public static String capturescreenshot(WebDriver driver,String screenshotname ){
		TakesScreenshot ts=(TakesScreenshot) driver;
		File scr=ts.getScreenshotAs(OutputType.FILE);
		String destination="./Screenshots/"+screenshotname+System.currentTimeMillis()+".png";
		try{
			FileUtils.copyFile(scr, new File(destination) );
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return destination;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
