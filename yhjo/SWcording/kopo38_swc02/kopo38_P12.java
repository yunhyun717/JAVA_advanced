package kopo38_swc02;

import java.util.Scanner;

public class kopo38_P12 {

	public static void main(String[] args) {
		int i = 91234567;
		float f = (float) i;
		int i2 = (int) f;

		double d = (double) i;
		int i3 = (int) d;

		float f2 = 1.666f;
		int i4 = (int) f2;
		
		// float�� int�� ������ �� �Ǵ� ��ȯ ������ �����Ѵ�.

		System.out.printf("i=%d\n", i);
		System.out.printf("f=%f i2=%d\n", f, i2);
		System.out.printf("d=%f i3=%d\n", d, i3);
		System.out.printf("(int)%f=%d\n", f2, i4);
		// ������ �������� ����Ѵ�.
		// ������ float ��ȯ�ϸ� 1�� �ø��ϰ� �Ҽ��� �Ʒ� 000000�� ���� ���·� ��ȯ�ȴ�.
		// ������ double ��ȯ�ϸ� �Ҽ��� �Ʒ� 000000�� ���� ���·� ��ȯ�ȴ�.
		// float�� ���� ��ȯ�ϸ� �Ҽ��� �Ʒ��� ���� ���·� ��ȯ�ȴ�.
	}
}
