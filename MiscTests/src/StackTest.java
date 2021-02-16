
public class StackTest {
 int val = 0;
	public static void main(String[] args) {
		new StackTest().testStack();
	}
	
	void testStack(){
		System.out.println("val : "+val);
		val++;
		testStack();
	}
}
