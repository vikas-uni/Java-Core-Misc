package recursion;
public class FibRecursion {
	static int a = 0, b = 1;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		fib(0,1);

	}

	private static void fib(int n1, int n2) {
		int sum = n1 + n2;
		if (sum > 100) {
			return;
		}
		System.out.println(sum);
		n2 = n1;
		
			fib(sum, n2);
		}
	
}
