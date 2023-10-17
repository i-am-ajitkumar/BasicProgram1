package BasicProgram;
public class AddFirstLastDigitOfNumber 
{
	public static void main(String[] args) 
	{
		{
			int n=89455;
			int sum=n%10;
			while(n!=0)
			{
				int last=n%10;
				if(last==n)
				{
					sum+=last;
				}
				n=n/10;
			}
			System.out.println(sum);
				}

	}

}
