package kopo38_swc02;

import java.util.Scanner;

public class kopo38_P08 {

	public static void main(String[] args) {

		short kopo38_sMin = -32768;
		short kopo38_sMax = 32767;
		char kopo38_cMin = 0;
		char kopo38_cMax = 65535;
		// short�� char�� ���� �����Ѵ�.

		System.out.println("sMin = " + kopo38_sMin);
		System.out.println("sMin-1 = " + (short) (kopo38_sMin - 1));
		// �׳� 1�� ���� ����ϸ� �Ϲ� ��갪���� ��µ�����, (short)�� ������ ��ȣ�� �ٲ� ������ 1�� �� ���� ����Ѵ�.
		System.out.println("sMax = " + kopo38_sMax);
		System.out.println("sMax+1 = " + (short) (kopo38_sMax + 1));
		// ���������� (short)�� �پ����Ƿ� ��ȣ�� �ٲ� ������ 1�� �� ���� ��µȴ�.
		System.out.println("cMin = " + (int) kopo38_cMin);
		System.out.println("cMin-1 = " + (int) --kopo38_cMin);
		// char�� ������ �ּڰ��� 0�̹Ƿ� 1�� ���� �� �ٽ� �ִ�(65535)���� ���ư���. ���� 65535�� ��µȴ�. 
		System.out.println("cMin = " + (int) kopo38_cMax);
		System.out.println("cMin+1 = " + (int) ++kopo38_cMax);
		// ���� char�� ������ �ִ��� 65535�̹Ƿ� 1�� ������ �� �ٽ� �ּڰ�(0)���� ���ư���. ���� 0�� ��µȴ�.

	}
}
