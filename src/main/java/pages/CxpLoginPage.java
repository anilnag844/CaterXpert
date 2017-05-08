package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CxpLoginPage {
	WebDriver driver;
	public CxpLoginPage(WebDriver driver){
		this.driver=driver;
	}

	@FindBy(id="userName") WebElement UserID;
	@FindBy(id="password") WebElement Password;
	@FindBy(id="save") WebElement LoginButton;
	
	
	public void userlogin(String username,String Passwd){
		UserID.sendKeys(username);
		Password.sendKeys(Passwd);
		LoginButton.click();
		
	}
}
