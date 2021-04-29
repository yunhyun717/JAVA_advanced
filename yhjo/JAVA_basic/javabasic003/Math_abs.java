package javabasic003;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class Math_abs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n = scan.nextDouble();
		
		if (n<0 ) {
			System.out.println((int)n*-1);
		} else {
			System.out.println((int)n);
		}
		scan.close();
	}
}
