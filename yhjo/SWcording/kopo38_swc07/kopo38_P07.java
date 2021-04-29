package kopo38_swc07;

import java.util.ArrayList;

public class kopo38_P07 {

	public static void main(String[] args) {
		ArrayList kopo38_iAL = new ArrayList();
		// ArrayList를 생성한다.

		kopo38_iAL.add("abc");
		kopo38_iAL.add("abcd");
		kopo38_iAL.add("efga");
		kopo38_iAL.add("가나다0");
		kopo38_iAL.add("1234");
		kopo38_iAL.add("12rk34");
		// ArrayList에 성분을 추가한다.

		System.out.printf("*********************\n");
		System.out.printf(" 시작 ArraySize %d \n", kopo38_iAL.size());
		// ArrayList의 크기를 출력한다.
		for (int kopo38_i = 0; kopo38_i < kopo38_iAL.size(); kopo38_i++) {
			System.out.printf(" ArrayList %d = %s\n", kopo38_i, kopo38_iAL.get(kopo38_i));
		}
		// ArrayList의 각 성분을 출력한다.

		kopo38_iAL.set(3, "가라라라");
		// 3번째 성분을 변경한다.
		System.out.printf("*********************\n");
		System.out.printf(" 내용변경 ArraySize %d \n", kopo38_iAL.size());
		for (int kopo38_i = 0; kopo38_i < kopo38_iAL.size(); kopo38_i++) {
			System.out.printf(" ArrayList %d = %s\n", kopo38_i, kopo38_iAL.get(kopo38_i));
		}
		// ArrayList의 각 성분을 출력한다. 
		kopo38_iAL.remove(4);
		// 네번째 성분을 삭제한다.
		System.out.printf("*********************\n");
		System.out.printf(" 내용변경 ArraySize %d \n", kopo38_iAL.size());
		for (int kopo38_i = 0; kopo38_i<kopo38_iAL.size(); kopo38_i++) {
			System.out.printf(" ArrayList %d = %s\n", kopo38_i, kopo38_iAL.get(kopo38_i));
		}
		// ArrayList의 각 성분을 출력한다.
		
		kopo38_iAL.sort(null);
		// ASCII 순서로 성분을 정렬한다.
		System.out.printf("*********************\n");
		System.out.printf(" 리스트Sort ArraySize %d \n", kopo38_iAL.size());
		for (int kopo38_i = 0; kopo38_i<kopo38_iAL.size(); kopo38_i++) {
			System.out.printf(" ArrayList %d = %s\n", kopo38_i, kopo38_iAL.get(kopo38_i));
		}
		// ArrayList의 각 성분을 출력한다.
		
		kopo38_iAL.clear();
		// 내용을 비운다.
		System.out.printf("*********************\n");
		System.out.printf(" 전부삭제 ArraySize %d \n", kopo38_iAL.size());
		for (int kopo38_i = 0; kopo38_i<kopo38_iAL.size(); kopo38_i++) {
			System.out.printf(" ArrayList %d = %s\n", kopo38_i, kopo38_iAL.get(kopo38_i));
		}
		// ArrayList의 각 성분을 출력한다.

	}
}
