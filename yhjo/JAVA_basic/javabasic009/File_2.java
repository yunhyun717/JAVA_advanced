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

public class File_2 {

	public static void main(String[] args) throws IOException {
		
		String path = "sdafjkl";
		String Path = "C:\\Users\\yunhyun jo\\Desktop\\"+path;
		File file = new File(Path);
		file.mkdir();
		System.out.println(file.exists());
		if (file.exists()) {
			file.delete();
		}
		System.out.println(file.exists());
	}
}