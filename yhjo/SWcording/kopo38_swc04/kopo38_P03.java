package kopo38_swc04;

public class kopo38_P03 {

	public static void main(String[] args) {
		int kopo38_iVal;
		// 정수 kopo38_iVal을 설정
		for (int kopo38_i = 0; kopo38_i < 300; kopo38_i++) {
			kopo38_iVal = 5 * kopo38_i;
			// 0부터 시작해 300보다 작은 1씩 커지는 kopo38_i에 대해 kopo38_iVal을 5*i로 설정
			// 즉, kopo38_iVal은 0부터 시작해 5*300=1500보다 작은 5의 배수가 된다.
			if (kopo38_iVal >= 0 && kopo38_iVal < 10)
				System.out.printf("일 %d\n", kopo38_iVal);
			// &&는 좌우의 조건을 모두 만족할 때 true 값을 가진다.
			// 즉, 위 조건은 kopo38_iVal이 0보다 크거나 같고 동시에 10보다 작을 때이다.
			// 조건을 만족하면 내용을 출력
			else if (kopo38_iVal >= 10 && kopo38_iVal < 100)
				System.out.printf("십 %d\n", kopo38_iVal);
			// kopo38_iVal이 10보다 크거나 같고 100보다 작으면 내용을 출력
			else if (kopo38_iVal >= 100 && kopo38_iVal < 1000)
				System.out.printf("백 %d\n", kopo38_iVal);
			// kopo38_iVal이 100보다 크거나 같고 1000보다 작으면 내용을 출력
			else
				System.out.printf("천 %d\n", kopo38_iVal);
			// 이외의 경우 내용을 출력
		}
	}

}
