package kopo38_swc03;

public class kopo38_P08 {

	public static void main(String[] args) {
		String[] kopo38_item = { "맛동산", "웨하스", "롯데샌드", "오땅", "샤브레" };
		//String 열 kopo38_item을 생성
		int[] kopo38_price = { 1000, 2000, 3000, 2500, 1450 };
		//정수열 kopo38_price를 생성
		int[] kopo38_amount = { 10, 2, 1, 3, 5 };
		//정수열 kopo38_amount를 생성
		double kopo38_tax_rate = 0.1;
		//kopo38_tax_rate를 double로 생성
		int kopo38_total_sum = 0;
		//kopo38_total_sum을 정수로 설정하고 값을 0으로 한다.

		System.out.printf("***********************************\n");
		System.out.printf("            너가 지른 과자들           \n");
		System.out.printf("   항목      단가      수량      합계   \n");
		for (int i = 0; i < kopo38_item.length; i++) {
			int kopo38_sum = kopo38_price[i] * kopo38_amount[i];
			kopo38_total_sum = kopo38_total_sum + kopo38_sum;
			System.out.printf("%5s	%7d      %2d	%9d\n", kopo38_item[i], kopo38_price[i], kopo38_amount[i], kopo38_sum);
		}
		/*0부터 kopo38_item String열의 항목 개수보다 작은 값의 1씩 증가하는 i에 대해
		 * 정수 kopo38_sum을 정수열 kopo38_price의 0부터 시작한 i번째 항목과
		 * 정수열 kopo38_amount의 0부터 시작한 i번째 항목의 곱으로 설정한다.
		 * 정수 kopo38_total sum은 이 sum들의 합으로 설정
		 * kopo38_item, kopo38_price, kopo38_amount의 0부터 시작한 i번째 항목을 출력하고
		 * (kopo38_item은 5번째 글자까지 출력, kopo38_price는 7번째 자리수까지, kopo38_amount는 2번째 자리수까지)
		 * kopo38_sum을 출력한다.(9번째 자리수까지)*/
		System.out.printf("***********************************\n");
		System.out.printf(" 지 불  금 액 : %20d\n", kopo38_total_sum);
		int kopo38_total_net_price = (int) (kopo38_total_sum / (1 + kopo38_tax_rate));
		System.out.printf(" 과 세  금 액 : %20d\n", kopo38_total_net_price);
		int kopo38_tax = kopo38_total_sum - kopo38_total_net_price;
		System.out.printf(" 세       금 : %20d\n", kopo38_tax);
		/*지불 금액은 20번째 자리수까지 kopo38_total_sum을 출력
		 *정수 kopo38_total_net_price는 kopo38_total_sum을 1+kopo38_tax_rate로 나눈 값을 정수처리한 값으로 설정(소숫점 아래 버림)
		 *세금 징수 전 금액을 계산해야하므로 1/1.1을 곱한 값(1.1로 나눈 값)을 계산해야한다.
		 *과세금액은 20번째 자리수까지 kopo38_total_net_price을 출력
		 *정수 kopo38_tax는 kopo38_total_sum과 kopo38_total_net_price의 차로 설정
		 * 세금은 20번째 자리수까지 kopo38_tax를 출력*/
	}

}
