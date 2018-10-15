package automationFramework;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class desiredCapabilitiesGeckoDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxOptions capabilities = new FirefoxOptions();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("http://www.toolsqa.com");
		
		Thread.sleep(5000);
		driver.quit();
	}

}
