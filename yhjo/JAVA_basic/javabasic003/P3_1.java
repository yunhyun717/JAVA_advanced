package javabasic003;

import java.util.Scanner;

public class P3_1 {
	final static String[] CHO = { "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
			"��", "��" };
	final static String[] JOONG = { "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
			"��", "��", "��", "��" };
	final static String[] JONG = { "", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
			"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��" };

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();

		for (int i = 0; i < text.length(); i++) {
			char uni = text.charAt(i);
			if (uni >= 0xAC00) {
				uni = (char) (uni - 0xAC00);
				char cho = (char) (uni / 28 / 21);
				char joong = (char) ((uni) / 28 % 21);
				char jong = (char) (uni % 28);
				System.out.print(CHO[cho] + JOONG[joong] + JONG[jong] + " ");
			} else {
			}
		}
	}
}