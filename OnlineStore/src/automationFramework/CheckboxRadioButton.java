package automationFramework;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import java.util.List;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;

public class CheckboxRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Old Laptop Backup\\HTML-CSS\\HTML-CSS\\HTML-CSS\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(URL);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> femaleRadioButton = driver.findElements(By.name("sex"));
		
		boolean value = false;
		
		value = femaleRadioButton.get(0).isSelected();
		
		if(value == true)
		{
			femaleRadioButton.get(0).click();
		}
		
		else
		{
			femaleRadioButton.get(1).click();
		}
		
		WebElement radioExperience = driver.findElement(By.id("exp-2"));
		radioExperience.click();
		
		List<WebElement> profession = driver.findElements(By.name("profession"));
		
		int size = profession.size();
		
		for(int i = 0; i<size; i++)
		{
			String professionvalue = profession.get(i).getAttribute("value");
			
			if(professionvalue.equalsIgnoreCase("Automation Tester"))
			{
				profession.get(i).click();
				
				break;
			}
		

		}
		
		WebElement seleniumCheckBox = driver.findElement(By.cssSelector("div[class='control-group']>input[value='Selenium IDE']"));
		
		seleniumCheckBox.click();
		
		driver.quit();
		
		}
}