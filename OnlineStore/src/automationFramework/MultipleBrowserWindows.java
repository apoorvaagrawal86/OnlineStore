package automationFramework;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleBrowserWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		
		WebElement newBrowserWindow = driver.findElement(By.id("button1"));
		
		
		for(int i=0; i<3; i++)
		{
			newBrowserWindow.click();
		}
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		for(String handle : allWindowHandles)
		{
			System.out.println("Window Handles are :" + handle);
		}
		
		driver.quit();

	}

}
