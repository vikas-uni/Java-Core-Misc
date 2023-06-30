package interviewTest;

public class ArrTest {
	
	public int[] getArr(){
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		return arr;
	}

	public static void main(String[] args) {
		ArrTest arrTest = new ArrTest();
	int arr[]=arrTest.getArr();
	for(int i=0,k=1,l=0;i<arr.length/2;i++,k+=2,l+=2)
	{
		
		System.out.println(arr[k]);
		System.out.println(arr[l]);
	}
		
	}
}
