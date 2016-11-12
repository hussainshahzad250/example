/*
	formatters formatting string  format is
	=====================================
	%[arg_index$][flags][width][.Precision]conversion char type flags
	-----
	these signs represents
	-  left alignment
	+ explicit +ve sign to the +ve numbers
	0 padding with 0 for all left un occupied places
	( to enclose -ve number in the brackets 
	, to grouping digits in a number
	
	conversion char types
	----------
	byte,short,int,long=======>d
	float,double=======>
	boolean ========>b
	char    ========>c
	String =========> s

*/


package Formatter5;

public class S 
{

	public static void main(String[] args) 
	{
		int i=2345;
		System.out.printf("(%10d)",i);
		System.out.printf("\n(%-10d)",i);
		System.out.printf("\n(%010d)",i);

	}

}
