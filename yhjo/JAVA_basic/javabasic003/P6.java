package javabasic003;

import java.util.Calendar;
import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int y = scan.nextInt();
		int m = scan.nextInt();
		int start_day_of_week = 0;
		int endday = 0;
		Calendar sday = Calendar.getInstance();
		Calendar eday = Calendar.getInstance();
		sday.set(y, m, 1);
		eday.set(y, m + 1, 1);
		eday.add(Calendar.DATE, -1);
		start_day_of_week = sday.get(Calendar.DAY_OF_WEEK);
		endday = eday.get(Calendar.DATE);

		System.out.println("Sun	Mon	Tue	Wed	Thu	Fri	Sat");

		for (int i = 1, n = start_day_of_week; i <= endday; i++, n++) {
			System.out.print((i < 10) ? "	" + i : "	" + i);
			if (n % 7 == 0) {
				System.out.println();
			}

		}

	}
}