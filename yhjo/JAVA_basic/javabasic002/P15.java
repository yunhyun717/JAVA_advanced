package javabasic002;

import java.util.Scanner;

public class P15 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		n=scan.nextInt();
		
		for (int i=1;i<n;i++) {
			if (n%i==0) {
				System.out.println(i);
			} else {
			}
		}
	}
}