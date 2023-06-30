package interviewTest.DS;

public class ArrayUniqueNew {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, 34, 76, 82, 12, 30, 45, 40, 30, 32, 45, 30, 82,82,90};
		
		int[] unique = getUnique(arr);
		
		for (int i : unique) {
			System.out.println(i);
		}

	}
	
	static int[] getUnique(int[] arr){
		int[] unique = new int[arr.length];
		
		int idx = 0;
		
		for(int i = 0; i < arr.length ; i++){
			if(hasElement(unique, arr[i], idx)){
				continue;
			}
			unique[idx] = arr[i];
			idx++;
		}
		
		return unique;
	}

	static boolean hasElement(int[] unique, int elem, int counter){
		for(int i = 0; i <= counter ; i++){
			if(unique[i] == elem)
				return true;
		}
		return false;
	}
	
}
