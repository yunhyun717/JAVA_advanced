package kopo38_swc03;

public class kopo38_P06 {

	public static int kopo38_netprice(int kopo38_price, double kopo38_rate) {
		return (int) (kopo38_price / (1 + kopo38_rate));
		// integer값을 return값으로 가지며 integer와 double값을 parameter로 가지는 메소드를 생성
		// 소비자가격 = 세전가격 * (1+세율) 이므로 세전가격 = 소비자가격 / (1+세율)
	}

	public static void main(String[] args) {
		int kopo38_price = 1234; // integer price를 1234로 설정
		double tax_rate = 0.1; // double tax_rate를 0.1로 설정

		int kopo38_netprice = kopo38_netprice(kopo38_price, tax_rate);
		// integer kopo38_netprice를 위에서 설정한 kopo38_netprice 메소드에 price와 tax_rate를 인자로 한 return값으로 설정
		int tax = kopo38_price - kopo38_netprice;
		// 세금은 소비자가격에서 세전가격을 뺀 값
		System.out.printf("***************************************\n");
		System.out.printf("*       소비자가, 세전가격, 세금 계산        *\n");
		System.out.printf("  소비자가격: %d, 세전가격: %d, 세금: %d\n", kopo38_price, kopo38_netprice, tax);
		System.out.printf("***************************************\n");

	}

}
