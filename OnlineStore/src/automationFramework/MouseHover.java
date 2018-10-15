package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement cancelbutton = driver.findElement(By.xpath("//div[@class='mCRfo9']/div/div/button"));
		cancelbutton.click();
		
		WebElement element = driver.findElement(By.xpath("//div[@id='container']/div/header/div[3]/ul/li/span[@class='_1QZ6fC _3Lgyp8'][contains (text(),'Electronics')]"));
		Actions action = new Actions(driver);
		
		action.moveToElement(element).build().perform();
		
		driver.findElement(By.linkText("Mobiles"));
		
		//It can alse be done in this way
		//action.moveToElement(element).moveToElement(driver.findElement(By.xpath("//div[@id='container']/div/header/div[3]/ul/li/span[@class='_1QZ6fC _3Lgyp8'][contains (text(),'Electronics')]"))).click().build().perform();
		
		Thread.sleep(10000);
		
		driver.quit();
	}

}
