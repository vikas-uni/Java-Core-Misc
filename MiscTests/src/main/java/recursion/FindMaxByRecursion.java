package recursion;
public class FindMaxByRecursion {
	public static void main(String[] args) {
		int[] arr = new int[] { 512, 45, 36, 260, 18 };
		System.out.println("greatest:"+findMax(arr, arr.length - 1, 0));
	}

	private static int findMax(int[] arr, int idx, int num) {
		if (idx == 0 || arr.length == 1) {
			return Math.max(arr[0],num);
		}
		return findMax(arr, idx-1, Math.max(arr[idx], num));
	}
}
