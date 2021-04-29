package kopo38_swc07;

public class kopo38_P06_2 {

	public static void main(String[] args) {
		int kopo38_iPerson = 10;
		// 정수 kopo38_iPerson을 설정한다.
		kopo38_P06_1[] kopo38_inData = new kopo38_P06_1[kopo38_iPerson];
		kopo38_inData[0] = new kopo38_P06_1("홍길01", 100, 100, 90);
		// kopo38_P06_1을 성분으로 갖는 배열을 생성하고 첫번째 성분을 인자를 넣어서 입력한다.
		// (성분이 클래스이므로 클래스가 요구하는 인자를 넣어서 생성한 후 입력)

		for (int kopo38_i = 0; kopo38_i < kopo38_iPerson; kopo38_i++) {
			// 0부터 시작해 kopo38_iPerson보다 작은 정수 kopo38_i에 대해
			String kopo38_name = String.format("홍길%02d", kopo38_i);
			int kopo38_kor = (int) (Math.random() * 100);
			int kopo38_eng = (int) (Math.random() * 100);
			int kopo38_mat = (int) (Math.random() * 100);
			kopo38_inData[kopo38_i] = new kopo38_P06_1(kopo38_name, kopo38_kor, kopo38_eng, kopo38_mat);
			// random을 이용해 각각의 변수를 설정하고 변수를 인자로 해 클래스에 넣고 배열에 추가시킨다.
		}

		for (int kopo38_i = 0; kopo38_i < kopo38_iPerson; kopo38_i++) {
			System.out.printf("번호 : %d, 이름:%s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%f\n", kopo38_i,
					kopo38_inData[kopo38_i].kopo38_name(), kopo38_inData[kopo38_i].kopo38_kor(),
					kopo38_inData[kopo38_i].kopo38_eng(), kopo38_inData[kopo38_i].kopo38_mat(),
					kopo38_inData[kopo38_i].kopo38_sum(), kopo38_inData[kopo38_i].kopo38_ave());
		}
		// kopo38_inData 배열에 대해 각 성분(클래스)을 순서대로 해당 성분(클래스)의 메소드를 이용해 출력한다.
	}
}
