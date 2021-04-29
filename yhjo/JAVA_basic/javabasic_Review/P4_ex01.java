package javabasic_Review;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class P4_ex01 {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH)); // January=0
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // sat=0
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(Calendar.MINUTE));
		System.out.println(calendar.get(Calendar.SECOND));
		System.out.println(calendar.get(Calendar.MILLISECOND));

		Scanner scan = new Scanner(System.in);
		int y = scan.nextInt();
		int M = scan.nextInt();

		calendar.set(y, M-1, 1);
		System.out.print(calendar.getTime());
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		calendar.set(y, M, 0);
		System.out.println(calendar.getTime());
		
		System.out.println("Sun	Mon	Tue	Wed	Thu	Fri	Sat");
		for (int i=0; i<calendar.get(Calendar.DAY_OF_WEEK);i++) {
			System.out.print("\t");
		}
			System.out.println(calendar.getActualMaximum(M));
		
		System.out.printf("%f %d",214678.12412,21521);
		System.out.println("%%");
	}

}
