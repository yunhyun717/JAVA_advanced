package kopo38_swc06;

public class kopo38_InputData {
	String[] kopo38_name;
	int[] kopo38_kor;
	int[] kopo38_eng;
	int[] kopo38_mat;
	int[] kopo38_sum;
	double[] kopo38_ave;
	// �������� ���ڿ�, ������, double���� �����Ѵ�.

	public kopo38_InputData(int kopo38_iPerson) {
		kopo38_name = new String[kopo38_iPerson];
		kopo38_kor = new int[kopo38_iPerson];
		kopo38_eng = new int[kopo38_iPerson];
		kopo38_mat = new int[kopo38_iPerson];
		kopo38_sum = new int[kopo38_iPerson];
		kopo38_ave = new double[kopo38_iPerson];
		// ���� Ŭ������ ������ ���ڷ� �����ε��� ��
		// ������ ������ kopo38_iPerson�� ũ�⸦ ���� ����ִ� ���� �����Ѵ�.
	}

	void kopo38_setData(int kopo38_in_i, String kopo38_in_name, int kopo38_in_kor, int kopo38_in_eng, int kopo38_in_mat) {
		kopo38_name[kopo38_in_i] = kopo38_in_name;
		kopo38_kor[kopo38_in_i] = kopo38_in_kor;
		kopo38_eng[kopo38_in_i] = kopo38_in_eng;
		kopo38_mat[kopo38_in_i] = kopo38_in_mat;
		kopo38_sum[kopo38_in_i] = (kopo38_in_kor + kopo38_in_eng + kopo38_in_mat);
		kopo38_ave[kopo38_in_i] = ((kopo38_in_kor + kopo38_in_eng + kopo38_in_mat) / 3.0);
		// ������ String�� ���ڷ� ���� kopo38_setDate �޼ҵ带 ����
		// �� ���� ������ �Է��Ѵ�.
	}

}
