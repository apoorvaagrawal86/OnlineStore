package Application.UnitTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Application.Application.MathProvider;

public class JUnitMethodProvider_2 {
	
	MathProvider provider;
	
	public JUnitMethodProvider_2() 
	{
		provider = new MathProvider();
	}
	
	@Test
	public void multiply()
	{
		System.out.println("Starting Test " + new Object() {}.getClass().getEnclosingMethod().getName() );
		int firstnumber = 10;
		int secondnumber = 20;
		assertEquals(firstnumber * secondnumber , provider.Multiply(firstnumber, secondnumber) );
		System.out.println("Ending Test " + new Object() {}.getClass().getEnclosingMethod().getName());
	}
	

}
