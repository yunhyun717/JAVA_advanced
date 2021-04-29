package javabasicHW02;

import java.util.Calendar;
import java.util.Scanner;

import javabasic004.staticfinalVariable;

public class P1 {

	public static void main(String[] args) {
		P1 encodeco = new P1();
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("#Menu");
			System.out.println("#1. encording");
			System.out.println("#2. decording");
			
			int n = scan.nextInt();
			
			String temp = scan.nextLine();

			char[] c = temp.toCharArray();
			System.out.println(c[1]);
			switch (n) {
			case 1:
				for (int i = 0; i < temp.length(); i++) {
					encodeco.encording(c[i]);
				}
				break;
			case 2:
				for (int i = 0; i < temp.length(); i++) {
					encodeco.decording(c[i]);
				}
				break;
			default:
				System.out.println();
				break;
			}
		}
	}

	void encording(char a) {
		switch (a) {
		case 0:
			a = 'a';
		case 1:
			a = 'b';
		case 2:
			a = 'c';
		case 3:
			a = 'd';
		case 4:
			a = 'e';
		case 5:
			a = 'f';
		case 6:
			a = 'g';
		case 7:
			a = 'h';
		case 8:
			a = 'i';
		case 9:
			a = 'j';
		}
		System.out.print(a);

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
		System.out.print(a);

	}
}
