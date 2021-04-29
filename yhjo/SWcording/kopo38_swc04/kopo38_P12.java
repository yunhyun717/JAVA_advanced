package kopo38_swc04;

import java.text.DecimalFormat;

public class kopo38_P12 {

	public static void main(String[] args) {
		String kopo38_item = "사과";
		// String kopo38_item을 "사과"로 설정
		int kopo38_unit_price = 5000;
		// 정수 kopo38_unit_price를 5000으로 설정
		int kopo38_num = 500;
		// 정수 kopo38_num을 500으로 설정
		int kopo38_total = 0;
		// 정수 kopo38_total을 0으로 설정

		DecimalFormat df = new DecimalFormat("###,###,###,###,###");
		// DecimalFormat은 정수를 지정한 형식(String값)으로 변환하는 Method를 불러온다.
		// 여기서는 df로 지정. df.format(정수)형태로 쓴다.
		System.out.printf("======================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n", "품목", "단가", "수량", "합계");
		System.out.printf("======================================================\n");
		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n", kopo38_item, df.format(kopo38_unit_price),
				df.format(kopo38_num), df.format(kopo38_unit_price * kopo38_num));
		System.out.printf("======================================================\n");
		// %20.20s : 전체 20자리에서 20자리까지 출력, 20자리가 안되면 좌측에 공백이 추가
		// 이때 한글은 1s로 인식하고 처리되지만 실제로는 한 글자당 2자리를 차지한다.
		// 자리 맞추기 위해서는 %n.ns, 한글 개수를 m이라 할 때(n>m) 공백의 크기는 n-m이고 총 길이는 (n-m)+2m=n+m이다.
		// 위를 예로 들면 윗줄의 "단가"는 한글 두 글자이며, %8.8s 표현하기 때문에 앞의 공백은 6, 총 길이는 10이다.
		// 따라서 아래에서 10.10을 써주게 된다.
	}

}
