package BasicProgram;

public class FactorialInRange 
{
	public static void main(String[] args) 
	{
		for (int j = 1; j <= 5; j++) 
		{
			int n = j;
			int prod = 1;
			for (int i = 1; i <= n; i++) 
			{
				prod = prod * i;
			}
			System.out.println(prod);
		}
	}
}
