package kopo38_swc06;

public class kopo38_P11_2 {

	public static void main(String[] args) {
		kopo38_P11_1 kopo38_p11;
		kopo38_p11 = new kopo38_P11_1();
		// kopo38_P11_1 Ŭ������ �ҷ��´�. �ش� Ŭ������ kopo38_P09_1�� ��ӹ޾����Ƿ�
		// kopo38_P09_1�� �޼ҵ嵵 ����� �����ϴ�.

		for (int i = 0; i < 10; i++) {
			kopo38_p11.kopo38_VolUp();
			System.out.printf("MSG Remocon battery[%s]\n", kopo38_p11.kopo38_power);
		}
		for (int i = 0; i < 10; i++) {
			kopo38_p11.kopo38_VolDn();
			System.out.printf("MSG Remocon battery[%s]\n", kopo38_p11.kopo38_power);
		}
		// �ҷ��� �޼ҵ带 ���� 10ȸ �����ϰ� ������ ����Ѵ�.

		kopo38_p11.kopo38_Powercheck();
		System.out.printf("MSG Remocon battery[%s]\n", kopo38_p11.kopo38_power_stat);
		// �޼ҵ带 �����ϰ� ������ ����Ѵ�.

	}
}
