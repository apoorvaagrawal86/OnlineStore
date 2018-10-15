package automationFramework;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class HandleDynamicWebtables_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Wait wait = new FluentWait(driver)
		.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(NoSuchElementException.class);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String URL = "http://toolsqa.wpengine.com/automation-practice-table/";
		driver.get(URL);
		driver.manage().window().maximize();
		
		WebElement valueCell = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/td[contains (text(),'Dubai')]"));
		String value = valueCell.getText();
		System.out.println(value);
		Thread.sleep(2000);
		
		String structureValue = "Clock Tower Hotel";
		
		for(int i=1; i<5; i++)
		{
			WebElement structure = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+ i +"]/th"));
			String structuretext = structure.getText();
						
			if(structuretext.equalsIgnoreCase(structureValue))
			{
				for(int j=1; j<6; j++)
				{
					WebElement tablevalues = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[2]/td["+ j +"]"));
					String tabletext = tablevalues.getText();
					
					System.out.println(tabletext);
				}
			}
		}
		
		driver.quit();
	}

}
