package automationFramework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MultipleTest {
	
	public WebDriver driver;
	
  @Test (priority=0)
  
  public void One() {
	  System.out.println("Test Case 1");
  }
  
  @Test (priority=1)
  
  public void Two() {
	  System.out.println("Test Case 2");
  }
  
  @Test (priority=2, enabled=false)
  
  public void Three() {
	  System.out.println("Test Case 3");
  }
  
  @Test (priority=3)
  
  public void Four() {
	  System.out.println("Test Case 4");
  }
}

