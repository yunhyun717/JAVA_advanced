package kopo38_swc03;

public class kopo38_P04 {

	public static void main(String[] args) {
		int kopo38_ii = 12345;
		// kopo38_ii�� integer 12345�� ����
		int kopo38_j = (kopo38_ii / 10) * 10;
		/*
		 * j�� integer�� �����ϰ� kop38_ii�� 10���� ���� �� 10�� ���� ������ ���� ��������� kopo38_ii�� ���� �ڸ�����
		 * ������ ������� ��� ��
		 */
		System.out.printf("#4-1 : %d\n", kopo38_j); // kopo38_j�� ���

		kopo38_ii = 12345; // kopo38_ii�� 12345�� ����(integer)
		kopo38_j = ((kopo38_ii + 5) / 10) * 10;
		/*
		 * kopo38_ii�� 5�� ���Ѱ��� kopo38_ii�� ���� �ڸ����� 0~4�� ���� ���� �ڸ��� ��ȭ�� ����, 5~9�� ���� ���� �ڸ�����
		 * 1�� ������. �ռ� ���� �ڸ����� ������ ����غ��������� 5�� ���Ͽ� ó���� ����� ���� �ڸ��� ���� �ݿø��� �ȴٴ� ���� �� �� ����
		 */
		System.out.printf("#4-2 : %d\n", kopo38_j); // kopo38_j�� ���

		kopo38_ii = 12344; // kopo38_ii�� 12344�� ����
		kopo38_j = ((kopo38_j + 5) / 10) * 10;
		// �ռ��� ���� �������� kopo38_ii�� ���� �ڸ����� 4�̹Ƿ� �ݿø��ϸ� ������
		System.out.printf("#4-3 : %d\n", kopo38_j); // kopo38_j�� ���

	}

}
