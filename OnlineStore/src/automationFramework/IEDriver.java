package automationFramework;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://toolsqa.com");
		
		Thread.sleep(5000);
		driver.quit();
	}

}
