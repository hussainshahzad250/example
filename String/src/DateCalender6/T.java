package DateCalender6;

import java.text.DateFormat;
import java.util.Date;
public class T 
{

	public static void main(String[] args)
	{
	   Date d1=new Date();
	   System.out.println(d1);
	   DateFormat df=DateFormat.getDateInstance(DateFormat.MEDIUM);
	   System.out.println(df.format(d1));

	}

}
