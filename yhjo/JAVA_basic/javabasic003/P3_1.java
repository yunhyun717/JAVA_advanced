package javabasic003;

import java.util.Scanner;

public class P3_1 {
	final static String[] CHO = { "ぁ", "あ", "い", "ぇ", "え", "ぉ", "け", "げ", "こ", "さ", "ざ", "し", "じ", "す", "ず", "せ", "ぜ",
			"そ", "ぞ" };
	final static String[] JOONG = { "た", "だ", "ち", "ぢ", "っ", "つ", "づ", "て", "で", "と", "ど", "な", "に", "ぬ", "ね", "の", "は",
			"ば", "ぱ", "ひ", "び" };
	final static String[] JONG = { "", "ぁ", "あ", "ぃ", "い", "ぅ", "う", "ぇ", "ぉ", "お", "か", "が", "き", "く", "ぎ", "ぐ", "け",
			"げ", "ご", "さ", "ざ", "し", "じ", "ず", "せ", "ぜ", "そ", "ぞ" };

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