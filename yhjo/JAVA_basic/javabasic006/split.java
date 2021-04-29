package javabasic006;

import java.util.Scanner;

public class split {

	public static void main(String[] args) {

		String words = "kim,lee,park";
		String[] names = words.split(",");

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}