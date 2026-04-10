package april10_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class DataDrivenWithDataProviderAnnotation {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito --start_Maximized");
		driver = new ChromeDriver(co);
		driver.get("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test(dataProvider = "items")
	public void searchProd(String item) 
	{
		WebElement searchBox = driver.findElement(By.id(""));
		searchBox.sendKeys(item);
		searchBox.sendKeys(Keys.ENTER);
	}
	
	
	
	@DataProvider(name = "items")
	public static Object[][] dataDriven()
	{
		Object[][] data = new Object[2][1];
		data[0][0] = "paperhoder";
		data[1][0] = "carbonsheet";
		
		return data;
	}
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	

}
