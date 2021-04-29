package javabasic004;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class P6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			String temp = scan.nextLine();
			String temp1 = temp.substring(0, temp.indexOf(getOperator(temp)));
			String temp2 = temp.substring(temp.indexOf(getOperator(temp))+1);
			if (getOperator(temp)=='+') {
				System.out.println(addition(Double.parseDouble(temp1), Double.parseDouble(temp2)));
			} else if (getOperator(temp)=='-') {
				System.out.println(subtraction(Double.parseDouble(temp1), Double.parseDouble(temp2)));
			} else if (getOperator(temp)=='*') {
				System.out.println(multiplication(Double.parseDouble(temp1), Double.parseDouble(temp2)));
			} else if (getOperator(temp)=='/') {
				System.out.println(division(Double.parseDouble(temp1), Double.parseDouble(temp2)));
			}

		}

	}

	public static double addition(double num1, double num2) {
		double add = num1 + num2;
		return add;
	}

	public static double subtraction(double num1, double num2) {
		double sub = num1 - num2;
		return sub;
	}

	public static double multiplication(double num1, double num2) {
		double mul = num1 * num2;
		return mul;
	}

	public static double division(double num1, double num2) {
		double div = num1 / num2;
		return div;
	}

	public static char getOperator(String temp) {
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