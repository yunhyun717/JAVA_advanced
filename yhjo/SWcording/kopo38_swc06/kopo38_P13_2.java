package kopo38_swc06;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class kopo38_P13_2 {

	public static void main(String[] args) {
		int kopo38_iPerson = 30;

		kopo38_InputData kopo38_inData = new kopo38_InputData(kopo38_iPerson);
		Calendar kopo38_calendar = Calendar.getInstance();
		SimpleDateFormat kopo38_sdf = new SimpleDateFormat("YYYY.M.d HH:mm:ss");
		// 클래스에서 사용할 메소드를 불러온다.

		for (int kopo38_i = 0; kopo38_i < kopo38_iPerson; kopo38_i++) {
			String kopo38_name = String.format("홍길%02d", kopo38_i);
			int kopo38_kor = (int) (Math.random() * 100);
			int kopo38_eng = (int) (Math.random() * 100);
			int kopo38_mat = (int) (Math.random() * 100);
			kopo38_inData.kopo38_setData(kopo38_i, kopo38_name, kopo38_kor, kopo38_eng, kopo38_mat);
		}
		// 이전과 같이 내용을 입력한다.

		System.out.printf("%25s\n", "성적집계표");
		System.out.printf("%49s\n", "출력일자 : " + kopo38_sdf.format(kopo38_calendar.getTime()));
		System.out.printf("=====================================================\n");
		System.out.printf("번호  이름     국어   영어   수학   총점      평균\n", kopo38_sdf.format(kopo38_calendar.getTime()));
		System.out.printf("=====================================================\n");
		// 지정한 형식으로 내용을 출력한다.
		int kopo38_kor_sum = 0;
		int kopo38_eng_sum = 0;
		int kopo38_mat_sum = 0;
		// 각 과목의 합에 초기값을 설정한다.
		for (int kopo38_i = 0; kopo38_i < kopo38_iPerson; kopo38_i++) {
			System.out.printf("%03d%7s%7d%7d%7d%7d%13.6f\n", kopo38_i + 1, kopo38_inData.kopo38_name[kopo38_i],
					kopo38_inData.kopo38_kor[kopo38_i], kopo38_inData.kopo38_eng[kopo38_i],
					kopo38_inData.kopo38_mat[kopo38_i], kopo38_inData.kopo38_sum[kopo38_i],
					kopo38_inData.kopo38_ave[kopo38_i]);
			kopo38_kor_sum += kopo38_inData.kopo38_kor[kopo38_i];
			kopo38_eng_sum += kopo38_inData.kopo38_eng[kopo38_i];
			kopo38_mat_sum += kopo38_inData.kopo38_mat[kopo38_i];
		}
		// 0부터 시작해 kopo38_iPerson보다 작은 정수 kopo38_i에 대해
		// 내용을 출력하고 각 과목 점수의 합에 해당 과목 점수를 더해준다.
		System.out.printf("=====================================================\n");
		System.out.printf("합계    %11d%7d%7d%7d%13.6f\n", kopo38_kor_sum, kopo38_eng_sum, kopo38_mat_sum,
				(kopo38_kor_sum + kopo38_eng_sum + kopo38_mat_sum),
				((kopo38_kor_sum + kopo38_eng_sum + kopo38_mat_sum) / 3.0));
		System.out.printf("평균    %11.2f%7.2f%7.2f%7.2f%13.6f\n", kopo38_kor_sum / 30.0, kopo38_eng_sum / 30.0,
				kopo38_mat_sum / 30.0, (kopo38_kor_sum + kopo38_eng_sum + kopo38_mat_sum) / 30.0,
				((kopo38_kor_sum + kopo38_eng_sum + kopo38_mat_sum) / 3.0) / 30.0);
		// 각 과목의 총합을 이용해 내용을 출력한다.
	}
}
