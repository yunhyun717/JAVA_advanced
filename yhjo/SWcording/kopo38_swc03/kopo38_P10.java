package kopo38_swc03;

public class kopo38_P10 {

	public static void main(String[] args) {
		int kopo38_MyWon = 1000000;
		// ���� kopo38_MyWon �� 1000000���� ����
		double kopo38_MoneyEx = 1238.21;
		// double kopo38_MoneyEx �� 1238.21�� ����
		double kopo38_commission = 0.003;
		// double kopo38_commission �� 0.003���� ����

		int kopo38_usd = (int) (kopo38_MyWon / kopo38_MoneyEx);
		// ���� kopo38_usd �� kopo38_MyWon �� kopo38_MoneyEx �� ���� ���� ����ó���� ��(�Ҽ��� �Ʒ� ����)���� ����
		// �޷� * ȯ�� = ��ȭ �̹Ƿ� �޷� = ��ȭ / ȯ��
		int kopo38_remain = (int) (kopo38_MyWon - kopo38_usd * kopo38_MoneyEx);
		// ���� kopo38_remain �� kopo38_MyWon ���� kopo38_usd �� ȯ���� ���� ���� ���� ����ó���� ��(�Ҽ��� �Ʒ� ����)���� ����
		// ���� �ݾ��� ������ ��ȭ���� ȯ���� �ݾ��� �� ���̹Ƿ�
		System.out.printf("*************************************************\n");
		System.out.printf("*                   ��������� ���                 *\n");
		System.out.printf("�� ��ȭȯ���ݾ�: %d��=> ��ȭ : %d�޷�, �ܵ� : %d��\n", kopo38_MyWon, kopo38_usd, kopo38_remain);
		System.out.printf("*************************************************\n");
		//�� ��ȭȯ���ݾ��� kopo38_MyWon, ��ȭ kopo38_usd, �ܵ� kopo38_remain ���� ���
		
		double kopo38_ComPerOne = kopo38_MoneyEx * kopo38_commission;
		//double kopo38_ComPerOne �� kopo38_MoneyEx�� kopo38_commission�� ������ ����
		double kopo38_totalcom = kopo38_usd*kopo38_ComPerOne;
		System.out.printf("***************************************************************\n");
		System.out.printf("*                         ������    ���                        *\n");
		System.out.printf("�� ������ : %f��=> ��ȭ : %d�޷�, �޷��� ������ : %f��\n", kopo38_totalcom, kopo38_usd, kopo38_ComPerOne);
		System.out.printf("***************************************************************\n");
		//�� ������� kopo38_totalcom, ��ȭ kopo38_usd, �޷��� ������ kopo38_ComPerOne �� ���
	}

}
