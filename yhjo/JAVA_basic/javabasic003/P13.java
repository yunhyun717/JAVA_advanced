package javabasic003;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			String temp1 = scan.nextLine();
			String temp2 = scan.nextLine();
			int n = 100;
			int m = 0;
			setarray(temp1, temp2, n, m);
		}
	}

	public static void setarray(String temp1, String temp2, int n, int m) {
		ArrayList<Character> words = new ArrayList<Character>();
		for (int i = 0; i < temp2.length(); i++) {
			for (int j = 0; j < temp1.length(); j++) {
				if (temp2.charAt(i) == temp1.charAt(j)) {
					words.add(temp1.charAt(j));
				}
			}
		}

		while (n != 0) {
			n = 0;
			for (int i = 0; i < temp2.length(); i++) {
				if (words.contains(temp2.charAt(i))) {
					words.remove(words.indexOf(temp2.charAt(i)));
					n++;
				}
			}
			if (n == temp2.length()) {
				m++;
			}
		}
		System.out.printf("%d", m);
	}
}
