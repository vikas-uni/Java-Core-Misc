package interviewTest.interviewTest;

/*
 * Write a recursive method that takes as parameters a String s and an integer i and returns a String that has s repeated 2^i times. 
 * For example, if the given string is “Go bears! ” and the integer is 3 then the return value would be “Go bears! Go bears! Go bears!
 *  Go bears! Go bears! Go bears! Go bears! Go bears!”. Do not use multiplication or exponentiation in your algorithm. Just double the length of the string i times
 */

public class StringRecursion {
	public static void main(String[] args) {
		System.out.println(expString("go daddy!", 3));
	}

	
	private static String expString(String input, int i){
		if(i < 0){
			return "";
		}
		
			System.out.println("before:  "+input+" " + i);
			input =   input + expString(input, --i);
			System.out.println("after:  "+input+" " + i);
		return input;
		
	}
	
}

