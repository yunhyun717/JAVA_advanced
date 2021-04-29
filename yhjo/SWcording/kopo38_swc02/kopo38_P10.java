package kopo38_swc02;

import java.util.Scanner;

public class kopo38_P10 {

	public static void main(String[] args) {

		int kopo38_i = 10;
		byte kopo38_b = (byte) kopo38_i;
		// 정수 kopo38_i와 byte kopo38_b를 설정한다.
		// kopo38_b는 kopo38_i를 byte 변환한 값으로 설정한다.
		System.out.printf("[int -> byte] i=%d -> b=%d%n", kopo38_i, kopo38_b);
		// 지정한 형식으로 출력한다.
		kopo38_i = 300;
		kopo38_b = (byte) kopo38_i;
		// kopo38_i를 300으로 설정하고 kopo38_b는 kopo38_i를 byte 변환한 값으로 설정한다.
		// 정수 300이 byte의 범위(256)을 넘어섰기 때문에 kopo38_b는 300%256 = 44
		System.out.printf("[int -> byte] i=%d -> b=%d%n", kopo38_i, kopo38_b);
		// 지정한 형식으로 출력한다.
		kopo38_b = 10;
		kopo38_i = (int) kopo38_b;
		// kopo38_b를 10으로 설정하고 kopo38_i는 kopo38_b를 정수 변환한 값으로 설정한다.
		System.out.printf("[byte -> int] b=%d -> i=%d%n", kopo38_b, kopo38_i);
		// 지정한 형식으로 출력한다.
		kopo38_b = 2;
		kopo38_i = (int) kopo38_b;
		// kopo38_b를 2로 설정하고 kopo38_i는 kopo38_b를 정수 변환한 값으로 설정한다.
		// byte의 범위가 int의 범위보다 작기 때문에 byte의 int 변환에서는 변동이 발생하지 않는다.
		System.out.printf("[byte -> int] b=%d -> i=%d%n", kopo38_b, kopo38_i);
		// 지정한 형식으로 출력한다.
	}
}
