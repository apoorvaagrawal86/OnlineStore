package JavaTutorials;

public class continueLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<=10; i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println("Count is " + i);
		}
		System.out.println("<----Next Count---->");
		
		for(int j=0; j<=5; j++)
		{
			if(j==3)
			{
				System.out.println("Count is " + j);
				continue;
			}
		}

	}

}
