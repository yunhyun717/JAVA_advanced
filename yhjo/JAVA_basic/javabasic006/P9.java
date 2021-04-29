package javabasic006;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class P9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String temp = scan.nextLine();
		Split(temp);
	}

	public static void Split(String temp) {
		ArrayList<Integer> mark = new ArrayList<Integer>();
		mark.add(-1);
		int n = 0;
		for (int i = 0; i < temp.length(); i++) {
			if (temp.charAt(i) == ',') {
				n++;
				mark.add(i);
			}
		}
		mark.add(temp.length());
		String[] split = new String[n + 1];
		for (int i = 0; i < n + 1; i++) {
			split[i] = temp.substring(mark.get(i) + 1, mark.get(i + 1));
		}
		for (int i = 0; i < split.length; i++) {

			System.out.println(split[i]);
		}
	}
}