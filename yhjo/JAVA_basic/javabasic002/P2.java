package javabasic002;

import java.util.Scanner;

public class P2 {
	
	public static void main(String[] args) {
		System.out.println("What operation do you want?\n\n1. +\n\n2. -\n\n3. *\n\n4. /\n\n--->");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		
		if (n == 1) {
			System.out.println(a+b);
		} else if (n==2) {
			System.out.println(a-b);
		} else if (n==3) {
			System.out.println(a*b);
		} else if (n==2) {
			System.out.println(a/b);
		}
	}

}
