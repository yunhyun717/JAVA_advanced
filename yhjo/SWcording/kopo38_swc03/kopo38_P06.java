package kopo38_swc03;

public class kopo38_P06 {

	public static int kopo38_netprice(int kopo38_price, double kopo38_rate) {
		return (int) (kopo38_price / (1 + kopo38_rate));
		// integer���� return������ ������ integer�� double���� parameter�� ������ �޼ҵ带 ����
		// �Һ��ڰ��� = �������� * (1+����) �̹Ƿ� �������� = �Һ��ڰ��� / (1+����)
	}

	public static void main(String[] args) {
		int kopo38_price = 1234; // integer price�� 1234�� ����
		double tax_rate = 0.1; // double tax_rate�� 0.1�� ����

		int kopo38_netprice = kopo38_netprice(kopo38_price, tax_rate);
		// integer kopo38_netprice�� ������ ������ kopo38_netprice �޼ҵ忡 price�� tax_rate�� ���ڷ� �� return������ ����
		int tax = kopo38_price - kopo38_netprice;
		// ������ �Һ��ڰ��ݿ��� ���������� �� ��
		System.out.printf("***************************************\n");
		System.out.printf("*       �Һ��ڰ�, ��������, ���� ���        *\n");
		System.out.printf("  �Һ��ڰ���: %d, ��������: %d, ����: %d\n", kopo38_price, kopo38_netprice, tax);
		System.out.printf("***************************************\n");

	}

}
