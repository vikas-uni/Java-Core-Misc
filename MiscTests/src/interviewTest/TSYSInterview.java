package designPatternsJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TSYSInterview {
	private static TSYSInterview instance = null;

	public static void main(String[] s) {
//		String in = "HELLO ALL TODAY";
//		String buffer = "";
//		String sentence = "";
//		for(int i = in.length()-1 ; i >= 0 ; i--) {
//			char ch = in.charAt(i);
//			 if(ch != ' ') {
//				
//				 buffer = ch+ buffer;
//				 System.out.println(" "+ch + " "+buffer);
//				 
//				 if(i == 0) {
//					 sentence = sentence +" "+ buffer ;
//				 }
//				 continue;
//			 }
//				 sentence = sentence +" "+ buffer ;
//				 buffer = "";
//				
//			 
//		}
//		System.out.println("Sentence: "+sentence);
		
		// salary(empname,sal,deptId)
		//Dept(deptId, deptName)
		
		//deptname with max aggregate sal
		
		//select deptname from( select max(sal) from salary where salary.deptId = dept.deptId groupBy deptId)
		

		int input1 = 15;
		int input2 = 30;
		
		System.out.println(findLcm(input1, input2));
		
	}
	
	public static List<Integer> findLcm(int n1, int n2) {
		
		List<Integer> lcm = new ArrayList<>();
		
		List<Integer> f1 = getFactors(n1);
		
		List<Integer> f2 = getFactors(n2);
		
		List<Integer> allFactors = new ArrayList<>();
		allFactors.addAll(f1);
		allFactors.addAll(f2);
		int multiple = 1;
		
		for (int i = 0 ; i<allFactors.size(); i++ ) {
			int tn1 = allFactors.get(i);
			lcm.add(tn1);
			multiple = multiple * tn1;
			if (multiple % n1 == 0 && multiple % n2 == 0) {
				return lcm;
			}
		}
		
		//lcm.addAll(f1);
		//lcm.addAll(f2);
		
		return lcm;
		
		
	}
	
	public static List<Integer>  getFactors(int input) {
		List<Integer> factors = new ArrayList<>();
		outer: while (input > 2) {
			for (int i = 2; i <= input ; i++) {
				if (input % i == 0) {
					input = input / i;
					if (isPrime(i)) {

						factors .add(i);
						 
					}
					continue outer;
				}

			}
			System.out.println(input);
		}
		
		return factors;
	}
	
	//10(2,5), 15(3,5) - 5,2,3

	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}
}
