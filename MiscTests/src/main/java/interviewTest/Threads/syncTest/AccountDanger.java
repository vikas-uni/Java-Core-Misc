/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest.Threads.syncTest;

/**
 *
 * @author ADMIN
 */
public class AccountDanger implements Runnable {
	private Account acct = new Account();

	public static void main(String[] args) {
		AccountDanger r = new AccountDanger();
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		one.setName("Fred");
		two.setName("Lucy");
		one.start();
		two.start();
	}

	public void run() {
		for (int x = 0; x < 5; x++) {
			acct.makeWithdrawal(10);
			if (acct.getBalance() < 0) {
				System.out.println("account is overdrawn!");
			}
		}
	}

}

class Account {
	private int balance = 50;

	public int getBalance() {
		return balance;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}

	public synchronized void makeWithdrawal(int amt) {
		if (getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw");
			/*
			 * try { Thread.sleep(500); } catch (InterruptedException ex) { }
			 */
			withdraw(amt);
			System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
		} else {
			System.out.println(
					"Not enough in account for " + Thread.currentThread().getName() + " to withdraw " + getBalance());
		}
	}

}
