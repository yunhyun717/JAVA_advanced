package javabasic_Review;

import java.util.Calendar;
import java.util.Scanner;

import javabasic004.staticfinalVariable;

public class review0321 {

	public static void main(String[] args) {
		review0321 encodeco = new review0321();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("#Menu");
			System.out.println("#1. encording");
			System.out.println("#2. decording");
			int n=scan.nextInt();
			String temp = scan.nextLine();
			char[] c = temp.toCharArray();
			
			switch (n) {
			case 1:
				for (int i=0;i<temp.length();i++) {
					encodeco.encording(c[i]);
				}
				break;
			case 2 :
				for (int i=0;i<temp.length();i++) {
					encodeco.decording(c[i]);
				}
				break;
			default : 
				System.out.println();
				break;
			}
		}
	}

	void encording(char a) {
		switch (a) {
		case (char) 0:
			a = (char) 'a';
		case (char) 1:
			a = (char) 'b';
		case (char) 2:
			a = (char) 'c';
		case (char) 3:
			a = (char) 'd';
		case (char) 4:
			a = (char) 'e';
		case (char) 5:
			a = (char) 'f';
		case (char) 6:
			a = (char) 'g';
		case (char) 7:
			a = (char) 'h';
		case (char) 8:
			a = (char) 'i';
		case (char) 9:
			a = (char) 'j';
		}
		System.out.print("a");

	}

	void decording(char a) {
		switch (a) {
		case (char) 'a':
			a = (int) 0;
		case (char) 'b':
			a = (int) 1;
		case (char) 'c':
			a = (int) 2;
		case (char) 'd':
			a = (int) 3;
		case (char) 'e':
			a = (int) 4;
		case (char) 'f':
			a = (int) 5;
		case (char) 'g':
			a = (int) 6;
		case (char) 'h':
			a = (int) 7;
		case (char) 'i':
			a = (int) 8;
		case (char) 'j':
			a = (int) 9;
		}
		System.out.print("a");

	}
}
