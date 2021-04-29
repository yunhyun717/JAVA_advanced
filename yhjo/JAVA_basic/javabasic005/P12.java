package javabasic005;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		while (true) {
			Scanner scan = new Scanner(System.in);
			String temp = scan.nextLine();
			double number = scan.nextDouble();
			nearest(temp, number);
		}
	}

	public static void nearest(String temp, double number) {
		try {
			String[] num = temp.split(" ");
			if (number == Double.parseDouble(num[0])) {
				System.out.println(num[1]);
			} else if (number == Double.parseDouble(num[num.length - 1])) {
				System.out.println(num[num.length - 2]);
			}
			for (int i = 1; i < num.length - 1; i++) {
				double a = Math.abs(Double.parseDouble(num[i]) - Double.parseDouble(num[i - 1]));
				double b = Math.abs(Double.parseDouble(num[i]) - Double.parseDouble(num[i + 1]));
				if (number == Double.parseDouble(num[i])) {
					if (a > b) {
						System.out.println(num[i + 1]);
					} else if (a < b) {
						System.out.println(num[i - 1]);
					} else {
						System.out.println(num[i - 1] + ", " + num[i + 1]);
					}
				}
			}
		} catch (Exception e) {
			System.out.println("error");
		}
	}
}