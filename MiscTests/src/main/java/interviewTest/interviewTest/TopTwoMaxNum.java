package interviewTest.interviewTest;

public class TopTwoMaxNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 6, 3, 77, 9, 76, 34, 21, 56, 34, 87, 23 };
		int num1 = 0, num2 = 0;

		for (int i = 0; i < arr.length; i++) {

			int tmp = arr[i];

			if (tmp > num1) {
				num2 = num1;
				num1 = tmp;

			}

		}

		System.out.println(num1 + " " + num2);

	}

}
