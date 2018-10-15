package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicWebtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String URL = "http://toolsqa.wpengine.com/automation-practice-table/";
		driver.get(URL);
		driver.manage().window().maximize();
		
		WebElement Cell = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/td[contains (text(),'Dubai')]"));
		System.out.println(Cell.getText());
		
		WebElement linkCell = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[1]/td/a[contains (text(),'details')]"));
		linkCell.click();
		
		driver.quit();

	}

}
