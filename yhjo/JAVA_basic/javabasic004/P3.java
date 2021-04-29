package javabasic004;

import java.util.Scanner;

public class P3 {
	public static final String father = "Alex"; // ������ �� ������ ����
	public static final String mother = "Elice";
	public static final String son = "John";
	public static final String daughter = "Jane";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P3 name = new P3();
		Scanner scan = new Scanner(System.in);

		while (true) {
			name.menu();
			int n = scan.nextInt();
			name.print(n);
		}
	}

	void print(int number) {
		if (number == 1) {
			System.out.println(father);
			System.out.println();
		} else if (number == 2) {
			System.out.println(mother);
			System.out.println();
		} else if (number == 3) {
			System.out.println(son);
			System.out.println();
		} else if (number == 4) {
			System.out.println(daughter);
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