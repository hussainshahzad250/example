package app3;
public class L 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer();
		sb.append("hello1234");
		//012345678
		System.out.println(sb);
		sb.delete(2, 50);
		System.out.println(sb);
	}
}
