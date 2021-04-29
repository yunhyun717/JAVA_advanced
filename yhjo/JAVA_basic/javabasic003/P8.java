package javabasic003;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String yyyyMMdd = scan.nextLine();
		int n = scan.nextInt();
		int year = Integer.parseInt(yyyyMMdd.substring(0, 4));
		int month = Integer.parseInt(yyyyMMdd.substring(4, 6));
		int day = Integer.parseInt(yyyyMMdd.substring(6, 8));
		Calendar date = Calendar.getInstance();
		date.set(year, month, day);
		date.add(Calendar.DATE, +n + 1);
		System.out.print(date.get(Calendar.YEAR));
		if ((date.get(Calendar.MONTH) < 10)) {
			System.out.print("0" + date.get(Calendar.MONTH));
		} else {
			System.out.print(date.get(Calendar.MONTH));
		}
		System.out.print(date.get(Calendar.DATE));
	}

}