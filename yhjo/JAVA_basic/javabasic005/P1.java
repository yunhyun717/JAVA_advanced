package javabasic005;

import java.util.Calendar;
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		while (true) {
			System.out.println("#Price");
			System.out.println("1. Apple");
			System.out.println("2. Strawberry");
			System.out.println("3. Grape");
			System.out.println("4. Watermelon");
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			P1_method price = new P1_method(1000, 2000, 3000, 4000);
			System.out.println("--->" + price.printprice(n) + "won\n");
		}

	}
}