package coaching.IO;


//prog to demo. java.util.StringTokenizer

import java.util.*;

class StringTokenTest {
	public static void main(String s[]) {
		StringTokenizer stk = new StringTokenizer(s[0], "_", true); // true parameter will return tokens as strings
		System.out.println("List of tokens: ");
		while (stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
	}
}