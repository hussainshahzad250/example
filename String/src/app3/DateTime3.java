package app3;

import java.util.Date;

public class DateTime3 {

	public static void main(String[] args) {
		
		System.out.println(String.format("%tA %<tB %<td", new Date()));//Date of week, Month, and Day of the month.
				
		System.out.printf("%tD", new Date()); // MM//DD//YY. 
		
	}
}
