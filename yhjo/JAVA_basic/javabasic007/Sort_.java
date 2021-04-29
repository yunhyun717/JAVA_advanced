package javabasic007;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Sort_ {

	public static void main(String[] args) {
		String[] temp = { "lee", "kim", "john", "bill", "mike" };

		Arrays.sort(temp);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
		System.out.println();
		System.out.println("==============");
		Arrays.sort(temp, Collections.reverseOrder());
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
			
		}
		System.out.println();
		System.out.println("==============");

		Integer[] inte = { 5, 8, 6, 0, 9, 7, 5, 1 };
		Arrays.sort(inte);
		for (int i = 0; i < inte.length; i++) {
			System.out.print(inte[i]);

		}
		System.out.println();
		System.out.println("==============");
		
		Arrays.sort(inte, Collections.reverseOrder());
		for (int i = 0; i < inte.length; i++) {
			System.out.print(inte[i]);
		}

	}
}
