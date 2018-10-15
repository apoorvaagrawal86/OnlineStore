package automationFramework;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	
public class GeckoDriverBrowser {
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.gecko.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\geckodriver-v0.22.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.toolsqa.com");
		
		driver.quit();
		
		
	}

}
