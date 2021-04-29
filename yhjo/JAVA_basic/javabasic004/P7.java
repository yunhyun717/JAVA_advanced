package javabasic004;

import java.util.Scanner;

public class P7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("n! = n X (n-1) X (n-2) X ... X 1");
		int n = scan.nextInt();
		System.out.print(multToOne(n) + " = ");
		print(n);
	}

	public static int multToOne(int number) {
		if (number == 1) {
			return 1;
		} else {
			return number * multToOne(--number);
		}
	}
	
	public static void print(int number) {
		for (int i=number;i>1;i--) {
		System.out.printf("%d X ", i);
		}
		System.out.print("1");
	}
	
	public static int Factorial(int m, boolean process) {
		if (m==1) {
			if (process) {
				System.out.print(m);
				
			} else {
				if (process) {
					System.out.println(m + " X ");
				}
			}
		}
		return m*Factorial(m-1);
		
	}
} 