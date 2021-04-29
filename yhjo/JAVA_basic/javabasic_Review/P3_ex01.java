package javabasic_Review;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class P3_ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] temp = scan.nextLine().split(" ");
		int[] input = new int[temp.length];
		for (int i = 0; i < input.length; i++) {
			input[i] = Integer.parseInt(temp[i]);
		}
		for (int i = 0; i < input.length; i++) {
			System.out.printf("%d ", plusone(input)[i]);
		}
	}

	public static int[] plusone(int[] input) {
		for (int i = 0; i < input.length; i++) {
			input[i]+=1;
		}
		return input;

	}

}
