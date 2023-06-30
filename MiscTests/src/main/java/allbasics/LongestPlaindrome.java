package allbasics;

import java.util.HashSet;

public class LongestPlaindrome {
	static HashSet<String> palindromes = new HashSet<>();

	public static void main(String[] args) {

		String input = "aaaddddffggallllriuuwasitacatisawmalayalamradar";

		LongestPlaindrome longestPlaindrome = new LongestPlaindrome();
		HashSet<String> res = longestPlaindrome.returnPalindromes(input);
		System.out.println(res);

	}

	HashSet<String> returnPalindromes(String input) {

		for (int i = 0; i < input.length(); i++) {

			for (int j = i; j < input.length(); j++) {
				String temp = input.substring(i, j + 1);
				System.out.println("temp is----:" + temp);
				if (checkPalindrome(temp)) {
					palindromes.add(temp.trim());
				}

			}

		}

		return palindromes;

	}

	boolean checkPalindrome(String s) {
		if (s.length() == 1) {
			return false;
		}

		for (int i = 0, j = s.length() - 1; i <= s.length() / 2; i++, j--) {
			if (s.charAt(i) != s.charAt(j))
				return false;
		}
		return true;
	}
}
