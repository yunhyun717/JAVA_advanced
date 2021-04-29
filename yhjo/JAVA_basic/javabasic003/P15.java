package javabasic003;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class P15 {
	public static void main(String[] args) {
		calc();
	}

	public static void calc() {
		try {
			while (true) {
				Scanner scan = new Scanner(System.in);
				String temp = scan.nextLine();
				double num1 = Double.parseDouble(temp.substring(0, temp.indexOf(operator(temp))));
				double num2 = Double.parseDouble(temp.substring(temp.indexOf(operator(temp)) + 1));
				char o = operator(temp);
				double result = 0;
				if (o == '+') {
					result = num1 + num2;
				} else if (o == '-') {
					result = num1 - num2;
				} else if (o == '*') {
					result = num1 * num2;
				} else if (o == '/') {
					result = num1 / num2;
				}
				System.out.printf("%.2f\n", result);
			}
		} catch (Exception e) {
			System.out.printf("%s\n", "Error");
		}
	}

	public static char operator(String temp) {
		char operator = 0;
		if (temp.contains("+")) {
			operator = '+';
		} else if (temp.contains("-")) {
			operator = '-';
		} else if (temp.contains("*")) {
			operator = '*';
		} else if (temp.contains("/")) {
			operator = '/';
		}
		return operator;
	}
}