package kopo38_swc08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class kopo38_P08 {

	public static void main(String[] args) throws IOException {
		// try-catch 대신 throws를 이용, IOException을 무시하도록 설정한다.
		File kopo38_f = new File("C:\\Users\\yunhyun jo\\Documents\\kopo38_swc08_data\\day_data\\kopo38_THTSKS010H00.dat");
		// File을 불러와 파일 경로를 통해 대상 파일을 지정한다.
		BufferedReader kopo38_br = new BufferedReader(new FileReader(kopo38_f));
		// BufferedReader를 불러와 파일 읽기를 한다.
		File kopo38_f1 = new File("C:\\Users\\yunhyun jo\\Documents\\kopo38_swc08_data\\day_data\\kopo38_StockDailyPrice.csv");
		// File을 불러와 파일 경로를 통해 대상 파일을 지정한다.
		BufferedWriter kopo38_bw1 = new BufferedWriter(new FileWriter(kopo38_f1));
		// BufferedWriter를 불러와 파일 쓰기를 한다.
		String kopo38_readtxt;
		int kopo38_cnt = 0;
		int kopo38_wcnt = 0;
		// String kopo38_readtxt를 설정하고 정수 kopo38_cnt와 kopo38_wcnt를 0으로 설정한다.
		while ((kopo38_readtxt = kopo38_br.readLine()) != null) {
			// String kopo38_readtxt를 대상 파일을 한 줄 씩 읽어오는 것으로 설정하고
			// 그 값이 null이 될 때까지 반복한다.
			StringBuffer kopo38_s = new StringBuffer();
			// StringBuffer를 불러온다.
			String[] kopo38_field = kopo38_readtxt.split("%_%");
			// String열 kopo38_field를 kopo38_readtxt를 %_%로 나눈 값으로 설정.
			if (kopo38_field.length > 2 && kopo38_field[2].replace("^", "").trim().substring(0, 1).equals("A")) {
				// kopo38_field의 길이가 2보다 크고, kopo38_field의 두번째 항의 "^"를 ""로 교체하면서
				// trim으로 kopo38_field 양옆의 공백을 제거한다. 이후 1번째 문자가 "A"와 같으면...
				kopo38_s.append(kopo38_field[0].replace("^", "").trim());
				// 0번째 항목의 "^"를 ""로 교체하고 양옆의 공백을 제거한다.
				// 해당 항목을 문장에 추가한다.
				for (int kopo38_j = 1; kopo38_j < kopo38_field.length; kopo38_j++) {
					kopo38_s.append("," + kopo38_field[kopo38_j].replace("^", "").trim());
				}
				// 1부터 시작해 kopo38_field의 길이까지 향하는 정수 kopo38_j에 대해 문장에 "^"를 ""로 교체하고
				// 양쪽 공백을 제거한 kopo38_field의 항목을 지정 형식으로 추가한다.
				kopo38_bw1.write(kopo38_s.toString());
				// 문장을 csv파일에 쓴다.
				kopo38_bw1.newLine();
				// 새 문장을 입력한다.
				kopo38_wcnt++;
				// kopo38_wcnt에 1을 더한다.(카운트)
			}
			kopo38_cnt++;
			// kopo38_cnt에 1을 더한다.(카운트)
		}
		kopo38_br.close();
		kopo38_bw1.close();
		// BufferedReader와 BufferedWriter를 닫는다.
		System.out.printf("Program End[%d][%d]records\n", kopo38_cnt, kopo38_wcnt);
		// 지정한 형식으로 카운트를 출력한다.
	}

}
