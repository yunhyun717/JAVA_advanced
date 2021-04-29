package javabasic008;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.TimeZone;

public class example {

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new ThreadExample("num 1");
		thread1.start();
		Thread thread2 = new ThreadExample("num 2");
		thread2.start();
	}
}

class ThreadExample extends Thread {
	public ThreadExample(String threadName) {
		this.setName(threadName);
	}

	public void run() {
		int sum = 0;
		System.out.print(this.getName() + "	");
		while (sum < 100) {
			try {
				Thread.sleep(1000);
				sum = sum + (int) (Math.random() * 10 + 1);
				System.out.print(sum + "	");

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}