package javabasic009;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.TimeZone;

public class Example1 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\yunhyun jo\\Desktop\\data.csv"));
		String line;
		int n = 0;
		while ((line = reader.readLine()) != null) {
			n++;
		}
		int[][] data = new int[n-1][6];
		n=0;
		reader.readLine();
		while ((line = reader.readLine()) != null) {
			for (int i=0;i<6;i++) {
			data[n][i]=Integer.parseInt(line.split(",")[i+2]);
			n++;
		}
		System.out.println(data[0][0]);
	}
}
}