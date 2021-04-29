package javabasic009;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.TimeZone;

public class FileInputStream_ {

	public static void main(String[] args) throws IOException {
		byte[] content = new byte[1000];
		FileInputStream input = new FileInputStream("C:\\Users\\yunhyun jo\\Desktop\\data.csv");

		input.read(content);
		String allLine = new String(content);
		System.out.println(allLine);

		input.close();
	}
} 