package BasicProgram;

public class Factorial {
	public static void main(String[] args) {
		int n = 6;
		int prod = 1, i;
		for (i = 1; i <= n; i++) {
			prod = prod * i;
		}
		System.out.println(prod);
	}
}
