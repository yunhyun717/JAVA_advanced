package javabasic008;

public class P4 {

	public static void main(String[] args) {
		Task task = new Task();
		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);
		thread1.setName("thread1-Thread");
		thread2.setName("thread2-Thread");

		thread1.start();
		thread2.start();
	}

}

class Bank {
	int balance = 1000;

	public synchronized void withDraw(int money) {

		if (balance >= money) {
			try {
				Thread thread = Thread.currentThread();
				System.out.println(thread.getName() + " 출금 금액 ->> " + money);
				Thread.sleep(1000);
				balance -= money;
				System.out.println(thread.getName() + " balance:" + balance);

			} catch (Exception e) {
			}

		}
	}
}

class Task implements Runnable {
	Bank bank = new Bank();

	public void run() {
		while (bank.balance > 0) {
			int money = (int) (Math.random() * 3 + 1) * 100;
			bank.withDraw(money);

		}
	}
}