package kopo38_swc04;

public class kopo38_P09 {

	public static void main(String[] args) {
		for (int kopo38_i = 0; kopo38_i < 10; kopo38_i++) {
			// 0부터 시작해 10보다 작은 정수 kopo38_i에 대해
			for (int kopo38_j = 0; kopo38_j < kopo38_i; kopo38_j++)
				// 또 0부터 시작해 i보다 작은 정수 j에 대해
				System.out.printf(" ");
			// 빈칸을 출력. 즉, 빈칸이 kopo38_i개 생김
			System.out.printf("%d\n", kopo38_i);
			// 줄의 마지막에 kopo38_i를 출력하고 새 줄을 추가한다.
		}
	}

}
