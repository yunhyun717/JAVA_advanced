package kopo38_swc06;

public class kopo38_P04_2 {
	private static int kopo38_inVal;

	public static void kopo38_up() {
		kopo38_inVal++;
		System.out.printf("난 그냥 메소드[%d]\n", kopo38_inVal);
	}
	// 메소드를 실행하면 kopo38_inVal에 1을 더하고 내용을 출력하도록 설정한다.

	public static void main(String[] args) {
		kopo38_inVal = 0;
		// kopo38_inVal에 초기값 0을 설정한다.
		kopo38_P04_1 kopo38_p4;
		// 해당 클래스를 받아 객체를 만든다.
		kopo38_p4 = new kopo38_P04_1();
		// 인스턴스를 생성하여 객체에 연결한다.

		kopo38_up();
		// 메소드를 실행한다. 따로 불러오지 않았기 때문에 현재 클래스의 메소드가 실행된다.
		for (int i = 0; i < 10; i++) {
			kopo38_p4.kopo38_up();
			System.out.printf("MSG[%s]\n", kopo38_p4.kopo38_help);
		}
		// 동일한 이름이지만 오버로딩한 클래스의 메소드가 실행된다.
		for (int i = 0; i < 10; i++) {
			kopo38_p4.kopo38_down();
			System.out.printf("MSG[%s]\n", kopo38_p4.kopo38_help);
		}
		// 오버로딩으로 불러온 메소드를 10회씩 실행하고 내용을 출력한다.
	}
}
