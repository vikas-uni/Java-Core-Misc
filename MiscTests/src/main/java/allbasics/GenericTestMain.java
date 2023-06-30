package allbasics;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class GenericTestMain {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		Student st = new Student(34, 56);
		Student st2 = new Student(78, 23);
		GenericStore<Student> store = new GenericStore<Student>();
		store.setObject(st);
		Student get = store.getObject();
		System.out.println(get);

		List<? extends Number> num = new ArrayList<Integer>(); // can assign any subclass of Number

		// num.add(12); //cannot add directly

		num = null;

		ArrayList<Integer> intArr = new ArrayList<>();
		intArr.add(23);
		intArr.add(24);
		intArr.add(25);
		intArr.add(26);

		num = intArr; // can assign subtype but cannot add to it

		num.forEach(System.out::println);
	}
}
