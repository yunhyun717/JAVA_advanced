package kopo38_swc06;

public class kopo38_P04_2 {
	private static int kopo38_inVal;

	public static void kopo38_up() {
		kopo38_inVal++;
		System.out.printf("�� �׳� �޼ҵ�[%d]\n", kopo38_inVal);
	}
	// �޼ҵ带 �����ϸ� kopo38_inVal�� 1�� ���ϰ� ������ ����ϵ��� �����Ѵ�.

	public static void main(String[] args) {
		kopo38_inVal = 0;
		// kopo38_inVal�� �ʱⰪ 0�� �����Ѵ�.
		kopo38_P04_1 kopo38_p4;
		// �ش� Ŭ������ �޾� ��ü�� �����.
		kopo38_p4 = new kopo38_P04_1();
		// �ν��Ͻ��� �����Ͽ� ��ü�� �����Ѵ�.

		kopo38_up();
		// �޼ҵ带 �����Ѵ�. ���� �ҷ����� �ʾұ� ������ ���� Ŭ������ �޼ҵ尡 ����ȴ�.
		for (int i = 0; i < 10; i++) {
			kopo38_p4.kopo38_up();
			System.out.printf("MSG[%s]\n", kopo38_p4.kopo38_help);
		}
		// ������ �̸������� �����ε��� Ŭ������ �޼ҵ尡 ����ȴ�.
		for (int i = 0; i < 10; i++) {
			kopo38_p4.kopo38_down();
			System.out.printf("MSG[%s]\n", kopo38_p4.kopo38_help);
		}
		// �����ε����� �ҷ��� �޼ҵ带 10ȸ�� �����ϰ� ������ ����Ѵ�.
	}
}
