package javabasic007;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		P7 p7 = new P7();
		while (true) {
			p7.gradecard();
		}
	}

	public void gradecard() {
		try {
			Scanner scan = new Scanner(System.in);
			String temp = scan.nextLine();
			String[] namescore = temp.split(",");
			String[][] name_score = new String[2][namescore.length];
			for (int i = 0; i < namescore.length; i++) {
				String[] temp1 = namescore[i].split(" ");
				name_score[0][i] = temp1[0];
				name_score[1][i] = temp1[1];
			}
			for (int i = 0; i < name_score.length; i++) {
				for (int j = 0; j < name_score[i].length; j++) {
					System.out.print(name_score[i][j] + "	");
				}
				System.out.println();
			}
			System.out.println();

			Arrays.sort(name_score[0]);
			System.out.println("list by name in ascending order");
			for (int i = 0; i < name_score.length; i++) {
				for (int j = 0; j < name_score[i].length; j++) {
					System.out.print(name_score[i][j] + "	");
				}
				System.out.println();
			}
			System.out.println();

			System.out.println("list by name in descending order");
			Arrays.sort(name_score[0], Collections.reverseOrder());
			for (int i = 0; i < name_score.length; i++) {
				for (int j = 0; j < name_score[i].length; j++) {
					System.out.print(name_score[i][j] + "	");
				}
				System.out.println();
			}
			System.out.println();

			System.out.println("list by score in ascending order");
			Arrays.sort(name_score[1]);
			for (int i = 0; i < name_score.length; i++) {
				for (int j = 0; j < name_score[i].length; j++) {
					System.out.print(name_score[i][j] + "	");
				}
				System.out.println();
			}
			System.out.println();

			System.out.println("list by score in descending order");
			Arrays.sort(name_score[1], Collections.reverseOrder());
			for (int i = 0; i < name_score.length; i++) {
				for (int j = 0; j < name_score[i].length; j++) {
					System.out.print(name_score[i][j] + "	");
				}
				System.out.println();
			}
			System.out.println();

		} catch (

		Exception e) {
			System.out.println("error");

		}

	}
}