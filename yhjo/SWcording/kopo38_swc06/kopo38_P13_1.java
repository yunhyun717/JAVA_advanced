package kopo38_swc06;

public class kopo38_P13_1 {

	public static void main(String[] args) {
		int kopo38_iPerson = 10;

		kopo38_InputData kopo38_inData = new kopo38_InputData(kopo38_iPerson);
		// kopo38_InputData Ŭ������ �ҷ����� ���ڸ� kopo38_iPerson���� �����Ѵ�.

		for (int kopo38_i = 0; kopo38_i < kopo38_iPerson; kopo38_i++) {
			// 0���� ������ kopo38_iPerson���� ���� ���� kopo38_i�� ����
			String kopo38_name = String.format("ȫ��%02d", kopo38_i);
			int kopo38_kor = (int) (Math.random() * 100);
			int kopo38_eng = (int) (Math.random() * 100);
			int kopo38_mat = (int) (Math.random() * 100);
			// ������ ������ �����Ѵ�.
			kopo38_inData.kopo38_setData(kopo38_i, kopo38_name, kopo38_kor, kopo38_eng, kopo38_mat);
			// ������ �������� ���ڷ� �Ͽ�kopo38_InputData�� kopo38_setData�޼ҵ带 ������ ������ �Է��Ѵ�.
		}

		for (int i = 0; i < kopo38_iPerson; i++) {
			System.out.printf("��ȣ : %d, �̸�:%s, ����:%d, ����:%d, ����:%d, ����:%d, ���:%f\n", i, kopo38_inData.kopo38_name[i],
					kopo38_inData.kopo38_kor[i], kopo38_inData.kopo38_eng[i], kopo38_inData.kopo38_mat[i],
					kopo38_inData.kopo38_sum[i], kopo38_inData.kopo38_ave[i]);
		}
		// kopo38_inData Ŭ������ ������ ����Ѵ�.
	}
}
