package kopo38_swc03;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class kopo38_P14 {

	public static void main(String[] args) {
		Calendar kopo38_calt = Calendar.getInstance();
		// Calendar Ŭ������ �ҷ��´�. kopo38_calt�� �ҷ��� �� ������ ��¥ ���� ������ �ҷ��� �� �ִ�.
		SimpleDateFormat kopo38_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		// SimpleDateFormat Ŭ������ �ҷ��´�. kopo38_sdt�� �ҷ��� �� ������, ������ �������� ��¥ ������ ������ �� �ִ�.
		System.out.printf("��������ð�: %s\n", kopo38_sdt.format(kopo38_calt.getTime()));
		System.out.printf("******************************\n");
		// String ���̹Ƿ� %s�� �ҷ�����, �ռ� SimpleDateFormat���� ������ �������� getTime()��ɾ ���� ���� ��¥��
		// �ҷ��´�.
	}

}
