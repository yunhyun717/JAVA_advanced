package javabasicHW01;

import java.util.Calendar;
import java.util.Scanner;

import org.graalvm.compiler.hotspot.aarch64.AArch64HotSpotConstantRetrievalOp;

public class P2 {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scorecal(n);
		
	}
	public static void scorecal(int n) {
		Scanner scan = new Scanner(System.in);
		int[] temp1 = new int[n];
		String[] temp2 = new String[n];
		char[] score = { 'A', 'B', 'C', 'D', 'F' };
		double result =0;
		int sum =0;
		for (int i = 0; i < n; i++) {
			temp1[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			sum = sum+temp1[i];
		}
		for (int i = 0; i < n; i++) {
			temp2[i] = scan.next();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				if (temp2[i].charAt(0) == score[j]) {
					result = result+(4-j)*temp1[i];
					if (temp2[i].charAt(1) == '+') {
						result = result+0.5*temp1[i];
						break;
				}
				
				}
			}
		}
		System.out.printf("%f\n\n", result/sum);
	}
}
