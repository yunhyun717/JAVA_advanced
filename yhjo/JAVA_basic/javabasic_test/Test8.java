package javabasic_test;

public class Test8 implements Runnable{

	public static void main(String[] args) throws Exception{
		
		Test8 t8 = new Test8();
		Thread thread = new Thread(t8);
		thread.start();
	}

	public void run() {
		double sum = 0;
		double avg;
		double min = 21;
		double max = 0;
		try {
			for (int i = 1; i <= 10; i++) {
				double d = Math.random() * 19 + 1;
				System.out.println(d);
				sum += d;
				avg = sum / i;
				min = Math.min(min, d);
				max = Math.max(max, d);
				System.out.print("count-" + i + " sum-" + sum + " avg-" + avg + " min-" + min + " max-" + max + "\n\n");
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();

		}

	}
}
