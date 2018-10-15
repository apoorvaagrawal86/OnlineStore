package automationFramework;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.store.demoqa.com");
		
		String PageTitle = driver.getTitle();
		int TitleLength = PageTitle.length();
		String URL = driver.getCurrentUrl();
		
		System.out.println("Title of the page is " + PageTitle);
		System.out.println("Title length is " + TitleLength);
		
		String actualURL = "http://store.demoqa.com/";
		System.out.println("URL of the page is " + URL);
		System.out.println("Actual URL of the page is " + actualURL);
		
		
		if(actualURL.equals(URL))
		{
			System.out.println("URLs match");
		}
		
		else 
		{
			System.out.println("URLs dont match");
		}
		
		String PageSource = driver.getPageSource();
		int PageSourceLength = PageSource.length();
		
		System.out.println("Length of the page source is " + PageSourceLength);
		
		driver.close();
		
	}

}
