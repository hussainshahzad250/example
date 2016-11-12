package app3;

import java.util.Calendar;

//calculating difference of dates before two days.
public class Manager7 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(2014, 4, 12);
		long num1 = cal.getTimeInMillis();
		
		cal.set(2014, 4, 20);
		long num2 = cal.getTimeInMillis();
		
		long res = num2 - num1;
		
		System.out.println("Difference of days is: " + res / (1000 * 60 * 60 * 24));
		
	}
}
