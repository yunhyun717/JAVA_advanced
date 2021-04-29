package javabasic002;

import java.util.Scanner;

public class P8 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int sum=0;
		n=scan.nextInt();
				
		for (int i=1;i<=n;i++) {
			sum+=i;
			if (i==n) {
				System.out.println(sum);
			}
		}
		
		scan.close();
	}
}
