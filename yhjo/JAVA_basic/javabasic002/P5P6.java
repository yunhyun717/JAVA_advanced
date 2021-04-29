package javabasic002;

import java.util.Scanner;

public class P5P6 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text;
		text = scanner.nextLine();
		if (text.toLowerCase().contains("car".toLowerCase()) == true) {
			System.out.println("car is include in the input string.");
		} else {
			System.out.println("car is not include in the input string.");
		}
		
		System.out.println(text);
		
		scanner.close();
	}
}
