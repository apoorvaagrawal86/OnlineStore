package automationFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sequencing {
	
	@Test
	
	public void testCase1() {
		System.out.println("Test Case 1");
	}
	
	@Test
	
	public void testCase2() {
		System.out.println("Test Case 2");
	}
	
	@BeforeMethod
	
	public void testCase3() {
		System.out.println("Test Case 3");
	}
	
	@AfterMethod
	
	public void testCase4() {
		System.out.println("Test Case 4");
	}
	
	@BeforeClass
	
	public void testCase5() {
		System.out.println("Test Case 5");
	}
	
	@AfterClass
	
	public void testCase6() {
		System.out.println("Test Case 6");
	}
	
	@BeforeTest
	
	public void testCase7() {
		System.out.println("Test Case 7");
	}

	@AfterTest
	
	public void testCase8() {
		System.out.println("Test Case 8");
	}
	
	@BeforeSuite
	
	public void testCase9() {
		System.out.println("Test Case 9");
	}
	
	@AfterSuite
	
	public void testCase10() {
		System.out.println("Test Case 10");
	}
}
