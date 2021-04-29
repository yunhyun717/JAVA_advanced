package kopo38_swc04;

public class kopo38_P07 {

	public static void main(String[] args) {
		String[] kopo38_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		// String 배열 kopo38_units를 위와 같이 설정
		// kopo38_units는 길이가 10이며 0부터 9까지의 정수 n에 대해 kopo38_units[n]은 n을 한글로 바꾼 결과가 나온다.
		for (int kopo38_i = 0; kopo38_i < 101; kopo38_i++) {
			if (kopo38_i >= 0 && kopo38_i < 10) {
				System.out.printf("일의자리 : %s\n", kopo38_units[kopo38_i]);
				// 0부터 100까지 향하는 정수 kopo38_i에 대해 kopo38_i가 0보다 크거나 같고 동시에 kopo38_i가 10보다 작으면
				// (한자리 수이면) 내용을 출력한다.
			} else if (kopo38_i >= 10 && kopo38_i < 100) {
				// kopo38_i가 10보다 크거나 같고 100보다 작으면 (두자리 수이면)
				int kopo38_i10, kopo38_i0;
				kopo38_i10 = kopo38_i / 10;
				// 정수 kopo38_i10을 kopo38_i를 10으로 나눈 몫으로 설정(따라서 kopo38_i10은 kopo38_i의 10의 자릿수)
				kopo38_i0 = kopo38_i % 10;
				// 정수 kopo38_i0는 kopo38_i를 10으로 나눈 나머지로 설정(따라서 kopo38_i0는 kopo38_i의 1의 자릿수)

				if (kopo38_i0 == 0) {
					System.out.printf("십의자리 : %s십\n", kopo38_units[kopo38_i10]);
				} else {
					System.out.printf("십의자리 : %s십%s\n", kopo38_units[kopo38_i10], kopo38_units[kopo38_i0]);
				}
				// kopo38_i0가 0이면(kopo38_i의 1의 자릿수가 0이면) 일의 자리를 읽을 필요가 없으므로 십의 자릿수만 출력
				// 그렇지 않으면 십의 자릿수에 십을 붙여서 출력하고 이어서 일의 자릿수를 출력.
			} else
				System.out.printf("==> %d\n", kopo38_i);
			// kopo38_i가 한자릿수 또는 두자릿수가 아닌 경우 (kopo38_i의 범위에 따라 100밖에 없음) 출력
		}
	}
}