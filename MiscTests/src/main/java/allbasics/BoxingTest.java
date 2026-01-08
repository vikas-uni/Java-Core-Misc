package allbasics;

public class BoxingTest {

	public static void main(String[] args) {

		BoxingTest boxingTest = new BoxingTest();
		boxingTest.testBox((byte) 3); // it will box to byte then widen to object

		// boxingTest.testBox(null, null); //not compile
		System.out.println(5 << 4); // results 5*2*2*2*2

		System.out.println(16 >>> 1); // results 16/2

		System.out.println(-4 < -2);
	}

	void testBox(Object o) {
		System.out.println("object");
	}

	void testBox(Integer i) {
		System.out.println("integer");
	}

	/*
	 * void testBox(Byte b){ System.out.println("byte"); }
	 */

	void testBox(String s) {
		System.out.println("String");
	}

	void testBox(Object o, Integer i) {
		System.out.println("object,integer");
	}

	void testBox(String o, String s) {
		System.out.println("object,String");
	}
}
