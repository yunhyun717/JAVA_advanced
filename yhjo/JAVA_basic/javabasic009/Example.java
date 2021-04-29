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

public class Example {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\yunhyun jo\\Desktop\\data.csv"));
		String line;
		Integer[][] data = new Integer[2743][6];
		reader.readLine();
		int Totalaccidents = 0;
		while ((line = reader.readLine()) != null) {
			int n = 2742;
			for (int i = 2; i < 8; i++) {
				String[] intd = line.split(",");
				data[n][i - 2] = Integer.parseInt(intd[i]);
			}
			n--;
		}
		for (int i=0;i<6;i++) {
			System.out.print(data[0][i]+" ");
		}
		
		for (int i = 0; i < data.length; i++) {
			Totalaccidents = Totalaccidents + data[i][0];
		}
		
		System.out.print("Total number of accidents = " + Totalaccidents + "\n");
		System.out.print("Average number of accidents = ");
		System.out.print("Total number of deads = ");
		System.out.print("Average number of deads = ");
		System.out.print("Total number of serious injuries = ");
		System.out.print("Average number of serious injuries = ");

	}
}