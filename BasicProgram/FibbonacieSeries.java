package BasicProgram;

import java.util.Scanner;

public class FibbonacieSeries 
{
	public static void main(String[] args) 
	{
		int a = 0, b = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the nuber");
		int n = sc.nextInt();
		if (n == 0)
			System.out.print(a);
		else if (n == 1)
			System.out.print(a + " " + b);
		else
		{
			System.out.print(a + " " + b);
		}
		for (int i = 3; i <= n; i++) 
		{
			int c = a + b;
			a = b;
			b = c;
			System.out.print(" " + c + " ");
		}
	}

}
