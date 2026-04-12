package april12_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject extends ReusableMethods{
	WebDriver driver;
	
	public PageObject(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy (id = "") WebElement username;
	@FindBy (id = "") WebElement password;
	@FindBy (id = "") WebElement lgButton;
	
	
	public void enterUsername(String un) {
		username.sendKeys(un);
	}
	
	
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	
	public void clickOnLoginButton() {
		lgButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
