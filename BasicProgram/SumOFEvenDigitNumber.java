package BasicProgram;

import java.util.Scanner;

public class SumOFEvenDigitNumber {

	public static void main(String[] args)
	{
		{
			// int count=0;//When we count then it is use
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number :");
			int n = sc.nextInt();
			int sum = 0, Check = 0;
			while (n != 0)
			{
				Check = n % 10;
	       if(Check%2==0)
			
					// count++;
					sum = sum + Check;
				n = n / 10;
			}
			System.out.println("The Sum  of Even Digit is :" + sum);// +" and the Counting the Odd Number is " +//count);
		
	}
	}
}
