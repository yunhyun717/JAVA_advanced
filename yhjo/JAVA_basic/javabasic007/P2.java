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

public class P2 {

	public static void main(String[] args) {
		P2 p2 = new P2();
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			p2.handling(n);
		}
	}

	public void handling(int n) {
		try {
			Scanner scan = new Scanner(System.in);
			int[] temp = new int[n];
			String Temp1 = scan.nextLine();
			String[] Temp2 = Temp1.split(" ");
			ArrayList<Integer> Array = new ArrayList<Integer>();
			for (int i = 0; i < Temp2.length; i++) {
				temp[i] = Integer.parseInt(Temp2[i]);
				Array.add(temp[i]);
			}
			Collections.sort(Array);
			for (int i = 0; i < Array.size(); i++) {
				System.out.print(Array.get(i) + " ");
			}
			System.out.println();

		} catch (Exception e) {
			System.out.println("error");
		}
	}
}
