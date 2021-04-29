package javabasic007;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class P3 {

	public static void main(String[] args) {
		P3 p3 = new P3();
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			for (int i = 0; i < n; i++) {
				System.out.print(p3.fibonacci(i) + " ");
			}
			System.out.println();
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
