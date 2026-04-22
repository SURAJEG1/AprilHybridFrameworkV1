package april18_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class StaticDropdown {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito --start-Maximized");
		driver = new ChromeDriver(co);
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	
	
	
	@Test(priority=1)
	public void staticDropdownSelectByValue() 
	{
		WebElement drop = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select sc = new Select(drop);
		sc.selectByValue("search-alias=amazon-devices");
	}
	
	
	@Test(priority=2)
	public void staticDropdownSelectByIndex() 
	{
		WebElement drop = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select sc = new Select(drop);
		sc.selectByIndex(4);
	}
	
	
	@Test(priority=3)
	public void staticDropdownSelectBySendKeysAction() 
	{
		WebElement drop = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		drop.sendKeys(Keys.ARROW_DOWN);
		drop.sendKeys(Keys.ARROW_DOWN);
	}
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
