package kopo38_swc06;

public class kopo38_P12_1 extends kopo38_P08_1 {
	// extends구문을 사용해 kopo38_P08_1를 상속받는다.

	void kopo38_Repair() {
		kopo38_help = String.format("수리중입니다");
	}
	// 전에 작성했지만 다중상속이 불가능하므로 원클래스를 다시 불러왔으므로 다시 작성해야한다.

	void kopo38_up() {
		if (kopo38_floor >= kopo38_limit_up_floor) {
			kopo38_help = "마지막층입니다.";
		} else {
			kopo38_floor = kopo38_floor + 2;
			kopo38_help = String.format("%d층입니다", kopo38_floor);
		}
		this.kopo38_down();
	}
	// kopo38_P08_1에 있는 메소드이지만 수정할 수 있다.

	void kopo38_down() {
		super.kopo38_down();
		System.out.printf("클래스 안에서 찍고있는 MSG [%s]\n", this.kopo38_help);
	}
	// kopo38_P08_1에 있는 메소드이지만 마찬가지로 수정할 수 있다.
	// super는 상속받은 클래스에서의 메소드를 의미한다.
}
