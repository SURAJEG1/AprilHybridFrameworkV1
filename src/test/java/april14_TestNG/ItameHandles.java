package april14_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.*;

public class ItameHandles {
	
	WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito --start-Maximized");
		driver = new ChromeDriver(co);
		driver.get("https://www.zomato.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test
	public void iframe() 
	{
		driver.switchTo().frame("auth-login-ui");
		
		WebElement enterPhoneNumber = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
		enterPhoneNumber.sendKeys("232323232");
		
		WebElement clickOnOTP = driver.findElement(By.cssSelector("span[class='sc-1kx5g6g-3 bTZuzF']"));
		clickOnOTP.click();
		
		driver.switchTo().defaultContent();
	}
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
