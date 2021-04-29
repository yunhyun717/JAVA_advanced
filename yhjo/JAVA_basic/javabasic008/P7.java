package javabasic008;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TimeZone;

public class P7 {

	public static void main(String[] args) {
		Temp Temp = new Temp();
		Thread timer = new Thread(Temp);

		timer.start();

	}

	public void run() {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		System.out.println(dateAndTime);
		while (true) {
			try {
				Scanner scan = new Scanner(System.in);
				int n = scan.nextInt();
				Date time2 = new Date();
				long diff = time2.getTime() - time.getTime();
				long m = n * 1000 - diff;
				if (m <= 0) {
					Date time3 = new Date();
					dateAndTime = format.format(time3);
					System.out.println("time is already over(" + dateAndTime + ")");
				} else {
					Thread.sleep(m);
					Date time3 = new Date();
					dateAndTime = format.format(time3);
					System.out.println("time is over(" + dateAndTime + ")");
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
