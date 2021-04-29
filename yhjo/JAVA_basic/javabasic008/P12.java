package javabasic008;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class P12 {

	public static void main(String[] args) {
		P12 p12 = new P12();
		while (true) {
			p12.calc();
		}
	}

	public void calc() {
		P12 p12 = new P12();
		Scanner scan = new Scanner(System.in);
		try {

			int n = scan.nextInt();
			for (int i = 0; i < n; i++) {
				System.out.print(p12.fibonacci(i) + " ");
			}
			System.out.println();
		} catch (InputMismatchException e) {
			System.out.println("error");
		}
	}

	public int fibonacci(int n) {
		ArrayList<Integer> Array = new ArrayList<Integer>();
		Array.add(0);
		Array.add(1);
		if (n > 1) {
			for (int i = 2; i <= n; i++) {
				Array.add(i, Array.get(i - 2) + Array.get(i - 1));
			}
		}
		return Array.get(n);
	}

}
