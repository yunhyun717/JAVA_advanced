package kopo38_swc06;

public class kopo38_P08_2 {
	static kopo38_P08_1 p08_1;
	static kopo38_P08_1 p08_2;
	static kopo38_P08_1 p08_3;

	public static void main(String[] args) {
		p08_1 = new kopo38_P08_1();
		p08_2 = new kopo38_P08_1(20, 1, 8);
		p08_3 = new kopo38_P08_1(50, -3, 5);
		// kopo38_P08_1 Ŭ������ �ҷ��´�.
		// ���ڸ� �ȳְ�, �Ǵ� ���� ���ڸ� 3�� ���� ���� �ҷ��´�.

		for (int i = 0; i < 20; i++) {
			//p08_1.kopo38_up();
			//p08_1.kopo38_msg("1������ ���� ������");
			//p08_2.kopo38_up();
			//p08_2.kopo38_msg("2������ ���� ������");
			p08_3.kopo38_up();
			p08_3.kopo38_msg("3������ ���� ������");
		}
		for (int i = 0; i < 20; i++) {
			//p08_1.kopo38_up(2);
			//p08_1.kopo38_msg("1������ 2�� ������");
			//p08_2.kopo38_up(2);
			//p08_2.kopo38_msg("2������ 2�� ������");
			p08_3.kopo38_up(2);
			p08_3.kopo38_msg("3������ 2�� ������");
		}
		for (int i = 0; i < 20; i++) {
			//p08_1.kopo38_down(3);
			//p08_1.kopo38_msg("1������ 3�� ������");
			//p08_2.kopo38_down(3);
			//p08_2.kopo38_msg("2������ 3�� ������");
			p08_3.kopo38_down(3);
			p08_3.kopo38_msg("3������ 3�� ������");
		}
		// ���ڸ� ���� ���� ���� ���ڸ� 3�� ���� ���� ���� �����Ѵ�.
	}
}
