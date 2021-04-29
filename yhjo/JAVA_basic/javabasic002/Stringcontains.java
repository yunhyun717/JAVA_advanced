package javabasic002;

import java.util.Scanner;

public class Stringcontains {
	
	public static void main(String[] args) {
		String text = "how are you?";
		
		if (text.contains("how") == true) {
			System.out.println("It's hello");
		} else {
			System.out.println("It's not hello");
		}
	}
}
