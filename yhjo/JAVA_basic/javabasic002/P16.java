package javabasic002;

import java.util.Scanner;

public class P16 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int m;
		n=scan.nextInt();
		m=scan.nextInt();
		
		for (int i=1;i<=n*m;i++) {
			if (i%n==0&&i%m==0) {
				System.out.println(i);
				break;
			} else {
			}
		}
	}
}