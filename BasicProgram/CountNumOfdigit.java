package BasicProgram;

import java.util.Scanner;

public class CountNumOfdigit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = sc.nextInt();
		int count = 0;
		while (n != 0)
		{
			count++;
			n = n / 10;
		}
		System.out.println("The count of Digit is " + count);
	}

}
