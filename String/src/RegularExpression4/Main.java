package RegularExpression4;
public class Main
{
	public static void main(String[] args)
	{
		String s1 = "India1is2a3great4country";
		String [] s2 = s1.split("\\d");
		for(String str : s2)
		{
			System.out.print(str  + " ");
		}
		/*System.out.println();
		String s4 = "no1body2can3fight4with5me";
		String [] s5 = s4.split("\\d");
		for(String str : s5)
		{
			System.out.print(str  + " ");
		}*/
	}
}
