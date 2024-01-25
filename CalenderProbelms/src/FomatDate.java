import java.text.SimpleDateFormat;
import java.util.*;
public class FomatDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat dateFormat=new SimpleDateFormat("mm/dd/yyyy");
		Date date=new Date();
		String formateddate=dateFormat.format(date);
		System.out.println(formateddate);
	}

}
