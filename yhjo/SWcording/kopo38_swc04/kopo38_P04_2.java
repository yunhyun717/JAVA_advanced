package kopo38_swc04;

public class kopo38_P04_2 {

	public static void main(String[] args) {
		// 앞서 매달 마지막 날 끝에 ','가 붙는 것을 수정하려 한다.
		for (int kopo38_i = 1; kopo38_i < 13; kopo38_i++) {
			System.out.printf(" %d월 => 1", kopo38_i);
			// 모든 달에 1일은 공통적으로 존재하므로 1일을 적고 시작한다.
			for (int kopo38_j = 2; kopo38_j < 32; kopo38_j++) {
				System.out.printf(" ,%d", kopo38_j);
				// 2일부터 적도록 하지만 ','를 앞에 붙여서 마지막 날의 끝에 ','가 붙지 않도록 한다.
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
			}
			System.out.printf("\n");
			// 그 외는 동일
		}
	}
}
