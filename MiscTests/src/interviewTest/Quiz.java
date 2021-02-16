/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interviewTest;

/**
 *
 * @author Administrator
 */
public class Quiz {
    static class Masher {
        static String mash(String s) {
            byte[] bytes = s.getBytes();
            byte[] mashed = new byte[bytes.length];
            for (int i = 0; i < bytes.length; i++) {
                mashed[i] = (byte) ~bytes[i];
            }
            return new String(mashed);
        }
        static String unmash(String s) {
            byte[] bytes = s.getBytes();
            byte[] unmashed = new byte[bytes.length];
            for (int i = 0; i < bytes.length; i++) {
                unmashed[i] = (byte) ~bytes[i];

            }
            return new String(unmashed);
        }
    }
    
    public static void main(String[] args) {
        // Test the masher
        String testString = "1, 2, 3";
        if(Masher.unmash(Masher.mash(testString)).equals(testString)) {
            System.out.println("OK");
        } else {
            System.out.println("Error");
        }
    }
}
