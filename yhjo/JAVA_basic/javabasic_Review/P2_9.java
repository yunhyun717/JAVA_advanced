package javabasic_Review;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class P2_9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while (true) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			Arith(num1, num2);
		}

	}

	public static void Arith(int num1, int num2) {
		try {
			int sum = 0;
			int num3 = 1;
			while (num3 <= num1) {
				sum += num3;
				num3 += num2;
			}
			System.out.println(sum);
		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
	}
}
