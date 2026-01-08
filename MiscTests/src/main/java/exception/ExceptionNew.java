/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Vikas-PC
 */
public class ExceptionNew {

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException nullE){ 
            try {
                throw new Exception();

            }catch(Exception e){
                System.out.println(e.getMessage());
            } 
            nullE.printStackTrace();
        }
        }

    }
