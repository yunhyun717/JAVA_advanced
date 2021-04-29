package javabasic_Review;

import java.util.Scanner;

public class P2_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = 1;
		while (m < n) {
			if (n % m == 0) {
				System.out.println(m);
			}
			m++;
		}

		System.out.println();

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
	}
}