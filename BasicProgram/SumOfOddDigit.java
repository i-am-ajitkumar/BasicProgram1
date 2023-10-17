package BasicProgram;

import java.util.Scanner;

public class SumOfOddDigit
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = sc.nextInt();
		int sum = 0, Check = 0;
		while (n != 0)
		{
			Check = n % 10;

			if (Check % 2 != 0)
			
				sum = sum + Check;
			n = n / 10;
		}
		System.out.println("The Sum  of odd Digit is :" + sum);
	}

}
