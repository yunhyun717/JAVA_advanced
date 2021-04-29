package kopo38_swc07;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class kopo38_P09_3 {

	static Calendar kopo38_calendar = Calendar.getInstance();
	static SimpleDateFormat kopo38_sdf = new SimpleDateFormat("YYYY.M.d HH:mm:ss");
	static ArrayList<kopo38_P09_1> kopo38_ArrayOneRec = new ArrayList<kopo38_P09_1>();
	// 클래스에서 사용할 메소드와 ArrayList를 불러온다.

	static int kopo38_pages = 0;
	static int kopo38_nums = 30;
	static int kopo38_sumkor = 0;
	static int kopo38_sumeng = 0;
	static int kopo38_summat = 0;
	static int kopo38_sumsum = 0;
	static int kopo38_sumave = 0;
	static int kopo38_sumkorall = 0;
	static int kopo38_sumengall = 0;
	static int kopo38_summatall = 0;
	static int kopo38_sumsumall = 0;
	static int kopo38_sumaveall = 0;
	static final int kopo38_iPerson = 200;
	// 클래스에서 사용할 변수를 설정한다.(kopo38_nusm : 한 페이지에 출력될 학생 수)

	public static void kopo38_dataSet() {
		for (int kopo38_i = 0; kopo38_i < kopo38_iPerson; kopo38_i++) {
			String kopo38_name = String.format("홍길%02d", kopo38_i + 1);
			int kopo38_kor = (int) (Math.random() * 100);
			int kopo38_eng = (int) (Math.random() * 100);
			int kopo38_mat = (int) (Math.random() * 100);
			kopo38_ArrayOneRec.add(new kopo38_P09_1(kopo38_i + 1, kopo38_name, kopo38_kor, kopo38_eng, kopo38_mat));
		}
	}
	// 이전과 마찬가지로 학생 수 만큼 학번, 학생명, 국어/영어/수학 성적을 생성하여 클래스에 입력 후
	// 해당 클래스를 ArrayList에 저장한다.

	public static void kopo38_HeaderPrint() {
		kopo38_pages++;
		System.out.printf("%25s\n", "성적집계표");
		System.out.printf("%-9s%37s\n", "Page : " + kopo38_pages,
				"출력일자 : " + kopo38_sdf.format(kopo38_calendar.getTime()));
		System.out.printf("==================================================\n");
		System.out.printf("%2s%3s%7s%5s%5s%7s%7s\n", "번호", "이름", "국어", "영어", "수학", "합계", "평균");
		System.out.printf("==================================================\n");
	}
	// 최종 출력의 목록부분을 출력하는 메소드

	public static void kopo38_ItemPrint(int kopo38_i) {
		kopo38_P09_1 kopo38_p09;
		kopo38_p09 = kopo38_ArrayOneRec.get(kopo38_i);
		System.out.printf("%03d %-5s%7d%7d%7d%8d%10.2f\n", kopo38_p09.kopo38_student_id(), kopo38_p09.kopo38_name(),
				kopo38_p09.kopo38_kor(), kopo38_p09.kopo38_eng(), kopo38_p09.kopo38_mat(), kopo38_p09.kopo38_sum(),
				kopo38_p09.kopo38_ave());
		kopo38_sumkor += kopo38_p09.kopo38_kor();
		kopo38_sumeng += kopo38_p09.kopo38_eng();
		kopo38_summat += kopo38_p09.kopo38_mat();
		kopo38_sumkorall += kopo38_p09.kopo38_kor();
		kopo38_sumengall += kopo38_p09.kopo38_eng();
		kopo38_summatall += kopo38_p09.kopo38_mat();
	}
	// 최종 출력의 내용을 출력하는 메소드. 페이지 누적 변수와 함께 총 누적 변수도 설정해준다.

	public static void kopo38_TailPrint(int kopo38_i) {
		System.out.printf("==================================================\n");
		System.out.printf("현재페이지\n");
		System.out.printf("합계%14s%7s%7s%8s%10.2f\n", kopo38_sumkor, kopo38_sumeng, kopo38_summat,
				kopo38_sumkor + kopo38_sumeng + kopo38_summat, (kopo38_sumkor + kopo38_sumeng + kopo38_summat) / 3.0);
		System.out.printf("평균%14.2f%7.2f%7.2f%8.2f%10.2f\n", kopo38_sumkor / (double) kopo38_nums,
				kopo38_sumeng / (double) kopo38_nums, kopo38_summat / (double) kopo38_nums,
				(kopo38_sumkor + kopo38_sumeng + kopo38_summat) / (double) kopo38_nums,
				(kopo38_sumkor + kopo38_sumeng + kopo38_summat) / 3.0 / (double) kopo38_nums);
		kopo38_sumkor = 0;
		kopo38_sumeng = 0;
		kopo38_summat = 0;
		System.out.printf("==================================================\n");
		System.out.printf("누적페이지\n");
		System.out.printf("합계%14s%7s%7s%8s%10.2f\n", kopo38_sumkorall, kopo38_sumengall, kopo38_summatall,
				kopo38_sumkorall + kopo38_sumengall + kopo38_summatall,
				(kopo38_sumkorall + kopo38_sumengall + kopo38_summatall) / 3.0);
		System.out.printf("평균%14.2f%7.2f%7.2f%8.2f%10.2f\n\n\n", kopo38_sumkorall / (double) (kopo38_i + kopo38_nums),
				kopo38_sumengall / (double) (kopo38_i + kopo38_nums),
				kopo38_summatall / (double) (kopo38_i + kopo38_nums),
				(kopo38_sumkorall + kopo38_sumengall + kopo38_summatall) / (double) (kopo38_i + kopo38_nums),
				(kopo38_sumkorall + kopo38_sumengall + kopo38_summatall) / 3.0 / (double) (kopo38_i + kopo38_nums));
	}
	// 최종 출력의 통계부분을 출력하는 메소드. 현재 페이지 통계와 누적 통계를 출력한다.

	public static void main(String[] args) {
		kopo38_dataSet();
		for (int kopo38_i = 0; kopo38_i < kopo38_ArrayOneRec.size(); kopo38_i += 30) {
			kopo38_HeaderPrint();
			if (kopo38_i == kopo38_ArrayOneRec.size() - kopo38_ArrayOneRec.size() % kopo38_nums) {
				kopo38_nums = kopo38_ArrayOneRec.size() % kopo38_nums;
			}
			for (int kopo38_j = kopo38_i; kopo38_j < kopo38_i + kopo38_nums; kopo38_j++) {
				kopo38_ItemPrint(kopo38_j);
			}
			kopo38_TailPrint(kopo38_i);
		}
	}
	// 최종 메인
	// 데이터를 생성하고 생성된 데이터를 설정한 페이지당 학생수에 따라 페이지를 출력한다.
	// 페이지당 학생수만큼 출력하다가 페이지당 학생수보다 남은 학생수가 적으면 그만큼 출력하도록 변경해 모두 출력한다.
	// 출력된 학생수에 따라 현재 페이지의 통계의 값(평균)에 영향을 주도록 한다.
}
