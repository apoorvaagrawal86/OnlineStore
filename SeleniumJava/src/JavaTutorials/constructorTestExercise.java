package JavaTutorials;

public class constructorTestExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//In case values are not defined by default use this to define cosntructor
		//constructorClass Hyundai = new constructorClass("Sonata",2018,true);
		//Else use this
		constructorClass Hyundai = new constructorClass();
		
		Hyundai.Color = "Blue";
		Hyundai.Doors = 4;
		Hyundai.Gear = 6;
		Hyundai.TopSpeed = 240;
		Hyundai.Transmission = "Automatic";
		//This will overwrite the default values setup in constructor
		Hyundai.Tyres = 4;
		
		
		Hyundai.displayCharacteristics();
		

	}

}
