package JavaTutorials;

public class enhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String days[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		for(String weekDays : days)
		{
			System.out.println("Days -->" + weekDays);
		}
		
		for(int i=0;i<days.length;i++)
		{
			System.out.println("Weekdays are --> " + days[i]);
		}

	}

}
