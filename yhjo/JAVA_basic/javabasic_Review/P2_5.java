package javabasic_Review;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class P2_5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while (true) {
			String input = scan.nextLine();
			String temp = scan.nextLine();
			include(input, temp);
		}

	}

	public static void include(String input, String temp) {
		try {
			String Input = input.toLowerCase();
			String Temp = input.toLowerCase();
			if (Temp.contains(Input) == true) {
				System.out.println("included");
			} else {
				System.out.println("not included");
			}
		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
	}
}
