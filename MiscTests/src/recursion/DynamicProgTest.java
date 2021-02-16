package recursion;

public class DynamicProgTest {

	/**
	 * @param args
	 * Given 3 numbers {1, 3, 5}, we need to tell
the total number of ways we can form a number 'N' 
using the sum of the given three numbers.
(allowing repetitions and different arrangements).

Total number of ways to form 6 is: 8
1+1+1+1+1+1
1+1+1+3
1+1+3+1
1+3+1+1
3+1+1+1
3+3
1+5
5+1
	 */
	public static void main(String[] args) {
		int n = 7;
		DynamicProgTest progTest = new DynamicProgTest();
		//System.out.println(progTest.solve(n));

		int[] cache = new int[n+1];
		for (int i = 0; i < cache.length; i++) {
			cache[i] = -1;
		}
		
		System.out.println(progTest.solveUsingMemo(n, cache));
	}
	int solve(int n) 
	{  
	   // base case 
	   if (n < 0)  
	      return 0; 
	   if (n == 0)   
	      return 1;   
	  
	   return solve(n-1) + solve(n-3) + solve(n-5); 
	}     
	
	int solveUsingMemo(int n, int[] cache){
		
		// base case 
		   if (n < 0)  
		      return 0; 
		   if (n == 0)   
		      return 1;   
		   if(cache[n] != -1)
			   return cache[n];
		  
		   int n1 = solveUsingMemo(n-1, cache);
		   int n2 = solveUsingMemo(n-3, cache);
		   int n3 = solveUsingMemo(n-5, cache);
		   cache[n] = n1+n2+n3;
		   return cache[n];// = solveUsingMemo(n-1, cache) + solveUsingMemo(n-3, cache) + solveUsingMemo(n-5, cache); 
	}
}
