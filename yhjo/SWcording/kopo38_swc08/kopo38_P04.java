package kopo38_swc08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class kopo38_P04 {

	public static void main(String[] args) throws IOException {
		// try-catch 대신 throws를 이용, IOException을 무시하도록 설정한다.
		File kopo38_f = new File("C:\\Users\\yunhyun jo\\Documents\\kopo38_swc08_data\\kopo38_무료와이파이정보.csv");
		// File을 불러와 파일 경로를 통해 대상 파일을 지정한다.
		BufferedReader kopo38_br = new BufferedReader(new FileReader(kopo38_f));
		// BufferedReader를 불러와 파일 읽기를 한다.
		String kopo38_readtxt;
		if ((kopo38_readtxt = kopo38_br.readLine()) == null) {
			System.out.printf("빈 파일입니다\n");
		}
		// String kopo38_readtxt를 대상 파일을 한 줄 씩 읽어오는 것으로 설정하고 그 값이 null이면
		// 내용을 출력한다.
		String[] kopo38_field_name = kopo38_readtxt.split(",");
		// 문자열 kopo38_field_name를 kopo38_readtxt(파일의 첫 줄)을 ","로 자른 것으로 설정한다.
		double kopo38_lat = 37.3860521;
		double kopo38_lng = 127.1214038;
		// double kopo38_lat과 kopo38_lng를 각각 설정한다.
		int kopo38_LineCnt = 0;
		// 정수 kopo38_LineCnt를 0으로 설정한다.
		while ((kopo38_readtxt = kopo38_br.readLine()) != null) {
			// String kopo38_readtxt를 대상 파일을 한 줄 씩 읽어오는 것으로 설정하고
			// (첫 줄은 앞에서 읽어왔으므로 그 다음줄부터)
			// 그 값이 null이 될 때까지 반복한다.
			kopo38_LineCnt++;
			// kopo38_LineCnt에 1을 더한다.
			String[] kopo38_field = kopo38_readtxt.split(",");
			// 문자열 kopo38_field를 kopo38_readtxt(파일의 첫 줄)을 ","로 자른 것으로 설정한다.
			System.out.printf("**[%d번째 항목]**************\n", kopo38_LineCnt);
			System.out.printf(" %s : %s\n", kopo38_field_name[9], kopo38_field[9]);
			System.out.printf(" %s : %s\n", kopo38_field_name[13], kopo38_field[13]);
			System.out.printf(" %s : %s\n", kopo38_field_name[14], kopo38_field[14]);
			// kopo38_field_name과 kopo38_field의 9번째 13번째, 14번째 내용을 출력한다.
			double kopo38_dist = Math.sqrt(Math.pow(Double.parseDouble(kopo38_field[13]) - kopo38_lat, 2)
					+ Math.pow(Double.parseDouble(kopo38_field[14]) - kopo38_lng, 2));
			System.out.printf(" 현재지점과의 거리 : %f\n", kopo38_dist);
			System.out.printf("*******************************\n");
			// 위에서 지정한 kopo38_lat과 kopo38_lng를 기본 위치의 위도와 경도로 사용하여
			// double kopo38_dist를 피타고라스 정리를 이용한 항목과의 거리로 설정하여 출력한다.

		}
		kopo38_br.close();
		// BufferedReader를 닫는다.
	}
}
