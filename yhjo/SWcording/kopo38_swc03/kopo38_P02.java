package kopo38_swc03;

public class kopo38_P02 {

	public static void main(String[] args) {
		int kopo38_sum; // kopo38_sum�� integer�� ����
		kopo38_sum = 0; // kopo38_sum�� 0���� ����
		for (int i = 1; i < 101; i++) {
			kopo38_sum = kopo38_sum + i;
		}
		/*for method, 1���� �����ؼ� 1�� �����Ͽ� 101�̸�����(100����) ���� �����ϴ� ���� i�� Ȱ��
		kopo38_sum�� i�� ù�׿��� ���ױ��� ����*/ 
		System.out.printf("#2 : %d\n", kopo38_sum); //kopo38_sum�� ���

		System.out.printf("#2-2 : %d\n", kopo38_sum / 100);
		//kopo38_sum/100�� ���, kopo38_sum�� integer���̱� ������ �������� ������ ���� ��µ�

		int[] kopo38_v = { 1, 2, 3, 4, 5 }; //������ kopo38_v�� ����
		int kopo38_vSum; //kopo38_vSum�� integer�� ����
		kopo38_vSum = 0; //kopo38_vSum�� 0���� ����

		for (int i = 0; i < 5; i++) {
			kopo38_vSum = kopo38_vSum + kopo38_v[i];
		}
		//0���� 5�̸������� i ���� ���� kopo38_vSum�� kopo38_v�� i�׸�ŭ �����ǵ��� ����
		System.out.printf("#2-3 : %d\n", kopo38_vSum);
		//kopo38_vSum�� ���
	}

}
