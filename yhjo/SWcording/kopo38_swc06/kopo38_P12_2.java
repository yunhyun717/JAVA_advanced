package kopo38_swc06;

public class kopo38_P12_2 {

	public static void main(String[] args) {
		kopo38_P12_1 kopo38_p12;
		kopo38_p12 = new kopo38_P12_1();
		// kopo38_P12_1 Ŭ������ �ҷ��´�. �ش� Ŭ������ kopo38_P08_1�� ��ӹ޾����Ƿ�
		// kopo38_P08_1�� �޼ҵ嵵 ����� �����ϴ�. 

		for (int i = 0; i < 10; i++) {
			kopo38_p12.kopo38_up();
			System.out.printf("MSG kopo38_p12[%s]\n", kopo38_p12.kopo38_help);
		}
		for (int i = 0; i < 10; i++) {
			kopo38_p12.kopo38_down();
			System.out.printf("MSG kopo38_p12[%s]\n", kopo38_p12.kopo38_help);
		}
		// �ҷ��� �޼ҵ带 ���� 10ȸ �����ϰ� ������ ����Ѵ�.
		
		kopo38_p12.kopo38_Repair();
		System.out.printf("MSG kopo38_p12[%s]\n", kopo38_p12.kopo38_help);
		// �޼ҵ带 �����ϰ� ������ ����Ѵ�.
	}
}
