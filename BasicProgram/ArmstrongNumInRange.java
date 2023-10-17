package BasicProgram;
import java.lang.Math;
public class ArmstrongNumInRange 
{
	public static void main(String[] args)
	{

		for(int i=1;i<=10000;i++)
		{
		 int n = i, temp, r, result = 0;//r=reminder
	        temp = n;
	        while (n!=0)
	        {
	            r = n % 10;
	            result+=Math.pow(r,4);
	            n =n/ 10;
	        }
	        if(result == temp)
	            System.out.println(temp + " is an Armstrong number.");
	       
		}
	}

}
