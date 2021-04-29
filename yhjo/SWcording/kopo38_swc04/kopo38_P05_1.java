package kopo38_swc04;

public class kopo38_P05_1 {

	public static void main(String[] args) {
		for (int kopo38_i = 1; kopo38_i < 13; kopo38_i++) {
			System.out.printf(" %d월 =>", kopo38_i);
			// 1부터 13까지의 정수 kopo38_i에 대해 내용을 출력
			KOPO38_LOOP: for (int kopo38_j = 1; kopo38_j < 32; kopo38_j++) {
				System.out.printf("%d, ", kopo38_j);
				// KOPO38_LOOP 라벨을 설정한다. 라벨을 이용해 해당 반복문을 빠져나올 수 있다.
				// 1부터 32까지의 정수 kopo38_j에 대해 내용을 출력
				switch (kopo38_i) {
				case 4:
				case 6:
				case 9:
				case 11:
					if (kopo38_j == 30)
						break KOPO38_LOOP;
					break;
				// 정수 kopo38_i가 4, 6, 9, 11인 경우 kopo38_j가 30이면 break하고 반복문을 빠져나간다.
				// 아니면 여기서 break 후 반복문 계속 시행
				case 2:
					if (kopo38_j == 28)
						break KOPO38_LOOP;
					break;
				// 정수 kopo38_i가 2인 경우 kopo38_j가 28이면 break하고 반복문을 빠져나간다.
				// 아니면 여기서 break 후 반복문 계속 시행
				}
			}
			System.out.printf("\n");
			// i가 증가하기 전 한 줄 추가
		}

	}

}
