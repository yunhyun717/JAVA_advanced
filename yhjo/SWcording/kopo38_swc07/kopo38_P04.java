package kopo38_swc07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class kopo38_P04 {
	static File kopo38_file;
	static BufferedReader kopo38_br;
	// 각각의 메소드를 선언해준다.(File = 파일 관련, BufferedReader = 파일 읽기)
	static String kopo38_temp;
	// String 설정
	
	public static void main(String[] args) throws IOException {
		kopo38_file = new File("C:\\Users\\yunhyun jo\\Desktop\\data.csv");
		// 파일 경로를 설정한다.
		kopo38_br = new BufferedReader(new FileReader(kopo38_file));
		// 해당 파일 경로의 파일을 읽도록 한다.
		String [] field_name = kopo38_br.readLine().split(",");
		// 파일의 첫 줄(목록)을 읽고 ","로 split해 배열로 설정한다.
		while ((kopo38_temp = kopo38_br.readLine()) != null) {
			// 파일을 한 줄 씩 읽으면서 읽어오는 값이 null이 될 때 까지 읽어오면서 내용을 반복한다.
			String[] field = kopo38_temp.split(",");
			// 읽어온 내용을 ","로 split하여 배열로 설정한다.
			System.out.printf("***********************\n");
			for (int j = 0; j < field_name.length; j++) {
				System.out.printf("%s : %s\n", field_name[j], field[j]);
			}
			// 목록값과 읽어온 내용이 쌍을 이뤄 출력되도록 설정한다.
			System.out.printf("***********************\n");
		}

	}
}
	