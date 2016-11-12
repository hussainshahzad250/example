package app3;
/*
 * The complete date and time.
 */
import java.util.Date;

public class DateTime1 {

	public static void main(String[] args) {
		
		System.out.println(String.format("%tc", new Date()));
		
		
		System.out.printf(String.format("%Tc", new Date()));
	}
}
