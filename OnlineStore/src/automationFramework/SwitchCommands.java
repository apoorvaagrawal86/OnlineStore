package automationFramework;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		WebElement button = driver.findElement(By.xpath("//button[contains (text(),'New Message Window')]"));
		button.click();
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		
		for(String handle1: driver.getWindowHandles())
		{
			System.out.println(handle1);
			driver.switchTo().window(handle1);
		}
		
		driver.close();
		
		driver.quit();
	}

}
