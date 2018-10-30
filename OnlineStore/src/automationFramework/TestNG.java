package automationFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestNG {
	
	public WebDriver driver;
	
  @Test
  public void main() {
	  
	  driver.findElement(By.cssSelector("input[type=text][name=userName]")).sendKeys("mercury");
	  
	  driver.findElement(By.cssSelector("input[type=password][name=password]")).sendKeys("mercury");
	  
	  driver.findElement(By.cssSelector("input[type=image][name=login]")).click();
	  
	  System.out.println("Login successful. Now logging off");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	  driver.get("http://newtours.demoaut.com");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}