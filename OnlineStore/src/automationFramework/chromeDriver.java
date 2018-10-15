package automationFramework;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriver {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://toolsqa.wpengine.com/automation-practice-form/");

}
}
