import java.util.*;
public class GettingCurrentDateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calender=Calendar.getInstance();// Gets a calendar instance based on the default time zone and locale.
		Date currentDate=calender.getTime();// Get the time value in milliseconds since the Unix epoch
		System.out.println(" current data and time "+currentDate);
		
			
	}

}
