package automationFramework;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.By;

public class FindElementsCommand2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String URL = "http://toolsqa.wpengine.com/Automation-practice-form/";
		driver.get(URL);
		
		driver.manage().window().maximize();
		
		WebElement PartialLink = driver.findElement(By.partialLinkText("Partial"));
		PartialLink.click();
		
		String Submit = driver.findElement(By.tagName("button")).toString();
		
		System.out.println(Submit);
		
		WebElement Link = driver.findElement(By.linkText("Link Test"));
		Link.click();
		
		driver.quit();

	}

}
