package BasicProgram;

public class StrongNumber
{
	public static void main(String[] args)
	{
		int sum = 0, n = 185, temp = n;
		while (n != 0) 
		{
			int last = n % 10;
			sum = sum + factorial(last);
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("Strong Number");
		else
			System.out.println("Not strong Number");
	}

	public static int factorial(int n) 
	{
		int fact = 1;
		for (int i = 1; i <= n; i++) 
		{
			fact = fact * i;
		}
		return fact;
	}
}
