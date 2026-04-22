package april18_TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class MouseHoverActions {
	
	
	WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito --start-Maximized");
		driver = new ChromeDriver(co);
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void mouseHoverRightClickAction()
	{
		WebElement insta = driver.findElement(By.linkText("Instagram"));
		Actions action = new Actions(driver);
		action.moveToElement(insta).contextClick().build().perform();
	}
	
	
	@Test
	public void robotClass() throws AWTException, InterruptedException 
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}
	
	
	@Test
	public void windowHandle() 
	{
		Set<String> wd = driver.getWindowHandles();
		Iterator<String> it = wd.iterator();
		String facebook = it.next();
		String instagram = it.next();
		
		driver.switchTo().window(facebook);
		System.out.println(driver.getTitle());
		driver.switchTo().window(instagram);
		System.out.println(driver.getTitle());
	}
	
	
	
	@AfterClass
	public void tearDown() throws InterruptedException 
	{
		driver.close();
		Thread.sleep(4000);
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	

}
