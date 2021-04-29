package javabasic_testA;

import java.util.Scanner;

public class Test5 {
	final static int BALANCE = 2000;
	final static int[] TEMP = { 500, 1000, 700 };

	public static void main(String[] args) {
		while (true) {
			try {
				int[] nums = new int[3];
				int balance = BALANCE;

				nums = vendingmachine(TEMP, BALANCE, balance, nums);
				balance = balancecalc(TEMP, BALANCE, nums);
			} catch (Exception e) {
				System.out.println("error");
			}
		}
	}

	public static int[] vendingmachine(int[] TEMP, int BALANCE, int balance, int[] nums) {
		if (balance < 0) {
			System.out.println("Insufficient balance. Try again.");
			nums = new int[3];
			balance = BALANCE;
		}
		System.out.println("\n#Vending machine");
		System.out.printf("1. Coke - %d\n", TEMP[0]);
		System.out.printf("2. Juice - %d\n", TEMP[1]);
		System.out.printf("3. Milk - %d\n", TEMP[2]);
		System.out.printf("4. Cancel All\n");
		System.out.printf("*balance = %d\n", balance);
		System.out.printf("*Coke[%d], Juice[%d], Milk[%d]\n", nums[0], nums[1], nums[2]);
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if (n < 4) {
			nums[n - 1] += 1;
		} else if (n == 4) {
			nums = new int[3];
		}
		return nums;
	}

	public static int balancecalc(int[] temp, int BALANCE, int[] nums) {
		int balance = BALANCE;
		for (int i = 0; i < 3; i++) {
			balance -= temp[i] * nums[i];
		}
		return balance;
	}
}
