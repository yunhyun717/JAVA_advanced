package javabasic002;

import java.util.Scanner;

public class P18 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		n=scan.nextInt();
		
		for (int i=2;i<=n;i++) {
			for (int j=2;j<=i;j++) {
				if (j<i&&i%j==0) {
					break;
				} else if (j==i) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}