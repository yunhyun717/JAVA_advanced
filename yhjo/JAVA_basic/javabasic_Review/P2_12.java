package javabasic_Review;

import java.util.Scanner;

public class P2_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt()+1;
		int i = 1;
		while (n != i) {

			int j = 0;
			while (i > j) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();

		}

	}
}