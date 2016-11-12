package app3;

import java.util.Calendar;
import java.util.Date;

public class Manager5 {

	public static void main(String[] args) {
		
		   Calendar cal = Calendar.getInstance();   // GregorianCalendar
		  // Calendar cal = new GregorianCalendar();
		  
		   System.out.println("Calendar's toString() is : " + cal + "\n");
		   System.out.println("Time zone is: " + cal.getTimeZone() + "\n");
		  
		   cal.set(2014, 4, 22, 4, 22, 12);
		  // cal.set(Calendar.AM_PM, Calendar.PM);
		   
		   // An Easier way to print the timestamp by getting a Date instance
		   Date date = cal.getTime();
		   System.out.println("Current date and time in Date's toString() is : " + date + "\n");
		  
		    // Print Calendar's field
		    System.out.println("Year  : " + cal.get(Calendar.YEAR));
		    System.out.println("Month : " + cal.get(Calendar.MONTH));//starts from 0 for January
		    System.out.println("Day of Month : " + cal.get(Calendar.DAY_OF_MONTH));
		    System.out.println("Day of Week  : " + cal.get(Calendar.DAY_OF_WEEK));//starts from Sunday as 1
		    System.out.println("Day of Year  : " + cal.get(Calendar.DAY_OF_YEAR));
		    System.out.println("Week of Year : " + cal.get(Calendar.WEEK_OF_YEAR));
		    System.out.println("Week of Month : " + cal.get(Calendar.WEEK_OF_MONTH));
		    System.out.println("Day of the Week in Month : " + cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));//1 for first week, 2 for sec and ...
		    System.out.println("Hour  : " + cal.get(Calendar.HOUR));//after 12
		    System.out.println("AM PM : " + cal.get(Calendar.AM_PM));//0 for AM and 1 for PM.
		    System.out.println("Hour of the Day : " + cal.get(Calendar.HOUR_OF_DAY));//current hour
		    System.out.println("Minute : " + cal.get(Calendar.MINUTE));//minute of current time
		    System.out.println("Second : " + cal.get(Calendar.SECOND));//second of current time
		    System.out.println();
		    
		    
		    
 
	}
}
