package kopo38_swc06;

public class kopo38_P04_1 {
	int kopo38_limit_up_floor = 10;
	int kopo38_limit_down_floor = 0;
	int kopo38_floor = 1;
	String kopo38_help;
	// ������ String�� ���������� �����Ѵ�.
	
	void kopo38_up() {
		if (kopo38_floor == kopo38_limit_up_floor) {
			kopo38_help = "���������Դϴ�";
		} else {
			kopo38_floor++;
			kopo38_help = String.format("%d���Դϴ�", kopo38_floor);
		}
	}
	// ���� ���� �ִ� �����̸� kopo38_help�� "���������Դϴ�"�� �����ϰ�
	// �׷��� ������ kopo38_floor���� 1�� ���ϰ� kopo38_help�� "kopo38_floor���Դϴ�"�� �����Ѵ�.

	void kopo38_down() {
		if (kopo38_floor == kopo38_limit_down_floor) {
			kopo38_help = "ó�����Դϴ�";
		} else {
			kopo38_floor--;
			kopo38_help = String.format("%d���Դϴ�", kopo38_floor);
		}
		
	}
	// ���� ���� ���� �����̸� kopo38_help�� "ó�����Դϴ�"�� �����ϰ�
	// �׷��� ������ kopo38_floor���� 1�� ���� kopo38_help�� "kopo38_floor���Դϴ�"�� �����Ѵ�.
}
