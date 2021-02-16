/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vikas-PC
 */
public class ExceptionTest {
    public static void main(String[] args) {
        try{
            throw new NullPointerException();
        }
        catch(NullPointerException e){
            try {
                //this exception will not be caught by catch declared below.So separate try-catch block is needed
                throw new Exception("thrown from inner catch");   
            }
            catch (Exception ex) {
                Logger.getLogger(ExceptionTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch(Exception e){
            //the Exception() thrown above will not be caught by this catch
        }
    }
    
}
