package javabasic008;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.TimeZone;

public class Thread_sleep {

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		
		System.out.println(dateAndTime);
		System.out.println("start");
		
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		time = new Date();
		dateAndTime = format.format(time);
		System.out.println(dateAndTime);
		System.out.println("end");
	}
}
