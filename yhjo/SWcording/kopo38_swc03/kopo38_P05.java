package kopo38_swc03;

public class kopo38_P05 {

	public static void main(String[] args) {
		int kopo38_MyVal = 14 / 5;
		// ���� ���̹Ƿ� 14�� 5�� ���� ���� ����
		System.out.printf("#5-1 : %d\n", kopo38_MyVal); // kopo38_MyVal�� ���

		double kopo38_MyValF;
		// double ������ ����
		kopo38_MyValF = 14 / 5; // double������ 14�� 5�� �����̹Ƿ� ���� 2�� ������
		System.out.printf("#5-2 : %f\n", kopo38_MyValF);
		// kopo38_MyValF�� ���, double�̹Ƿ� %f�� ��������� ���� 2�̹Ƿ� 2.000000���� ǥ��

		kopo38_MyValF = 14.0 / 5; // type�� double�̰� double������ 14.0�� 5�� ���������Ƿ� 2.8�� ������
		System.out.printf("#5-3 : %f\n", kopo38_MyValF);
		// kopo38_MyValF�� ���, double�̹Ƿ� %f�� ���

		kopo38_MyValF = (14.0) / 5 + 0.5; // 2.8�� 0.5�� ����
		System.out.printf("#5-4 : %f\n", kopo38_MyValF);
		// kopo38_MyValF�� ���, double�̹Ƿ� %f�� ���

		kopo38_MyVal = (int) ((14.0) / 5 + 0.5); // type�� double�̰� double������ 14.0�� 5�� ���������Ƿ� 2.8�� ������
		System.out.printf("#5-5 : %d\n", kopo38_MyVal);
		// kopo38_MyVal�� ���, integer�� ��ȯ�����Ƿ� �Ҽ��� �Ʒ��� ����

	}

}
