package dpTop20;

public class SubsetSum {
	//runs in O(2^n)
	private static int times = 1;
	
	public static void main(String[] args) {
		int[] arr = new int[] {-2,-5,-7};
		System.out.println(hasSubset(arr, arr.length - 1, 13));
		System.out.println(times);
	}

	private static boolean hasSubset(int[] arr, int idx, int sum) {
		if(sum == 0) {
			return true;
		}
		if(idx < 0 && sum != 0) {
			return false;
		}
		times ++;
		return hasSubset(arr, idx-1, sum - arr[idx] ) || hasSubset(arr, idx - 1, sum);
	}
}
