package javabasic_Review;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class P9_2 {

	public static void main(String[] args) throws IOException {
		read();

	}

	public static void read() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\yunhyun jo\\Desktop\\data.csv"));
		ArrayList<Integer> data = new ArrayList<Integer>();
		String line = "";
		int sum = 0;
		double avg;
		int max = 0;
		int min = 1000000;
		reader.readLine();
		while ((line = reader.readLine()) != null) {
			data.add(Integer.parseInt(line.split("\",\"")[8]));
		}
		for (int i = 0; i < data.size(); i++) {
			sum += data.get(i);
			max = Math.max(max, data.get(i));
			min = Math.min(min, data.get(i));
		}
		avg = (double) sum / data.size();

		System.out.printf("2012~2013 ����/�б⺰ �Ϲ����ڱ� ���� �л��� :\n\n���� : %d��\t��� : %f��\n�ִ� : %d��\t�ּ� : %d��", sum, avg, max, min);

	}
}