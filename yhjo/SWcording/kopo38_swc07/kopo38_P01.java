package kopo38_swc07;

public class kopo38_P01 {

	public static String HanBlankForeword(String kopo38_in, int kopo38_n) {
		int kopo38_charnum = 0;
		int kopo38_kornum = 0;
		for (int kopo38_i = 0; kopo38_i < kopo38_in.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_in.charAt(kopo38_i));
			kopo38_charnum++;
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_kornum++;
			}
		}
		// 6������ �ѱ��� ������ String kopo38_in�� ���̸� ���ϴ� ������ �����´�.
		String kopo38_result = "";
		for (int kopo38_i = 0; kopo38_i < (kopo38_n - kopo38_charnum - kopo38_kornum); kopo38_i++) {
			kopo38_result = kopo38_result + " ";
		}
		// �� ���̿��� �Է��� String kopo38_in�� ���̸� �� ��ŭ�� ���̸�ŭ�� ��ĭ�� �����.
		kopo38_result = kopo38_result + kopo38_in;
		// String kopo38_in�� �̾���δ�.
		return kopo38_result;
		// ���� String�� return�Ѵ�.
	}

	public static String HanBlankBackword(String kopo38_in, int kopo38_n) {
		int kopo38_charnum = 0;
		int kopo38_kornum = 0;
		for (int kopo38_i = 0; kopo38_i < kopo38_in.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_in.charAt(kopo38_i));
			kopo38_charnum++;
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_kornum++;
			}
		}
		// 6������ �ѱ��� ������ String kopo38_in�� ���̸� ���ϴ� ������ �����´�.
		String kopo38_result = kopo38_in;
		// kopo38_in�� �տ� ���δ�.
		for (int kopo38_i = 0; kopo38_i < (kopo38_n - kopo38_charnum - kopo38_kornum); kopo38_i++) {
			kopo38_result = kopo38_result + " ";
		}
		// �� ���̿��� �Է��� String kopo38_in�� ���̸� �� ��ŭ�� ���̸�ŭ�� ��ĭ�� ����� �ڿ� �̾� ���δ�.
		return kopo38_result;
		// ���� String�� return�Ѵ�.
	}

	public static int HanCount(String in) {
		int kopo38_kornum = 0;
		for (int kopo38_i = 0; kopo38_i < in.length(); kopo38_i++) {
			int kopo38_charint = (int) (in.charAt(kopo38_i));
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_kornum++;
			}
		}
		// 6������ �ѱ��� ������ String kopo38_in�� ���̸� ���ϴ� ������ ������ �ѱ� ������ ����.
		return kopo38_kornum;
		// ����� return �Ѵ�.
	}

	public static void main(String[] args) {
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("�ѱ�abcd", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("�ѱ��ѱ�aa", 15));
		System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("�ѱ�abcd", 15));
		System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("�ѱ��ѱ�aa", 15));
		System.out.printf("�ѱ��� [%d]��\n", HanCount("�ѱ��ѱ�aa"));
	}
	// �޼ҵ� ��� ���
}
