package automationFramework;


import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.xml.DOMConfigurator;
import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterLogs {
	
	
	
	private static WebDriver driver;
	private static Logger Log = Logger.getLogger(Log.class.getName());
	
	@Test
	
	public static void test() {
		DOMConfigurator.configure("log4j.xml");
		System.setProperty("webdriver.chrome.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		Log.info("New driver instantiated");
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		Log.info("Implicit wait applied");
		
		driver.get("http://store.demoqa.com");
		
		Log.info("Web application launched");
		
		Reporter.log("Application launched successfully");
		
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		
		Log.info("Click action performed on my account link");
		
		driver.findElement(By.id("log")).sendKeys("testuser_1");
		
		Log.info("Username entered");
		
		driver.findElement(By.id("pwd")).sendKeys("Test@123");
		
		Log.info("Password Entered");
		
		driver.findElement(By.id("login")).click();
		
		Log.info("Click action performed on Submit button");
		
		Reporter.log("Sign in successful !");
		
		driver.findElement(By.id("account_logout"));
		
		Log.info("Click action performed on Log out link");
		
		driver.quit();
		
		Log.info("Browser closed");
		
		Reporter.log("User is logged out and Application is closed.");
		
		
	}

}
