package kopo38_swc04;

public class kopo38_P08 {

	public static void main(String[] args) {
		int kopo38_iNumVal = 1001034567;
		// ���� �б��� ����� �Ǵ� ���� kopo38_iNumVal �� ����
		String kopo38_sNumVal = String.valueOf(kopo38_iNumVal);
		// String kopo38_sNumVal�� ���� kopo38_iNumVal�� String���� ��ȯ��, �� "1001034567"�� ����
		String kopo38_sNumVoice = " ";
		// String kopo38_sNumVoice�� �������� ����
		System.out.printf("==> %s [%d�ڸ�]\n", kopo38_sNumVal, kopo38_sNumVal.length());
		// String kopo38_sNumVal�� �� ���̸� ���(kopo38_sNumVal�� kopo38_iNumVal�� �״�� ���������Ƿ�
		// kopo38_sNumVal�� ���̴� kopo38_iNumVal�� �ڸ����� �ȴ�)
		int kopo38_i, kopo38_j;
		String[] kopo38_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };
		String[] kopo38_unitX = { " ", "��", "��", "õ", "��", "��", "��", "õ", "��", "��" };
		// ���� kopo38_i�� kopo38_j �� �����ϰ� String �迭 kopo38_units�� kopo38_unitX�� ���� ����
		// �����Ѵ�.

		kopo38_i = 0;
		kopo38_j = kopo38_sNumVal.length() - 1;
		// ���� kopo38_i�� 0����, kopo38_j�� kopo38_sNumVal�� ���̿��� 1�� �� ������ �����Ѵ�.

		while (true) {
			// break���� ���� �ݺ�
			if (kopo38_i >= kopo38_sNumVal.length())
				break;
			// kopo38_i�� kopo38_sNumval�� ���̺��� ũ�ų� �������� break
			System.out.printf("%s[%s]", kopo38_sNumVal.substring(kopo38_i, kopo38_i + 1),
					kopo38_units[Integer.parseInt(kopo38_sNumVal.substring(kopo38_i, kopo38_i + 1))]);
			// ù��° ��µǴ� String�� kopo38_sNumVal�� kopo38_i��°���� kopo38_i+1��° �������� String�̴�.
			// ��, �տ������� kopo38_i��° ���ڰ� �ȴ�.(0���� ����)
			// ���� �ռ� ��µ� ���ڸ� �������·� ��ȯ�ϰ�(���������� String ���¿���)
			// kopo38_units�� �ش� ���ڹ�° ��Ҹ� �ι�°�� ����Ѵ�([]����).
			// ��, �ش� ���ڸ� �ѱ۷� ���� ���ڰ� ��µȴ�.
			if (kopo38_sNumVal.substring(kopo38_i, kopo38_i + 1).equals("0")) {
				if (kopo38_unitX[kopo38_j].equals("��") || kopo38_unitX[kopo38_j].equals("��")) {
					// kopo38_unitx[kopo38_j]�� kopo38_i��° ������ ������ �ȴ�.
					kopo38_sNumVoice = kopo38_sNumVoice + "" + kopo38_unitX[kopo38_j];
					// kopo38_i��° ���ڰ� 0�϶�, kopo38_i��° ������ ������ ���̰ų�(||) ���̸�
					// kopo38_sNumVoice �ڿ� ������ �ٿ��ش�.(�� �Ǵ� ��)
				} else {
				}
				// ������ �� �Ǵ� ���� �ƴϸ� ������
			} else {
				kopo38_sNumVoice = kopo38_sNumVoice
						+ kopo38_units[Integer.parseInt(kopo38_sNumVal.substring(kopo38_i, kopo38_i + 1))]
						+ kopo38_unitX[kopo38_j];
			}
			// kopo38_i��° ���ڰ� 0�� �ƴϸ� kop38_sNumVoice�� kopo38_sNumVoice�� (String��)
			// kopo38_i��° ���ڸ� �д� ��(kopo38_units)�� ����(kopo38_unitX)�� ���δ�.

			kopo38_i++;
			kopo38_j--;
			// kopo38_i�� 1�� ���ϰ� kopo38_j���� 1�� ����.
		}
		System.out.printf("\n %s[%s]\n", kopo38_sNumVal, kopo38_sNumVoice);
		// kopo38_sNumVal�� kopo38_sNumVoice�� ���� ���� ����Ѵ�.
	}
}