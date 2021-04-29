package kopo38_swc06;

public class kopo38_P13_1 {

	public static void main(String[] args) {
		int kopo38_iPerson = 10;

		kopo38_InputData kopo38_inData = new kopo38_InputData(kopo38_iPerson);
		// kopo38_InputData 클래스를 불러오고 인자를 kopo38_iPerson으로 설정한다.

		for (int kopo38_i = 0; kopo38_i < kopo38_iPerson; kopo38_i++) {
			// 0부터 시작해 kopo38_iPerson보다 작은 정수 kopo38_i에 대해
			String kopo38_name = String.format("홍길%02d", kopo38_i);
			int kopo38_kor = (int) (Math.random() * 100);
			int kopo38_eng = (int) (Math.random() * 100);
			int kopo38_mat = (int) (Math.random() * 100);
			// 각각의 변수를 설정한다.
			kopo38_inData.kopo38_setData(kopo38_i, kopo38_name, kopo38_kor, kopo38_eng, kopo38_mat);
			// 생성한 변수들을 인자로 하여kopo38_InputData의 kopo38_setData메소드를 실행해 내용을 입력한다.
		}

		for (int i = 0; i < kopo38_iPerson; i++) {
			System.out.printf("번호 : %d, 이름:%s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%f\n", i, kopo38_inData.kopo38_name[i],
					kopo38_inData.kopo38_kor[i], kopo38_inData.kopo38_eng[i], kopo38_inData.kopo38_mat[i],
					kopo38_inData.kopo38_sum[i], kopo38_inData.kopo38_ave[i]);
		}
		// kopo38_inData 클래스의 정보를 출력한다.
	}
}
