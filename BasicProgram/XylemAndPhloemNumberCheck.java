package BasicProgram;

import java.util.Scanner;

public class XylemAndPhloemNumberCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int m = 0;
		int fl = n % 10;
		int temp = n;
		n = n / 10;
		while (n != 0) 
		{
			int l = n % 10;
			if (l == n)
				fl = fl + l;
			else
				m = m + l;
			n = n / 10;
		}
		if (fl == m)
			System.out.println(temp + " is Xylem number");
		else
			System.out.println(temp + " is phloem number");
	}
}
