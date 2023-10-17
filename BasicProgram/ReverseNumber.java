package BasicProgram;

public class ReverseNumber 
{
	public static void main(String[] args) 
	{
		int rev = 0, n = 120;
		while (n != 0)
		{
			int x = n % 10;
			rev = rev * 10 + x;
			n = n / 10;
		}
		System.out.println(rev);
	}
}
