package allbasics;

public class DebuggingTest {
	public static void main(String[] args) {
		DebuggingTest debuggingTest = new DebuggingTest();
		TestClass testClass = new TestClass(12, "asdfg");
		debuggingTest.m1(5);
		debuggingTest.m2();
		System.out.println(testClass.getName());
	}

	public void m1(int n) {
		System.out.println("n is: " + n);

		for (int i = 0; i < n; i++) {
			System.out.println(i);
			m2();
		}
	}

	public String m2() {
		System.out.println("in m2");
		String txt = "asdfghjkl";
		return txt;
	}
}

class TestClass {
	private int age;
	private String name;

	public TestClass(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}