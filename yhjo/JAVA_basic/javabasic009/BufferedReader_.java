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

public class BufferedReader_ {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\yunhyun jo\\Desktop\\in2.txt"));
		String line;
		while ((line = reader.readLine()) != null) {
		System.out.println(line);	
		}
	}
} 