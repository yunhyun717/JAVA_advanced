package javabasic_test;

import java.util.Scanner;

public class Test2_2 {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = 0;
		int i;

		while (true) {
			i = (int) (Math.random() * 20 + 1);
			m++;
			System.out.print(m + "-" + i + "\n");
			if (i == n) {
				break;
			}
			Thread.sleep(1000);
		}
		System.out.println("Number of trials : " + m);
	}
}