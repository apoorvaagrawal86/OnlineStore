package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement from = driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		WebElement to = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		
		Actions builder = new Actions(driver);
		
		Action draganddrop = builder.clickAndHold(from)
		.moveToElement(to)
		.release(to)
		.build();
		
		draganddrop.perform();
		
		Thread.sleep(10000);
		
		driver.quit();
		
		
	}

}
