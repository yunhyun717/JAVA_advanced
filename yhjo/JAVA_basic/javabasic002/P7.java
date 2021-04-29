package javabasic002;

import java.util.Scanner;

public class P7 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		n=scan.nextInt();
		
		if (n>=2&&n<=9) {
			for (int i=2;i<10;i++) {
				System.out.println(n + "X" + i + "=" + (n*i));
			}
		}
		scan.close();
	}
}
