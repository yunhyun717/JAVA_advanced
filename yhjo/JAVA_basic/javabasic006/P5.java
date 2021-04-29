package javabasic006;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		String[][] scores = { { "Jeong", "70", "80", "100" }, { "Pyo", "60", "70", "86" },
				{ "Choi", "54", "100", "82" }, { "Mike", "87", "95", "79" } };
		Scanner scan = new Scanner(System.in);
		P5 p5 = new P5();
		while (true) {
			System.out.println("#Select your name");
			System.out.println("1. Jeong");
			System.out.println("2. Pyo");
			System.out.println("3. Choi");
			System.out.println("4. Mike");

			int num = scan.nextInt() - 1;

			System.out.println("Summation : " + p5.sum(scores, num));
			System.out.println("Average : " + p5.aver(scores, num));
			System.out.println("Minimum : " + p5.min(scores, num));
			System.out.println("Maximum : " + p5.max(scores, num));
			System.out.println();

		}

	}

	public double sum(String[][] who, int n) {
		double sum = 0;
		for (int i = 1; i < who[n].length; i++) {
			sum = sum + Double.parseDouble(who[n][i]);
		}
		return sum;

	}

	public double aver(String[][] who, int n) {
		P5 p5 = new P5();
		double aver = 0;
		aver = aver + (p5.sum(who, n) / (who[n].length - 1));
		return aver;
	}

	public double min(String[][] who, int n) {
		double min = 100;
		for (int i = 1; i < 4; i++) {
			min = Math.min(min, Double.parseDouble(who[n][i]));
		}
		return min;
	}

	public double max(String[][] who, int n) {
		double max = 0;
		for (int i = 1; i < 4; i++) {
			max = Math.max(max, Double.parseDouble(who[n][i]));
		}
		return max;
	}
}
