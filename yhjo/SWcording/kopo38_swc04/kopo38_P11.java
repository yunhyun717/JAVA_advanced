package kopo38_swc04;

public class kopo38_P11 {

	public static void main(String[] args) {
		int kopo38_n, kopo38_m;
		kopo38_m = 20;
		kopo38_n = 1;
		// ���� kopo38_m�� 20, kopo38_n�� 1�� �����Ѵ�.
		while (true) {
			// break�� �� ������ �ݺ�
			for (int kopo38_i = 0; kopo38_i < kopo38_m; kopo38_i++)
				System.out.printf(" ");
			// 0���� ������ m���� ���� ���� i�� ���� ��ĭ�� ����Ѵ�. ��, ��ĭ�� kopo38_m�� �����.
			for (int kopo38_i = 0; kopo38_i < kopo38_n; kopo38_i++)
				System.out.printf("��");
			// 0���� ������ n���� ���� ���� i�� ���� "��"�� ����Ѵ�. ��, "��"�� kopo38_n�� �����.
			System.out.printf("\n");
			// �� ���� �߰�
			kopo38_m = kopo38_m - 1;
			kopo38_n = kopo38_n + 2;
			// kopo38_m������ 1�� ����, kopo38_n���� 2�� ���Ѵ�.
			if (kopo38_m < 0)
				break;
			// kopo38_m�� 0���� �۾����� break
		}
	}

}
