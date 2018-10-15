package automationFramework;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectionBoxText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(URL);
		
		WebElement SeleniumCommands = driver.findElement(By.name("selenium_commands"));
		
		Select select = new Select(SeleniumCommands);
		select.selectByIndex(0);
		Thread.sleep(5000);
		select.deselectByIndex(0);
		Thread.sleep(5000);
		
		select.selectByVisibleText("Navigation Commands");
		Thread.sleep(5000);
		select.deselectByVisibleText("Navigation Commands");
		Thread.sleep(5000);
		
		List <WebElement> multiselectCount = select.getOptions();
		int size = multiselectCount.size();
		
		for(int i=0; i<size; i++)
		{
			String value = multiselectCount.get(i).getText();
			System.out.println(value);
			select.selectByIndex(i);
			Thread.sleep(2000);
			
		}
		
		select.deselectAll();
		
		driver.quit();
		

	}

}
