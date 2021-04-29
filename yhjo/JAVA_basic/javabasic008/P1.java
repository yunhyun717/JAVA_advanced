package javabasic008;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.TimeZone;

public class P1 {

	public static void main(String[] args) {

		System.out.println("start");

		try {
			for (int i = 0; i < 100; i++) {
				System.out.println(i + 1);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
