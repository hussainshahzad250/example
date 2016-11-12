package app1;

public class V 
{
	public static void main(String[] args) 
	{
      String s1="abc";
      System.out.println(s1);
      String  s2=s1.concat("xyz");
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s1.concat("xyz"));
	}
}
/*Output=
		abc
		abc
		abcxyz
		abcxyz*/