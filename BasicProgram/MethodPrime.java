package BasicProgram;

import java.util.Scanner;

public class MethodPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Number to check :");
		int n = sc.nextInt();
		boolean check = isPrime(n);
		if (check == true)
			System.out.println("This " + n + " is a Prime Number");
		else
			System.out.println("This " + n + " is not a Prime Number");
	}

	static boolean isPrime(int n) 
	{
		int count = 0, i;
		for (i = 1; i <= n; i++) 
		{
			if (n % i == 0)
				count++;
		}
		if (count == 2)
			return true;
		else
			return false;
	}
}
