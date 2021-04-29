package kopo38_swc05;

public class kopo38_P01 {

	public static void main(String[] args) {
		for (int kopo38_i = 1; kopo38_i < 10; kopo38_i += 3) {
			System.out.printf("************\t************\t************\n");
			System.out.printf(" 구구단 %d 단 \t 구구단 %d 단 \t 구구단 %d 단 \n", kopo38_i, kopo38_i + 1, kopo38_i + 2);
			System.out.printf("************\t************\t************\n");
			// 1부터 시작해 10보다 작은 3씩 증가하는 정수인 kopo38_i에 대해 kopo38_i에서 시작해 1씩 커지는 숫자를 이용해 구구단의
			// 제목을 가로로
			// 배치한다.
			for (int kopo38_j = 1; kopo38_j < 10; kopo38_j++) {
				System.out.printf(" %d * %d = %2d \t %d * %d = %2d \t %d * %d = %2d \n", kopo38_i, kopo38_j,
						kopo38_i * kopo38_j, kopo38_i + 1, kopo38_j, (kopo38_i + 1) * kopo38_j, kopo38_i + 2, kopo38_j,
						(kopo38_i + 2) * kopo38_j);
				// 1부터 시작해 10보다 작은 정수 kopo38_j에 대해 kopo38_i와 가로로 이어지는 kopo38_i+1, kopo38_i+2에 대한
				// 구구단을 kopo38_j와의 수식을 통해 출력한다.
			}
			// 좌측 상단부터 시작해 하단으로 읽는 구구단이 완성된다.
		}
	}
}
