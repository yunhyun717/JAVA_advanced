package kopo38_swc06;

public class kopo38_P02 {

	static int kopo38_iStatic;
	// ���������� kopo38_iStatic�� ������ �����Ѵ�.

	public static void kopo38_add(int kopo38_i) {
		kopo38_iStatic++;
		kopo38_i++;
		System.out.printf("add�޼ҵ忡��->iStatic=[%d]\n", kopo38_iStatic);
		System.out.printf("add�޼ҵ忡��->i=[%d]\n", kopo38_i);

	} 

	public static int kopo38_add2(int kopo38_i) {
		kopo38_iStatic++;
		kopo38_i++;
		System.out.printf("add�޼ҵ忡��->iStatic=[%d]\n", kopo38_iStatic);
		System.out.printf("add�޼ҵ忡��->i=[%d]\n", kopo38_i);
		return kopo38_i;
	}
	// ���������� ���ڿ� 1�� ���ϰ� ������ ���.
	// �� ���� �޼ҵ带 �����ϰ� ���� ������ ������, kopo38_add2�� return���� �������� ������ �Ѵ�.


	public static void main(String[] args) {
		int kopo38_iMain;
		kopo38_iMain = 1;
		kopo38_iStatic = 1;
		// ������ ������ ���� 1�� �����Ѵ�.

		System.out.printf("*********************************\n");
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iStatic=[%d]\n", kopo38_iStatic);
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iMain=[%d]\n", kopo38_iMain);
		System.out.printf("*********************************\n");
		// ������ ����Ѵ�.
		
		kopo38_add(kopo38_iMain);
		// �޼ҵ带 �����Ѵ�. �ش� �޼ҵ�� return���� ���� �ʰ� ��¸� �ϴ� �޼ҵ��̴�.
		
		System.out.printf("*********************************\n");
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iStatic=[%d]\n", kopo38_iStatic);
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iMain=[%d]\n", kopo38_iMain);
		System.out.printf("*********************************\n");
		// �޼ҵ带 ���� ���� ���� ����Ѵ�.
		
		kopo38_iMain=kopo38_add2(kopo38_iMain);
		// �޼ҵ带 �����Ѵ�. �ش� �޼ҵ�� return���� ������ �����鼭 ���� �� ��µ� �ϴ� �޼ҵ��̴�.
		// return���� kopo38_iMain���� �����Ѵ�.
		
		System.out.printf("*********************************\n");
		System.out.printf("�޼ҵ� add2ȣ���� ���ο���->iStatic=[%d]\n", kopo38_iStatic);
		System.out.printf("�޼ҵ� add2ȣ���� ���ο���->iMain=[%d]\n", kopo38_iMain);
		System.out.printf("*********************************\n");
		// �޼ҵ� ���� �� ���� ���� ����Ѵ�.

	}
}
