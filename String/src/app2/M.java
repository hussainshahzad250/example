package app2;

import java.util.StringTokenizer;

public class M 
{
	public static void main(String[] args) 
	{
		String s1="abc;xyz;hello;123";
		String [] x =s1.split(";");
		
		
		StringTokenizer st = new StringTokenizer(s1, ";");
		while (st.hasMoreElements()) {
			Object object = (Object) st.nextElement();
			System.out.print(object);
			
		}
		System.out.println();
		System.out.println("###################");
		for(String str : x)
		{
			System.out.print(str);
			/*System.out.print(str + ", ");*/
		}
	}
}
