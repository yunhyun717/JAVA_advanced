package kopo38_swc05;

public class kopo38_P01 {

	public static void main(String[] args) {
		for (int kopo38_i = 1; kopo38_i < 10; kopo38_i += 3) {
			System.out.printf("************\t************\t************\n");
			System.out.printf(" ������ %d �� \t ������ %d �� \t ������ %d �� \n", kopo38_i, kopo38_i + 1, kopo38_i + 2);
			System.out.printf("************\t************\t************\n");
			// 1���� ������ 10���� ���� 3�� �����ϴ� ������ kopo38_i�� ���� kopo38_i���� ������ 1�� Ŀ���� ���ڸ� �̿��� ��������
			// ������ ���η�
			// ��ġ�Ѵ�.
			for (int kopo38_j = 1; kopo38_j < 10; kopo38_j++) {
				System.out.printf(" %d * %d = %2d \t %d * %d = %2d \t %d * %d = %2d \n", kopo38_i, kopo38_j,
						kopo38_i * kopo38_j, kopo38_i + 1, kopo38_j, (kopo38_i + 1) * kopo38_j, kopo38_i + 2, kopo38_j,
						(kopo38_i + 2) * kopo38_j);
				// 1���� ������ 10���� ���� ���� kopo38_j�� ���� kopo38_i�� ���η� �̾����� kopo38_i+1, kopo38_i+2�� ����
				// �������� kopo38_j���� ������ ���� ����Ѵ�.
			}
			// ���� ��ܺ��� ������ �ϴ����� �д� �������� �ϼ��ȴ�.
		}
	}
}
