package javabasic_testA;

import java.util.Scanner;

public class Test2_1 {

	public static void main(String[] args) {
		char[] temp = { '-', '*' };
		for (int i = 1; i < 8; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(temp[i % 2]);
			}
			System.out.println();
		}
	}
}