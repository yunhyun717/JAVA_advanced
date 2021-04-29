package javabasic006;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		P6 p6 = new P6();
		while (true) {
			String temp = scan.nextLine();
			String input = scan.nextLine();
			int n = 0;
			for (int i = 0; i < temp.length()-input.length(); i++) {
				String Temp = temp.substring(i, i + input.length());
				if (Temp.equals(input)) {
					n++;
				}
			}
			System.out.println(n);
		}
	}
}
