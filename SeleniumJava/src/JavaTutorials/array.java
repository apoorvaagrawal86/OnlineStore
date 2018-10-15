package JavaTutorials;

public class array {
	
	public static void main (String args[]) {
	
	String[] array = new String[5];
	{
		array[0] = "BMW";
		array[1] = "Audi";
		array[2] = "Mercedes";
		array[3] = "Maruti";
		array[4] = "Hyundai";
	
	}
	
	String[] carMake = {"BMW", "Audi", "Mercedes"};
	
	System.out.println(array[2]);
	System.out.println(carMake[2]);
	System.out.println(array.length);
	System.out.println("The length of array carMake is " + carMake.length);
	
	int len = array.length;
	for(int i=0;i<=len-1;i++)
	{
		System.out.println(array[i]);
	}
	}
}
