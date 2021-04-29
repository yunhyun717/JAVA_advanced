package kopo38_swc03;

public class kopo38_P08 {

	public static void main(String[] args) {
		String[] kopo38_item = { "������", "���Ͻ�", "�Ե�����", "����", "���극" };
		//String �� kopo38_item�� ����
		int[] kopo38_price = { 1000, 2000, 3000, 2500, 1450 };
		//������ kopo38_price�� ����
		int[] kopo38_amount = { 10, 2, 1, 3, 5 };
		//������ kopo38_amount�� ����
		double kopo38_tax_rate = 0.1;
		//kopo38_tax_rate�� double�� ����
		int kopo38_total_sum = 0;
		//kopo38_total_sum�� ������ �����ϰ� ���� 0���� �Ѵ�.

		System.out.printf("***********************************\n");
		System.out.printf("            �ʰ� ���� ���ڵ�           \n");
		System.out.printf("   �׸�      �ܰ�      ����      �հ�   \n");
		for (int i = 0; i < kopo38_item.length; i++) {
			int kopo38_sum = kopo38_price[i] * kopo38_amount[i];
			kopo38_total_sum = kopo38_total_sum + kopo38_sum;
			System.out.printf("%5s	%7d      %2d	%9d\n", kopo38_item[i], kopo38_price[i], kopo38_amount[i], kopo38_sum);
		}
		/*0���� kopo38_item String���� �׸� �������� ���� ���� 1�� �����ϴ� i�� ����
		 * ���� kopo38_sum�� ������ kopo38_price�� 0���� ������ i��° �׸��
		 * ������ kopo38_amount�� 0���� ������ i��° �׸��� ������ �����Ѵ�.
		 * ���� kopo38_total sum�� �� sum���� ������ ����
		 * kopo38_item, kopo38_price, kopo38_amount�� 0���� ������ i��° �׸��� ����ϰ�
		 * (kopo38_item�� 5��° ���ڱ��� ���, kopo38_price�� 7��° �ڸ�������, kopo38_amount�� 2��° �ڸ�������)
		 * kopo38_sum�� ����Ѵ�.(9��° �ڸ�������)*/
		System.out.printf("***********************************\n");
		System.out.printf(" �� ��  �� �� : %20d\n", kopo38_total_sum);
		int kopo38_total_net_price = (int) (kopo38_total_sum / (1 + kopo38_tax_rate));
		System.out.printf(" �� ��  �� �� : %20d\n", kopo38_total_net_price);
		int kopo38_tax = kopo38_total_sum - kopo38_total_net_price;
		System.out.printf(" ��       �� : %20d\n", kopo38_tax);
		/*���� �ݾ��� 20��° �ڸ������� kopo38_total_sum�� ���
		 *���� kopo38_total_net_price�� kopo38_total_sum�� 1+kopo38_tax_rate�� ���� ���� ����ó���� ������ ����(�Ҽ��� �Ʒ� ����)
		 *���� ¡�� �� �ݾ��� ����ؾ��ϹǷ� 1/1.1�� ���� ��(1.1�� ���� ��)�� ����ؾ��Ѵ�.
		 *�����ݾ��� 20��° �ڸ������� kopo38_total_net_price�� ���
		 *���� kopo38_tax�� kopo38_total_sum�� kopo38_total_net_price�� ���� ����
		 * ������ 20��° �ڸ������� kopo38_tax�� ���*/
	}

}
