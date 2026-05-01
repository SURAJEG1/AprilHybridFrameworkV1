package april27_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class Iframe {
	
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
		System.out.println("switch to iframe...");
		
		WebElement enterMob = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
		enterMob.sendKeys("4564689891");
		
		WebElement clickOnOTP = driver.findElement(By.xpath("//span[@class='sc-1kx5g6g-2 ilXTK']"));
		clickOnOTP.click();
		
		driver.switchTo().defaultContent();
		System.out.println("switch to default...");
	}
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
