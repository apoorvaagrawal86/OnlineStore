package Application.UnitTests;

import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumJUnitTest {

			private static ChromeDriver driver;
			WebElement element;
			
			
			
			@BeforeClass
			public static void openBrowser() {
				//System.setProperty("webdriver.chrome.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
				//WebDriver driver = new ChromeDriver();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
			
			
			@Test
			public void valid_UserCredentials() {
				
				System.out.println("Starting Test " + new Object() {}.getClass().getEnclosingMethod().getName());
				driver.get("http://www.store.demoqa.com");
				driver.findElement(By.xpath(".//*[@id='account']/a")).click();
				driver.findElement(By.id("log")).sendKeys("testuser_3");
				driver.findElement(By.id("pwd")).sendKeys("Test@123");
				driver.findElement(By.id("login")).click();
			try
			{
				element = driver.findElement(By.xpath(".//*[@id='account_logout']/a"));
			}
			catch(Exception e)
			{
				
			}
			
			Assert.assertNotNull(element);
			System.out.println("Ending Test " + new Object() {}.getClass().getEnclosingMethod().getName());
			}
			
			@Test
			public void invalid_UserCredentials() {
				
				System.out.println("Starting Test " + new Object() {}.getClass().getEnclosingMethod().getName());
				driver.get("http://www.store.demoqa.com");
				driver.findElement(By.xpath(".//*[@id='account']/a")).click();
				driver.findElement(By.id("log")).sendKeys("testuser");
				driver.findElement(By.id("pwd")).sendKeys("Test@123");
				driver.findElement(By.id("login")).click();
			try
			{
				element = driver.findElement(By.xpath(".//*[@id='account_logout']/a"));
			}
			catch(Exception e)
			{
				
			}
			
			Assert.assertNotNull(element);
			System.out.println("Ending Test " + new Object() {}.getClass().getEnclosingMethod().getName());
				
			}
			
			@AfterClass
			public static void closeBrowser() {
				driver.quit();
			}
			
			
			
}
