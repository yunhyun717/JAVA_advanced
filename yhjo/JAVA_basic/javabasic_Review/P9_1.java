package javabasic_Review;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P9_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\yunhyun jo\\Desktop\\data.csv"));
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		String line = "";
		while ((line = reader.readLine()) != null) {
			String[] temp = line.split(",");
			if (temp[4].equals("³ó±¸")) {
				num1++;
			} else if (temp[4].equals("¹è±¸")) {
				num2++;
			} else if (temp[4].equals("ºù»ó")) {
				num3++;
			}
		}
		System.out.printf("³ó±¸ : %d, ¹è±¸ : %d, ºù»ó : %d", num1, num2, num3);
	}
}