package automationFramework;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j {
	
	private static WebDriver driver;
	
	private static Logger Log = Logger.getLogger(Log4j.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DOMConfigurator.configure("log4j.xml");
		//BasicConfigurator.configure();
		//create new instance of chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("log4j.debug", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\OnlineStore\\log4j2.xml");
		driver = new ChromeDriver();
		
		Log.info("New driver instantiated");
		
		//Put an implicit wait
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Log.info("Implicit wait applied on the driver for 10 seconds");
		
		//Launch online store website
		driver.get("http://newtours.demoaut.com");
		Log.info("Web application launched");
		
		//Find element by account id
		//driver.findElement(By.id("account")).click();
		//Log.info("Click action performed on my account link");
		
		driver.findElement(By.cssSelector("input[type=text][name=userName]")).sendKeys("mercury");
		//driver.findElement(By.id("log")).sendKeys("testuser_1");
		Log.info("Username entered in the username text box");
		
		driver.findElement(By.cssSelector("input[type=text][name=userName]")).sendKeys("mercury");
		//driver.findElement(By.id("pwd")).sendKeys("Test@123");
		Log.info("Password entered in the password text box");
		
		driver.findElement(By.cssSelector("input[type=image][name=login]")).click();
		//driver.findElement(By.id("login")).click();
		Log.info("Click action performed on Submit button");
		
		//Print a login message to the screen
		System.out.println("Login successfully, logging out now");
		
		//driver.findElement(By.id("account_logout")).click();
		//Log.info("Click action performed on Log out link");
		
		driver.quit();
		
		Log.info("Browser closed");
	}

}
