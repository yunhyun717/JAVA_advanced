package kopo38_swc04;

public class kopo38_P10 {

	public static void main(String[] args) {
		double kopo38_fSin;
		for (int kopo38_i = 0; kopo38_i < 360; kopo38_i++) {
			// 0부터 시작해 360보다 작은 정수 kopo38_i에 대해
			kopo38_fSin = Math.sin(kopo38_i * 3.141592 / 180);
			// double kopo38_fSin을 sin(kopo38_i*3.141592/180)으로 설정
			// Math.sin함수에서 인자는 라디안 값을 가지므로 변환을 해줘야한다.
			// 라디안값 = 도*π/180이므로 kopo38_i를 변환하기위해 π의 근사값인 3.141592를 이용해 위와 같이 계산한다.
			System.out.printf("%d sin ==>%f\n", kopo38_i, kopo38_fSin);
			// kopo38_i와 kopo38_fSin을 위와 같이 출력
		}
		for (int kopo38_i = 0; kopo38_i < 360; kopo38_i++) {
			// 0부터 시작해 360보다 작은 정수 kopo38_i에 대해
			kopo38_fSin = Math.sin(kopo38_i * 3.141592 / 180);
			// kopo38_fSin을 위와 마찬가지로 sin(kopo38_i*3.141592/180)으로 설정
			int kopo38_iSpace = (int) ((1.0 - kopo38_fSin) * 50);
			// 정수 kopo38_iSpace를 (1.0-kopo38_fSin)*50의 정수변환(소숫점 아래 버림)으로 설정
			// kopo38_fSin은 sin 값으로 -1부터 1까지의 값을 가지므로
			// 1-kopo38_fSin은 0부터 2까지의 값을 가지며 결국 (1.0 - kopo38_fSin) * 50은 0부터 100까지의 값을
			// 가진다.
			for (int kopo38_j = 0; kopo38_j < kopo38_iSpace; kopo38_j++)
				// 0부터 시작해 iSpace보다 작은 정수 j에 대해
				System.out.printf(" ");
			// 빈칸을 출력한다. 즉 빈칸이 iSpace개 만큼 출력
			// 즉 1도 당 변화하는 sin값보다 작은 최대의 정수만큼 빈칸이 생긴다.
			System.out.printf("*[%f][%d]\n", kopo38_fSin, kopo38_iSpace);
			// kopo38_fSin과 kopo38_iSpace를 위와 같이 출력
		}
	}
}
