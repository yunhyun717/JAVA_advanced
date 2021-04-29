package kopo38_swc07;

import java.util.ArrayList;

public class kopo38_P09_2 {

	static ArrayList<kopo38_P09_1> kopo38_ArrayOneRec = new ArrayList<kopo38_P09_1>();
	// ArrayList를 생성

	static int kopo38_sumkor = 0;
	static int kopo38_sumeng = 0;
	static int kopo38_summat = 0;
	static int kopo38_sumsum = 0;
	static int kopo38_sumave = 0;
	// 누적 변수를 생성하고 초기값을 설정한다.
	static final int kopo38_iPerson = 20;
	// 생성할 학생 수를 설정한다.

	public static void kopo38_dataSet() {
		for (int kopo38_i = 0; kopo38_i < kopo38_iPerson; kopo38_i++) {
			String kopo38_name = String.format("홍길%02d", kopo38_i);
			int kopo38_kor = (int) (Math.random() * 100);
			int kopo38_eng = (int) (Math.random() * 100);
			int kopo38_mat = (int) (Math.random() * 100);
			kopo38_ArrayOneRec.add(new kopo38_P09_1(kopo38_i, kopo38_name, kopo38_kor, kopo38_eng, kopo38_mat));
		}
		// 학생 수에 맞춰 번호, 이름을 순서대로 입력하고, 국어/영어/수학 점수를 random으로 생성하여 kopo38_P09_1 클래스에 입력하고
		// ArrayList에 추가한다.
	}

	public static void kopo38_HeaderPrint() {
		System.out.printf("****************************************\n");
		System.out.printf("%2s %4s %2s %2s %2s %2s   %2s\n", "번호", "이름", "국어", "영어", "수학", "합계", "평균");
		System.out.printf("****************************************\n");
	}
	// 최종 출력되는 부분의 목록 부분을 설정한다.

	public static void kopo38_ItemPrint(int kopo38_i) {
		// 내용을 출력하는 메소드를 설정한다.
		kopo38_P09_1 kopo38_p09;
		kopo38_p09 = kopo38_ArrayOneRec.get(kopo38_i);
		// kopo38_P09_1 메소드를 선언하고 ArrayList에서 입력된 정수 인자번째의 클래스를 불러온다.
		System.out.printf("%4d %4s %3d  %3d  %3d  %3d  %6.2f\n", kopo38_p09.kopo38_student_id(),
				kopo38_p09.kopo38_name(), kopo38_p09.kopo38_kor(), kopo38_p09.kopo38_eng(), kopo38_p09.kopo38_mat(),
				kopo38_p09.kopo38_sum(), kopo38_p09.kopo38_ave());
		kopo38_sumkor += kopo38_p09.kopo38_kor();
		kopo38_sumeng += kopo38_p09.kopo38_eng();
		kopo38_summat += kopo38_p09.kopo38_mat();
		kopo38_sumsum += kopo38_p09.kopo38_sum();
		kopo38_sumave += kopo38_p09.kopo38_ave();
		// 클래스의 메소드를 이용해 내용을 출력하고 누적 변수에 각 값을 더해준다.
	}

	public static void kopo38_TailPrint() {
		System.out.printf("****************************************\n");
		System.out.printf("    국어합계 %4.4s   국어평균: %6.2f\n", kopo38_sumkor,
				kopo38_sumkor / (double) kopo38_ArrayOneRec.size());
		System.out.printf("    영어합계 %4.4s   영어평균: %6.2f\n", kopo38_sumeng,
				kopo38_sumeng / (double) kopo38_ArrayOneRec.size());
		System.out.printf("    수학합계 %4.4s   수학평균: %6.2f\n", kopo38_summat,
				kopo38_summat / (double) kopo38_ArrayOneRec.size());
		System.out.printf("****************************************\n");
		System.out.printf("    반평균합계 %d   반평균: %6.2f\n", kopo38_sumave,
				kopo38_sumave / (double) kopo38_ArrayOneRec.size());
	}
	// 누적 변수를 이용해 최종 출력되는 부분의 하단 부분을 설정한다.

	public static void main(String[] args) {
		kopo38_dataSet();
		kopo38_HeaderPrint();
		for (int kopo38_i = 0; kopo38_i < kopo38_ArrayOneRec.size(); kopo38_i++) {
			kopo38_ItemPrint(kopo38_i);
		}
		kopo38_TailPrint();
		// 메인에는 메소드 실행부분만 남긴다.
	}
}
