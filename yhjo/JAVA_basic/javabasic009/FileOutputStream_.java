package javabasic009;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.TimeZone;

public class FileOutputStream_ {

	public static void main(String[] args) throws IOException {
		FileOutputStream output = new FileOutputStream("C:\\Users\\yunhyun jo\\Desktop\\out.csv");
		for (int i = 1; i < 11; i++) {
			String data = "Line #" + i + "\n";
			output.write(data.getBytes());
		}
		output.close();
	}
}