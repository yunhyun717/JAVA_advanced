package kopo38_swc02;

import java.util.Scanner;

public class kopo38_P11 {

	public static void main(String[] args) {

		float kopo38_f = 9.1234567f;
		double kopo38_d = 9.1234567;
		double kopo38_d2 = (double) kopo38_f;
		// float과 double을 각각 설정한다.
		// kopo38_d2는 kopo38_f를 double변환한 값으로 설정한다.

		System.out.printf("f=%20.18f\n", kopo38_f);
		System.out.printf("d=%20.18f\n", kopo38_d);
		System.out.printf("d2=%20.18f\n", kopo38_d2);
		// 지정한 형식으로 출력한다.
		// %20.18f를 사용해 20자리를 차지하면서 소숫점 아래 18자리까지 출력하도록 한다.
		// 메모리에 2진수로 저장하기 때문에 억지로 18자리까지 출력할 경우
		// 6~7자리까지 저장되는 float은 숫자가 부정확하게 출력된다.
		// double은 float보다 소숫점 아래 저장되는 범위가 크기 때문에 문제 없이 잘 출력된다.
		// float값을 double 변환했어도 이미 부정확한 값으로 저장된 후기 때문에 해당 값이 그대로 출력된다.
	}
}
