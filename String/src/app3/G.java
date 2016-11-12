package app3;
public class G 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.length());//0
		System.out.println(sb.capacity());//16
		sb.append("12345678123456789");
		System.out.println(sb.length());//17
		System.out.println(sb.capacity());//34
	}
}
