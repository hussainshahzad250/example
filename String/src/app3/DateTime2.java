package app3;
/*
 * Just the time.
 */
import java.util.Date;

public class DateTime2 {

	public static void main(String[] args) {
		
		System.out.println(String.format("%tr", new Date())); // Local time like 2 P.M i.e 02:33:32 PM
		
		System.out.printf("%tR", new Date());//Military time.

	}
}
