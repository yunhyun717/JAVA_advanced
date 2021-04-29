package javabasic_Review;

import java.util.Scanner;

public class P3_1 {

	public static void main(String[] args) {

		for (int i = 65; i < 91; i++) {
			System.out.print((char) i);

		}
		System.out.println();

		int n = 65;
		while (n != 91) {
			System.out.print((char) n);
			n++;
		}
	}
}
