package javabasic_test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String temp = scan.nextLine();
		String[] t = temp.split(" ");

		double sum = 0, avr;
		double min = Double.parseDouble(t[0]);
		double max = min;
		for (int i = 0; i < 4; i++) {
			sum += Double.parseDouble(t[i]);
			min = Math.min(min, Double.parseDouble(t[i]));
			max = Math.max(max, Double.parseDouble(t[i]));
		}
		avr = sum / 4;

		System.out.println("Summation : " + sum);
		System.out.println("Average : " + avr);
		System.out.println("Minimum : " + min);
		System.out.println("Maximum : " + max);

	}
}