package javabasic001;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(a-b);
		int aTemp = a-b;
		System.out.println("10000 - " + aTemp/10000);
		int bTemp = (a-b)%10000;
		System.out.println("5000 - " + bTemp/5000);
		int cTemp = bTemp%5000;
		System.out.println("1000 - " + cTemp/1000);
		int dTemp = cTemp%1000;
		System.out.println("500 - " + dTemp/500);
		int eTemp = dTemp%500;
		System.out.println("100 - " + eTemp/100);
		int fTemp = eTemp%100;
		System.out.println("50 - " + fTemp/50);
		int gTemp = fTemp%50;
		System.out.println("10 - " + gTemp/10);
		int hTemp = gTemp%10;
	}
}
