package javabasic004;

import java.util.Scanner;

public class P11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			for (int i=0; i<n;i++) {
				System.out.print(Fibonacci(i)+" ");
			}
			System.out.println();
		}
	}

	public static int Fibonacci(int number) {
		if (number == 0) {
			return 0;
		} else if (number == 1){
			return 1;
		} else {
			return Fibonacci(number-1)+Fibonacci(number-2);
		}
	}
}