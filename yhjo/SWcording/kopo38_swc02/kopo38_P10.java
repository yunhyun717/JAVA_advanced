package kopo38_swc02;

import java.util.Scanner;

public class kopo38_P10 {

	public static void main(String[] args) {

		int kopo38_i = 10;
		byte kopo38_b = (byte) kopo38_i;
		// ���� kopo38_i�� byte kopo38_b�� �����Ѵ�.
		// kopo38_b�� kopo38_i�� byte ��ȯ�� ������ �����Ѵ�.
		System.out.printf("[int -> byte] i=%d -> b=%d%n", kopo38_i, kopo38_b);
		// ������ �������� ����Ѵ�.
		kopo38_i = 300;
		kopo38_b = (byte) kopo38_i;
		// kopo38_i�� 300���� �����ϰ� kopo38_b�� kopo38_i�� byte ��ȯ�� ������ �����Ѵ�.
		// ���� 300�� byte�� ����(256)�� �Ѿ�� ������ kopo38_b�� 300%256 = 44
		System.out.printf("[int -> byte] i=%d -> b=%d%n", kopo38_i, kopo38_b);
		// ������ �������� ����Ѵ�.
		kopo38_b = 10;
		kopo38_i = (int) kopo38_b;
		// kopo38_b�� 10���� �����ϰ� kopo38_i�� kopo38_b�� ���� ��ȯ�� ������ �����Ѵ�.
		System.out.printf("[byte -> int] b=%d -> i=%d%n", kopo38_b, kopo38_i);
		// ������ �������� ����Ѵ�.
		kopo38_b = 2;
		kopo38_i = (int) kopo38_b;
		// kopo38_b�� 2�� �����ϰ� kopo38_i�� kopo38_b�� ���� ��ȯ�� ������ �����Ѵ�.
		// byte�� ������ int�� �������� �۱� ������ byte�� int ��ȯ������ ������ �߻����� �ʴ´�.
		System.out.printf("[byte -> int] b=%d -> i=%d%n", kopo38_b, kopo38_i);
		// ������ �������� ����Ѵ�.
	}
}
