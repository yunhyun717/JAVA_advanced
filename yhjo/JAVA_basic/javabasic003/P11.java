package javabasic003;

import java.util.Calendar;
import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		P11 p11 = new P11();
		float[] currency = { 0.00089f, 1125.04f, 0.0058f, 173.13f };
		while (true) {
			p11.Currency(currency);
		}
	}

	public void Currency(float[] currency) {

		Scanner scan = new Scanner(System.in);
		System.out.println("#Curreny Converter");
		System.out.println("#1. South Korean won -> United States Dollar");
		System.out.println("#2. United States Dollar -> South Korean won");
		System.out.println("#3. South Korean won -> China CNY");
		System.out.println("#4. China CNY -> South Korean won");
		int n = scan.nextInt();
		int m = scan.nextInt();

		double f = m * currency[n - 1];
		System.out.printf("%.2f\n\n", f);
		

	}

}
