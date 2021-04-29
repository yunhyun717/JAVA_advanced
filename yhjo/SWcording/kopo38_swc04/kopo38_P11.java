package kopo38_swc04;

public class kopo38_P11 {

	public static void main(String[] args) {
		int kopo38_n, kopo38_m;
		kopo38_m = 20;
		kopo38_n = 1;
		// 정수 kopo38_m을 20, kopo38_n을 1로 설정한다.
		while (true) {
			// break가 될 때까지 반복
			for (int kopo38_i = 0; kopo38_i < kopo38_m; kopo38_i++)
				System.out.printf(" ");
			// 0부터 시작해 m보다 작은 정수 i에 대해 빈칸을 출력한다. 즉, 빈칸이 kopo38_m개 생긴다.
			for (int kopo38_i = 0; kopo38_i < kopo38_n; kopo38_i++)
				System.out.printf("★");
			// 0부터 시작해 n보다 작은 정수 i에 대해 "★"을 출력한다. 즉, "★"이 kopo38_n개 생긴다.
			System.out.printf("\n");
			// 한 줄을 추가
			kopo38_m = kopo38_m - 1;
			kopo38_n = kopo38_n + 2;
			// kopo38_m에서는 1을 빼고, kopo38_n에는 2를 더한다.
			if (kopo38_m < 0)
				break;
			// kopo38_m이 0보다 작아지면 break
		}
	}

}
