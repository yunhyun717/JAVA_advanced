package javabasic_test;

import java.util.Scanner;

public class Test2_1 {

	public static void main(String[] args) {
		int[] nums = { 3, 7, 2, 8, 0 };
		for (int i = 0; i < 5; i++) {
			System.out.print(nums[i]);
			System.out.print("*");
			if (i % 2 == 0) {
				for (int j = 0; j < nums[i]; j++) {
					System.out.print("*");
				}
				for (int k = 0; k < 8 - nums[i]; k++) {
					System.out.print(" ");
				}
				System.out.println("*");
			} else {
				for (int j = 0; j < 8 - nums[i]; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < nums[i]; k++) {
					System.out.print("*");
				}
				System.out.println("*");
			}
		}
	}
}