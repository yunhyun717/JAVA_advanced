package javabasic008;

public class P9 extends Thread {

	public static void main(String[] args) throws InterruptedException {

		Thread thread1 = new P9Thread("thread1");
		Thread thread2 = new P9Thread("thread2");
		Thread thread3 = new P9Thread("thread3");
		thread1.setPriority(10);
		thread2.setPriority(5);
		thread3.setPriority(1);
		thread1.start();
		thread2.start();
		thread3.start();

	}
}

class P9Thread extends Thread {
	public P9Thread(String threadName) {
		this.setName(threadName);
	}

	public void run() {

		double sum = 0;
		char f = 0;
		int a = 0;
		while (a != 5) {
			try {
				Thread.sleep(2000);
				sum += (double) (Math.random() * 10 + 1);
				if (sum < 50) {
					System.out.printf("\t%.1fm\t", sum);
				} else if (f == 'f') {
					System.out.print("\t\t");
					a++;
				} else if (sum >= 50 || f != 'f') {
					System.out.print("\t(END)\t");
					f = 'f';
					a++;
				}
				if (Thread.currentThread().getName().equals("thread3")) {
					System.out.println();
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}