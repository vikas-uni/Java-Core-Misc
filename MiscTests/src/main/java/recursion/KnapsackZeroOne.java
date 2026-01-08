package recursion;

public class KnapsackZeroOne {

	public static void main(String[] args) {
		int[] weights = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] values = new int[] { 7, 3, 4, 8, 10, 18, 13, 12, 11, 9 };

		//Integer[][] memo = initMemo(weights.length);
		long startTime = System.nanoTime();
		System.out.println(getMaxValue(weights, values, weights.length - 1, 10));

		// System.out.println(getMaxValueMemoized(weights, values, weights.length - 1,
		// 10, memo));

		System.out.println("Total time taken:" + (System.nanoTime() - startTime));
	}

	private static int getMaxValue(int[] wt, int[] val, int itemIdx, int totalWt) {
		if (totalWt == 0 || itemIdx == -1)
			return 0;

		if (totalWt < wt[itemIdx])
			return getMaxValue(wt, val, itemIdx - 1, totalWt);

		int taken = val[itemIdx] + getMaxValue(wt, val, itemIdx - 1, totalWt - wt[itemIdx]);
		int notTaken = getMaxValue(wt, val, itemIdx - 1, totalWt);

		return Math.max(taken, notTaken);
	}

	private static int getMaxValueMemoized(int[] wt, int[] val, int itemIdx, int totalWt, Integer[][] memo) {
		if (memo[wt[itemIdx]][val[itemIdx]] != null)
			return memo[wt[itemIdx]][val[itemIdx]];

		if (totalWt == 0 || itemIdx == -1)
			return 0;

		if (totalWt < wt[itemIdx])
			return getMaxValue(wt, val, itemIdx - 1, totalWt);

		int taken = val[itemIdx] + getMaxValue(wt, val, itemIdx - 1, totalWt - wt[itemIdx]);
		int notTaken = getMaxValue(wt, val, itemIdx - 1, totalWt);

		int max = Math.max(taken, notTaken);
		// if(memo[itemIdx][itemIdx] == -1) {
		memo[wt[itemIdx]][val[itemIdx]] = max;
		// }

		return max;
	}

	private static Integer[][] initMemo(int row) {
		Integer[][] memo = new Integer[100][100];

		return memo;
	}
}
