package javabasic_Review;

import java.util.Scanner;

public class P2_16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int M = Math.max(n, m);
		while (M % n != 0 || M % m != 0) {
			M += 1;
		}
		System.out.println(M);

		for (int i = Math.min(n, m); i > 0; i--) {
			if (n % i == 0 && m % i == 0) {
				System.out.println(i);
				break;

			}
		}
	}
}
