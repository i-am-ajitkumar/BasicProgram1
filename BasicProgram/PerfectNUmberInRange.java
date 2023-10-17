package BasicProgram;

public class PerfectNUmberInRange 
{
	public static void main(String[] args)
	{
		for (int j = 1; j < 1000; j++) 
		{
			int sum = 0;
			int n = j;
			for (int i = 1; i < n; i++) 
			{
				if (n % i == 0)
					sum = sum + i;
			}
			if (n == sum)
				System.out.println(n);
		}
	}
}
