package recursion;

public class BarclaysMinPrice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] quantity = new int[] { 2, 5, 6, 9, 8 };
		int[] cost = new int[] { 6, 5, 2, 7, 3 };

		System.out.println(findMin(14, 2, 6));

	}

	public int getPrice(int cal, int qty1, int qty2, int qty3, int cost1, int cost2, int cost3) {
		int amt = -1;

		int minCost = cost1 < cost2 ? ((cost1 < cost3) ? cost1 : cost3) : ((cost2 < cost3) ? cost2 : cost3);

		int totalCalForQt1 = 2;
		int totalCalForQt2 = 3;
		int totalCalForQt3 = 5;

		if (cal < 2) {
			return amt;
		}

		return amt;

	}

	private static int findMin(int n1, int n2, int n3) {

		return n1 < n2 ? ((n1 < n3) ? n1 : n3) : ((n2 < n3) ? n2 : n3);
	}
}
