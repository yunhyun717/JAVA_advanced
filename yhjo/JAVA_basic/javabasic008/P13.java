package javabasic008;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class P13 {

	public static void main(String[] args) {
		P13 p4 = new P13();
		Scanner scan = new Scanner(System.in);
		while (true) {
			String word1 = scan.nextLine();
			String word2 = scan.nextLine();
			p4.comparing(word1, word2);
		}
	}

	public void comparing(String word1, String word2) {
		try {
			ArrayList<Character> Word1 = new ArrayList<Character>();
			ArrayList<Character> Word2 = new ArrayList<Character>();
			int n = 0;
			int i = 0;
			while (i != word1.length()) {
				Word1.add(word1.charAt(i));
				i++;
			}
			i = 0;
			while (i != word2.length()) {
				Word2.add(word2.charAt(i));
				i++;
			}

			System.out.println("1 : " + Word1.size());
			System.out.println("2 : " + Word2.size());

			i = 0;

			while (i != Word1.size()) {
				int j = 0;
				while (j != Word2.size()) {
					if (Word1.get(i) == Word2.get(j)) {
						Word2.remove(j);
						n++;
					}
					j++;
				}
				i++;
			}

			System.out.println("3 : " + n);
		} catch (

		Exception e) {
			System.out.println("error");
		}

	}
}
