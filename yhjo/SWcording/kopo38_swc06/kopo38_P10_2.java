package kopo38_swc06;

public class kopo38_P10_2 {

	public static void main(String[] args) {
		kopo38_P10_1 kopo38_p10;
		kopo38_p10 = new kopo38_P10_1();
		// kopo38_P10_1 Ŭ������ �ҷ��´�. �ش� Ŭ������ kopo38_P08_1�� ��ӹ޾����Ƿ�
		// kopo38_P08_1�� �޼ҵ嵵 ����� �����ϴ�.

		for (int kopo38_i = 0; kopo38_i < 10; kopo38_i++) {
			kopo38_p10.kopo38_up();
			System.out.printf("MSG elev3[%s]\n", kopo38_p10.kopo38_help);
		}
		for (int kopo38_i = 0; kopo38_i < 10; kopo38_i++) {
			kopo38_p10.kopo38_down();
			System.out.printf("MSG elev3[%s]\n", kopo38_p10.kopo38_help);
		}
		// �ҷ��� �޼ҵ带 ���� 10ȸ �����ϰ� ������ ����Ѵ�.
		kopo38_p10.kopo38_Repair();
		System.out.printf("MSG elev3[%s]\n", kopo38_p10.kopo38_help);
		// �޼ҵ带 �����ϰ� ������ ����Ѵ�.
	}
}
