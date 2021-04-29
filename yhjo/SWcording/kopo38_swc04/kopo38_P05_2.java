package kopo38_swc04;

public class kopo38_P05_2 {

	public static void main(String[] args) {
		// 여기서도 마찬가지로 마지막 날 다음의 ','를 없애고자한다.
		for (int kopo38_i = 1; kopo38_i < 13; kopo38_i++) {
			System.out.printf(" %d월 => 1", kopo38_i);
			KOPO38_LOOP: for (int kopo38_j = 2; kopo38_j < 32; kopo38_j++) {
				System.out.printf(" ,%d", kopo38_j);
				// 앞서와 같이 시작할 때 1을 미리 써주고 날짜를 2일부터 시작하도록 했다.
				switch (kopo38_i) {
				case 4:
				case 6:
				case 9:
				case 11:
					if (kopo38_j == 30)
						break KOPO38_LOOP;
					break;

				case 2:
					if (kopo38_j == 28)
						break KOPO38_LOOP;
					break;

				}
			}
			System.out.printf("\n");
			// 나머지 부분은 동일
		}

	}

}
