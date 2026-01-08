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
public class SwitchTest {
    public static void main(String[] args) {
        int n = 10;
        switch(n){
            //this default will not print forst if matching case is found
            default:{
                System.out.println("in default");
                break;
            }
            case 10:{
                System.out.println("in case");
            }
            case 9:{
                System.out.println("case 9");
            }
        }
    }
}
