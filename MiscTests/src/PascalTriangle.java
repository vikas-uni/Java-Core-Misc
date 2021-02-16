public class PascalTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] getTriangle = buildTriangle(9);
		for (int i = 0; i < getTriangle.length; i++) {
			
			int[] arr = getTriangle[i];
			
			for (int j = 0; j < arr.length; j++) {
				
				
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}

	}

	private static int[][] buildTriangle(int depth) {
		int[][] triangle = new int[depth][];

		for (int i = 0; i < depth; i++) {
			
			int[] arr = new int[i + 1];
			
			if (i == 0) {
				arr[0] = 1;
				triangle[0] = arr;
			} else {
				int[] last = triangle[i - 1];

				for (int j = 0; j < arr.length; j++) {
					if (j == 0 || j == arr.length -1 ) {
						arr[j] = 1;

					} else {

						arr[j] = last[j-1] + last[j];
					}
				}

				triangle[i] = arr;

			}
		}
		return triangle;
	}
}
