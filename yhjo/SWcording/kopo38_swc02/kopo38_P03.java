package kopo38_swc02;

public class kopo38_P03 {

	public static void main(String[] args) {
		String kopo38_name = "Ja" + "Va";
		String kopo38_str = kopo38_name + 8.0;
		// kopo38_name와 kopo38_str를 설정한다.
		// 덧셈기호를 이용해 String을 설정할 수 있다.
		// kopo38_str과 같이 8.0을 더하면 뒤에 8.0을 붙이면 ""를 사용한 것과
		// 같은 결과를 얻지만 ""를 붙이자...

		System.out.println(kopo38_name);
		System.out.println(kopo38_str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7);
		// 지정한 형식으로 출력한다. " "은 공백으로 처리, ""는 아무것도없다.
		// 정수는 정수로 출력된다.
	}

}
