package kopo38_swc06;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class kopo38_P13_3 {

	public static void main(String[] args) {
		int kopo38_iPerson = 200;

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
		int kopo38_page = 1;
		// 페이지 변수를 설정한다.
		int kopo38_nums = 30;
		// 한 페이지에 출력될 학생의 수를 kopo38_nums로 설정한다.
		int kopo38_kor_sum_all = 0;
		int kopo38_eng_sum_all = 0;
		int kopo38_mat_sum_all = 0;
		// 각 과목의 총합에 초기값을 부여한다.
		for (int kopo38_i = 0; kopo38_i < kopo38_iPerson; kopo38_i += kopo38_nums) {
			// 0부터 시작해 총 인원수보다 작으며 kopo38_nums만큼 커지는 정수 kopo38_i에 대해
			System.out.printf("%25s\n", "성적집계표");
			System.out.printf("%-9s%40s\n", "Page : " + kopo38_page,
					"출력일자 : " + kopo38_sdf.format(kopo38_calendar.getTime()));
			System.out.printf("=====================================================\n");
			System.out.printf("번호  이름     국어   영어   수학   총점      평균\n", kopo38_sdf.format(kopo38_calendar.getTime()));
			System.out.printf("=====================================================\n");
			// 지정된 내용을 출력한다.
			int kopo38_kor_sum = 0;
			int kopo38_eng_sum = 0;
			int kopo38_mat_sum = 0;
			// 각 과목의 페이지 합에 초기값을 부여한다.
			if (kopo38_i == (kopo38_iPerson - kopo38_iPerson % kopo38_nums)) {
				kopo38_nums = kopo38_iPerson % kopo38_nums;
			}
			// kopo38_i가 총인원수를 페이지당 표시 학생수로 나눴을 때의 나머지를 총인원수에서 제외한 값과 같아졌을 때,
			// ( kopo38_i가 최대값에 도달했을 때)
			// kopo38_nums를 총인원수를 페이지당 표시 학생수로 나눈 나머지로 설정한다.

			for (int kopo38_j = kopo38_i; kopo38_j < kopo38_i + kopo38_nums; kopo38_j++) {
				// kopo38_i부터 시작해 kopo38_i + kopo38_nums보다 작은 정수 kopo38_j에 대해
				System.out.printf("%03d%7s%7d%7d%7d%7d%13.6f\n", kopo38_j + 1, kopo38_inData.kopo38_name[kopo38_j],
						kopo38_inData.kopo38_kor[kopo38_j], kopo38_inData.kopo38_eng[kopo38_j],
						kopo38_inData.kopo38_mat[kopo38_j], kopo38_inData.kopo38_sum[kopo38_j],
						kopo38_inData.kopo38_ave[kopo38_j]);
				kopo38_kor_sum += kopo38_inData.kopo38_kor[kopo38_j];
				kopo38_eng_sum += kopo38_inData.kopo38_eng[kopo38_j];
				kopo38_mat_sum += kopo38_inData.kopo38_mat[kopo38_j];
				// 내용을 출력하고 각 과목 점수의 합에 해당 과목 점수를 더해준다.
			}
			System.out.printf("=====================================================\n");
			System.out.printf("현재페이지\n");
			System.out.printf("합계    %11d%7d%7d%7d%13.6f\n", kopo38_kor_sum, kopo38_eng_sum, kopo38_mat_sum,
					(kopo38_kor_sum + kopo38_eng_sum + kopo38_mat_sum),
					((kopo38_kor_sum + kopo38_eng_sum + kopo38_mat_sum) / 3.0));
			System.out.printf("평균    %11.2f%7.2f%7.2f%7.2f%13.6f\n", kopo38_kor_sum / (double) kopo38_nums,
					kopo38_eng_sum / (double) kopo38_nums, kopo38_mat_sum / (double) kopo38_nums,
					(kopo38_kor_sum + kopo38_eng_sum + kopo38_mat_sum) / (double) kopo38_nums,
					((kopo38_kor_sum + kopo38_eng_sum + kopo38_mat_sum) / 3.0) / (double) kopo38_nums);
			kopo38_kor_sum_all += kopo38_kor_sum;
			kopo38_eng_sum_all += kopo38_eng_sum;
			kopo38_mat_sum_all += kopo38_mat_sum;
			// 각 과목의 페이지 합을 이용해 내용을 출력한다.
			// 각 과목의 페이지 합을 더해 각 과목의 누적 합을 설정한다.
			System.out.printf("=====================================================\n");
			System.out.printf("누적페이지\n");
			System.out.printf("합계    %11d%7d%7d%7d%13.6f\n", kopo38_kor_sum_all, kopo38_eng_sum_all, kopo38_mat_sum_all,
					(kopo38_kor_sum_all + kopo38_eng_sum_all + kopo38_mat_sum_all),
					((kopo38_kor_sum_all + kopo38_eng_sum_all + kopo38_mat_sum_all) / 3.0));
			System.out.printf("평균    %11.2f%7.2f%7.2f%7.2f%13.6f\n",
					(kopo38_kor_sum_all / (double) (kopo38_i + kopo38_nums)),
					(kopo38_eng_sum_all / (double) (kopo38_i + kopo38_nums)),
					(kopo38_mat_sum_all / (double) (kopo38_i + kopo38_nums)),
					((kopo38_kor_sum_all + kopo38_eng_sum_all + kopo38_mat_sum_all)
							/ (double) (kopo38_i + kopo38_nums)),
					(((kopo38_kor_sum_all + kopo38_eng_sum_all + kopo38_mat_sum_all) / 3.0)
							/ ((double) (kopo38_i + kopo38_nums))));
			// 각 과목의 누적 합을 이용해 내용을 출력한다.
			kopo38_page++;
			// 페이지에 1을 더한다.
		}
	}
}
