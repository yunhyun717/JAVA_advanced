package javabasic_Review;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class P1_13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int a = scanner.nextInt();
			int n = scanner.nextInt();
			base(a, n);
		}

	}

	public static void base(int a, int n) {
		try {
			Stack<Integer> stack = new Stack<Integer>();
			int b;
			int k = 1;
			while (a >= n) {
				b = a % n;
				stack.add(b);
				a = a / n;
				k++;
			}
			stack.add(a);
			for (int i = 0; i < k; i++) {
				System.out.print(stack.pop());
			}
			System.out.println();
		} catch (InputMismatchException e) {
			System.out.println("error");
		}
	}
}
