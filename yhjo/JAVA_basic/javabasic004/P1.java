package javabasic004;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P1 name = new P1();
		Scanner scan = new Scanner(System.in);

		while (true) {
			name.menu();
			int n = scan.nextInt();
			name.print(n);
		}
	}

	void print(int number) {
		if (number == 1) {
			System.out.println("Alex");
			System.out.println();
		} else if (number == 2) {
			System.out.println("Elice");
			System.out.println();
		} else if (number == 3) {
			System.out.println("John");
			System.out.println();
		} else if (number == 4) {
			System.out.println("Jane");
			System.out.println();
		} else {
			System.out.println("Error");
			System.out.println();
		}
	}

	void menu() {
		System.out.println("#Printing a Name");
		System.out.println("1. Father");
		System.out.println("2. Mother");
		System.out.println("3. Son");
		System.out.println("4. Daughter");
		System.out.print("-->");
	}
}