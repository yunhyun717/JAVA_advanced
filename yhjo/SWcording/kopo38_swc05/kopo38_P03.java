package kopo38_swc05;

public class kopo38_P03 {

	public static void main(String[] args) {
		int kopo38_iWeekday = 5;
		int[] kopo38_iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// 일요일부터 하나씩 세나갈때(일요일을 0으로) 금요일은 5번째 요일이다. 따라서 kopo38_iWeekday를 5로 설정
		// 정수 배열 kopo38_iEnd를 설정하고 그 값을 1월부터 12월까지 각 월의 일수로 한다.
		for (int kopo38_iMon = 0; kopo38_iMon < 12; kopo38_iMon++) {
			// 0부터 시작해 12보다 작은 정수 kopo38_iMon에 대해
			System.out.printf("\n\n         %d월\n", kopo38_iMon + 1);
			// kopo38_iMon이 0부터 시작하므로 1을 더해 월을 써준다.
			System.out.printf("======================\n");
			System.out.printf(" 일 월 화 수 목 금 토\n");
			// 요일을 출력한다.
			for (int kopo38_i = 0; kopo38_i < kopo38_iWeekday; kopo38_i++) {
				System.out.printf("   ");
			}
			// 0부터 시작해 kopo38_iWeekday보다 작은 정수 kopo38_i에 대해 빈간 3개를 적는다.
			// (각 날짜 당 3바이트 만큼의 공간을 가지므로 이를 채워주기 위해)
			// 즉, 해당 달의 첫 시작 요일을 맞춰주기 위해 빈칸 3개 * kopo38_iWeekday 만큼의 빈칸을 만든다.
			for (int kopo38_i = 1; kopo38_i <= kopo38_iEnd[kopo38_iMon]; kopo38_i++) {
				System.out.printf("%3d", kopo38_i);
				kopo38_iWeekday++;
				// 1부터 시작해 kopokopo38_iEnd의 kopo38_iMon번째 항목(해당 월의 일수)까지 향하는 정수 kopo38_i에 대해
				// 3칸의 자리를 차지하도록 kopo38_i를 출력하고 kopo38_iWeekday(요일)에는 1씩 더한다.
				if (kopo38_iWeekday % 7 == 0) {
					System.out.printf("\n");
					kopo38_iWeekday = 0;
					// kopo38_iWeekday가 7로 나누어떨어지면(일요일에 7이 된다.) 새로운 줄에서 시작하며 요일을 초기화한다.
				}
			}
			// 달력 완성
		}
	}
}
