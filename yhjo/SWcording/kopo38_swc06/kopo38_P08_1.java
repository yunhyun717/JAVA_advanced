package kopo38_swc06;

public class kopo38_P08_1 {
	int kopo38_limit_up_floor;
	int kopo38_limit_down_floor;
	int kopo38_floor;
	String kopo38_help;
	// ������������ �����Ѵ�.

	kopo38_P08_1() {
		kopo38_limit_up_floor = 10;
		kopo38_limit_down_floor = 1;
		kopo38_floor = 1;
		kopo38_help = "���������� �⺻ �ذ��Ϸ�";
	}
	// �ش� Ŭ������ �ҷ��� �� ���������� �ش� ������ �����ϵ��� �Ѵ�.
	// Ŭ������ ���� �̸��� �޼ҵ带 �����ϸ� �ش� Ŭ������ �ҷ��� �� ������ ������ ������ �� �ִ�.

	kopo38_P08_1(int up_floor, int d_floor, int in_floor) {
		kopo38_limit_up_floor = up_floor;
		kopo38_limit_down_floor = d_floor;
		kopo38_floor = in_floor;
		kopo38_help = "���������� ���� �ذ��Ϸ�";
	}
	// �ش� Ŭ������ ������ ���� ���ڸ� �־ �ҷ��� �� ���������� �ش� ������ �����ϵ��� �Ѵ�.

	void kopo38_up() {
		if (kopo38_floor == kopo38_limit_up_floor) {
			kopo38_help = "���������Դϴ�";
		} else {
			kopo38_floor++;
			kopo38_help = String.format("%d���Դϴ�", kopo38_floor);
		}
	}
	// ���� ���� �ִ� ���̸� kopo38_help�� "���������Դϴ�"�� �����ϰ�,
	// �ƴϸ� ���� ���� 1�� ���ϰ� kopo38_help�� ������ ������ �����ϵ��� �޼ҵ带 �����Ѵ�.

	void kopo38_down() {
		if (kopo38_floor == kopo38_limit_down_floor) {
			kopo38_help = "ó�����Դϴ�";
		} else {
			kopo38_floor--;
			kopo38_help = String.format("%d���Դϴ�", kopo38_floor);
		}
	}
	// ���� ���� ���� ���̸� kopo38_help�� "ó�����Դϴ�"�� �����ϰ�,
	// �ƴϸ� ���� ���� 1�� ���� kopo38_help�� ������ ������ �����ϵ��� �޼ҵ带 �����Ѵ�.

	void kopo38_up(int kopo38_u) {
		for (int kopo38_i = 0; kopo38_i < kopo38_u; kopo38_i++)
			this.kopo38_up();
	}
	// kopo38_up�޼ҵ尡 ���� ���ڸ� ������ kopo38_up�� kopo38_u�� ����ǵ��� �����Ѵ�.

	void kopo38_down(int kopo38_u) {
		for (int kopo38_i = 0; kopo38_i < kopo38_u; kopo38_i++)
			kopo38_down();
	}
	// kopo38_down�޼ҵ尡 ���� ���ڸ� ������ kopo38_down�� kopo38_u�� ����ǵ��� �����Ѵ�.

	void kopo38_msg(String id) {
		System.out.printf("%s=>[%s] �ִ���[%d] �ּ���[%d] ������[%d]\n", id, kopo38_help, kopo38_limit_up_floor,
				kopo38_limit_down_floor, kopo38_floor);
	}
	// String�� ���ڷ� �ϴ� �޼ҵ带 �����ϰ� ������ �ۼ��Ѵ�.
}
