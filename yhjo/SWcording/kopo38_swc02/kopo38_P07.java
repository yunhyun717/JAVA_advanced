package kopo38_swc02;

import java.util.Scanner;

public class kopo38_P07 {

	public static void main(String[] args) {
		
		String kopo38_url = "www.codechobo.com";
		// String kopo38_url�� �����Ѵ�.
		
		float kopo38_f1 = .10f;
		// float kopo38_f1�� �����Ѵ�. �Ҽ��� ��� ���� f�� �ٿ� �Ҽ����� ǥ���Ѵ�. 
		float kopo38_f2 = 1e1f;
		// float kopo38_f2�� �ε��Ҽ���ǥ��������� �����Ѵ�.
		// e���� ���ڿ� ���� �Ҽ����� e ���� ���ڸ�ŭ(������ ��� ��������, ����� ��� ��������) ������ ���� �ǹ��Ѵ�.
		// �� ��� 1�� �Ҽ���(1.0�̹Ƿ�)�� 1��ŭ �������� ���������Ƿ� 10.0�� ǥ���� ���̴�.
		float kopo38_f3 = 3.14e3f;
		// float kopo38_f3�� �ε��Ҽ���ǥ��������� �����Ѵ�.
		// 3.14�� �Ҽ����� 3��ŭ �������� ���������Ƿ� 3140�� �ȴ�.
		double kopo38_d = 1.2345678;
		// double d�� 1.2345678�� �����Ѵ�.
		
		System.out.printf("f1 = %f, %e, %g%n", kopo38_f1, kopo38_f1,kopo38_f1);
		System.out.printf("f2 = %f, %e, %g%n", kopo38_f2, kopo38_f2,kopo38_f2);
		System.out.printf("f3 = %f, %e, %g%n", kopo38_f3, kopo38_f3,kopo38_f3);
		// kopo38_f1, f2, f3�� ���� ������ �������� ����Ѵ�.
		// %f�� �Ϲ� �Ҽ� ǥ��, %e�� �ε��Ҽ���ǥ�����, %g�� �Ҽ��� ���̿� ���� �Ϲ� �Ǵ� �ε��Ҽ���ǥ��������� ����Ѵ�.
		
		System.out.printf("d = %f%n", kopo38_d);
		System.out.printf("d = %14.10f%n", kopo38_d);
		// kopo38_d�� ������ �������� ����Ѵ�.
		// %f�� �Ϲ� �Ҽ� ǥ������ ���
		// %m.nf�� m��ŭ�� �������� �ش� �Ҽ��� �Ҽ��� n�ڸ���ŭ ����Ѵٴ� ���̴�.
		
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", kopo38_url);
		System.out.printf("[%20s]%n", kopo38_url);
		System.out.printf("[%-20s]%n", kopo38_url);
		// String�� ""�ȿ� �׳� �Է��ϰų� %s�� ����� �� �ִ�.
		// %ns�� n�� ����̸� ���������Ͽ� nĭ�� �����ϵ��� ����ϰ�, n�� �����̸� ���������Ͽ� nĭ�� �����ϵ��� ����Ѵ�.
		System.out.printf("[%.8s]%n", kopo38_url);	}
		// %m.ns�� mĭ�� �����ϸ鼭 n��° ���ڱ��� ����Ѵ�. 

}
