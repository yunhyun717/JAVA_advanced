package kopo38_swc03;

public class kopo38_P07 {

	public static int kopo38_taxcal(int kopo38_val, int kopo38_rate) {
		//kopo38_taxcal method를 생성하고 integer kopo39_val과 kopo38_rate를 parameter로 받음 
		int kopo38_ret; //kopo38_ret을 integer로 설정

		if (((double) kopo38_val * (double) kopo38_rate / 100.0) == kopo38_val * kopo38_rate / 100) {
			/*double로 변환된 kopo38_val을 마찬가지고 double로 변환된 kopo38_rate와 곱하고 100으로 나눔
			그 값이 kopo38과 kopo38_rate의 값을 100으로 나눈 값(integer이기 때문에 소숫점 아래는 버림)과 같을 때*/
			kopo38_ret = kopo38_val * kopo38_rate / 100;
			//kopo38_ret을 kopo38_val과 kopo38_rate를 곱한 값을 100으로 나눈값으로 설정
		} else {
			//그 외의 경우
			kopo38_ret = kopo38_val * kopo38_rate / 100 + 1;
			//kopo38_ret을 kopo38_val과 kopo38_rate를 곱한 값을 100으로 나눈 값에 1을 더한 값으로 설정
		}
		return kopo38_ret;
		//kopo38_taxcal method는 integer를 return값으로 가지며, 이를 kopo38_ret으로 설정
	}

	public static void main(String[] args) {
		int kopo38_val = 271;
		//kopo38_val을 설정
		int kopo38_rate = 3;
		//kopo38_rate를 설정
		int kopo38_tax = kopo38_taxcal(kopo38_val, kopo38_rate);
		//kopo38_tax를 위에서 정의한 kopo38_taxcal method에 kopo38_val과 kopo38_rate를 parameter로 설정한 값으로 설정
		System.out.printf("**********************************\n");
		System.out.printf("*           단순 세금 계산          *\n");
		System.out.printf("실제 세금계산: %f\n", kopo38_val * kopo38_rate / 100.0);
		//실제 세금을 kopo38_val과 kopo38_rate를 곱한 값을 100으로 나눈 값으로 계산
		System.out.printf("세전가격: %d 세금:%d 세금포함가격 : %d\n", kopo38_val, kopo38_tax, kopo38_val + kopo38_tax);
		//세전가격을 kopo38_val, 세금을 kopo38_tax로 계산하였으며 세금포함가격을 두 값의 합으로 계산
		System.out.printf("**********************************\n");

	}

}
