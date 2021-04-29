package kopo38_swc06;

public class kopo38_P11_2 {

	public static void main(String[] args) {
		kopo38_P11_1 kopo38_p11;
		kopo38_p11 = new kopo38_P11_1();
		// kopo38_P11_1 클래스를 불러온다. 해당 클래스가 kopo38_P09_1를 상속받았으므로
		// kopo38_P09_1의 메소드도 사용이 가능하다.

		for (int i = 0; i < 10; i++) {
			kopo38_p11.kopo38_VolUp();
			System.out.printf("MSG Remocon battery[%s]\n", kopo38_p11.kopo38_power);
		}
		for (int i = 0; i < 10; i++) {
			kopo38_p11.kopo38_VolDn();
			System.out.printf("MSG Remocon battery[%s]\n", kopo38_p11.kopo38_power);
		}
		// 불러온 메소드를 각각 10회 실행하고 내용을 출력한다.

		kopo38_p11.kopo38_Powercheck();
		System.out.printf("MSG Remocon battery[%s]\n", kopo38_p11.kopo38_power_stat);
		// 메소드를 실행하고 내용을 출력한다.

	}
}
