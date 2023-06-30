package allbasics;

public class SortArrayMinComplex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 0, 1, 0, 1, 1, 1 };
		int[] tmp = new int[arr.length];

		int zIdx = 0;
		int oIdx = arr.length - 1;

		/*
		 * for (int i : arr) { if(i == 0){ tmp[zIdx] = i; zIdx++; }else{ tmp[oIdx] = i;
		 * oIdx--; } }
		 */

		int endIdx = arr.length - 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0 && arr[endIdx] == 1) {
				arr[i] = 1;
				arr[endIdx] = 0;
				endIdx--;
			}

		}

		for (int i : arr) {
			System.out.println(i);
		}
	}

}
