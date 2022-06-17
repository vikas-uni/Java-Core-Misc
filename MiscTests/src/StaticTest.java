
public class StaticTest {
	
	static void test(){
		System.out.println("static ");
	}
	
//	public void test(){     //illegal
//		System.out.println("instance");
//	}

	public static void main(String[] args) {
		test();
		
		String num = "10.2.3";
		String[] sp = num.split("\\.");
		System.out.println(sp[0]);
	}
}
