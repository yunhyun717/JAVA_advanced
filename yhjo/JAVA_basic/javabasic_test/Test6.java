package javabasic_test;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] temp = new int[5];

		while (true) {
			System.out.println();
			System.out.println("#Menu");
			System.out.printf("[Price] milk-%d apple-%d orange-%d melon-%d water-%d\n", temp[0], temp[1], temp[2],
					temp[3], temp[4]);
			System.out.println("1. Set the prive of items");
			System.out.println("2. Calculate the charges");
			System.out.println("3. Reset the price of items");
			System.out.print("->");
			int n = scan.nextInt();
			switch (n) {
			case 1:
				setprice(temp);
				break;
			case 2:
				calc(temp);
				break;
			case 3:
				temp = new int[5];
				System.out.println("\n#Reset complete!\n");
				break;
			}

		}
	}

	public static void setprice(int[] temp) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n#Please input the price of milk, apple, orange, melon and water in order.");
		System.out.print("->");

		for (int i = 0; i < 5; i++) {
			temp[i] = scan.nextInt();
		}
		System.out.println();
	}

	public static void calc(int[] temp) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n#Total charge");
		System.out.println("#Please input the quantities of milk, apple, orange, melon and water in order.");
		System.out.print("->");

		int[] order = new int[5];
		for (int i = 0; i < 5; i++) {
			order[i] = scan.nextInt();
		}
		int total = 0;
		for (int i = 0; i < 5; i++) {
			total = total + temp[i] * order[i];
			System.out.print(temp[i] * order[i] + " ");
		}
		System.out.printf("\nTotal charge : %d\n", total);
	}

}
