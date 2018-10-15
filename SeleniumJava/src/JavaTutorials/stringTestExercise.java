package JavaTutorials;

public class stringTestExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Topic_1 = "Selenium Automation Framework";
		String Topic_2 = "Basic Java Tutorial";
		
		System.out.println("First Output");
		System.out.println(Topic_1.concat(Topic_2));
		
		System.out.println("Second Output");
		System.out.println("Selnium Automation Framework".concat(Topic_2));
		
		System.out.println("Third Output");
		System.out.println("Selenium Automation Framework" + "Basic Java Tutorial");
		
		System.out.println("Fourth Output");
		System.out.println("Selenium Automation Framework" + " " + "Basic Java Tutorial");
		
		//Compare two strings
		boolean compareResult = Topic_1.equals(Topic_2);
		System.out.println("The result of the comparison is " + compareResult);
		
		//return single character at indexed value from the string
		char Index = Topic_1.charAt(4);
		System.out.println("Character at 4th index is " + Index);
		
		//String contains text
		boolean Contains = Topic_1.contains("Automation");
		System.out.println("The result of required string being contained in Topic_1 is " + Contains);
		
		//Return the starting index of the passed string
		int iIndex = Topic_1.indexOf("Framework");
		System.out.println("The starting index of Index is " + iIndex);
		
		//Return Starting string of the sub string of the indexed string number
		String subString = Topic_1.substring(iIndex);
		System.out.println("The starting string of the sub string is " + subString);
		
		//Return substring for the first and last index of the indexed string number
		subString = Topic_1.substring(12, 16);
		System.out.println("Substring for the first and last index for the indexed string number is " + subString);
		
		//Convert to lower case
		String lowerCase = Topic_1.toLowerCase();
		System.out.println("Converted to lower case string is " + lowerCase);
		
		//Split the string into 2 parts and store them into an array
		String[] split = Topic_1.split("Automation");
		System.out.println("The first part of the array is " + split[0]);
		System.out.println("The last part of the array is " + split[1]);
		
	}

}
