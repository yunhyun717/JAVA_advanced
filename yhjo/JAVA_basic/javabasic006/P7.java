package javabasic006;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		P7 p7 = new P7();

		while (true) {
			String temp = scan.nextLine();
			p7.Ency(temp);
		}
	}

	public void Ency(String temp) {
		char[] Encryption = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		for (int i = 0; i < temp.length(); i++) {
			for (int j = 0; j < Encryption.length; j++) {
				if (temp.charAt(i) == Encryption[j]) {
					System.out.print(Encryption[(Encryption.length - j - 1)]);
				}
			}
		}
		System.out.println();

	}
}