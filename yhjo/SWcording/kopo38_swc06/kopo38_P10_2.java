package kopo38_swc06;

public class kopo38_P10_2 {

	public static void main(String[] args) {
		kopo38_P10_1 kopo38_p10;
		kopo38_p10 = new kopo38_P10_1();
		// kopo38_P10_1 클래스를 불러온다. 해당 클래스가 kopo38_P08_1를 상속받았으므로
		// kopo38_P08_1의 메소드도 사용이 가능하다.

		for (int kopo38_i = 0; kopo38_i < 10; kopo38_i++) {
			kopo38_p10.kopo38_up();
			System.out.printf("MSG elev3[%s]\n", kopo38_p10.kopo38_help);
		}
		for (int kopo38_i = 0; kopo38_i < 10; kopo38_i++) {
			kopo38_p10.kopo38_down();
			System.out.printf("MSG elev3[%s]\n", kopo38_p10.kopo38_help);
		}
		// 불러온 메소드를 각가 10회 실행하고 내용을 출력한다.
		kopo38_p10.kopo38_Repair();
		System.out.printf("MSG elev3[%s]\n", kopo38_p10.kopo38_help);
		// 메소드를 실행하고 내용을 출력한다.
	}
}
