package kopo38_swc07;

public class kopo38_P05 {

	public static void main(String[] args) {
		int[] kopo38_iArray = { 1, 7, 5, 3, 2, 1, 3, 4, 9, 12, 1, 212, 33, 11, 21, 11, 2121, 121, 11, 5, 6, 33 };
		// 정수 배열을 설정한다.

		for (int kopo38_i = 0; kopo38_i < kopo38_iArray.length; kopo38_i++) {
			System.out.printf("iArray[%d]=%d\n", kopo38_i, kopo38_iArray[kopo38_i]);
		}
		// 배열의 각 성분을 순서대로 출력한다.

		int kopo38_iMax = kopo38_iArray[0];
		// 배열의 첫번째 성분을 초기값으로 설정한다.
		int kopo38_iMaxPt = 0;
		// 최대값이 배열의 몇번째 성분인지 확인하는 정수를 설정하고 초기값을 0으로 한다.(현재 초기값이 0번째 성분으로 되어있으므로)
		for (int kopo38_i = 0; kopo38_i < kopo38_iArray.length; kopo38_i++) {
			if (kopo38_iMax < kopo38_iArray[kopo38_i]) {
				kopo38_iMax = kopo38_iArray[kopo38_i];
				kopo38_iMaxPt = kopo38_i;
			}
		}
		// 조건식으로 최대값을 설정해주고 최대값이 변함에 따라 성분의 번호도 바꿔준다.
		System.out.printf("MAX : iArray[%d]=%d]\n", kopo38_iMaxPt, kopo38_iMax);
		// 결과를 출력한다.
	}
}
