package interviewTest.DS;

public class BookStackHCF {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 36,12,24, 60, 72, 120,4 };

		// sort the array
		/*for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;

				}

			}
		}*/
		// sorted
		for (int i = 0; i < arr.length; i++) {
			System.out.println("sorted: " + arr[i]);
		}

		// calculate HCF
		int hcf = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			int num1 = arr[i];
			int num2 = arr[i + 1];

			if (i == 0) {
				num1 = arr[i];
				//num1 = arr[i] < arr[i+1] ? arr[i] : arr[i+1];    // in case not sorted   
			} else {
				num1 = hcf;
			}
			num2 = arr[i + 1];

			int rem = 1;
			while (rem >= 1) {

				rem = num2 % num1;

				if (rem == 0) {
					hcf = num1;
					break;
				}

				num2 = num1;
				num1 = rem;

			}

		}

		System.out.println(hcf);

	}

}
