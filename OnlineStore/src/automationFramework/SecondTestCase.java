package automationFramework;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String URL = "http://demoqa.com/frames-and-windows/";
		driver.get(URL);
		
		WebElement Button = driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a"));
		Button.click();
		
		driver.close();
	}

}
