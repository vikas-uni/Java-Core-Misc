package recursion;
public class NQueenProblem {

	private static int[][] matrix = new int[4][4];

	public static void main(String[] args) {
		positionQueens(matrix, 0);
		printMatrix();
	}

	static void positionQueens(int[][] matrix, int pos) {

		for (int i = 0; i < matrix[0].length; i++) {
			boolean isPresent = false;
			

			for (int j = pos; j < matrix[0].length; j++) {

				if ((i - 1 >= 0) ){//&& ((pos + 1 < matrix[0].length) || (pos - 1 > matrix[0].length))) {
					
					if((matrix[i-1][pos] == 1)){// && ((matrix[i-1][pos -1] == 1) || (matrix[i-1][pos +1] == 1)) ){
						pos++;
						continue;
					}
					
				}

					if (matrix[i][pos] == 0 && isPresent == false) {
						matrix[i][pos] = 1;
						isPresent = true;
					}
				
					
			}
			
		}
	}

	static void printMatrix() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

}
