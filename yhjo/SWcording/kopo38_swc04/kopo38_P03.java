package kopo38_swc04;

public class kopo38_P03 {

	public static void main(String[] args) {
		int kopo38_iVal;
		// ���� kopo38_iVal�� ����
		for (int kopo38_i = 0; kopo38_i < 300; kopo38_i++) {
			kopo38_iVal = 5 * kopo38_i;
			// 0���� ������ 300���� ���� 1�� Ŀ���� kopo38_i�� ���� kopo38_iVal�� 5*i�� ����
			// ��, kopo38_iVal�� 0���� ������ 5*300=1500���� ���� 5�� ����� �ȴ�.
			if (kopo38_iVal >= 0 && kopo38_iVal < 10)
				System.out.printf("�� %d\n", kopo38_iVal);
			// &&�� �¿��� ������ ��� ������ �� true ���� ������.
			// ��, �� ������ kopo38_iVal�� 0���� ũ�ų� ���� ���ÿ� 10���� ���� ���̴�.
			// ������ �����ϸ� ������ ���
			else if (kopo38_iVal >= 10 && kopo38_iVal < 100)
				System.out.printf("�� %d\n", kopo38_iVal);
			// kopo38_iVal�� 10���� ũ�ų� ���� 100���� ������ ������ ���
			else if (kopo38_iVal >= 100 && kopo38_iVal < 1000)
				System.out.printf("�� %d\n", kopo38_iVal);
			// kopo38_iVal�� 100���� ũ�ų� ���� 1000���� ������ ������ ���
			else
				System.out.printf("õ %d\n", kopo38_iVal);
			// �̿��� ��� ������ ���
		}
	}

}
