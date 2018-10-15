package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "http://toolsqa.wpengine.com/automation-practice-switch-windows/";
		driver.get(URL);
		driver.manage().window().maximize();
		
		WebElement timingAlert = driver.findElement(By.id("timingAlert"));
		timingAlert.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		
		System.out.println("Alert Accepted");
		
		driver.quit();

	}

}
