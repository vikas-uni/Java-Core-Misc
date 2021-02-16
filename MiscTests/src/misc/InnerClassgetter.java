/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package misc;

/**
 *
 * @author Administrator
 */
public class InnerClassgetter {
    
    private static class InnerClass{

        public InnerClass() {
            System.out.println("inner created");
        }
        public String toString(){
            return "cant get instance outside";
        }
    
    }
    
    public static InnerClass getInnerClass(){
        return new InnerClass();
    }
    
}
