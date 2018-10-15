package JavaTutorials;

public class passingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] carList = {"BMW", "Audi", "Mercedes", "Maruti", "Hyundai"};
		Print_Array(carList);

	}
	
	public static void Print_Array(String []array)
	{
		for(int i=0; i<=array.length-1; i++)
		{
			System.out.println("Printing all values of array carlist via method " + array[i]);
		}
	}

}
