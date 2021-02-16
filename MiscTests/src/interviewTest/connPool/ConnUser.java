/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest.connPool;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class ConnUser implements Runnable {

    @Override
    public void run() {
//        System.out.println(Thread.currentThread()+" Started");
            MyConnection c = MyConnection.getConnection();

            if (c != null) {               
                c.useConnection();
                c.release();

            }
        }
    

}
