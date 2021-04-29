package javabasic004;

import java.util.Scanner;

public class P10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();

			ntimetable(n, 2);
		}
	}

	public static void ntimetable(int number1, int number2) {
		if (number2 > 9) {
			return;
		} else {
			System.out.println(number1 + " X " + number2 + " = " + (number1 * number2));
			ntimetable(number1, number2+1);
			return;
		}
	}
}