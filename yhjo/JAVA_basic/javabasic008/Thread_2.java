package javabasic008;

public class Thread_2 implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		Thread_2 thread_2 = new Thread_2();
		Thread thread = new Thread(thread_2);
		thread.start();
	}
	@Override
	public void run() {
		System.out.println("Thread");
	}
}
