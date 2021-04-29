package javabasic002;

import java.util.Scanner;

public class Stringequals {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = "hello?";
		
		if (text.equals("hello") == true) {
			System.out.println("It's hello");
		} else {
			System.out.println("It's not hello");
		}
		scanner.close();
	}
}
