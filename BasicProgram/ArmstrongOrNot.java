package BasicProgram;

public class ArmstrongOrNot //371=(3*3*3)+(7*7*7)+(1*1*1)=371   if equal then we say armstrong number
{
	public static void main(String[] args) 
	{
		 int n = 371, temp, r, result = 0;//r=reminder
	        temp = n;
	        while (n!=0)
	        {
	            r = n % 10;
	            result=result+(r*r*r);
	            n =n/ 10;
	        }
	        if(result == temp)
	            System.out.println(temp + " is an Armstrong number.");
	        else
	            System.out.println(temp + " is not an Armstrong number.");
	    }
	}
