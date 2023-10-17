package BasicProgram;

import java.util.Scanner;

public class PalindromNumber 
{

	public static void PalindromeOrNot(int n) 
	{
		int temp = n;
		int rev = 0, Check = 0;
		while (n != 0) 
		{
			Check = n % 10;// 6776
			rev = (rev * 10) + Check;
			n = n / 10;
		}
		System.out.println(rev);
		if (rev == temp)
			System.out.println("is palindrome");
		else
			System.out.print("Not palindrome");
	}

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		PalindromeOrNot(n);

	}

}
