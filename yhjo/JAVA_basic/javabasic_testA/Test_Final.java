package javabasic_testA;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.TimeZone;

import javabasic008.Thread_2;

public class Test_Final {

	public static void main(String[] args) {

		Thread thread = new Thread();
		thread.start();
	}

	public static void run() throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\yunhyun jo\\Desktop\\test8.txt", true);
		double a = 0;
		double b = 21;
		double sum = 0;
		try {
			for (int i = 1; i <= 10; i++) {
				double d = (1 + (Math.random() * 20));
				System.out.println(d);
				if (d > 20) {
					d = 20;
				}
				sum = sum + d;
				double avg = sum / i;
				double min = Math.min(d, b);
				double max = Math.max(d, a);
				b=min;
				a=max;
				String data = "count-" + i + "	sum-" + sum + "	avg-" + avg + "	min-" + min + "	max-" + max + "\n";
				System.out.print(data);
				System.out.println();
				a = d;
				fw.write(data);
				Thread.sleep(500);

			}
			fw.close();
		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();

		}

	}
}
