package kopo38_swc07;

public class kopo38_P06_2 {

	public static void main(String[] args) {
		int kopo38_iPerson = 10;
		// ���� kopo38_iPerson�� �����Ѵ�.
		kopo38_P06_1[] kopo38_inData = new kopo38_P06_1[kopo38_iPerson];
		kopo38_inData[0] = new kopo38_P06_1("ȫ��01", 100, 100, 90);
		// kopo38_P06_1�� �������� ���� �迭�� �����ϰ� ù��° ������ ���ڸ� �־ �Է��Ѵ�.
		// (������ Ŭ�����̹Ƿ� Ŭ������ �䱸�ϴ� ���ڸ� �־ ������ �� �Է�)

		for (int kopo38_i = 0; kopo38_i < kopo38_iPerson; kopo38_i++) {
			// 0���� ������ kopo38_iPerson���� ���� ���� kopo38_i�� ����
			String kopo38_name = String.format("ȫ��%02d", kopo38_i);
			int kopo38_kor = (int) (Math.random() * 100);
			int kopo38_eng = (int) (Math.random() * 100);
			int kopo38_mat = (int) (Math.random() * 100);
			kopo38_inData[kopo38_i] = new kopo38_P06_1(kopo38_name, kopo38_kor, kopo38_eng, kopo38_mat);
			// random�� �̿��� ������ ������ �����ϰ� ������ ���ڷ� �� Ŭ������ �ְ� �迭�� �߰���Ų��.
		}

		for (int kopo38_i = 0; kopo38_i < kopo38_iPerson; kopo38_i++) {
			System.out.printf("��ȣ : %d, �̸�:%s, ����:%d, ����:%d, ����:%d, ����:%d, ���:%f\n", kopo38_i,
					kopo38_inData[kopo38_i].kopo38_name(), kopo38_inData[kopo38_i].kopo38_kor(),
					kopo38_inData[kopo38_i].kopo38_eng(), kopo38_inData[kopo38_i].kopo38_mat(),
					kopo38_inData[kopo38_i].kopo38_sum(), kopo38_inData[kopo38_i].kopo38_ave());
		}
		// kopo38_inData �迭�� ���� �� ����(Ŭ����)�� ������� �ش� ����(Ŭ����)�� �޼ҵ带 �̿��� ����Ѵ�.
	}
}
