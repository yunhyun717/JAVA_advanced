package javabasic002;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		n = 1;
		switch (n) {
		case 1:
			System.out.println("One!");
			break;
		case 2:
			System.out.println("Two!");
			break;
		default:
			System.out.println("Except 1, 2");
			break;
		}
		scanner.close();
	}
}
