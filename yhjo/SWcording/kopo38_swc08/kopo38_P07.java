package kopo38_swc08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class kopo38_P07 {

	public static void main(String[] args) throws IOException {
		// try-catch 대신 throws를 이용, IOException을 무시하도록 설정한다.
		File f = new File("C:\\Users\\yunhyun jo\\Documents\\kopo38_swc08_data\\day_data\\kopo38_THTSKS010H00.dat");
		// File을 불러와 파일 경로를 통해 대상 파일을 지정한다.
		BufferedReader br = new BufferedReader(new FileReader(f));
		// BufferedReader를 불러와 파일 읽기를 한다.
		String readtxt;
		int LineCnt = 0;
		int n = -1;
		// String kopo38_readtxt를 생성, 정수 kopo38_LineCnt를 0으로, 정수 kopo38_n을 -1로 설정한다.
		StringBuffer s = new StringBuffer();
		// StringBuffer를 불러온다.
		while (true) {
			// break까지 무한 반복
			char[] ch = new char[1000];
			n = br.read(ch);
			// 크기가 1000인 문자열 kopo38_ch를 설정한다.
			// kopo38_ch를 BufferReader로 읽을 때 
			if (n == -1)
				break;
			// kopo38_n이 -1이면(더이상 불러올 값이 없으면) break
			for (char c : ch) {
				// kopo38_ch의 문자를 하나씩 불러와 kopo38_c로 설정
				if (c == '\n') {
					System.out.printf("[%s]***\n", s.toString());
					s.delete(0, s.length());
					// kopo38_c가 '\n'이면 kopo38_s를 String으로 전환하여 지정된 내용으로 출력한다.
					// 이후 초기화를 위해 전체 내용을 삭제한다.
				} else {
					s.append(c);
					// 이외의 경우 kopo38_c를 kopo38_s에 더한다.(한글자씩 더함)
				}
			}
			LineCnt++;
			// kopo38_LineCnt에 1을 더한다.(카운트)
		}
		System.out.printf("[%s]***\n", s.toString());
		// 마지막행을 출력한다.
		br.close();
		// BufferedReader을 닫는다.
	}

}
