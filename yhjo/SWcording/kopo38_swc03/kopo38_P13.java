package kopo38_swc03;

import java.text.DecimalFormat;

public class kopo38_P13 {

	public static void main(String[] args) {
		DecimalFormat kopo38_df = new DecimalFormat("###,###,###,###,###");
		// DecimalFormat Ŭ������ �ҷ��´�. kopo38_df �� �ҷ��� �� �ִ�.
		int kopo38_MyWon = 1000000;
		// ���� kopo38_MyWon �� 1000000���� ����
		double kopo38_MoneyEx = 1238.21;
		// double kopo38_MoneyEx �� 1238.21�� ����
		double kopo38_commission = 0.003;
		// double kopo38_commission �� 0.003���� ����
		double kopo38_ComPerOne = kopo38_MoneyEx * kopo38_commission;
		// double kopo38_ComPerOne �� kopo38_MoneyEx�� kopo38_commission�� ������ ����

		int kopo38_usd = (int) (kopo38_MyWon / (kopo38_MoneyEx + kopo38_ComPerOne));
		// ���� kopo38_usd �� kopo38_MyWon �� kopo38_MoneyEx�� kopo38_ComPerOne �� ���� ���� ����ó����
		// ��(�Ҽ��� �Ʒ� ����)���� ����
		double kopo38_totalcom = kopo38_usd * kopo38_ComPerOne;
		// double kopo38_totalcom �� kopo38_usd�� kopo38_ComPerOne�� ������ ����
		// �޷��� ������� �޷��� ���� �� �����ᰡ �ȴ�.
		int kopo38_i_totalcom;
		// ���� kopo38_i_totalcom �� ����
		if (kopo38_totalcom != (double) ((int) kopo38_totalcom)) {
			kopo38_i_totalcom = (int) kopo38_totalcom + 1;
		} else {
			kopo38_i_totalcom = (int) kopo38_totalcom;
		}
		// kopo38_totalcom�� �ڱ��ڽ��� ����ó���ϰ� double�� ��ȯ�� ���� �ٸ���(������ �ƴ� �Ҽ��̸�)
		// kopo38_i_totalcom �� kopo38_totalcom�� ����ȭ�� ���� 1�� ���� ������ ����
		// �ƴϸ� kopo38_i_totalcom �� kopo38_totalcom�� ����ȭ�� ������ ����(�ø����� �����ؾ� ���غ����ʴ´�.)
		int kopo38_remain = (int) (kopo38_MyWon - kopo38_usd * kopo38_MoneyEx - kopo38_i_totalcom);
		// ���� kopo38_remain �� kopo38_MyWon ���� kopo38_usd �� ȯ���� ���� �����Ḧ ���� ���� ����ó���� ��(�Ҽ���
		// �Ʒ� ����)���� ����
		// ���� �ݾ��� ������ ��ȭ���� ȯ���� �ݾװ� �����Ḧ �� ���̹Ƿ�
		System.out.printf("********************************************************************\n");
		System.out.printf("*                     �޸����, ��¥ ����                              *\n");
		System.out.printf("�� ������: %s��=> ��ȭ: %s�޷�, �޷��� ������: %s��\n", kopo38_df.format(kopo38_i_totalcom),
				kopo38_df.format(kopo38_usd), kopo38_ComPerOne);
		System.out.printf("�� ��ȭȯ���ݾ�: %s��=> ��ȭ: %s�޷�, ������û��: %s��, �ܵ�: %s��\n", kopo38_df.format(kopo38_MyWon),
				kopo38_df.format(kopo38_usd), kopo38_df.format(kopo38_i_totalcom), kopo38_df.format(kopo38_remain));
		System.out.printf("********************************************************************\n");
		// ���ڸ����� ,�� ����ִ� ������ �ٲ۴�
		// ,�� ������ �������� �ƴ� String ���� �ǹǷ� %s�� ����
	}

}
