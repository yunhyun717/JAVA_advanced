package javabasic003;

import java.util.Calendar;
import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("#Temperature Converter");
			System.out.println("#1. Celsius -> Fahrenheit");
			System.out.println("#2. Fahrenheit -> Celsius");
			
			int n=scan.nextInt();
			
			if (n==1) {
				double t = scan.nextInt();
				double f = t*1.8+32;
				System.out.printf("%.2f",f);
			} else if (n==2) {
				double t = scan.nextInt();
				double c = t-32/1.8;
				System.out.printf("%.2f",c);
			} 
		}

	}
}
