package kopo38_swc06;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class kopo38_P13_2 {

	public static void main(String[] args) {
		int kopo38_iPerson = 30;

		kopo38_InputData kopo38_inData = new kopo38_InputData(kopo38_iPerson);
		Calendar kopo38_calendar = Calendar.getInstance();
		SimpleDateFormat kopo38_sdf = new SimpleDateFormat("YYYY.M.d HH:mm:ss");
		// Ŭ�������� ����� �޼ҵ带 �ҷ��´�.

		for (int kopo38_i = 0; kopo38_i < kopo38_iPerson; kopo38_i++) {
			String kopo38_name = String.format("ȫ��%02d", kopo38_i);
			int kopo38_kor = (int) (Math.random() * 100);
			int kopo38_eng = (int) (Math.random() * 100);
			int kopo38_mat = (int) (Math.random() * 100);
			kopo38_inData.kopo38_setData(kopo38_i, kopo38_name, kopo38_kor, kopo38_eng, kopo38_mat);
		}
		// ������ ���� ������ �Է��Ѵ�.

		System.out.printf("%25s\n", "��������ǥ");
		System.out.printf("%49s\n", "������� : " + kopo38_sdf.format(kopo38_calendar.getTime()));
		System.out.printf("=====================================================\n");
		System.out.printf("��ȣ  �̸�     ����   ����   ����   ����      ���\n", kopo38_sdf.format(kopo38_calendar.getTime()));
		System.out.printf("=====================================================\n");
		// ������ �������� ������ ����Ѵ�.
		int kopo38_kor_sum = 0;
		int kopo38_eng_sum = 0;
		int kopo38_mat_sum = 0;
		// �� ������ �տ� �ʱⰪ�� �����Ѵ�.
		for (int kopo38_i = 0; kopo38_i < kopo38_iPerson; kopo38_i++) {
			System.out.printf("%03d%7s%7d%7d%7d%7d%13.6f\n", kopo38_i + 1, kopo38_inData.kopo38_name[kopo38_i],
					kopo38_inData.kopo38_kor[kopo38_i], kopo38_inData.kopo38_eng[kopo38_i],
					kopo38_inData.kopo38_mat[kopo38_i], kopo38_inData.kopo38_sum[kopo38_i],
					kopo38_inData.kopo38_ave[kopo38_i]);
			kopo38_kor_sum += kopo38_inData.kopo38_kor[kopo38_i];
			kopo38_eng_sum += kopo38_inData.kopo38_eng[kopo38_i];
			kopo38_mat_sum += kopo38_inData.kopo38_mat[kopo38_i];
		}
		// 0���� ������ kopo38_iPerson���� ���� ���� kopo38_i�� ����
		// ������ ����ϰ� �� ���� ������ �տ� �ش� ���� ������ �����ش�.
		System.out.printf("=====================================================\n");
		System.out.printf("�հ�    %11d%7d%7d%7d%13.6f\n", kopo38_kor_sum, kopo38_eng_sum, kopo38_mat_sum,
				(kopo38_kor_sum + kopo38_eng_sum + kopo38_mat_sum),
				((kopo38_kor_sum + kopo38_eng_sum + kopo38_mat_sum) / 3.0));
		System.out.printf("���    %11.2f%7.2f%7.2f%7.2f%13.6f\n", kopo38_kor_sum / 30.0, kopo38_eng_sum / 30.0,
				kopo38_mat_sum / 30.0, (kopo38_kor_sum + kopo38_eng_sum + kopo38_mat_sum) / 30.0,
				((kopo38_kor_sum + kopo38_eng_sum + kopo38_mat_sum) / 3.0) / 30.0);
		// �� ������ ������ �̿��� ������ ����Ѵ�.
	}
}
