package kopo38_swc06;

public class kopo38_P12_1 extends kopo38_P08_1 {
	// extends������ ����� kopo38_P08_1�� ��ӹ޴´�.

	void kopo38_Repair() {
		kopo38_help = String.format("�������Դϴ�");
	}
	// ���� �ۼ������� ���߻���� �Ұ����ϹǷ� ��Ŭ������ �ٽ� �ҷ������Ƿ� �ٽ� �ۼ��ؾ��Ѵ�.

	void kopo38_up() {
		if (kopo38_floor >= kopo38_limit_up_floor) {
			kopo38_help = "���������Դϴ�.";
		} else {
			kopo38_floor = kopo38_floor + 2;
			kopo38_help = String.format("%d���Դϴ�", kopo38_floor);
		}
		this.kopo38_down();
	}
	// kopo38_P08_1�� �ִ� �޼ҵ������� ������ �� �ִ�.

	void kopo38_down() {
		super.kopo38_down();
		System.out.printf("Ŭ���� �ȿ��� ����ִ� MSG [%s]\n", this.kopo38_help);
	}
	// kopo38_P08_1�� �ִ� �޼ҵ������� ���������� ������ �� �ִ�.
	// super�� ��ӹ��� Ŭ���������� �޼ҵ带 �ǹ��Ѵ�.
}
