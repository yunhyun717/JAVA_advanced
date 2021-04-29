package javabasic_testA;

import java.util.Scanner;

import javabasic004.staticfinalVariable;

public class Test4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			String temp = scan.nextLine();
			if (temp.contains("+")) {
				String temp1 = temp.substring(temp.indexOf("+") + 1);
				String temp2 = temp.substring(0, temp.indexOf("+"));
				System.out.println(Calc(Double.parseDouble(temp2), Double.parseDouble(temp1),0));
			} else if (temp.contains("-")) {
				String temp1 = temp.substring(temp.indexOf("-") + 1);
				String temp2 = temp.substring(0, temp.indexOf("-"));
				System.out.println(Calc(Double.parseDouble(temp2), Double.parseDouble(temp1),0.0f));
			} else if (temp.contains("*")) {
				String temp1 = temp.substring(temp.indexOf("*") + 1);
				String temp2 = temp.substring(0, temp.indexOf("*"));
				System.out.println(Calc(Double.parseDouble(temp2), Double.parseDouble(temp1),'a'));
			} else if (temp.contains("/")) {
				String temp1 = temp.substring(temp.indexOf("/") + 1);
				String temp2 = temp.substring(0, temp.indexOf("/"));
				System.out.println(Calc(Double.parseDouble(temp2), Double.parseDouble(temp1),"aa"));
			}
		}
	}

	public static double Calc(double x, double y, int a) {
		return x + y;
	}
	public static double Calc(double x, double y, double a) {
		return x - y;
	}
	public static double Calc(double x, double y, char a) {
		return x * y;
	}
	public static double Calc(double x, double y, String a) {
		return x / y;
	}
}