package DateCalender6;
import java.util.Date;
public class G
{
	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1);
		System.out.println(d1.getTime());//Fri Oct 17 15:13:14 IST 2014(its returning current system time ,date)
		Date d2=new Date(d1.getTime());
		System.out.println(d2);//Fri Oct 17 15:13:14 IST 2014
	}
}
