package javabasic004;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class P4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			String temp = scan.nextLine();
			if (temp.contains("+")) {
				String temp1 = temp.substring(temp.indexOf("+") + 1);
				String temp2 = temp.substring(0, temp.indexOf("+"));
				addition(Double.parseDouble(temp2), Double.parseDouble(temp1));
			} else if (temp.contains("-")) {
				String temp1 = temp.substring(temp.indexOf("-") + 1);
				String temp2 = temp.substring(0, temp.indexOf("-"));
				subtraction(Double.parseDouble(temp2), Double.parseDouble(temp1));
			} else if (temp.contains("*")) {
				String temp1 = temp.substring(temp.indexOf("*") + 1);
				String temp2 = temp.substring(0, temp.indexOf("*"));
				multiplication(Double.parseDouble(temp2), Double.parseDouble(temp1));
			} else if (temp.contains("/")) {
				String temp1 = temp.substring(temp.indexOf("/") + 1);
				String temp2 = temp.substring(0, temp.indexOf("/"));
				division(Double.parseDouble(temp2), Double.parseDouble(temp1));
			}

		}

	}

	public static void addition(double num1, double num2) {
		double add = num1 + num2;
		System.out.println(add);
	}

	public static void subtraction(double num1, double num2) {
		double sub = num1 - num2;
		System.out.println(sub);
	}

	public static void multiplication(double num1, double num2) {
		double mul = num1 * num2;
		System.out.println(mul);
	}

	public static void division(double num1, double num2) {
		double div = num1 / num2;
		System.out.println(div);
	}

}