package dpTop20;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringPermutation {

	public static void main(String[] args) {
		String s = "ABCD";
		permutation(s);
	}

	public static void permutation(String str) {
		permutation("", str);
	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		//System.out.println("incoming: "+prefix +"  "+str);
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++){
				System.out.println("before call:   i= "+i+"  n= "+n+"    prefix:"+prefix+"   str:"+str);
				
				permutation(prefix + str.charAt(i),	str.substring(0, i) + str.substring(i + 1, n));
			
			System.out.println("loop end with i= "+i+"  n= "+n+"   str:"+str);
			}
		}
	}
	

}
