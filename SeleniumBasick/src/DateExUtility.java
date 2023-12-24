import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import utilities.DateUtility;

public class DateExUtility {

	public static void main(String[] args) {

		Date d1 = new Date();
		System.out.println("Date ref d1:" + d1);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String date = sdf.format(d1);
		System.out.println("Date using formatter: " + date);//03/10/2023
        System.out.println("differnt format to right");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, 5);
		SimpleDateFormat s = new SimpleDateFormat("dd,MMMM,yyyy");
		String date2 = s.format(new Date(cal.getTimeInMillis()));
		System.out.println("Date in future: "+date2);
		
		System.out.println(DateUtility.getRequiredDateBasedOnNumberOfDays("dd-MMMM-yyyy", -2));
		
		System.out.println(DateUtility.getRequiredDateBasedOnNumberOfMonths("dd-MMMM-yyyy", 5));
		
		System.out.println(DateUtility.getRequiredDateBasedOnNumberOfYears("dd-MMMM-yyyy", -7));


	}

}
