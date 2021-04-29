package javabasic_Review;

import java.util.ArrayList;

public class P6_2 {

	public static void main(String[] args) {
		String[][] temp = new String[8][8];

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				temp[i][j] = (j + 2) + "X" + (i + 2) + "=" + (j + 2) * (i + 2);
				System.out.printf("%s\t", temp[i][j]);
			}
			System.out.println();

		}
	}

}
