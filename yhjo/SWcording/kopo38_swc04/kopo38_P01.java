package kopo38_swc04;

public class kopo38_P01 {

	public static void main(String[] args) {
		int kopo38_iA, kopo38_iB;
		kopo38_iA = 0;
		// ���� kopo38_iA�� kopo38_iB�� �����ϰ� kopo38_iA�� 0���� ����
		while (true) {
			// while (true) ���� �ݺ��̴�.(break �ɸ� �� ����)
			kopo38_iB = 0;
			// kopo38_iB�� 0���� ����(ó������ ���ƿ� ������ ��� �ݺ���)
			while (true) {
				// ���� while (true) ���������� break�� �ɸ� �� ���� �ݺ�
				System.out.printf("*");
				if (kopo38_iA == kopo38_iB)
					break;
				kopo38_iB++;
				// "*"�� ����ؼ� ��� kopo38_iA�� kopo38_iB�� �������� break�Ѵ�.
				// �׷��� ������ kopo38_iB�� 1�� ���Ѵ�.
			}
			System.out.printf("\n");
			// "*"�� ��� �� �� ��������.
			kopo38_iA++;
			// kopo38_iA�� 1�� ���Ѵ�.
			if (kopo38_iA == 30)
				break;
			// kopo38_iA�� 30�� �Ǹ� break
		}
	}
}
