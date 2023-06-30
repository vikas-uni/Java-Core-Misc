package interviewTest.CollectionsTest;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(1);
		set.add(1);
		//set.add("1");  //compile error
		//set.add('1');
		//set.add(null);  runtime exception
	}

}
