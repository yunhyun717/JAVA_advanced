package javabasic_testA;

import java.util.Scanner;

public class Test2_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] temp = { 'j', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' };
		while (true) {
			System.out.println("#Input a string");
			String input = scan.nextLine();
			for (int i = 0; i < input.length(); i++) {
				int a = (int) input.charAt(i);
				System.out.println(a);
				
			}
		}
	}
}