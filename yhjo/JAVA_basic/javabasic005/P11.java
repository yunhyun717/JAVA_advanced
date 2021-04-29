package javabasic005;

import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			String temp = scan.nextLine();

			for (int i = 0; i < temp.length(); i++) {
				System.out.print(temp.charAt(temp.length()-i-1));
			}
		}
	}
}