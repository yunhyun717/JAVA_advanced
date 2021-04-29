package javabasic_Review;

import java.util.Calendar;
import java.util.Scanner;

public class review0320 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("#Curreny Converter");
			System.out.println("#1. South Korean won -> United States Dollarr");
			System.out.println("#2. United States Dollar -> South Korean won");
			System.out.println("#3. South Korean won -> China CNY");
			System.out.println("#4. China CNY -> South Korean won");
			int n=scan.nextInt();
			
			if (n==1) {
				int m = scan.nextInt();
				int f = (int)((m*0.00089f)*100);
				System.out.println((float)f/100+"\n");
			} else if (n==2) {
				int m = scan.nextInt();
				float f = (int)((m*1125.04f)*100);
				System.out.println((float)f/100+"\n");
			} else if (n==3) {
				int m = scan.nextInt();
				float f = (int)((m*0.0058f)*100);
				System.out.println((float)f/100+"\n");
			} else if (n==4) {
				int m = scan.nextInt();
				float f = (int)((m*173.03f)*100);
				System.out.println((float)f/100+"\n");
		}
		
			
		}
		
		
		
	}
}
