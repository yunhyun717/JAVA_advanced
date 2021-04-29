package kopo38_swc07;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class kopo38_P09_3 {

	static Calendar kopo38_calendar = Calendar.getInstance();
	static SimpleDateFormat kopo38_sdf = new SimpleDateFormat("YYYY.M.d HH:mm:ss");
	static ArrayList<kopo38_P09_1> kopo38_ArrayOneRec = new ArrayList<kopo38_P09_1>();
	// Ŭ�������� ����� �޼ҵ�� ArrayList�� �ҷ��´�.

	static int kopo38_pages = 0;
	static int kopo38_nums = 30;
	static int kopo38_sumkor = 0;
	static int kopo38_sumeng = 0;
	static int kopo38_summat = 0;
	static int kopo38_sumsum = 0;
	static int kopo38_sumave = 0;
	static int kopo38_sumkorall = 0;
	static int kopo38_sumengall = 0;
	static int kopo38_summatall = 0;
	static int kopo38_sumsumall = 0;
	static int kopo38_sumaveall = 0;
	static final int kopo38_iPerson = 200;
	// Ŭ�������� ����� ������ �����Ѵ�.(kopo38_nusm : �� �������� ��µ� �л� ��)

	public static void kopo38_dataSet() {
		for (int kopo38_i = 0; kopo38_i < kopo38_iPerson; kopo38_i++) {
			String kopo38_name = String.format("ȫ��%02d", kopo38_i + 1);
			int kopo38_kor = (int) (Math.random() * 100);
			int kopo38_eng = (int) (Math.random() * 100);
			int kopo38_mat = (int) (Math.random() * 100);
			kopo38_ArrayOneRec.add(new kopo38_P09_1(kopo38_i + 1, kopo38_name, kopo38_kor, kopo38_eng, kopo38_mat));
		}
	}
	// ������ ���������� �л� �� ��ŭ �й�, �л���, ����/����/���� ������ �����Ͽ� Ŭ������ �Է� ��
	// �ش� Ŭ������ ArrayList�� �����Ѵ�.

	public static void kopo38_HeaderPrint() {
		kopo38_pages++;
		System.out.printf("%25s\n", "��������ǥ");
		System.out.printf("%-9s%37s\n", "Page : " + kopo38_pages,
				"������� : " + kopo38_sdf.format(kopo38_calendar.getTime()));
		System.out.printf("==================================================\n");
		System.out.printf("%2s%3s%7s%5s%5s%7s%7s\n", "��ȣ", "�̸�", "����", "����", "����", "�հ�", "���");
		System.out.printf("==================================================\n");
	}
	// ���� ����� ��Ϻκ��� ����ϴ� �޼ҵ�

	public static void kopo38_ItemPrint(int kopo38_i) {
		kopo38_P09_1 kopo38_p09;
		kopo38_p09 = kopo38_ArrayOneRec.get(kopo38_i);
		System.out.printf("%03d %-5s%7d%7d%7d%8d%10.2f\n", kopo38_p09.kopo38_student_id(), kopo38_p09.kopo38_name(),
				kopo38_p09.kopo38_kor(), kopo38_p09.kopo38_eng(), kopo38_p09.kopo38_mat(), kopo38_p09.kopo38_sum(),
				kopo38_p09.kopo38_ave());
		kopo38_sumkor += kopo38_p09.kopo38_kor();
		kopo38_sumeng += kopo38_p09.kopo38_eng();
		kopo38_summat += kopo38_p09.kopo38_mat();
		kopo38_sumkorall += kopo38_p09.kopo38_kor();
		kopo38_sumengall += kopo38_p09.kopo38_eng();
		kopo38_summatall += kopo38_p09.kopo38_mat();
	}
	// ���� ����� ������ ����ϴ� �޼ҵ�. ������ ���� ������ �Բ� �� ���� ������ �������ش�.

	public static void kopo38_TailPrint(int kopo38_i) {
		System.out.printf("==================================================\n");
		System.out.printf("����������\n");
		System.out.printf("�հ�%14s%7s%7s%8s%10.2f\n", kopo38_sumkor, kopo38_sumeng, kopo38_summat,
				kopo38_sumkor + kopo38_sumeng + kopo38_summat, (kopo38_sumkor + kopo38_sumeng + kopo38_summat) / 3.0);
		System.out.printf("���%14.2f%7.2f%7.2f%8.2f%10.2f\n", kopo38_sumkor / (double) kopo38_nums,
				kopo38_sumeng / (double) kopo38_nums, kopo38_summat / (double) kopo38_nums,
				(kopo38_sumkor + kopo38_sumeng + kopo38_summat) / (double) kopo38_nums,
				(kopo38_sumkor + kopo38_sumeng + kopo38_summat) / 3.0 / (double) kopo38_nums);
		kopo38_sumkor = 0;
		kopo38_sumeng = 0;
		kopo38_summat = 0;
		System.out.printf("==================================================\n");
		System.out.printf("����������\n");
		System.out.printf("�հ�%14s%7s%7s%8s%10.2f\n", kopo38_sumkorall, kopo38_sumengall, kopo38_summatall,
				kopo38_sumkorall + kopo38_sumengall + kopo38_summatall,
				(kopo38_sumkorall + kopo38_sumengall + kopo38_summatall) / 3.0);
		System.out.printf("���%14.2f%7.2f%7.2f%8.2f%10.2f\n\n\n", kopo38_sumkorall / (double) (kopo38_i + kopo38_nums),
				kopo38_sumengall / (double) (kopo38_i + kopo38_nums),
				kopo38_summatall / (double) (kopo38_i + kopo38_nums),
				(kopo38_sumkorall + kopo38_sumengall + kopo38_summatall) / (double) (kopo38_i + kopo38_nums),
				(kopo38_sumkorall + kopo38_sumengall + kopo38_summatall) / 3.0 / (double) (kopo38_i + kopo38_nums));
	}
	// ���� ����� ���κ��� ����ϴ� �޼ҵ�. ���� ������ ���� ���� ��踦 ����Ѵ�.

	public static void main(String[] args) {
		kopo38_dataSet();
		for (int kopo38_i = 0; kopo38_i < kopo38_ArrayOneRec.size(); kopo38_i += 30) {
			kopo38_HeaderPrint();
			if (kopo38_i == kopo38_ArrayOneRec.size() - kopo38_ArrayOneRec.size() % kopo38_nums) {
				kopo38_nums = kopo38_ArrayOneRec.size() % kopo38_nums;
			}
			for (int kopo38_j = kopo38_i; kopo38_j < kopo38_i + kopo38_nums; kopo38_j++) {
				kopo38_ItemPrint(kopo38_j);
			}
			kopo38_TailPrint(kopo38_i);
		}
	}
	// ���� ����
	// �����͸� �����ϰ� ������ �����͸� ������ �������� �л����� ���� �������� ����Ѵ�.
	// �������� �л�����ŭ ����ϴٰ� �������� �л������� ���� �л����� ������ �׸�ŭ ����ϵ��� ������ ��� ����Ѵ�.
	// ��µ� �л����� ���� ���� �������� ����� ��(���)�� ������ �ֵ��� �Ѵ�.
}
