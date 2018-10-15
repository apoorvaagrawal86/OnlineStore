package automationFramework;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleBrowserWindows2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window's handle" + parentWindowHandle);
		WebElement clickElement = driver.findElement(By.id("button1"));

		for (int i=0; i<3; i++)
		{
			clickElement.click();
		}
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		for(String handle: allWindowHandles)
		{
			System.out.println("Switching to window : " + handle);
			System.out.println("Navigating to Google");
			driver.switchTo().window(handle).get("http://www.google.com");
		}
		
		driver.quit();

	}

}
