package javabasic_test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		double mab = a % b;
		double mac = a % c;

		if (mab == 0 && mac == 0) {
			System.out.println("Divisible by " + b + " and " + c + "!");
		} else {
			System.out.println("NOT divisible by " + b + " and " + c + "!");
		}

		scan.close();

	}

}
