/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest.interviewTest;

/**
 *
 * @author Vikas-PC
 */
public class TernaryOptrTest {
    public static void main(String[] args) {
        System.out.println(getMax(20, 283, 33));
    }
  private static int getMax(int a,int b,int c){
      return a > b ? (a > c ? a : c):(b > c ? b : c);  //logic1
      // return a < b ? (b > c ? b : c) : (a > c ? a : c)
  }          
}
