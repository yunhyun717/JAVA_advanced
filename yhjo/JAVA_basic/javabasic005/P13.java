package javabasic005;

import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {

		while (true) {
			Converter();
		}
	}

	public static void Converter() {
		try {
			double [][] converter = {{1,0.01,10,0.00001,10/1609344},{100,1,1000,0.001,0.000621},{0.1,0.001,1,1/1000000,1/1609344},{100000,1000,1000000,1,0.621371},{160934.4,1609.344,1609344,1.609344,1}};
			Scanner scan = new Scanner(System.in);
			System.out.println("#Unit");
			System.out.println("1. cm");
			System.out.println("2. m");
			System.out.println("3. mm");
			System.out.println("4. km");
			System.out.println("5. mile");
			int n = scan.nextInt();
			int m = scan.nextInt();
			double input = scan.nextDouble();
			double output = input*converter[n-1][m-1];
			System.out.printf("%f\n\n",output);
		} catch (Exception e) {
			System.out.println("error");
		}
	}
}
