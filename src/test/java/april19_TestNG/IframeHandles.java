package april19_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

public class IframeHandles {
	
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
		
		WebElement enterP = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
		enterP.sendKeys("987678998");
		WebElement clickOnOTP = driver.findElement(By.xpath("//span[@class='sc-1kx5g6g-2 ilXTK']"));
		clickOnOTP.click();
		
		driver.switchTo().defaultContent();
		driver.navigate().back();
	}
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
