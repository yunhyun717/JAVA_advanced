package kopo38_swc02;

import java.util.Scanner;

public class kopo38_P11 {

	public static void main(String[] args) {

		float kopo38_f = 9.1234567f;
		double kopo38_d = 9.1234567;
		double kopo38_d2 = (double) kopo38_f;
		// float�� double�� ���� �����Ѵ�.
		// kopo38_d2�� kopo38_f�� double��ȯ�� ������ �����Ѵ�.

		System.out.printf("f=%20.18f\n", kopo38_f);
		System.out.printf("d=%20.18f\n", kopo38_d);
		System.out.printf("d2=%20.18f\n", kopo38_d2);
		// ������ �������� ����Ѵ�.
		// %20.18f�� ����� 20�ڸ��� �����ϸ鼭 �Ҽ��� �Ʒ� 18�ڸ����� ����ϵ��� �Ѵ�.
		// �޸𸮿� 2������ �����ϱ� ������ ������ 18�ڸ����� ����� ���
		// 6~7�ڸ����� ����Ǵ� float�� ���ڰ� ����Ȯ�ϰ� ��µȴ�.
		// double�� float���� �Ҽ��� �Ʒ� ����Ǵ� ������ ũ�� ������ ���� ���� �� ��µȴ�.
		// float���� double ��ȯ�߾ �̹� ����Ȯ�� ������ ����� �ı� ������ �ش� ���� �״�� ��µȴ�.
	}
}
