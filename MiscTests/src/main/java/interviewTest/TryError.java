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
public class TryError {
    public static void main(String[] args) {
        try{
            test();
            System.out.println("A");
        }
        catch(Exception e){
            System.out.println("B");
        }
        finally{
            System.out.println("C"); //this will print
        }
    }
    static void test(){
        throw new Error();
    }
}
