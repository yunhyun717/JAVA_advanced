package kopo38_swc04;

public class kopo38_P10 {

	public static void main(String[] args) {
		double kopo38_fSin;
		for (int kopo38_i = 0; kopo38_i < 360; kopo38_i++) {
			// 0���� ������ 360���� ���� ���� kopo38_i�� ����
			kopo38_fSin = Math.sin(kopo38_i * 3.141592 / 180);
			// double kopo38_fSin�� sin(kopo38_i*3.141592/180)���� ����
			// Math.sin�Լ����� ���ڴ� ���� ���� �����Ƿ� ��ȯ�� ������Ѵ�.
			// ���Ȱ� = ��*��/180�̹Ƿ� kopo38_i�� ��ȯ�ϱ����� ���� �ٻ簪�� 3.141592�� �̿��� ���� ���� ����Ѵ�.
			System.out.printf("%d sin ==>%f\n", kopo38_i, kopo38_fSin);
			// kopo38_i�� kopo38_fSin�� ���� ���� ���
		}
		for (int kopo38_i = 0; kopo38_i < 360; kopo38_i++) {
			// 0���� ������ 360���� ���� ���� kopo38_i�� ����
			kopo38_fSin = Math.sin(kopo38_i * 3.141592 / 180);
			// kopo38_fSin�� ���� ���������� sin(kopo38_i*3.141592/180)���� ����
			int kopo38_iSpace = (int) ((1.0 - kopo38_fSin) * 50);
			// ���� kopo38_iSpace�� (1.0-kopo38_fSin)*50�� ������ȯ(�Ҽ��� �Ʒ� ����)���� ����
			// kopo38_fSin�� sin ������ -1���� 1������ ���� �����Ƿ�
			// 1-kopo38_fSin�� 0���� 2������ ���� ������ �ᱹ (1.0 - kopo38_fSin) * 50�� 0���� 100������ ����
			// ������.
			for (int kopo38_j = 0; kopo38_j < kopo38_iSpace; kopo38_j++)
				// 0���� ������ iSpace���� ���� ���� j�� ����
				System.out.printf(" ");
			// ��ĭ�� ����Ѵ�. �� ��ĭ�� iSpace�� ��ŭ ���
			// �� 1�� �� ��ȭ�ϴ� sin������ ���� �ִ��� ������ŭ ��ĭ�� �����.
			System.out.printf("*[%f][%d]\n", kopo38_fSin, kopo38_iSpace);
			// kopo38_fSin�� kopo38_iSpace�� ���� ���� ���
		}
	}
}
