package JavaTutorials;

public class constructorClass {
		String Model;
		int Gear;
		int TopSpeed;
		String Color;
		int Make;
		boolean LeftHandDrive;
		String Transmission;
		int Tyres;
		int Doors;
		
		//Use either this constructor or the other one
		/*public constructorClass(String carModel, int carMake, boolean carLeftHandDrive)
		{
			Model = carModel;
			Make = carMake;
			LeftHandDrive = carLeftHandDrive;
		}*/
		
		//Use this constructor generally to set default values
		public constructorClass()
		{
			Model = "Sonata";
			LeftHandDrive = true;
			Tyres = 5;
		}
		
		public void displayCharacteristics()
		{
			System.out.println("Model of the car: " + Model);
			System.out.println("Number of gears in the car: " + Gear);
			System.out.println("Top Speed of the car: " + TopSpeed);
			System.out.println("Color of the car: " + Color);
			System.out.println("Make of the car: " + Make);
			System.out.println("Transmission of the car: " + Transmission);
			System.out.println("Left Hand Drive car: " + LeftHandDrive);
			System.out.println("No. of tyres: " + Tyres);
			
		}
}
