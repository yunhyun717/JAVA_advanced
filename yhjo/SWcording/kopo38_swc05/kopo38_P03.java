package kopo38_swc05;

public class kopo38_P03 {

	public static void main(String[] args) {
		int kopo38_iWeekday = 5;
		int[] kopo38_iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// �Ͽ��Ϻ��� �ϳ��� ��������(�Ͽ����� 0����) �ݿ����� 5��° �����̴�. ���� kopo38_iWeekday�� 5�� ����
		// ���� �迭 kopo38_iEnd�� �����ϰ� �� ���� 1������ 12������ �� ���� �ϼ��� �Ѵ�.
		for (int kopo38_iMon = 0; kopo38_iMon < 12; kopo38_iMon++) {
			// 0���� ������ 12���� ���� ���� kopo38_iMon�� ����
			System.out.printf("\n\n         %d��\n", kopo38_iMon + 1);
			// kopo38_iMon�� 0���� �����ϹǷ� 1�� ���� ���� ���ش�.
			System.out.printf("======================\n");
			System.out.printf(" �� �� ȭ �� �� �� ��\n");
			// ������ ����Ѵ�.
			for (int kopo38_i = 0; kopo38_i < kopo38_iWeekday; kopo38_i++) {
				System.out.printf("   ");
			}
			// 0���� ������ kopo38_iWeekday���� ���� ���� kopo38_i�� ���� �� 3���� ���´�.
			// (�� ��¥ �� 3����Ʈ ��ŭ�� ������ �����Ƿ� �̸� ä���ֱ� ����)
			// ��, �ش� ���� ù ���� ������ �����ֱ� ���� ��ĭ 3�� * kopo38_iWeekday ��ŭ�� ��ĭ�� �����.
			for (int kopo38_i = 1; kopo38_i <= kopo38_iEnd[kopo38_iMon]; kopo38_i++) {
				System.out.printf("%3d", kopo38_i);
				kopo38_iWeekday++;
				// 1���� ������ kopokopo38_iEnd�� kopo38_iMon��° �׸�(�ش� ���� �ϼ�)���� ���ϴ� ���� kopo38_i�� ����
				// 3ĭ�� �ڸ��� �����ϵ��� kopo38_i�� ����ϰ� kopo38_iWeekday(����)���� 1�� ���Ѵ�.
				if (kopo38_iWeekday % 7 == 0) {
					System.out.printf("\n");
					kopo38_iWeekday = 0;
					// kopo38_iWeekday�� 7�� �����������(�Ͽ��Ͽ� 7�� �ȴ�.) ���ο� �ٿ��� �����ϸ� ������ �ʱ�ȭ�Ѵ�.
				}
			}
			// �޷� �ϼ�
		}
	}
}
