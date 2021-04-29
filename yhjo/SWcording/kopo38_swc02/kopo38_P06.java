package kopo38_swc02;

import java.util.Scanner;

public class kopo38_P06 {

	public static void main(String[] args) {

		byte kopo38_b = 1;
		// byte kopo38_b를 1로 설정한다.
		// byte는 -127에서 127까지의 수이다.
		short kopo38_s = 2;
		// short kopo38_s를 2로 설정한다.
		// short는 -32768에서 32768까지의 수이다.
		char kopo38_c = 'A';
		// char kopo38_c를 'A'로 설정한다.
		// char는 한 개의 문자이다.
		int kopo38_finger = 10;
		// 정수 finger를 10으로 설정한다.
		// int는 -2,147,483,648에서 2,147,483,648까지의 수이다.
		long kopo38_big = 100000000000L;
		// long big를 100000000000L로 설정한다.
		// long은 -9,223,372,036,854,775,808에서 9,223,372,036,854,775,808까지의 수이다.
		// 변수는 메모리에 int 형태로 저장되기 때문에 그냥 숫자만 입력하면 int의 범위를 벗어나므로
		// 오류가 발생한다. 따라서 long이라는 것을 표시하기위해 끝에 L을 붙인다.
		long kopo38_hex = 0xFFFFFFFFFFFFFFFFL;
		// 헥사코드는 16진수로 0~9의 10개의 숫자에 더해 A~F까지의 숫자를 이용해 표현한다.
		// 헥사코드임을 표시하기위해 시작할 때 0x를 붙여주고, 마찬가지로 끝에 L을 붙여준다.
		int kopo38_octNum = 010;
		// 0으로 시작하면 8진법이다. 
		int kopo38_hexNum = 0x10;
		// 0x로 시작했으로 헥사코드이다.(16진법)
		int kopo38_binNum = 0b10;
		// 0b는 바이너리로 2진법 수를 나타낸다.
		System.out.printf("b = %d%n", kopo38_b);
		System.out.printf("s = %d%n", kopo38_s);
		// %d를 이용해 byte, short를 출력한다.
		System.out.printf("c = %c, %d %n", kopo38_c, (int) kopo38_c);
		// %c를 이용해 char를 출력한다. (int)로 정수변환을 하여 %d로 출력한
		System.out.printf("finger = [%5d]%n", kopo38_finger);
		// %nd에서 정수 n에 따라 해당 부분이 차지하는 공간이 정해진다. 
		System.out.printf("finger = [%-5d]%n", kopo38_finger);
		// n이 양수이면 우측정렬, 음수이면 좌측정렬이 된다.
		System.out.printf("finger = [%05d]%n", kopo38_finger);
		// 0n형태이면 빈 공간에 0이 채워진다.
		System.out.printf("big = %d%n", kopo38_big);
		// long도 %d로 출력한다.
		System.out.printf("hex = %#x%n", kopo38_hex);
		// 헥사코드형태는 %x로 출력한다. #을 중간에 넣으면 접두사(0x)가 같이 출력된다.
		System.out.printf("octNum = %o, %d%n", kopo38_octNum, kopo38_octNum);
		// 8진법을 출력할 경우 %o로 출력하고, %d로 출력하면 10진법으로 변환되어 출력된다.
		System.out.printf("hexNum = %x, %d%n", kopo38_hexNum, kopo38_hexNum);
		// 16진법을 출력할 경우 %x로 출력하고, %d로 출력하면 10진법으로 변환되어 출력된다.
		System.out.printf("binNum = %s, %d%n", Integer.toBinaryString(kopo38_binNum), kopo38_binNum);
		// 2진법을 출력할 경우 Integer.toBinaryString로 정수 변환하여 %s로 출력하고, %d로 출력하면 10진법으로 변환되어 출력된다.

	}

}
