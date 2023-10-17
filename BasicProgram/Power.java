package BasicProgram;

import java.util.Scanner;

public class Power
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of power :");
		int n = sc.nextInt();
		System.out.println("enter the number of base :");
		int m = sc.nextInt();
		int i, prod = 1;
		for (i = 1; i <= n; i++) 
		{
			prod = prod * m;
		}
		System.out.println(prod);
	}

}
