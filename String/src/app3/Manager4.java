package app3;
import java.util.Calendar;
public class Manager4 {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		c.set(2004, 0, 07, 15, 40, 20);
		System.out.println(c.getTime());
		System.out.println("----------------------------------");
		
		long day = c.getTimeInMillis();
		day += (1000 * 60 * 60 );
		c.setTimeInMillis(day);
		
		System.out.println(c.getTime());
		System.out.println("new Hour: " + c.get( Calendar.HOUR_OF_DAY));
		
		System.out.println("---------------------------------");
		c.add(Calendar.DATE, 35);
		System.out.println("added 35 days : " + c.getTime());
		
		System.out.println("----------------------------------");
		c.roll(Calendar.DATE, 35);
		System.out.println("roll 35 days :" + c.getTime());
		
		System.out.println("---------------------------");
		c.set(Calendar.DATE, 1);
		System.out.println("set to 1 :" + c.getTime());
		
	}
}
