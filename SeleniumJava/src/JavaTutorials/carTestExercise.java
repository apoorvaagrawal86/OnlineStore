package JavaTutorials;

public class carTestExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		carClass Toyota = new carClass();
		
		Toyota.LeftHandDrive = true;
		Toyota.Doors = 4;
		Toyota.Gear = 6;
		Toyota.TopSpeed = 200;
		Toyota.Make = 2018;
		Toyota.Tyres = 4;
		Toyota.Color = "Black";
		Toyota.Transmission = "Manual";
		Toyota.Model = "Camry";
		
		Toyota.DisplayCharacteristics();
		
		

	}

}
