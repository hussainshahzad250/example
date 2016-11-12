package RegularExpression4;
public class J 
{
	public static void main(String[] args)
	{
		E.find("abfdrghsbvgdyuhsbcvs","[bj]");//all occurance of b and j only
		System.out.println("--------");
		E.find("abfdrghsbvgdyuhsbcvs","[b-j]");//all occurance from b to j
	}
}
