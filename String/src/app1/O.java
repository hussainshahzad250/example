package app1;
public class O
{
	public static void main(String[] args) 
	{
		String s1=null;
		String s2=s1+null;
		String s3=null+s1;
		String s4="abc"+null;
        String s5=s1 +"xyz";
        String s6=s1+s1;
		String s7=s1+2000;
		String s8=400+s1;
		/*
		String s9=null+10;
		String s10=90 +null;
		String s11=90+80;
		String s12=null+null;
		*/
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
	}
}
