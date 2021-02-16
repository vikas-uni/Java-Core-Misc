package interviewTest.interviewTest;

public class ErrorThrowTest {
	
	public static void main(String[] args) {
		try{
			test();
			System.out.println("1");
		}
		catch(Exception e){
			System.out.println("2");
		}
		finally{
			System.out.println("3hg");  // print this with Error
		}
	}

	private static void test(){
		throw new Error("custom error");
	}
}
