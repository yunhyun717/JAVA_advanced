package kopo38_swc02;

import java.util.Scanner;

public class kopo38_P05 {

	public static void main(String[] args) {
		
		Scanner kopo38_scanner = new Scanner(System.in);
		// ������� �Է��� �ޱ� ���� Scanner�� �ҷ����� import���ش�.
		
		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");
		// print�� println�� �޸� ���� �� ���ٿ��� �������� �ʴ´�.
		
		String kopo38_input = kopo38_scanner.nextLine();
		// Scanner�� �̿��� ���� �Է��ϴ� ���� String kopo38_input���� �����Ѵ�.
		
		int kopo38_num = Integer.parseInt(kopo38_input);
		// ���� kopo38_num�� kopo38_input�� ������ȯ�� ������ �����Ѵ�.
		
		System.out.println("�Է³��� : " + kopo38_input);
		System.out.printf("num=%d%n", kopo38_num);
		// ������ �������� ����Ѵ�.
		// printf�� ����� ���� ����� ���� ������ �� �ִ�.(%d = ����, %n = ���๮��)
	}

}
