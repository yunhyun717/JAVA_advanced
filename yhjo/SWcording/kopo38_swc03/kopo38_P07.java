package kopo38_swc03;

public class kopo38_P07 {

	public static int kopo38_taxcal(int kopo38_val, int kopo38_rate) {
		//kopo38_taxcal method�� �����ϰ� integer kopo39_val�� kopo38_rate�� parameter�� ���� 
		int kopo38_ret; //kopo38_ret�� integer�� ����

		if (((double) kopo38_val * (double) kopo38_rate / 100.0) == kopo38_val * kopo38_rate / 100) {
			/*double�� ��ȯ�� kopo38_val�� ���������� double�� ��ȯ�� kopo38_rate�� ���ϰ� 100���� ����
			�� ���� kopo38�� kopo38_rate�� ���� 100���� ���� ��(integer�̱� ������ �Ҽ��� �Ʒ��� ����)�� ���� ��*/
			kopo38_ret = kopo38_val * kopo38_rate / 100;
			//kopo38_ret�� kopo38_val�� kopo38_rate�� ���� ���� 100���� ���������� ����
		} else {
			//�� ���� ���
			kopo38_ret = kopo38_val * kopo38_rate / 100 + 1;
			//kopo38_ret�� kopo38_val�� kopo38_rate�� ���� ���� 100���� ���� ���� 1�� ���� ������ ����
		}
		return kopo38_ret;
		//kopo38_taxcal method�� integer�� return������ ������, �̸� kopo38_ret���� ����
	}

	public static void main(String[] args) {
		int kopo38_val = 271;
		//kopo38_val�� ����
		int kopo38_rate = 3;
		//kopo38_rate�� ����
		int kopo38_tax = kopo38_taxcal(kopo38_val, kopo38_rate);
		//kopo38_tax�� ������ ������ kopo38_taxcal method�� kopo38_val�� kopo38_rate�� parameter�� ������ ������ ����
		System.out.printf("**********************************\n");
		System.out.printf("*           �ܼ� ���� ���          *\n");
		System.out.printf("���� ���ݰ��: %f\n", kopo38_val * kopo38_rate / 100.0);
		//���� ������ kopo38_val�� kopo38_rate�� ���� ���� 100���� ���� ������ ���
		System.out.printf("��������: %d ����:%d �������԰��� : %d\n", kopo38_val, kopo38_tax, kopo38_val + kopo38_tax);
		//���������� kopo38_val, ������ kopo38_tax�� ����Ͽ����� �������԰����� �� ���� ������ ���
		System.out.printf("**********************************\n");

	}

}
