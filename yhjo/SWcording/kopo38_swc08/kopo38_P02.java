package kopo38_swc08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class kopo38_P02 {

	public static void kopo38_FileWrite() throws IOException {
		// try-catch 대신 throws를 이용, IOException을 무시하도록 설정한다.
		File kopo38_f = new File("C:\\Users\\yunhyun jo\\Documents\\kopo38_swc08_data\\k38_Mytest.txt");
		// File을 불러와 파일 경로를 통해 대상 파일을 지정한다.
		BufferedWriter kopo38_bw = new BufferedWriter(new FileWriter(kopo38_f));
		// BufferedWriter를 불러와 파일 쓰기를 한다.
		// 일정 이상의 파일을 기록할 때는 BufferedWriter와 FileWriter를 같이 쓰는 것이 빠르다.
		kopo38_bw.write("안녕 파일");
		kopo38_bw.newLine();
		kopo38_bw.write("hello 헬로");
		kopo38_bw.newLine();
		// BufferedWriter를 이용해 내용을 작성한다. newLine으로 새 줄을 추가한다.
		kopo38_bw.close();
		// BufferedWriter를 닫는다.
	}

	public static void kopo38_FileRead() throws IOException {
		File kopo38_f = new File("C:\\Users\\yunhyun jo\\Documents\\kopo38_swc08_data\\k38_Mytest.txt");
		// File을 불러와 파일 경로를 통해 대상 파일을 지정한다.
		BufferedReader kopo38_br = new BufferedReader(new FileReader(kopo38_f));
		// BufferedReader를 불러와 파일 읽기를 한다.
		// 일정 이상의 파일을 읽을 때는 BufferedReader와 FileReader를 같이 쓰는 것이 빠르다.
		String kopo38_readtxt;
		while ((kopo38_readtxt = kopo38_br.readLine()) != null) {
			System.out.printf("%s\n", kopo38_readtxt);
		}
		// String kopo38_readtxt를 대상 파일을 한 줄 씩 읽어오는 것으로 설정하고 그 값이 null이 될 때까지
		// kopo38_readtxt를 출력한다.
		kopo38_br.close();
		// BufferedReader를 닫는다.
	}

	public static void main(String[] args) throws IOException {
		kopo38_FileWrite();
		kopo38_FileRead();
	}
	// main에서 kopo38_FileWrite와 kopo38_FileRead를 실행한다.
}
