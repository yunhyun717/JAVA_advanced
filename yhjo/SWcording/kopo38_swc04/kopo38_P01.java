package kopo38_swc04;

public class kopo38_P01 {

	public static void main(String[] args) {
		int kopo38_iA, kopo38_iB;
		kopo38_iA = 0;
		// 정수 kopo38_iA와 kopo38_iB를 생성하고 kopo38_iA는 0으로 설정
		while (true) {
			// while (true) 무한 반복이다.(break 걸릴 때 까지)
			kopo38_iB = 0;
			// kopo38_iB를 0으로 설정(처음으로 돌아올 때마다 계속 반복됨)
			while (true) {
				// 이중 while (true) 마찬가지로 break가 걸릴 때 까지 반복
				System.out.printf("*");
				if (kopo38_iA == kopo38_iB)
					break;
				kopo38_iB++;
				// "*"을 계속해서 찍고 kopo38_iA와 kopo38_iB가 같아지면 break한다.
				// 그렇지 않으면 kopo38_iB에 1씩 더한다.
			}
			System.out.printf("\n");
			// "*"를 찍고 한 줄 내려간다.
			kopo38_iA++;
			// kopo38_iA에 1씩 더한다.
			if (kopo38_iA == 30)
				break;
			// kopo38_iA가 30이 되면 break
		}
	}
}
