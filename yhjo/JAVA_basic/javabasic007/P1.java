package javabasic007;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class P1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String temp = scan.nextLine();
		String[] Temp = temp.split(" ");
		ArrayList<String> words = new ArrayList<String>();
		for (int i=0;i<Temp.length;i++) {
			words.add(Temp[i]);
		}
		Collections.sort(words);
		Collections.reverse(words);
		System.out.println(words);
	}

}
