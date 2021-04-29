package javabasicHW02;

import java.util.Calendar;
import java.util.Scanner;

import javabasic004.staticfinalVariable;

public class P2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int hn = (int)Math.ceil(n/10000);
			int hm = (int)Math.ceil(m/10000);
			int mn = (int)Math.ceil(n/100)-(hn*100);
			int mm = (int)Math.ceil(m/100)-(hm*100);
			int sn = (int) (n-(hn*10000)-(mn*100));
			int sm = (int) (m-(hm*10000)-(mm*100));
			
			System.out.println(Math.abs((3600*hn+60*mn+sn)-(3600*hm+60*mm+sm)) + "s");
		}
}
}