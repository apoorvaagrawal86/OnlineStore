package Application.UnitTests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result = JUnitCore.runClasses(JUnitMathProvider_1.class, JUnitMethodProvider_2.class);
		System.out.println("Total Number of Tests " + result.getRunCount());
		
		System.out.println("Total Number of Failures " + result.getFailureCount());
		
		for(Failure failure : result.getFailures())
		{
			System.out.println(failure.getMessage());
		}
		
		System.out.println(result.wasSuccessful());

	}

}
