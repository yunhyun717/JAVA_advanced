package kopo38_swc07;

import java.util.ArrayList;

public class kopo38_P08 {

	public static void main(String[] args) {
		int kopo38_iTestMAX = 10000000;
		ArrayList kopo38_iAL = new ArrayList();
		// 큰 정수와 ArrayList를 설정한다.

		for (int kopo38_i = 0; kopo38_i < kopo38_iTestMAX; kopo38_i++) {
			kopo38_iAL.add((int) (Math.random() * 10000000));
		}
		// 큰 크기의 정수만큼 random을 이용해 성분을 입력한다.

		for (int kopo38_i = 0; kopo38_i < kopo38_iAL.size(); kopo38_i++) {
			System.out.printf(" ArrayList %d = %s\n", kopo38_i, kopo38_iAL.get(kopo38_i));
		}
		// 내용을 출력한다.
		System.out.printf("*********************\n");
		kopo38_iAL.sort(null);
		// 순서를 정렬한다.
		for (int kopo38_i = 0; kopo38_i < kopo38_iAL.size(); kopo38_i++) {
			System.out.printf(" ArrayList %d = %s\n", kopo38_i, kopo38_iAL.get(kopo38_i));
		}
		// 내용을 출력한다.

	}
}
