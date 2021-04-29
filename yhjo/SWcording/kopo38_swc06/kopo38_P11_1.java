package kopo38_swc06;

public class kopo38_P11_1 extends kopo38_P09_1 {
	// extends구문을 사용해 kopo38_P09_1로 확장한다.
	void kopo38_Powercheck() {
		if (kopo38_power == 0) {
			kopo38_power_stat = String.format("건전지가 부족합니다.");
		}
	}
	// 메소드를 생성한다.
}
