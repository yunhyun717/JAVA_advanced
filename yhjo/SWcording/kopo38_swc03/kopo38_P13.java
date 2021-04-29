package kopo38_swc03;

import java.text.DecimalFormat;

public class kopo38_P13 {

	public static void main(String[] args) {
		DecimalFormat kopo38_df = new DecimalFormat("###,###,###,###,###");
		// DecimalFormat 클래스를 불러온다. kopo38_df 로 불러올 수 있다.
		int kopo38_MyWon = 1000000;
		// 정수 kopo38_MyWon 을 1000000으로 설정
		double kopo38_MoneyEx = 1238.21;
		// double kopo38_MoneyEx 을 1238.21로 설정
		double kopo38_commission = 0.003;
		// double kopo38_commission 을 0.003으로 설정
		double kopo38_ComPerOne = kopo38_MoneyEx * kopo38_commission;
		// double kopo38_ComPerOne 를 kopo38_MoneyEx와 kopo38_commission의 곱으로 설정

		int kopo38_usd = (int) (kopo38_MyWon / (kopo38_MoneyEx + kopo38_ComPerOne));
		// 정수 kopo38_usd 를 kopo38_MyWon 을 kopo38_MoneyEx과 kopo38_ComPerOne 로 나눈 값을 정수처리한
		// 값(소숫점 아래 버림)으로 설정
		double kopo38_totalcom = kopo38_usd * kopo38_ComPerOne;
		// double kopo38_totalcom 을 kopo38_usd와 kopo38_ComPerOne의 곱으로 설정
		// 달러당 수수료와 달러의 곱은 총 수수료가 된다.
		int kopo38_i_totalcom;
		// 정수 kopo38_i_totalcom 을 설정
		if (kopo38_totalcom != (double) ((int) kopo38_totalcom)) {
			kopo38_i_totalcom = (int) kopo38_totalcom + 1;
		} else {
			kopo38_i_totalcom = (int) kopo38_totalcom;
		}
		// kopo38_totalcom이 자기자신을 정수처리하고 double로 전환한 값과 다르면(정수가 아닌 소수이면)
		// kopo38_i_totalcom 을 kopo38_totalcom을 정수화한 값에 1을 더한 값으로 설정
		// 아니면 kopo38_i_totalcom 을 kopo38_totalcom을 정수화한 값으로 설정(올림으로 설정해야 손해보지않는다.)
		int kopo38_remain = (int) (kopo38_MyWon - kopo38_usd * kopo38_MoneyEx - kopo38_i_totalcom);
		// 정수 kopo38_remain 을 kopo38_MyWon 에서 kopo38_usd 와 환율의 곱과 수수료를 빼준 값을 정수처리한 값(소숫점
		// 아래 버림)으로 설정
		// 남은 금액은 지불한 한화에서 환전된 금액과 수수료를 뺀 값이므로
		System.out.printf("********************************************************************\n");
		System.out.printf("*                     콤마찍기, 날짜 적용                              *\n");
		System.out.printf("총 수수료: %s원=> 미화: %s달러, 달러당 수수료: %s원\n", kopo38_df.format(kopo38_i_totalcom),
				kopo38_df.format(kopo38_usd), kopo38_ComPerOne);
		System.out.printf("총 한화환전금액: %s원=> 미화: %s달러, 수수료청구: %s원, 잔돈: %s원\n", kopo38_df.format(kopo38_MyWon),
				kopo38_df.format(kopo38_usd), kopo38_df.format(kopo38_i_totalcom), kopo38_df.format(kopo38_remain));
		System.out.printf("********************************************************************\n");
		// 세자리마다 ,를 찍어주는 것으로 바꾼다
		// ,를 찍으면 정수값이 아닌 String 값이 되므로 %s로 적용
	}

}
