package JavaTutorials;

public class returningArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] carList = ReturnArray();
		for(int i=0; i<=carList.length-1;i++)
		{
			System.out.println("Printing all values of array returning from a method " + carList[i]);
		}
	}
		
	public static String[] ReturnArray() {
		String [] carMake = {"BMW", "Audi", "Mercedes", "Maruti", "Hyundai"};
		return carMake;
	}	
	}

	
	
