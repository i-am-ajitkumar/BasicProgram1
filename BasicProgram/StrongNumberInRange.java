package BasicProgram;

public class StrongNumberInRange {
	public static void main(String[] args)
	
	{
		for (int j = 1; j <= 1000; j++)
		{
			int sum = 0, n = j, temp = n;
			while (n != 0) {
				int last = n % 10;
				sum = sum + factorial(last);
				n = n / 10;
			}
			if (temp == sum)
				System.out.println(temp);
		}
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
