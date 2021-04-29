package kopo38_swc06;

public class kopo38_InputData {
	String[] kopo38_name;
	int[] kopo38_kor;
	int[] kopo38_eng;
	int[] kopo38_mat;
	int[] kopo38_sum;
	double[] kopo38_ave;
	// 전역으로 문자열, 정수열, double열을 설정한다.

	public kopo38_InputData(int kopo38_iPerson) {
		kopo38_name = new String[kopo38_iPerson];
		kopo38_kor = new int[kopo38_iPerson];
		kopo38_eng = new int[kopo38_iPerson];
		kopo38_mat = new int[kopo38_iPerson];
		kopo38_sum = new int[kopo38_iPerson];
		kopo38_ave = new double[kopo38_iPerson];
		// 현재 클래스를 정수를 인자로 오버로딩할 때
		// 각각의 열들을 kopo38_iPerson의 크기를 갖는 비어있는 열로 설정한다.
	}

	void kopo38_setData(int kopo38_in_i, String kopo38_in_name, int kopo38_in_kor, int kopo38_in_eng, int kopo38_in_mat) {
		kopo38_name[kopo38_in_i] = kopo38_in_name;
		kopo38_kor[kopo38_in_i] = kopo38_in_kor;
		kopo38_eng[kopo38_in_i] = kopo38_in_eng;
		kopo38_mat[kopo38_in_i] = kopo38_in_mat;
		kopo38_sum[kopo38_in_i] = (kopo38_in_kor + kopo38_in_eng + kopo38_in_mat);
		kopo38_ave[kopo38_in_i] = ((kopo38_in_kor + kopo38_in_eng + kopo38_in_mat) / 3.0);
		// 정수와 String을 인자로 갖는 kopo38_setDate 메소드를 설정
		// 각 열에 내용을 입력한다.
	}

}
