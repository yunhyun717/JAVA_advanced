package javabasicHW01;

import java.util.Calendar;
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int num1, num2, sum;
		num1 = 0;
		num2 = 1;
		sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ",sum);
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}

	}
}
