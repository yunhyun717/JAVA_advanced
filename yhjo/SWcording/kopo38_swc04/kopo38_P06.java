package kopo38_swc04;

public class kopo38_P06 {

	public static void main(String[] args) {
		int[] kopo38_iLMD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// 정수 배열 kopo38_iLMD를 위와 같이 설정
		for (int kopo38_i = 1; kopo38_i < 13; kopo38_i++) {
			System.out.printf(" %d월 =>", kopo38_i);
			// 1부터 12까지의 정수 kopo38_i에 대해 내용을 출력
			for (int kopo38_j = 1; kopo38_j < 32; kopo38_j++) {
				System.out.printf("%d", kopo38_j);
				// 1부터 31까지의 정수 kopo38_j에 대해 다음을 출력
				if (kopo38_iLMD[kopo38_i - 1] == kopo38_j)
					break;
				// 만약 kopo38_iLMD배열의 kopo38_i-1번째 항목이 kopo38_j와 같다면 break
				// 배열의 항목은 0번째부터 시작하므로 1부터 시작하는 월과 차이를 없애기 위해 1을 빼준다.
				System.out.print(",");
				// 달의 마지막 날이면 위의 조건문에서 break되므로 마지막 날 뒤에 ','가 붙지 않는다.
			}
			System.out.printf("\n");
			// kopo38_i가 1 증가하기 전에 한 줄 추가
		}
	}
}
