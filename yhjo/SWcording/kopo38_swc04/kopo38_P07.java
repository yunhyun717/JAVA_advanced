package kopo38_swc04;

public class kopo38_P07 {

	public static void main(String[] args) {
		String[] kopo38_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };
		// String �迭 kopo38_units�� ���� ���� ����
		// kopo38_units�� ���̰� 10�̸� 0���� 9������ ���� n�� ���� kopo38_units[n]�� n�� �ѱ۷� �ٲ� ����� ���´�.
		for (int kopo38_i = 0; kopo38_i < 101; kopo38_i++) {
			if (kopo38_i >= 0 && kopo38_i < 10) {
				System.out.printf("�����ڸ� : %s\n", kopo38_units[kopo38_i]);
				// 0���� 100���� ���ϴ� ���� kopo38_i�� ���� kopo38_i�� 0���� ũ�ų� ���� ���ÿ� kopo38_i�� 10���� ������
				// (���ڸ� ���̸�) ������ ����Ѵ�.
			} else if (kopo38_i >= 10 && kopo38_i < 100) {
				// kopo38_i�� 10���� ũ�ų� ���� 100���� ������ (���ڸ� ���̸�)
				int kopo38_i10, kopo38_i0;
				kopo38_i10 = kopo38_i / 10;
				// ���� kopo38_i10�� kopo38_i�� 10���� ���� ������ ����(���� kopo38_i10�� kopo38_i�� 10�� �ڸ���)
				kopo38_i0 = kopo38_i % 10;
				// ���� kopo38_i0�� kopo38_i�� 10���� ���� �������� ����(���� kopo38_i0�� kopo38_i�� 1�� �ڸ���)

				if (kopo38_i0 == 0) {
					System.out.printf("�����ڸ� : %s��\n", kopo38_units[kopo38_i10]);
				} else {
					System.out.printf("�����ڸ� : %s��%s\n", kopo38_units[kopo38_i10], kopo38_units[kopo38_i0]);
				}
				// kopo38_i0�� 0�̸�(kopo38_i�� 1�� �ڸ����� 0�̸�) ���� �ڸ��� ���� �ʿ䰡 �����Ƿ� ���� �ڸ����� ���
				// �׷��� ������ ���� �ڸ����� ���� �ٿ��� ����ϰ� �̾ ���� �ڸ����� ���.
			} else
				System.out.printf("==> %d\n", kopo38_i);
			// kopo38_i�� ���ڸ��� �Ǵ� ���ڸ����� �ƴ� ��� (kopo38_i�� ������ ���� 100�ۿ� ����) ���
		}
	}
}