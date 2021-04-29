package javabasic007;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			Queue<Integer> numbers = new LinkedList<Integer>();
			String temp = scan.nextLine();
			int n = scan.nextInt();
			int m = 1;
			String[] series = temp.split(" ");
			for (int i = 0; i < series.length; i++) {
				numbers.offer(Integer.parseInt(series[i]));
			}
			while (n != numbers.poll()) {
				m++;
			}
			System.out.println(m);

		} catch (Exception e) {
			System.out.println("error");

		}
	}
}