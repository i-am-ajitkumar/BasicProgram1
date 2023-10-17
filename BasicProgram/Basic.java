package BasicProgram;

public class Basic 
{
	String name;
	String cas;
	String sec;

	public void bark() 
	{
		System.out.println(name);
		System.out.println(cas);
		System.out.println(sec);
	}

	Basic(String name, String cas, String sec) 
	{
		this.name = name;
		this.cas = cas;
		this.sec = sec;
	}

	public static void main(String[] args) 
	{
		Basic b = new Basic("ajit", "cas", " ca");
//	b .mew("Ajit","sdsds","hscxcs");
		b.bark();
	}
}
