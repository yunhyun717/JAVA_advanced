package kopo38_swc02;

public class kopo38_P04 {

	public static void main(String[] args) {
		
		System.out.println('\'');
		System.out.println("abc\t123\b456");
		System.out.println('\n');
		System.out.println("\"Hello\"");
		System.out.println("c:\\");
		// '과 같이 print에 영향을 주는 문자/기호를 출력하려면 \를 이용한다.
		// \t는 tab, \b는 백스페이스인데... 출력에서는 결과가 다르게 나왔다.
		// \n은 개행문자이다.(새로운 줄 시작)
		// "도 마찬가지로 \를 이용해서 출력한다.
		// \는 \\로 출력한다.
	}

}
