package javabasic_test;

import java.util.Scanner;

import javabasic004.staticfinalVariable;

public class Test5 implements CalculatorInterface {
	public static void main(String[] args) {
		double sol;
		Scanner scan = new Scanner(System.in);
		Test5 m = new Test5();

		while (true) {
			String formula = scan.nextLine();
			double formula1 = Double.parseDouble(formula.substring(0, formula.indexOf(m.getOperator(formula))));
			double formula2 = Double.parseDouble(formula.substring(formula.indexOf(m.getOperator(formula))+1));
			if (m.getOperator(formula) == '+') {
				sol = m.calAddition(formula1, formula2); 
				System.out.println(formula1 + "+" + formula2 + "=" + sol);
			} else if (m.getOperator(formula) == '-') {
				sol = m.calSubtraction(formula1, formula2);
				System.out.println(formula1 + "-" + formula2 + "=" + sol);
			} else if (m.getOperator(formula) == '*') {
				sol = m.calMultiplication(formula1, formula2);
				System.out.println(formula1 + "*" + formula2 + "=" + sol);
			} else if (m.getOperator(formula) == '/') {
				sol = m.calDivision(formula1, formula2);
				System.out.println(formula1 + "/" + formula2 + "=" + sol);
			}
		}
	}

	public double calAddition(double num1, double num2) {
		return num1 + num2;
	}

	public double calSubtraction(double num1, double num2) {
		return num1 - num2;
	}

	public double calMultiplication(double num1, double num2) {
		return num1 * num2;
	}

	public double calDivision(double num1, double num2) {
		return num1 / num2;
	}

	public char getOperator(String formula) {
		if (formula.contains("+")) {
			return '+';
		} else if (formula.contains("-")) {
			return '-';
		} else if (formula.contains("*")) {
			return '*';
		} else if (formula.contains("/")) {
			return '/';
		}
		return 0;
	
	}
}