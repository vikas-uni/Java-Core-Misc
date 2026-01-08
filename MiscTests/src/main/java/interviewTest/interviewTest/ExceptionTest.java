/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest.interviewTest;

import java.io.File;
import java.io.IOException;

/**
 * 
 * @author ADMIN
 */
public class ExceptionTest {
	public int method1() {
		try {
			throw new Exception();

		}
		// can comment here
		catch (Exception e) {
			return 0;
		} finally {
			return 1;
		}

	}

	public static void main(String[] args) {
		ExceptionTest t = new ExceptionTest();
		System.out.println(t.method1());

		// int n = Integer.parseInt("12");
		// System.out.println(n);
		Child p = new Child();
		try {
			p.test();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

interface Testinterface {
	void test() throws IOException;
}

class Parent {
	public void test() throws IOException {

	}
}

class Child extends Parent {

	public void test() throws IOException {
		try {
			File f = new File("");
		} catch (Exception e) {
			return;
		} finally {

		}
	}
}