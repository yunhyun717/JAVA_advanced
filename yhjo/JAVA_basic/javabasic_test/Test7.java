package javabasic_test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

public class Test7 {

	public static void main(String[] args) {
		number();

	}

	public static void number() {
		HashSet<Integer> numbers = new HashSet<Integer>();
		int n = 0;
		while (numbers.size() < 10) {
			n++;
			int m = (int) ((Math.random() * 10)+1);
			numbers.add(m);
			System.out.println("#" + n + "-" + m);
		}
		System.out.println("Total number of trials : " + n);
	}

}
