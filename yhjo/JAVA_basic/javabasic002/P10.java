package javabasic002;

import java.util.Scanner;

public class P10 {
	
	public static void main(String[] args) {
		for (int i=2;i<10;++i) {
			for (int j=1;j<10;++j) {
			System.out.println(i + " X " + j + " = " + (i*j));
			if (j==9) {
				System.out.println();
			}
				
			}
		}
	}
}
