package javabasic007;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			String temp = scan.nextLine();
			int n = scan.nextInt();
			String[] series = temp.split(" ");
			for (int i = 0; i < series.length; i++) {
				numbers.add(Integer.parseInt(series[i]));
			}
			for (int i = 0; i < numbers.size(); i++) {
				if (numbers.get(i) % n == 0) {
					System.out.print(numbers.get(i) + " ");
				}
			}
			System.out.println();

		} catch (Exception e) {
			System.out.println("error");

		}
	}
}