package kopo38_swc07;

import java.util.ArrayList;

public class kopo38_P08 {

	public static void main(String[] args) {
		int kopo38_iTestMAX = 10000000;
		ArrayList kopo38_iAL = new ArrayList();
		// ū ������ ArrayList�� �����Ѵ�.

		for (int kopo38_i = 0; kopo38_i < kopo38_iTestMAX; kopo38_i++) {
			kopo38_iAL.add((int) (Math.random() * 10000000));
		}
		// ū ũ���� ������ŭ random�� �̿��� ������ �Է��Ѵ�.

		for (int kopo38_i = 0; kopo38_i < kopo38_iAL.size(); kopo38_i++) {
			System.out.printf(" ArrayList %d = %s\n", kopo38_i, kopo38_iAL.get(kopo38_i));
		}
		// ������ ����Ѵ�.
		System.out.printf("*********************\n");
		kopo38_iAL.sort(null);
		// ������ �����Ѵ�.
		for (int kopo38_i = 0; kopo38_i < kopo38_iAL.size(); kopo38_i++) {
			System.out.printf(" ArrayList %d = %s\n", kopo38_i, kopo38_iAL.get(kopo38_i));
		}
		// ������ ����Ѵ�.

	}
}
