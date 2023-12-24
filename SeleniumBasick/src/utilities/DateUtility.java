package utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtility {

	public static String getRequiredDateBasedOnNumberOfDays(String format, int numberOfdays) {
		
			Calendar ca1=Calendar.getInstance();
			ca1.add(Calendar.DATE, numberOfdays);//numberOfdays chi value takaychi
			SimpleDateFormat s=new SimpleDateFormat(format); 
            return s.format(new Date(ca1.getTimeInMillis()));
}

	public static String getRequiredDateBasedOnNumberOfMonths(String format, int numberOfMonths) {
		
		Calendar ca1=Calendar.getInstance();
		ca1.add(Calendar.MONTH, numberOfMonths);//numberOfMonths chi value takaychi
		SimpleDateFormat s=new SimpleDateFormat(format); 
        return s.format(new Date(ca1.getTimeInMillis()));
}

	public static String getRequiredDateBasedOnNumberOfYears(String format, int numberOfYears) {
		
		Calendar ca1=Calendar.getInstance();
		ca1.add(Calendar.YEAR, numberOfYears);//numberOfyears chi value takaychi
		SimpleDateFormat s=new SimpleDateFormat(format); 
        return s.format(new Date(ca1.getTimeInMillis()));
}	
		
		
		
	}


