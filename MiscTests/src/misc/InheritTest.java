/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import interfaceTest.Interface1;

/**
 *
 * @author ADMIN
 */
public class InheritTest implements Interface1{

    public void showMessage() {
        System.out.println("this is super");
    }

    public static void main(String[] args) {
        Short x = 7;
//        short s = x;
        int n = new Integer("8");    //automatic unboxing.declared for test only
        int y = 8;
        InheritTest test = new InheritTest();
        System.out.println(test.calculate(x, y));
    }

    public Integer calculate(int x, int y) {
        return x + y;
    }

    public void meth1() {
//        throw new UnsupportedOperationException("Not supported yet.");
    }

	@Override
	public String testMethod() throws SQLException, FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}
