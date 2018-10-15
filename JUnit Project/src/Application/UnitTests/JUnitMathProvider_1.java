package Application.UnitTests;

import static org.junit.Assert.*;
import org.junit.Test;
import Application.Application.MathProvider;

public class JUnitMathProvider_1 {
		
	MathProvider provider;
	
	public JUnitMathProvider_1()
	{
		provider = new MathProvider();
	}
	
	@Test
	public void add()
	{
		System.out.println("Starting Test" + new Object() {}.getClass().getEnclosingMethod().getName());
		int firstnumber = 10;
		int secondnumber = 20;
		assertEquals(firstnumber + secondnumber, provider.Add(firstnumber, secondnumber));
		System.out.println("Ending Test" + new Object() {}.getClass().getEnclosingMethod().getName());
	}
	
	@Test
	public void subtract()
	{
		System.out.println("Starting Test" + new Object() {}.getClass().getEnclosingMethod().getName());
		int firstnumber = 30;
		int secondnumber = 25;
		assertEquals(firstnumber - secondnumber, provider.Subtract(firstnumber, secondnumber));
		System.out.println("Ending Test" + new Object() {}.getClass().getEnclosingMethod().getName());
	}

}
