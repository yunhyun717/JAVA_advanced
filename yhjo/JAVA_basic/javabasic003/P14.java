package javabasic003;

import java.util.Scanner;

public class P14 {
	public static void main(String[] args) {
		while (true) {
			Scanner scan = new Scanner(System.in);
			String sentence = scan.nextLine();
			aan(sentence);
		}
	}

	public static void aan(String sentence) {
		String[] words = sentence.split(" ");
		String vowel = "aeiou";

		for (int i = 0; i < words.length - 1; i++) {
			if (words[i].equals("a")) {
				String c = String.valueOf(words[i + 1].charAt(0));
				if (vowel.contains(c)) {
					words[i] = "an";
				}
			} else if (words[i].equals("an")) {
				String c = String.valueOf(words[i + 1].charAt(0));
				if (!vowel.contains(c)) {
					words[i] = "a";
				}
			}
		}
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}
		System.out.println();
	}
}
