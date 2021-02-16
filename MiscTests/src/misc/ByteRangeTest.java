/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

/**
 *
 * @author ADMIN
 */
public class ByteRangeTest {

    void setByte(byte b) {
        System.out.println("byte is " + b);
    }

    public static void main(String[] args) {
        ByteRangeTest test = new ByteRangeTest();
        test.setByte((byte) 256);
    }
}
