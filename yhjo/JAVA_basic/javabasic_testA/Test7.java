package javabasic_testA;

public class Test7 implements Runnable {

	public static void main(String[] args) throws Exception {

		Test7 t7 = new Test7();
		Thread thread = new Thread(t7);
		thread.start();
	}

	public void run() {
		try {
			int sum = 0;
			int n = 0;
			while (sum < 100) {
				Thread.sleep(1000);
				n++;
				int d = (int) (Math.random() * 10 + 1);
				sum += d;
				System.out.printf("#%d : %d(%d)\n", n, d, sum);
			}
			System.out.printf("\nCount : %d\n", n);

		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
	}
}
