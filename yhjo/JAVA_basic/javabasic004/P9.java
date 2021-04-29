package javabasic004;

import java.util.Scanner;

public class P9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			int m = scan.nextInt();

			if (n >= m) {
				System.out.print("C(" + n + "," + m + ")  = " + n + "! / (" + n + " - " + m + ")! / " + m + "!  = (");

				for (int i = 0; i < n; i++) {
					if (i == (n - 1)) {
						System.out.print("1");
					} else {
						System.out.print((n - i) + " X ");
					}
				}
				System.out.print(") / (");
				for (int i = 0; i < n - m; i++) {
					if (i == (n - m - 1)) {
						System.out.print("1");
					} else {
						System.out.print((n - m - i) + " X ");
					}
				}
				System.out.print(") / (");
				for (int i = 0; i < m; i++) {
					if (i == (m - 1)) {
						System.out.print("1");
					} else {
						System.out.print((m - i) + " X ");
					}

				}
				System.out.print(") = " + multitoOne(n) + " / " + multitoOne(n-m) + " / " + multitoOne(m) + " = "
						+ multitoOne(n) / multitoOne(m) / multitoOne(n - m));
				System.out.println();
			} else {
				System.out.println("1st number must be smaller than 2nd number!!");
			}
		}
	}

	public static int multitoOne(int number) {
		if (number == 1 || number == 0) {
			return 1;
		} else {
			return number * multitoOne(--number);
		}
	}
}