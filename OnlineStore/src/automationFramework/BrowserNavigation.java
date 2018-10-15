package automationFramework;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
public class BrowserNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		String URL = "http://www.DemoQA.com";
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		WebElement Link = driver.findElement(By.xpath(".//*[@id='menu-item-374']/a"));
		
		Link.click();

		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().to(URL);
		
		driver.navigate().refresh();
		
		driver.close();
	}

}
