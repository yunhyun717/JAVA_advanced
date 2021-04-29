package javabasic004;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class P5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int n = scan.nextInt();
			Multitable(n);
			System.out.println();
		}

	}

	public static void Multitable(int num) {
		for (int i = 0; i < 9; i++) {
			System.out.println(num + "X" + (i + 1) + "=" + (num * (i + 1)));
		}

	}
}