package kopo38_swc02;

import java.util.Scanner;

public class kopo38_P07 {

	public static void main(String[] args) {
		
		String kopo38_url = "www.codechobo.com";
		// String kopo38_url을 설정한다.
		
		float kopo38_f1 = .10f;
		// float kopo38_f1을 설정한다. 소수의 경우 끝에 f를 붙여 소수임을 표시한다. 
		float kopo38_f2 = 1e1f;
		// float kopo38_f2를 부동소수점표현방식으로 설정한다.
		// e앞의 숫자에 대해 소숫점을 e 뒤의 숫자만큼(음수일 경우 좌측으로, 양수일 경우 우측으로) 움직인 수를 의미한다.
		// 이 경우 1의 소숫점(1.0이므로)을 1만큼 우측으로 움직였으므로 10.0을 표현한 것이다.
		float kopo38_f3 = 3.14e3f;
		// float kopo38_f3를 부동소수점표현방식으로 설정한다.
		// 3.14의 소숫점을 3만큼 우측으로 움직였으므로 3140이 된다.
		double kopo38_d = 1.2345678;
		// double d를 1.2345678로 설정한다.
		
		System.out.printf("f1 = %f, %e, %g%n", kopo38_f1, kopo38_f1,kopo38_f1);
		System.out.printf("f2 = %f, %e, %g%n", kopo38_f2, kopo38_f2,kopo38_f2);
		System.out.printf("f3 = %f, %e, %g%n", kopo38_f3, kopo38_f3,kopo38_f3);
		// kopo38_f1, f2, f3를 각각 지정한 형식으로 출력한다.
		// %f는 일반 소수 표현, %e는 부동소수점표현방식, %g는 소수의 길이에 따라 일반 또는 부동소수점표현방식으로 출력한다.
		
		System.out.printf("d = %f%n", kopo38_d);
		System.out.printf("d = %14.10f%n", kopo38_d);
		// kopo38_d를 지정한 형식으로 출력한다.
		// %f는 일반 소수 표현으로 출력
		// %m.nf는 m만큼의 영역에서 해당 소수를 소숫점 n자리만큼 출력한다는 뜻이다.
		
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", kopo38_url);
		System.out.printf("[%20s]%n", kopo38_url);
		System.out.printf("[%-20s]%n", kopo38_url);
		// String은 ""안에 그냥 입력하거나 %s로 출력할 수 있다.
		// %ns는 n이 양수이면 우측정렬하여 n칸을 차지하도록 출력하고, n이 음수이면 좌측정렬하여 n칸을 차지하도록 출력한다.
		System.out.printf("[%.8s]%n", kopo38_url);	}
		// %m.ns는 m칸을 차지하면서 n번째 글자까지 출력한다. 

}
