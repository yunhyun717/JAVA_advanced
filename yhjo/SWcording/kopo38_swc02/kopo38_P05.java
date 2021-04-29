package kopo38_swc02;

import java.util.Scanner;

public class kopo38_P05 {

	public static void main(String[] args) {
		
		Scanner kopo38_scanner = new Scanner(System.in);
		// 사용자의 입력을 받기 위해 Scanner를 불러오고 import해준다.
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		// print는 println과 달리 끝난 후 새줄에서 시작하지 않는다.
		
		String kopo38_input = kopo38_scanner.nextLine();
		// Scanner를 이용해 다음 입력하는 줄을 String kopo38_input으로 설정한다.
		
		int kopo38_num = Integer.parseInt(kopo38_input);
		// 정수 kopo38_num을 kopo38_input을 정수변환한 것으로 설정한다.
		
		System.out.println("입력내용 : " + kopo38_input);
		System.out.printf("num=%d%n", kopo38_num);
		// 지정한 형식으로 출력한다.
		// printf를 사용해 변수 출력을 쉽게 조정할 수 있다.(%d = 정수, %n = 개행문자)
	}

}
