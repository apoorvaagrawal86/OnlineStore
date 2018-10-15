package automationFramework;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	

public class FindElementsCommand1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String URL = "http://toolsqa.wpengine.com/Automation-practice-form/";
		driver.get(URL);
		
		driver.manage().window().maximize();
		
		WebElement FirstName = driver.findElement(By.name("firstname")); 
		FirstName.sendKeys("Apoorva");
		
		WebElement LastName = driver.findElement(By.name("lastname"));
		LastName.sendKeys("Agrawal");
		
		WebElement Submit = driver.findElement(By.id("submit"));
		Submit.click();
		
		driver.quit();
		
		
	}

}

