package kopo38_swc05;

public class kopo38_P02 {

	public static void main(String[] args) {
		for (int kopo38_i = 1; kopo38_i < 4; kopo38_i++) {
			System.out.printf("*************\t*************\t*************\n");
			System.out.printf(" ������ %d �� \t ������ %d �� \t ������ %d �� \n", kopo38_i, kopo38_i + 3, kopo38_i + 6);
			System.out.printf("*************\t*************\t*************\n");
			// 1���� ������ 4���� ���� ������ kopo38_i�� ���� kopo38_i���� ������ 3�� Ŀ���� ���ڸ� �̿��� �������� ������ ���η�
			// ��ġ�Ѵ�.
			for (int kopo38_j = 1; kopo38_j < 10; kopo38_j++) {
				System.out.printf(" %d * %d = %2d \t %d * %d = %2d \t %d * %d = %2" + "" + "d \n", kopo38_i, kopo38_j,
						kopo38_i * kopo38_j, kopo38_i + 3, kopo38_j, (kopo38_i + 3) * kopo38_j, kopo38_i + 6, kopo38_j,
						(kopo38_i + 6) * kopo38_j);
				// 1���� ������ 10���� ���� ���� kopo38_j�� ���� kopo38_i�� ���η� �̾����� kopo38_i+3, kopo38_i+6�� ����
				// �������� kopo38_j���� ������ ���� ����Ѵ�.
			}
			// ���� ��ܺ��� ������ �ϴ����� �д� �������� �ϼ��ȴ�.

		}
	}
}
