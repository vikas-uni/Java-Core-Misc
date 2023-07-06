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
public class MyConnection {

	private static boolean havingFree = true;

	private static MyConnection c1 = new MyConnection(1);
	private static MyConnection c2 = new MyConnection(2);
	private static MyConnection c3 = new MyConnection(3);

	private boolean busy = false;

	private static MyConnection[] pool = { c1, c2, c3 };
	private int connNum;

	private MyConnection(int connNum) {
		this.connNum = connNum;
	}

	public static MyConnection getConnection() {
		MyConnection live = null;
		if (havingFree) {

			live = getFree();

		}

		return live;
	}

	private static MyConnection getFree() {
		while (true) {
			for (MyConnection connection : pool) {

				if (!connection.isBusy()) {
					synchronized (connection) {
						if (!connection.isBusy()) {
							connection.setBusy(true);

							return connection;
						} else {
							try {
								connection.wait();
							} catch (InterruptedException ex) {
								Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
							}
						}

					}

				}
			}

		}

	}

	public void useConnection() {
		System.out.println("Using connection " + connNum + " by: " + Thread.currentThread());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
			Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
		}
		System.out.println("Finished using " + connNum + " by: " + Thread.currentThread());
		release();
	}

	public boolean isBusy() {
		return busy;
	}

	public void setBusy(boolean busy) {
		this.busy = busy;

	}

	private void release() {
		this.setBusy(false);
		havingFree = true;
		synchronized (this) {
			this.notifyAll();
		}
	}

	public static boolean isHavingFree() {
		return havingFree;
	}

}
