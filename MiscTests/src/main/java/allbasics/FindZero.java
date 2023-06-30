package allbasics;

public class FindZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int in = 10;
		int zero = 0;
		int fact = fact(in);
		System.out.println("fact:" + fact);
		while (fact % 10 == 0) {
			zero++;
			fact /= 10;
		}
		System.out.println(zero);

	}

	private static int fact(int n) {
		int f = 1;
		while (n >= 1) {
			f = f * n;
			n--;
		}
		return f;
	}
}
