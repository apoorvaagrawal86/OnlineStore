package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {
	
	private static WebDriver driver;
	
	@Test
	
	@Parameters({"username","password"})
	
	public void test(String username, String password) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		driver.get("http://store.demoqa.com");
		
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		
		driver.findElement(By.id("log")).sendKeys(username);
		
		driver.findElement(By.id("pwd")).sendKeys(password);
		
		driver.findElement(By.id("login")).click();
		
		//driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
		
		driver.quit();
	}

}
