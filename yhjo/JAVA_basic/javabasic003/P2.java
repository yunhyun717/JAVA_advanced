package javabasic003;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String temp = scan.nextLine();
		
		for (int n=0;n<temp.length();n++) {
			byte tempb=(byte)(temp.charAt(n));
			if (tempb>=97&&tempb<=122) {
				System.out.print((char)(tempb-32));
			} else if (tempb>=65&&tempb<=90) {
				System.out.print((char)(tempb+32));
			} else {
				System.out.print((char)(tempb));
				
			}
		}
	}
}
