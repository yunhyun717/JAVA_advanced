package kopo38_swc03;

public class kopo38_P03 {

	public static void main(String[] args) {
		int kopo38_ii = 1000 / 3;
		// kopo38_ii�� integer�� �����ϰ� 1000/3�� �ϸ� 333.333...�� �ƴ� 1000�� 
		// 3���� ���� ���� ����
		System.out.printf("#3-1 : %d\n", kopo38_ii);

		kopo38_ii = 1000 % 3; // kopo38_ii�� ���
		System.out.printf("#3-2 : %d\n", kopo38_ii); // kopo38_ii�� ���

		for (int kopo38_i = 0; kopo38_i < 20; kopo38_i++) {
			System.out.printf("#3-3 : %d	", kopo38_i);
			// 0���� 19������ i�� ���� i�� ���

			if (((kopo38_i + 1) % 5) == 0) {
				System.out.printf("\n");
				/* �̶� 5�� ���� ���ο� �ٿ��� �����ϵ��� ������ ����
				   i�� 1�� �����ִ� ���� : i���� ������ ��� 
				   0���� ���۵ǰ� ù�׺��� 5�� �������� �� �������� 0�� �ǹǷ�
				   5�� °�� �������� 0�� �ǵ��� �ϱ� ���� +1
				   i%5=4�� ��ü ����
				 */
			}
		}
	}

}
