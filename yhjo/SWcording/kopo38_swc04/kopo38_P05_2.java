package kopo38_swc04;

public class kopo38_P05_2 {

	public static void main(String[] args) {
		// ���⼭�� ���������� ������ �� ������ ','�� ���ְ����Ѵ�.
		for (int kopo38_i = 1; kopo38_i < 13; kopo38_i++) {
			System.out.printf(" %d�� => 1", kopo38_i);
			KOPO38_LOOP: for (int kopo38_j = 2; kopo38_j < 32; kopo38_j++) {
				System.out.printf(" ,%d", kopo38_j);
				// �ռ��� ���� ������ �� 1�� �̸� ���ְ� ��¥�� 2�Ϻ��� �����ϵ��� �ߴ�.
				switch (kopo38_i) {
				case 4:
				case 6:
				case 9:
				case 11:
					if (kopo38_j == 30)
						break KOPO38_LOOP;
					break;

				case 2:
					if (kopo38_j == 28)
						break KOPO38_LOOP;
					break;

				}
			}
			System.out.printf("\n");
			// ������ �κ��� ����
		}

	}

}
