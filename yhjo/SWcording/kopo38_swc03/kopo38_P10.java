package kopo38_swc03;

public class kopo38_P10 {

	public static void main(String[] args) {
		int kopo38_MyWon = 1000000;
		// 정수 kopo38_MyWon 을 1000000으로 설정
		double kopo38_MoneyEx = 1238.21;
		// double kopo38_MoneyEx 을 1238.21로 설정
		double kopo38_commission = 0.003;
		// double kopo38_commission 을 0.003으로 설정

		int kopo38_usd = (int) (kopo38_MyWon / kopo38_MoneyEx);
		// 정수 kopo38_usd 를 kopo38_MyWon 을 kopo38_MoneyEx 로 나눈 값을 정수처리한 값(소숫점 아래 버림)으로 설정
		// 달러 * 환율 = 한화 이므로 달러 = 한화 / 환율
		int kopo38_remain = (int) (kopo38_MyWon - kopo38_usd * kopo38_MoneyEx);
		// 정수 kopo38_remain 을 kopo38_MyWon 에서 kopo38_usd 와 환율의 곱을 빼준 값을 정수처리한 값(소숫점 아래 버림)으로 설정
		// 남은 금액은 지불한 한화에서 환전된 금액을 뺀 값이므로
		System.out.printf("*************************************************\n");
		System.out.printf("*                   수수료없이 계산                 *\n");
		System.out.printf("총 한화환전금액: %d원=> 미화 : %d달러, 잔돈 : %d원\n", kopo38_MyWon, kopo38_usd, kopo38_remain);
		System.out.printf("*************************************************\n");
		//총 한화환전금액은 kopo38_MyWon, 미화 kopo38_usd, 잔돈 kopo38_remain 으로 출력
		
		double kopo38_ComPerOne = kopo38_MoneyEx * kopo38_commission;
		//double kopo38_ComPerOne 를 kopo38_MoneyEx와 kopo38_commission의 곱으로 설정
		double kopo38_totalcom = kopo38_usd*kopo38_ComPerOne;
		System.out.printf("***************************************************************\n");
		System.out.printf("*                         수수료    계산                        *\n");
		System.out.printf("총 수수료 : %f원=> 미화 : %d달러, 달러당 수수료 : %f원\n", kopo38_totalcom, kopo38_usd, kopo38_ComPerOne);
		System.out.printf("***************************************************************\n");
		//총 수수료는 kopo38_totalcom, 미화 kopo38_usd, 달러당 수수료 kopo38_ComPerOne 로 출력
	}

}
