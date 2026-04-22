package april18_TestNG;

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
	public void switchToIframe() throws InterruptedException 
	{
		driver.switchTo().frame("auth-login-ui");
		
		WebElement enterMob = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
		WebElement clickOnOtp = driver.findElement(By.xpath("//span[@class='sc-1kx5g6g-3 bTZuzF']"));
		
		enterMob.sendKeys("4444444444");
		clickOnOtp.click();
		
		driver.switchTo().defaultContent();
		
		driver.navigate().back();
		
		Thread.sleep(3000);
	}
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
