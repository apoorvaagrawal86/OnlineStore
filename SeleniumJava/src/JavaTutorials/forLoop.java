package JavaTutorials;

public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int increment=0; increment<=10; increment ++)
		{
			System.out.println("Count is " + increment);
		}
		System.out.println("<-----Next Count----->");
		for(int decrement=5; decrement>0;decrement --)
		{
			System.out.println("Count is " + decrement);
		}
		System.out.println("<-------Final count------>");
		for(int count=0;count<=6;count+=2)
		{
			System.out.println("Count is " + count);
		}

	}

}
