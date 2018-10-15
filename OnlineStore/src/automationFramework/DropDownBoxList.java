package automationFramework;
	import java.util.List;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

public class DropDownBoxList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(URL);
		driver.manage().window().maximize();
		
		WebElement continents = driver.findElement(By.id("continents"));
		Select select = new Select(continents);
		select.selectByIndex(1);
		select.selectByVisibleText("Africa");
		
		List <WebElement> elementCount = select.getOptions();
		int dropdownSize = elementCount.size();
		
		for(int i=0; i<dropdownSize; i++)
		{
			String value = elementCount.get(i).getText();
			System.out.println(value);
		}
		
		driver.quit();
		
	}

}
