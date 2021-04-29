package javabasic005;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		Menu();

	}

	public static void Menu() {
		String[][] data = {{"Name", "Kor", "Eng", "Math"}};
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("#Menu");
			System.out.println("1. Input a record");
			System.out.println("2. Make descriptive statistics");
			System.out.println("3. Print all the records");
			int n = scan.nextInt();
			System.out.println();
			switch (n) {
			case 1:
				String input = scan.next();
				data = record(input, data);
				break;
			case 2:
				System.out.printf("Number of Students : %d\n", data.length - 1);
				for (int i = 1; i < 4; i++) {
					double sum = 0;
					double min = 100;
					double max = 0;
					for (int j = 1; j < data.length; j++) {
						sum = sum + Double.parseDouble(data[i][j]);
					}
					double avg = sum / (data.length - 1);
					for (int j = 1; j < data.length; j++) {
						min = Math.min(min, Double.parseDouble(data[i][j]));
					}
					for (int j = 1; j < data.length; i++) {
						max = Math.max(max, Double.parseDouble(data[i][j]));
					}
					if (i == 1) {
						System.out.print("Korean");
					} else if (i == 2) {
						System.out.print("English");
					} else if (i == 3) {
						System.out.print("Math");
					}
					System.out.printf("(Avg, Min, Max) : %.2f, %.2f, %.2f\n", avg, min, max);
				}
				System.out.println();
				break;
			case 3:
				for (int i = 0; i < data.length; i++) {
					for (int j = 0; j < data[i].length; j++) {
						System.out.print(data[i][j] + "	");
					}
					System.out.println();
				}
				System.out.println();
				break;
			}

		}
	}

	public static String[][] record(String input, String[][] data) {
		String[] temp = input.split(",");
		String[][] Data = new String[data.length + 1][4];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				Data[i][j] = data[i][j];
			}
		}
		for (int k = 0; k < Data[data.length].length; k++) {
			Data[data.length][k] = temp[k];
		}
		return Data;

	}
}