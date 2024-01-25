import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat dateFormate=new SimpleDateFormat("dd/mm/yyyy");
		Calendar cal=Calendar.getInstance();
		Date currentDate=cal.getTime();
		System.out.println(currentDate);
		try {
			Date date1=dateFormate.parse("09/02/1998");
			Date date2=dateFormate.parse("02/11/2023");
			long dif=date2.getTime()-date1.getTime();
			long days=dif/(1000 * 60 * 60 * 24);
			long years=days/365;
			System.out.println(years);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*
		        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		        try {
		            Date date1 = dateFormat.parse("01/01/2023");
		            Date date2 = dateFormat.parse("01/01/2022");
		            long difference = date1.getTime() - date2.getTime();
		            System.out.println("Days Difference: " + difference / (1000 * 60 * 60 * 24));
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		        */
		    }
		}

