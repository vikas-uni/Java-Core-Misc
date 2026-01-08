package coaching.Threads;

class Login {
	int value;

	synchronized void admin() {
		value = (int) (Math.random() * 100);
		System.out.println("admin is going to notify all threads in a pool");
		try {
			notifyAll();
			wait();
		} catch (Exception e) {
		}
	}

	synchronized void user() {
		try {
			System.out.println(Thread.currentThread().getName() + " waiting for admin thread...");
			wait();
		} catch (Exception e) {
		}
		System.out.println(Thread.currentThread().getName() + " has gain the lock");
	}
}

class MThread2 extends Thread {
	MThread2(String tname) {
		super(tname);
		if (tname.equals("admin"))
			setDaemon(true);
		start();
	}

	public void run() {
		if (getName().equals("admin")) {
			System.out.println("admin thread started");
			SynchTest3.login.admin();
		} else {
			SynchTest3.login.user();
		}
	}
}

class SynchTest3 {
	static Login login;

	public static void main(String s[]) {
		login = new Login();
		MThread2 usr1 = new MThread2("user1");
		MThread2 usr2 = new MThread2("user2");
		MThread2 usr3 = new MThread2("user3");
		MThread2 adm = new MThread2("admin");
		MThread2 usr4 = new MThread2("user4");
	}
}