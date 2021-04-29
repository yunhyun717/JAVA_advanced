package kopo38_swc06;

public class kopo38_P12_2 {

	public static void main(String[] args) {
		kopo38_P12_1 kopo38_p12;
		kopo38_p12 = new kopo38_P12_1();
		// kopo38_P12_1 클래스를 불러온다. 해당 클래스가 kopo38_P08_1를 상속받았으므로
		// kopo38_P08_1의 메소드도 사용이 가능하다. 

		for (int i = 0; i < 10; i++) {
			kopo38_p12.kopo38_up();
			System.out.printf("MSG kopo38_p12[%s]\n", kopo38_p12.kopo38_help);
		}
		for (int i = 0; i < 10; i++) {
			kopo38_p12.kopo38_down();
			System.out.printf("MSG kopo38_p12[%s]\n", kopo38_p12.kopo38_help);
		}
		// 불러온 메소드를 각각 10회 실행하고 내용을 출력한다.
		
		kopo38_p12.kopo38_Repair();
		System.out.printf("MSG kopo38_p12[%s]\n", kopo38_p12.kopo38_help);
		// 메소드를 실행하고 내용을 출력한다.
	}
}
