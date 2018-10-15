package automationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		driver.manage().window().maximize();
		
		//Find no of frames by Javascript
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer noOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iFrames on the page is " + noOfFrames);
		
		//Find no of frames using iFrame tag
		List<WebElement> iframeElements = driver.findElements(By.tagName("iFrame"));
		System.out.println("The total number of iframes are " + iframeElements.size());
		
		//WebElement iframeElement = driver.findElement(By.id("IF1"));
		
		//You can switch to 1 frame at a time.Uncomment any 1 and execute else error will appear.
		
		//switch to frame by Index
		driver.switchTo().frame(1);
		
		//switch to default frame
		driver.switchTo().defaultContent();
		
		//switch to frame by name
		driver.switchTo().frame("iframe1");
		
		//switch to default frame
		driver.switchTo().defaultContent();
		
		//switch to frame by ID
		driver.switchTo().frame("IF1");
		
		//switch to default frame
		driver.switchTo().defaultContent();
		
		//switch to frame by WebElement
		//driver.switchTo().frame("iframeElement");
		
		//switch to default frame
		driver.switchTo().defaultContent();
		
		driver.quit();
		

	}

}
