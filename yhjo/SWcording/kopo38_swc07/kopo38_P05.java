package kopo38_swc07;

public class kopo38_P05 {

	public static void main(String[] args) {
		int[] kopo38_iArray = { 1, 7, 5, 3, 2, 1, 3, 4, 9, 12, 1, 212, 33, 11, 21, 11, 2121, 121, 11, 5, 6, 33 };
		// ���� �迭�� �����Ѵ�.

		for (int kopo38_i = 0; kopo38_i < kopo38_iArray.length; kopo38_i++) {
			System.out.printf("iArray[%d]=%d\n", kopo38_i, kopo38_iArray[kopo38_i]);
		}
		// �迭�� �� ������ ������� ����Ѵ�.

		int kopo38_iMax = kopo38_iArray[0];
		// �迭�� ù��° ������ �ʱⰪ���� �����Ѵ�.
		int kopo38_iMaxPt = 0;
		// �ִ밪�� �迭�� ���° �������� Ȯ���ϴ� ������ �����ϰ� �ʱⰪ�� 0���� �Ѵ�.(���� �ʱⰪ�� 0��° �������� �Ǿ������Ƿ�)
		for (int kopo38_i = 0; kopo38_i < kopo38_iArray.length; kopo38_i++) {
			if (kopo38_iMax < kopo38_iArray[kopo38_i]) {
				kopo38_iMax = kopo38_iArray[kopo38_i];
				kopo38_iMaxPt = kopo38_i;
			}
		}
		// ���ǽ����� �ִ밪�� �������ְ� �ִ밪�� ���Կ� ���� ������ ��ȣ�� �ٲ��ش�.
		System.out.printf("MAX : iArray[%d]=%d]\n", kopo38_iMaxPt, kopo38_iMax);
		// ����� ����Ѵ�.
	}
}
