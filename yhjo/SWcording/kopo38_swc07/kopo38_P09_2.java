package kopo38_swc07;

import java.util.ArrayList;

public class kopo38_P09_2 {

	static ArrayList<kopo38_P09_1> kopo38_ArrayOneRec = new ArrayList<kopo38_P09_1>();
	// ArrayList�� ����

	static int kopo38_sumkor = 0;
	static int kopo38_sumeng = 0;
	static int kopo38_summat = 0;
	static int kopo38_sumsum = 0;
	static int kopo38_sumave = 0;
	// ���� ������ �����ϰ� �ʱⰪ�� �����Ѵ�.
	static final int kopo38_iPerson = 20;
	// ������ �л� ���� �����Ѵ�.

	public static void kopo38_dataSet() {
		for (int kopo38_i = 0; kopo38_i < kopo38_iPerson; kopo38_i++) {
			String kopo38_name = String.format("ȫ��%02d", kopo38_i);
			int kopo38_kor = (int) (Math.random() * 100);
			int kopo38_eng = (int) (Math.random() * 100);
			int kopo38_mat = (int) (Math.random() * 100);
			kopo38_ArrayOneRec.add(new kopo38_P09_1(kopo38_i, kopo38_name, kopo38_kor, kopo38_eng, kopo38_mat));
		}
		// �л� ���� ���� ��ȣ, �̸��� ������� �Է��ϰ�, ����/����/���� ������ random���� �����Ͽ� kopo38_P09_1 Ŭ������ �Է��ϰ�
		// ArrayList�� �߰��Ѵ�.
	}

	public static void kopo38_HeaderPrint() {
		System.out.printf("****************************************\n");
		System.out.printf("%2s %4s %2s %2s %2s %2s   %2s\n", "��ȣ", "�̸�", "����", "����", "����", "�հ�", "���");
		System.out.printf("****************************************\n");
	}
	// ���� ��µǴ� �κ��� ��� �κ��� �����Ѵ�.

	public static void kopo38_ItemPrint(int kopo38_i) {
		// ������ ����ϴ� �޼ҵ带 �����Ѵ�.
		kopo38_P09_1 kopo38_p09;
		kopo38_p09 = kopo38_ArrayOneRec.get(kopo38_i);
		// kopo38_P09_1 �޼ҵ带 �����ϰ� ArrayList���� �Էµ� ���� ���ڹ�°�� Ŭ������ �ҷ��´�.
		System.out.printf("%4d %4s %3d  %3d  %3d  %3d  %6.2f\n", kopo38_p09.kopo38_student_id(),
				kopo38_p09.kopo38_name(), kopo38_p09.kopo38_kor(), kopo38_p09.kopo38_eng(), kopo38_p09.kopo38_mat(),
				kopo38_p09.kopo38_sum(), kopo38_p09.kopo38_ave());
		kopo38_sumkor += kopo38_p09.kopo38_kor();
		kopo38_sumeng += kopo38_p09.kopo38_eng();
		kopo38_summat += kopo38_p09.kopo38_mat();
		kopo38_sumsum += kopo38_p09.kopo38_sum();
		kopo38_sumave += kopo38_p09.kopo38_ave();
		// Ŭ������ �޼ҵ带 �̿��� ������ ����ϰ� ���� ������ �� ���� �����ش�.
	}

	public static void kopo38_TailPrint() {
		System.out.printf("****************************************\n");
		System.out.printf("    �����հ� %4.4s   �������: %6.2f\n", kopo38_sumkor,
				kopo38_sumkor / (double) kopo38_ArrayOneRec.size());
		System.out.printf("    �����հ� %4.4s   �������: %6.2f\n", kopo38_sumeng,
				kopo38_sumeng / (double) kopo38_ArrayOneRec.size());
		System.out.printf("    �����հ� %4.4s   �������: %6.2f\n", kopo38_summat,
				kopo38_summat / (double) kopo38_ArrayOneRec.size());
		System.out.printf("****************************************\n");
		System.out.printf("    ������հ� %d   �����: %6.2f\n", kopo38_sumave,
				kopo38_sumave / (double) kopo38_ArrayOneRec.size());
	}
	// ���� ������ �̿��� ���� ��µǴ� �κ��� �ϴ� �κ��� �����Ѵ�.

	public static void main(String[] args) {
		kopo38_dataSet();
		kopo38_HeaderPrint();
		for (int kopo38_i = 0; kopo38_i < kopo38_ArrayOneRec.size(); kopo38_i++) {
			kopo38_ItemPrint(kopo38_i);
		}
		kopo38_TailPrint();
		// ���ο��� �޼ҵ� ����κи� �����.
	}
}
