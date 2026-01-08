/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest.Threads.notifyAllTest;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
class CalculatorTask implements Runnable {
	private Calculator calculator;

    public void run() {
        try {
            Thread.sleep(2000);
            calculator.calculate();
        } catch (InterruptedException ex) {
            Logger.getLogger(CalculatorTask.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setCalc(Calculator calculator) {
    	this.calculator = calculator;
    }
}
