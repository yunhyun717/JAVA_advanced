package kopo38_swc07;

import java.util.ArrayList;

public class kopo38_P07 {

	public static void main(String[] args) {
		ArrayList kopo38_iAL = new ArrayList();
		// ArrayList�� �����Ѵ�.

		kopo38_iAL.add("abc");
		kopo38_iAL.add("abcd");
		kopo38_iAL.add("efga");
		kopo38_iAL.add("������0");
		kopo38_iAL.add("1234");
		kopo38_iAL.add("12rk34");
		// ArrayList�� ������ �߰��Ѵ�.

		System.out.printf("*********************\n");
		System.out.printf(" ���� ArraySize %d \n", kopo38_iAL.size());
		// ArrayList�� ũ�⸦ ����Ѵ�.
		for (int kopo38_i = 0; kopo38_i < kopo38_iAL.size(); kopo38_i++) {
			System.out.printf(" ArrayList %d = %s\n", kopo38_i, kopo38_iAL.get(kopo38_i));
		}
		// ArrayList�� �� ������ ����Ѵ�.

		kopo38_iAL.set(3, "������");
		// 3��° ������ �����Ѵ�.
		System.out.printf("*********************\n");
		System.out.printf(" ���뺯�� ArraySize %d \n", kopo38_iAL.size());
		for (int kopo38_i = 0; kopo38_i < kopo38_iAL.size(); kopo38_i++) {
			System.out.printf(" ArrayList %d = %s\n", kopo38_i, kopo38_iAL.get(kopo38_i));
		}
		// ArrayList�� �� ������ ����Ѵ�. 
		kopo38_iAL.remove(4);
		// �׹�° ������ �����Ѵ�.
		System.out.printf("*********************\n");
		System.out.printf(" ���뺯�� ArraySize %d \n", kopo38_iAL.size());
		for (int kopo38_i = 0; kopo38_i<kopo38_iAL.size(); kopo38_i++) {
			System.out.printf(" ArrayList %d = %s\n", kopo38_i, kopo38_iAL.get(kopo38_i));
		}
		// ArrayList�� �� ������ ����Ѵ�.
		
		kopo38_iAL.sort(null);
		// ASCII ������ ������ �����Ѵ�.
		System.out.printf("*********************\n");
		System.out.printf(" ����ƮSort ArraySize %d \n", kopo38_iAL.size());
		for (int kopo38_i = 0; kopo38_i<kopo38_iAL.size(); kopo38_i++) {
			System.out.printf(" ArrayList %d = %s\n", kopo38_i, kopo38_iAL.get(kopo38_i));
		}
		// ArrayList�� �� ������ ����Ѵ�.
		
		kopo38_iAL.clear();
		// ������ ����.
		System.out.printf("*********************\n");
		System.out.printf(" ���λ��� ArraySize %d \n", kopo38_iAL.size());
		for (int kopo38_i = 0; kopo38_i<kopo38_iAL.size(); kopo38_i++) {
			System.out.printf(" ArrayList %d = %s\n", kopo38_i, kopo38_iAL.get(kopo38_i));
		}
		// ArrayList�� �� ������ ����Ѵ�.

	}
}
