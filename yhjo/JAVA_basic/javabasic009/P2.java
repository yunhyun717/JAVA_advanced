package javabasic009;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.TimeZone;

public class P2 {

	public static void main(String[] args) throws IOException {
		File dir = new File("C:\\Users\\yunhyun jo\\Desktop");
		File files[] = dir.listFiles();
		
		for (int i = 0;i<files.length; i++) {
			System.out.println(files[i]);
		}
	}
}