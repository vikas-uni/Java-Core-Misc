/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interviewTest.connPool;

/**
 *
 * @author Administrator
 */
public class ConnStarter {
    public static void main(String[] args) {
        new Thread(new ConnUser()).start();
        new Thread(new ConnUser()).start();
        new Thread(new ConnUser()).start();
        new Thread(new ConnUser()).start();
        new Thread(new ConnUser()).start();
        new Thread(new ConnUser()).start();
        new Thread(new ConnUser()).start();
        new Thread(new ConnUser()).start();
        new Thread(new ConnUser()).start();
        new Thread(new ConnUser()).start();
    }
}
