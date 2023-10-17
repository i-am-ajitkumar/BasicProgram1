package BasicProgram;

public class AddDigit {
	public static void main(String[] args)
	{
		int sum = 0;
		int num = 88897;
		while (num > 0) 
		{
			int x = num % 10;
			sum = sum + x;
			num = num / 10;
		}
		System.out.println(sum);
	}
}
