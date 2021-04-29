package javabasic002;

import java.util.Scanner;

public class squ {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i;
		i=scan.nextInt();
		
		for (int n=1; n<=i;n++) {
			for (int m=1;m<=i;m++) {
				if (n==1||n==i) 
				{System.out.print("*");
				}
				else if (m==1||m==i)
				{System.out.print("*");
				}
				else
				{System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
