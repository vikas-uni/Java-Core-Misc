package concurrency;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.TimeUnit;
public class DeadlockDemo {
	private final Object object1 = new Object();
	private final Object object2 = new Object();
	public static void main(String[] args) {
		final DeadlockDemo deadLockDemo = new DeadlockDemo();
		Thread t1 = new Thread(() -> {
			while (true) {
				synchronized (deadLockDemo.object1) {
					try {
						System.out.println("Inside first synchronized block of first thread t1");
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (deadLockDemo.object2) {
						System.out.println("Inside second synchronized block of first thread t1");
					}
				}
			}
		}, "Thread-t1");
		
		Thread t2 = new Thread(() -> {
			while (true) {
				synchronized (deadLockDemo.object2) {
					System.out.println("Inside first synchronized block of second thread t2");
					synchronized (deadLockDemo.object1) {
						System.out.println("Inside second synchronized block of second thread t2");
					}
				}
			}
		}, "Thread-t2");
		Thread t3 = new Thread(() -> {
			System.out.println("Hello World");
			try {
				TimeUnit.SECONDS.sleep(6);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}, "Thread-t3");
		t1.start();
		t2.start();
		t3.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getThreadDump());
	}
	public static String getThreadDump() {
		final StringBuilder threadInfoStr = new StringBuilder();
		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		// long ids[] = threadMXBean.findMonitorDeadlockedThreads();
		// ThreadInfo threadInfo[] = threadMXBean.getThreadInfo(ids);
		final ThreadInfo[] threadInfo = threadMXBean.getThreadInfo(threadMXBean.getAllThreadIds(), 100);
		System.out.println(threadInfo.length);
		for (ThreadInfo info : threadInfo) {
			threadInfoStr.append('"');
			threadInfoStr.append(info.getThreadName());
			threadInfoStr.append("\" ");
			final Thread.State state = info.getThreadState();
			threadInfoStr.append("\n   java.lang.Thread.State: ");
			threadInfoStr.append(state);
			final StackTraceElement[] stackTraceElements = info.getStackTrace();
			for (final StackTraceElement stackTraceElement : stackTraceElements) {
				threadInfoStr.append("\n        at ");
				threadInfoStr.append(stackTraceElement);
			}
			threadInfoStr.append("\n\n");
		}
		return threadInfoStr.toString();
	}
}