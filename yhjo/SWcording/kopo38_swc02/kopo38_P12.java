package kopo38_swc02;

import java.util.Scanner;

public class kopo38_P12 {

	public static void main(String[] args) {
		int i = 91234567;
		float f = (float) i;
		int i2 = (int) f;

		double d = (double) i;
		int i3 = (int) d;

		float f2 = 1.666f;
		int i4 = (int) f2;
		
		// float과 int를 지정한 값 또는 변환 값으로 설정한다.

		System.out.printf("i=%d\n", i);
		System.out.printf("f=%f i2=%d\n", f, i2);
		System.out.printf("d=%f i3=%d\n", d, i3);
		System.out.printf("(int)%f=%d\n", f2, i4);
		// 지정한 형식으로 출력한다.
		// 정수를 float 변환하면 1울 올림하고 소숫점 아래 000000이 찍힌 상태로 변환된다.
		// 정수를 double 변환하면 소숫점 아래 000000이 찍힌 상태로 변환된다.
		// float을 정수 변환하면 소숫점 아래를 버린 형태로 변환된다.
	}
}
