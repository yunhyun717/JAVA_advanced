package kopo38_swc04;

public class kopo38_P06 {

	public static void main(String[] args) {
		int[] kopo38_iLMD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// ���� �迭 kopo38_iLMD�� ���� ���� ����
		for (int kopo38_i = 1; kopo38_i < 13; kopo38_i++) {
			System.out.printf(" %d�� =>", kopo38_i);
			// 1���� 12������ ���� kopo38_i�� ���� ������ ���
			for (int kopo38_j = 1; kopo38_j < 32; kopo38_j++) {
				System.out.printf("%d", kopo38_j);
				// 1���� 31������ ���� kopo38_j�� ���� ������ ���
				if (kopo38_iLMD[kopo38_i - 1] == kopo38_j)
					break;
				// ���� kopo38_iLMD�迭�� kopo38_i-1��° �׸��� kopo38_j�� ���ٸ� break
				// �迭�� �׸��� 0��°���� �����ϹǷ� 1���� �����ϴ� ���� ���̸� ���ֱ� ���� 1�� ���ش�.
				System.out.print(",");
				// ���� ������ ���̸� ���� ���ǹ����� break�ǹǷ� ������ �� �ڿ� ','�� ���� �ʴ´�.
			}
			System.out.printf("\n");
			// kopo38_i�� 1 �����ϱ� ���� �� �� �߰�
		}
	}
}
