package BasicProgram;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Number to check :");
		int n = sc.nextInt();// 5
		int count = 0, i;
		if (n > 2)
		{
			for (i = 1; i <= n; i++)// n=5
			{
				if (n % i == 0)
					count++;
			}
			if (count == 2)
				System.out.println(" this is prime number");
			else
				System.out.println("not prime");
		}
	}
}