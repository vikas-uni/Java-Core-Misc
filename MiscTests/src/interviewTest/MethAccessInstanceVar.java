/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest;

/**
 *
 * @author Vikas-PC
 */
public class MethAccessInstanceVar {
    int i = getJ();
    int j = 5;
    private int getJ(){
        return j;
    }
    public static void main(String[] args) {
        MethAccessInstanceVar m = new MethAccessInstanceVar();
        System.out.println(m.i);   //prints 0
    }
}
