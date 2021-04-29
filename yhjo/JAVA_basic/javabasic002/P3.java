package javabasic002;

import java.util.Scanner;

public class P3 {
	
	public static void main(String[] args) {
		System.out.println("What number do you want?");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();		
		
		if (n == 2) {
			System.out.println("2 X 2 = 4\n2 X 3 = 6\n2 X 4 = 8\n2 X 5 = 10\n2 X 6 = 12\n2 X 7 = 14\n2 X 8 = 16\n2 X 9 = 18");
		} else if (n == 3) {
			System.out.println("3 X 2 = 6\n3 X 3 = 9\n3 X 4 = 12\n3 X 5 = 15\n3 X 6 = 18\n3 X 7 = 21\n3 X 8 = 24\n3 X 9 = 27");
		} else if (n == 4) {
			System.out.println("4 X 2 = 8\n4 X 3 = 12\n4 X 4 = 16\n4 X 5 = 20\n4 X 6 = 24\n4 X 7 = 28\n4 X 8 = 32\n4 X 9 = 36");
		} else if (n == 5) {
			System.out.println("5 X 2 = 10\n5 X 3 = 15\n5 X 4 = 20\n5 X 5 = 25\n5 X 6 = 30\n5 X 7 = 35\n5 X 8 = 40\n5 X 9 = 45");
		} else if (n == 6) {
			System.out.println("6 X 2 = 12\n6 X 3 = 18\n6 X 4 = 24\n6 X 5 = 30\n6 X 6 = 36\n6 X 7 = 42\n6 X 8 = 48\n6 X 9 = 54");
		} else if (n == 7) {
			System.out.println("7 X 2 = 14\n7 X 3 = 21\n7 X 4 = 28\n7 X 5 = 35\n7 X 6 = 42\n7 X 7 = 49\n7 X 8 = 56\n7 X 9 = 63");
		} else if (n == 8) {
			System.out.println("8 X 2 = 16\n8 X 3 = 24\n8 X 4 = 32\n8 X 5 = 40\n8 X 6 = 48\n8 X 7 = 56\n8 X 8 = 64\n8 X 9 = 72");
		} else if (n == 9) {
			System.out.println("9 X 2 = 18\n9 X 3 = 27\n9 X 4 = 36\n9 X 5 = 45\n9 X 6 = 54\n9 X 7 = 63\n9 X 8 = 72\n9 X 9 = 81");
		} else {
			System.out.println("Not Supported number");
		}
	}

}
