package javabasic001;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Input the 1st number");
		int a;
		a = scanner.nextInt();
		
		System.out.println("Input the 2st number");
		int b;
		b = scanner.nextInt();
		
		System.out.print("Result : " + a + "+" + b + "=" + (a+b));
		
		
	}
}
