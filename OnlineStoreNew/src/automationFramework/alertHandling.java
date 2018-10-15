package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class alertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		
		//Click Simple Alert
		WebElement simpleAlert = driver.findElement(By.xpath("//button[contains (text(),'Simple Alert')]"));
		simpleAlert.click();
		
		Alert simple = driver.switchTo().alert();
		String alertText = simple.getText();
		System.out.println("Alert text is : " + alertText);
		simple.accept();
		
		//Click Confirmation pop up
		WebElement confirmPopUp = driver.findElement(By.xpath("//button[contains (text(),'Confirm Pop up')]"));
		//confirmPopUp.click();
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", confirmPopUp);
		
		Alert confirmationAlert = driver.switchTo().alert();
		String confirmationAlertText = confirmationAlert.getText();
		System.out.println("Confirmation Alert Text is : " + confirmationAlertText);
		confirmationAlert.dismiss();
		
		//Enter Text in Prompt Pop up
		WebElement promptPopUp = driver.findElement(By.xpath("//button[contains (text(),'Prompt Pop up')]"));
		promptPopUp.click();
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Yes");
		String promptAlertText = promptAlert.getText();
		System.out.println("Prompt Alert text is : " + promptAlertText);
		promptAlert.accept();
		
				
		driver.quit();

	}

}
