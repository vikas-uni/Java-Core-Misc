package interviewTest.DS;

public class ArrayDuplicateElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] in = {2,4,6,3,9,8,6,12,51,4,9,4,23,3,5,6,23};
		
		int[] dup = getDup(in);
		
		for (int i : dup) {
			System.out.println(i);
		}
	}

	static int[] getDup(int[] in){
		int[] dup = new int[in.length/2];
		
		int count = 0;
		
		outer:
		for(int i = 0; i < in.length - 1 ; i++){
			int tmp = in[i];
			
			boolean exist = contains(dup, tmp);
			if(exist){
				continue;
			}
			
			for(int j = i+1 ; j < in.length ; j++){
				 int n = in[j];
				 if(n == tmp){
					 
					 dup[count] = n;
					 count++;
					 continue outer;
				 }
			}
		}
		
		return dup;
		
	}
	
	static boolean contains(int[] arr, int val){
		for (int i : arr) {
			if(val == i)
				return true;
		}
		return false;
	}
}
