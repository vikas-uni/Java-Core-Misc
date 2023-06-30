package dpTop20;

import java.util.HashSet;

public class PowerSet {
	public static void main(String[] args) {
		String input = "abcd";
		HashSet<String> result = new HashSet<>();
		//generatePowerSet(input, 0, "", result);
		genPowSet2(input, 0, "");
		System.out.println(result);
	}

	private static void generatePowerSet(String input, int i, String curr, HashSet<String> result) {
		if(i >= input.length()) {
			System.out.println(curr);
			result.add(curr);
			return;
		}
		result.add(curr);
		System.out.println(curr);
		
		generatePowerSet(input, i+1, curr+input.charAt(i),result);
		generatePowerSet(input, i+1, curr, result);
		
	}
	
	//not working
	private static void genPowSet2(String input, int idx, String curr) {
		if (idx >= input.length()) {
			System.out.println(curr);
			return;
		}
		System.out.println(curr);
		for (int i = idx; i < input.length(); i++) {
			curr = curr + input.charAt(i);
			genPowSet2(input, i + 1, curr);
		}

	}
}
