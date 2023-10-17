package BasicProgram;

public class PerfectNumber 
{
	public static void main(String[] args) 
	{
		int sum = 0, n = 6;
		for (int i = 1; i < n; i++) 
		{
			if (n % i == 0)
				sum = sum + i;
		}
		if (n == sum)
			System.out.println(n + "is perfect number");
		else
			System.out.println(n + "is not Perfect number");
	}

}
