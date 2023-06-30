package misc;

import java.util.Arrays;
import java.util.List;

public class StringTest {
	private static List<String> testList = null;
	
	
	public static void main(String[] args) {
		//System.out.println(String.format("No key found for Dynamic Property- %s , key= %s","abc","def"));
		test1();
		//foreTest();
	}
	private static void test2() {
		String values = "abc : ";
		values = values.trim();
		System.out.println("strLength-"+values.length());
		System.out.println("index-"+values.indexOf(':'));
		String[] dynaProps = values.split(":");
		System.out.println("length-"+dynaProps.length);
		for (String string : dynaProps) {
			System.out.println("val-"+string);
		}
		
	}
	
	private static void test1() {
		String values = null;
		String val2 = "ddd";

		if((values = val2) == null) {
			System.out.println("null");
		}
		else {
			System.out.println(values);
		}
	}

	private static void foreTest() {
		for(String s:getTestList()) {
			System.out.println("here");
		}
	}
	public static List<String> getTestList() {
		return testList;
	}
	public static void setTestList(List<String> testList) {
		StringTest.testList = testList;
	}

	
}
