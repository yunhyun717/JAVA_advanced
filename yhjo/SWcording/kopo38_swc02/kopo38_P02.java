package kopo38_swc02;

public class kopo38_P02 {

	public static void main(String[] args) {
		int kopo38_x = 10;
		int kopo38_y = 20;
		int kopo38_tmp = 0;
		// ���� kopo38_x, kopo38_y, kopo38_tmp�� �����Ѵ�.

		System.out.println("x:" + kopo38_x + "y:" + kopo38_y);
		// kopo38_x�� kopo38_y�� ������ �������� ����Ѵ�.
		
		kopo38_tmp = kopo38_x;
		kopo38_x = kopo38_y;
		kopo38_y = kopo38_tmp;
		// ������ ������ ������ Ȱ���� �缳���Ѵ�.	
		
		System.out.println("x:" + kopo38_x + "y:" + kopo38_y);
		// kopo38_x�� kopo38_y�� ������ �������� ����Ѵ�.
		
	}

}
