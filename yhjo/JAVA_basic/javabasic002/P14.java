package javabasic002;

import java.util.Scanner;

public class P14 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		n=scan.nextInt();
		
		for (int i=n;i>=1;i--) {
			for (int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for (int k=1;k<=2*i-1;k++) {
				if (i%2==0) {
					System.out.print("*");
				} else {
					System.out.print("/");
				}
			}
			System.out.println();
		}
	}
}