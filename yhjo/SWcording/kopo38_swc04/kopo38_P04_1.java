package kopo38_swc04;

public class kopo38_P04_1 {

	public static void main(String[] args) {
		for (int kopo38_i = 1; kopo38_i < 13; kopo38_i++) {
			System.out.printf(" %d월 =>", kopo38_i);
			// 1부터 12까지의 정수 kopo38_i에 대해 내용을 출력한다.
			for (int kopo38_j = 1; kopo38_j < 32; kopo38_j++) {
				System.out.printf("%d, ", kopo38_j);
				// 이어서 1부터 31까지의 정수 kopo38_j에 대해 내용을 출력한다.
				if (kopo38_i == 1 && kopo38_j == 31)
					break;
				if (kopo38_i == 2 && kopo38_j == 28)
					break;
				if (kopo38_i == 3 && kopo38_j == 31)
					break;
				if (kopo38_i == 4 && kopo38_j == 30)
					break;
				if (kopo38_i == 5 && kopo38_j == 31)
					break;
				if (kopo38_i == 6 && kopo38_j == 30)
					break;
				if (kopo38_i == 7 && kopo38_j == 31)
					break;
				if (kopo38_i == 8 && kopo38_j == 31)
					break;
				if (kopo38_i == 9 && kopo38_j == 30)
					break;
				if (kopo38_i == 10 && kopo38_j == 31)
					break;
				if (kopo38_i == 11 && kopo38_j == 30)
					break;
				if (kopo38_i == 12 && kopo38_j == 31)
					break;
				// kopo38_i와 kopo38_j에 대한 각각의 if에 대해
				// 조건이 둘 다 성립하면(&& 이용) break
			}
			System.out.printf("\n");
			// kopo38_i가 증가하기 전 한줄을 추가한다.
		}
	}

}
