package javabasic002;

import java.util.Scanner;

public class P9 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int k;
		int sum=0;
		n=scan.nextInt();
		k=scan.nextInt();
				
		for (int i=1;i<=n;i+=k) {
			sum+=i;
			if (i+1>=n) {
				System.out.println(sum);
			} 
		}
		
		scan.close();
	}
}
