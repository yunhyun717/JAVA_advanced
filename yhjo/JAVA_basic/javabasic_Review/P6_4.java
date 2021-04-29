package javabasic_Review;

import java.util.Arrays;

public class P6_4 {

	public static void main(String[] args) {
		int[] numbers = { 2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20 };
		Arrays.sort(numbers);
		ascending(numbers);
		System.out.println();
		descending(numbers);
		
	}
	public static void ascending(int[] numbers) {	
		for (int i=0;i<numbers.length;i++) {
		System.out.print(numbers[i] + " ");
		}
	}
	
	public static void descending(int[] numbers) {
		for (int i=0;i<numbers.length;i++) {
		System.out.print(numbers[numbers.length-i-1] + " ");
		}
	}
}
