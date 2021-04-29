package kopo38_swc06;

public class kopo38_P06_2 {

	public static void main(String[] args) {
		kopo38_P06_1 kopo38_p06 = new kopo38_P06_1();
		// kopo38_P06_1 클래스를 불러온다.
		System.out.printf("2개 덧셉이 호출됨 [%d]\n", kopo38_p06.kopo38_sum(1, 2));
		System.out.printf("3개 덧셉이 호출됨 [%d]\n", kopo38_p06.kopo38_sum(1, 2, 3));
		System.out.printf("4개 덧셉이 호출됨 [%d]\n", kopo38_p06.kopo38_sum(1, 2, 3, 4));
		System.out.printf("더블형 덧셉이 호출됨 [%f]\n", kopo38_p06.kopo38_sum(1.3, 2.4));
		// 불러온 클래스의 메소드들이 같은 이름을 갖고 있지만 인자의 종류와 갯수에 따라
		// 다른 메소드가 실행된다. 이를 메소드 오버로딩이라고 한다.
	}

}
