package javabasic003;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class Math_min {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n = scan.nextDouble();
		double m = scan.nextDouble();
		
		if (n-m<0) {
			System.out.println((int)n);
		} else {
			System.out.println((int)m);
		}
		scan.close();
	}
}
