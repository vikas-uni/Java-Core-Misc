
public class ImageRotate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] arr1 = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
		
		for(int i = 0 ; i < arr1.length ; i++){
			for(int j = 0 ; j < arr1[i].length ; j++){
				System.out.print(arr1[i][j]+"("+i+","+j+")"+ "  ");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		
		for(int i = 0 ; i < arr1[0].length  ; i++){
			
			for(int j = 0 , k = arr1.length -1 ; j < arr1.length ; j++ , k--){
				
				System.out.print(arr1[k][i]+"("+k+","+i+")"+ "  ");
			}
			
			System.out.println();
		}
		

	}

}
