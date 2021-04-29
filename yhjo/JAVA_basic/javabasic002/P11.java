package javabasic002;

import java.util.Scanner;

public class P11 {
	
	public static void main(String[] args) {
		int n=1;
		int m=1;
		while(n<9) {
			n++;
			m=1;
			do {
				m++;
				System.out.println(n + "X" + m + "=" + n*m);
				switch (m) {
				case 9 :
					System.out.println();
				}
			} while (m<9);
		}
	}
}
