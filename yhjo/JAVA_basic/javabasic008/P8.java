package javabasic008;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TimeZone;

public class P8 {

	public static void main(String[] args) {
		rps();
	}

	public static int rpsResult() {
		int ret;
		int randomNumber = (int) (Math.random() * 3);
		if (randomNumber == 0) {
			ret = 0;
		} else if (randomNumber == 1) {
			ret = 1;
		} else {
			ret = 2;
		}
		return ret;
	}

	public static void rps() {
		try {
			while (true) {
				int[][] game = { { 0, -1, 1 }, { 1, 0, -1 }, { -1, 1, 0 } };
				String[] RPS = { "Rock!", "Paper!", "Scissor!" };
				String[] Result = { "You Lose\n", "Draw\n", "You Win!\n" };
				Scanner scan = new Scanner(System.in);
				System.out.println("Please input number.(0 : Rock, 1 : Paper, 2 : Scissor)");
				int n = scan.nextInt();
				int cpu = rpsResult();
				int r = game[n][cpu];
				System.out.printf("You : %s\nCPU : %s\n%s\n", RPS[n], RPS[cpu], Result[r + 1]);
			}
		} catch (Exception e) {
			System.out.println("error");
		}
	}
}
