package kopo38_swc02;

import java.util.Scanner;

public class kopo38_P06 {

	public static void main(String[] args) {

		byte kopo38_b = 1;
		// byte kopo38_b�� 1�� �����Ѵ�.
		// byte�� -127���� 127������ ���̴�.
		short kopo38_s = 2;
		// short kopo38_s�� 2�� �����Ѵ�.
		// short�� -32768���� 32768������ ���̴�.
		char kopo38_c = 'A';
		// char kopo38_c�� 'A'�� �����Ѵ�.
		// char�� �� ���� �����̴�.
		int kopo38_finger = 10;
		// ���� finger�� 10���� �����Ѵ�.
		// int�� -2,147,483,648���� 2,147,483,648������ ���̴�.
		long kopo38_big = 100000000000L;
		// long big�� 100000000000L�� �����Ѵ�.
		// long�� -9,223,372,036,854,775,808���� 9,223,372,036,854,775,808������ ���̴�.
		// ������ �޸𸮿� int ���·� ����Ǳ� ������ �׳� ���ڸ� �Է��ϸ� int�� ������ ����Ƿ�
		// ������ �߻��Ѵ�. ���� long�̶�� ���� ǥ���ϱ����� ���� L�� ���δ�.
		long kopo38_hex = 0xFFFFFFFFFFFFFFFFL;
		// ����ڵ�� 16������ 0~9�� 10���� ���ڿ� ���� A~F������ ���ڸ� �̿��� ǥ���Ѵ�.
		// ����ڵ����� ǥ���ϱ����� ������ �� 0x�� �ٿ��ְ�, ���������� ���� L�� �ٿ��ش�.
		int kopo38_octNum = 010;
		// 0���� �����ϸ� 8�����̴�. 
		int kopo38_hexNum = 0x10;
		// 0x�� ���������� ����ڵ��̴�.(16����)
		int kopo38_binNum = 0b10;
		// 0b�� ���̳ʸ��� 2���� ���� ��Ÿ����.
		System.out.printf("b = %d%n", kopo38_b);
		System.out.printf("s = %d%n", kopo38_s);
		// %d�� �̿��� byte, short�� ����Ѵ�.
		System.out.printf("c = %c, %d %n", kopo38_c, (int) kopo38_c);
		// %c�� �̿��� char�� ����Ѵ�. (int)�� ������ȯ�� �Ͽ� %d�� �����
		System.out.printf("finger = [%5d]%n", kopo38_finger);
		// %nd���� ���� n�� ���� �ش� �κ��� �����ϴ� ������ ��������. 
		System.out.printf("finger = [%-5d]%n", kopo38_finger);
		// n�� ����̸� ��������, �����̸� ���������� �ȴ�.
		System.out.printf("finger = [%05d]%n", kopo38_finger);
		// 0n�����̸� �� ������ 0�� ä������.
		System.out.printf("big = %d%n", kopo38_big);
		// long�� %d�� ����Ѵ�.
		System.out.printf("hex = %#x%n", kopo38_hex);
		// ����ڵ����´� %x�� ����Ѵ�. #�� �߰��� ������ ���λ�(0x)�� ���� ��µȴ�.
		System.out.printf("octNum = %o, %d%n", kopo38_octNum, kopo38_octNum);
		// 8������ ����� ��� %o�� ����ϰ�, %d�� ����ϸ� 10�������� ��ȯ�Ǿ� ��µȴ�.
		System.out.printf("hexNum = %x, %d%n", kopo38_hexNum, kopo38_hexNum);
		// 16������ ����� ��� %x�� ����ϰ�, %d�� ����ϸ� 10�������� ��ȯ�Ǿ� ��µȴ�.
		System.out.printf("binNum = %s, %d%n", Integer.toBinaryString(kopo38_binNum), kopo38_binNum);
		// 2������ ����� ��� Integer.toBinaryString�� ���� ��ȯ�Ͽ� %s�� ����ϰ�, %d�� ����ϸ� 10�������� ��ȯ�Ǿ� ��µȴ�.

	}

}
