package kopo38_swc04;

public class kopo38_P05_1 {

	public static void main(String[] args) {
		for (int kopo38_i = 1; kopo38_i < 13; kopo38_i++) {
			System.out.printf(" %d�� =>", kopo38_i);
			// 1���� 13������ ���� kopo38_i�� ���� ������ ���
			KOPO38_LOOP: for (int kopo38_j = 1; kopo38_j < 32; kopo38_j++) {
				System.out.printf("%d, ", kopo38_j);
				// KOPO38_LOOP ���� �����Ѵ�. ���� �̿��� �ش� �ݺ����� �������� �� �ִ�.
				// 1���� 32������ ���� kopo38_j�� ���� ������ ���
				switch (kopo38_i) {
				case 4:
				case 6:
				case 9:
				case 11:
					if (kopo38_j == 30)
						break KOPO38_LOOP;
					break;
				// ���� kopo38_i�� 4, 6, 9, 11�� ��� kopo38_j�� 30�̸� break�ϰ� �ݺ����� ����������.
				// �ƴϸ� ���⼭ break �� �ݺ��� ��� ����
				case 2:
					if (kopo38_j == 28)
						break KOPO38_LOOP;
					break;
				// ���� kopo38_i�� 2�� ��� kopo38_j�� 28�̸� break�ϰ� �ݺ����� ����������.
				// �ƴϸ� ���⼭ break �� �ݺ��� ��� ����
				}
			}
			System.out.printf("\n");
			// i�� �����ϱ� �� �� �� �߰�
		}

	}

}
