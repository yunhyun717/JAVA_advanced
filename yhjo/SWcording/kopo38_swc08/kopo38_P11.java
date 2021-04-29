package kopo38_swc08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class kopo38_P11 {

	public static void main(String[] args) throws IOException {
		// try-catch 대신 throws를 이용, IOException을 무시하도록 설정한다.
		File kopo38_f = new File(
				"C:\\Users\\yunhyun jo\\Documents\\kopo38_swc08_data\\day_data\\kopo38_SamsungStockPrice.csv");
		// File을 불러와 파일 경로를 통해 대상 파일을 지정한다.
		BufferedReader kopo38_br = new BufferedReader(new FileReader(kopo38_f));
		// BufferedReader를 불러와 파일 읽기를 한다.
		String kopo38_readtxt;
		int kopo38_cnt = 0;
		String kopo38_samsung_max_date = "";
		String kopo38_samsung_min_date = "";
		int kopo38_samsung_max_value = 0;
		int kopo38_samsung_min_value = 0;
		// String kopo38_readtxt를 설정하고 정수 kopo38_cnt를 0으로 설정한다.
		while ((kopo38_readtxt = kopo38_br.readLine()) != null) {
			// String kopo38_readtxt를 대상 파일을 한 줄 씩 읽어오는 것으로 설정하고
			// 그 값이 null이 될 때까지 반복한다.
			String[] kopo38_field = kopo38_readtxt.split(",");
			// String열 kopo38_field를 kopo38_readtxt를 ","로 나눈값으로 설정.
			if (kopo38_field[1].substring(0, 4).equals("2015")) {
				// kopo38_field의 첫번째 항목의 0부터 3번째 글자가 "2015"와 같으면(날짜가 2015년도이면)
				if (kopo38_cnt == 0) {
					kopo38_samsung_max_date = kopo38_field[1];
					kopo38_samsung_min_date = kopo38_field[1];
					kopo38_samsung_max_value = Integer.parseInt(kopo38_field[3]);
					kopo38_samsung_min_value = Integer.parseInt(kopo38_field[3]);
					// kopo38_samsung_max_date와 min_date를 kopo38_field[1]으로 설정한다.
					// kopo38_cnt가 0일 때 kopo38_samsung_max와 kopo38_samsung_min을
					// kopo38_field의 5번째 항목과 6번째 항목으로 각각 설정한다.(초기값 설정)
				} else {
					kopo38_samsung_max_value = Math.max(kopo38_samsung_max_value, Integer.parseInt(kopo38_field[3]));
					kopo38_samsung_min_value = Math.min(kopo38_samsung_min_value, Integer.parseInt(kopo38_field[3]));
					// 이외의 경우 kopo38_samsung_max와 kopo38_samsung_min을 각각 자기자신과
					// 읽어온 값 중 큰 것 또는 작은 것으로 설정한다.
					if (kopo38_samsung_max_value == Integer.parseInt(kopo38_field[3])) {
						kopo38_samsung_max_date = kopo38_field[1];
					} else if (kopo38_samsung_min_value == Integer.parseInt(kopo38_field[3])) {
						kopo38_samsung_min_date = kopo38_field[1];
					}
				}
				kopo38_cnt++;
				// kopo38_cnt에 1을 더한다.(카운트)
			}
		}
		System.out.printf("2015년 삼성 주가 : 총 %d건\n", kopo38_cnt);
		System.out.printf("2015년 최고가 : %d원 (%s)\n", kopo38_samsung_max_value, kopo38_samsung_max_date);
		System.out.printf("2015년 최저가 : %d원 (%s)\n", kopo38_samsung_min_value, kopo38_samsung_min_date);
		// 결과를 출력한다.
		kopo38_br.close();
		// BufferedReader와 BufferedWriter를 닫는다.
	}
}