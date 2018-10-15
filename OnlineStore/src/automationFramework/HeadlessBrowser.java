package automationFramework;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HeadlessBrowser {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		HtmlUnitDriver unitDriver = new HtmlUnitDriver();
		unitDriver.get("http://www.google.com");
		
		System.out.println("Title of the page is " + unitDriver.getTitle());
		
		WebElement searchBox = unitDriver.findElement(By.id("lst-ib"));
		searchBox.sendKeys("Selenium");
		
		WebElement button = unitDriver.findElement(By.name("btnK"));
		
		button.click();
		
		System.out.println("Title of the page is " + unitDriver.getTitle());
		

	}

}
