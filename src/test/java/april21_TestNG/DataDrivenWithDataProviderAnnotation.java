package april21_TestNG;

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
		co.addArguments("--incognito --start-Maximized");
		driver = new ChromeDriver(co);
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(dataProvider = "getData")
	public void searchProd(String items) 
	{
		WebElement searchBox = driver.findElement(By.xpath(""));
		searchBox.sendKeys(items);
		searchBox.sendKeys(Keys.ENTER);
	}
	
	
	
	
	@DataProvider(name = "getData")
	public static Object[][] dataDriven()
	{
		Object[][] data = new Object[2][1];
		data[0][0] = "glass";
		data[1][0] = "book";
		
		return data;
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	

}
