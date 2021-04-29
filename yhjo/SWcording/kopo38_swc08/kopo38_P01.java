package kopo38_swc08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class kopo38_P01 {

	public static void main(String[] args) {
		try {
			// Exception 오류가 발생해도 처리하고 진행할 수 있는 try-catch를 사용
			File kopo38_f = new File("C:\\Users\\yunhyun jo\\Documents\\kopo38_swc08_data\\k38_Mytest.txt");
			// File을 불러와 파일 경로를 통해 대상 파일을 지정한다.
			FileWriter kopo38_fw = new FileWriter(kopo38_f);
			// FilwWriter를 불러와 대상 파일에 내용을 작성할 수 있게한다.
			kopo38_fw.write("안녕 파일\n");
			kopo38_fw.write("hello 헬로\n");
			// write로 내용을 작성한다.
			kopo38_fw.close();
			// FileWriter를 불러온 후 닫아줘야 이후에 쓸 수 있다.
			FileReader kopo38_fr = new FileReader(kopo38_f);
			// FileReader를 불러와 대상 파일을 읽을 수 있게 한다.
			int kopo38_n = -1;
			char[] kopo38_ch;
			// 정수 kopo38_n을 -1로 지정하고, 문자 배열 kopo38_ch를 생성한다.
			while (true) {
				// break까지 무한 반복
				kopo38_ch = new char[100];
				// 문자 배열 kopo38_ch를 100개까지의 문자가 들어갈 수 있게 설정한다.
				kopo38_n = kopo38_fr.read(kopo38_ch);
				// FileReader에서 read는 kopo38_ch에서 불러온 문자의 수를 return한다.
				// 문자가 없으면 -1을 return하며, 정수 kopo38_n을 이 값으로 한다.
				if (kopo38_n == -1)
					break;
				// 정수 kopo38_n이 -1이면 break
				for (int i = 0; i < kopo38_n; i++) {
					System.out.printf("%c", kopo38_ch[i]);
				}
				// 0부터 시작해 kopo38_n보다 작은 정수 kopo38_i에 대해 kopo38_ch[kopo38_i]를 출력
			}
			kopo38_fr.close();
			// FileReader를 닫는다.
			System.out.printf("\n FILE READ END ");
		} catch (Exception e) {
			System.out.printf("나 에러[%s]\n", e);
			// Exception이 발생하면 내용을 출력한다.
		}
	}
}
