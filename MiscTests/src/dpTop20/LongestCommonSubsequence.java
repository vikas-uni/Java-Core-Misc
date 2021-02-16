package dpTop20;

/**
 * 
 * @author vikasgond Problem- given two strings- ASDFGH and ADEHK, the common
 *         sequence is ADH
 */
public class LongestCommonSubsequence {
	private static StringBuilder out = new StringBuilder();
	public static void main(String[] args) {
		String s1 = "ASDFGH";
		String s2 = "ADEHK";
		int len = lcs(s1, s2, s1.length() - 1, s2.length() - 1);
		System.out.println(len);
		System.out.println(out);
	}

	public static int lcs(String s1, String s2, int m, int n) {
		if (m < 0 || n < 0) {
			return 0;
		}

		if (s1.charAt(m) == s2.charAt(n)) {
			
			return 1 + lcs(s1, s2, m - 1, n - 1);
			
		} else {
			int short_s1 = lcs(s1, s2, m - 1, n);
			int short_s2 = lcs(s1, s2, m, n - 1);
			return Math.max(short_s1, short_s2);
		}
	}
}
