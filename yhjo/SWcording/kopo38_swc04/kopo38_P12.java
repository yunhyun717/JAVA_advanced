package kopo38_swc04;

import java.text.DecimalFormat;

public class kopo38_P12 {

	public static void main(String[] args) {
		String kopo38_item = "���";
		// String kopo38_item�� "���"�� ����
		int kopo38_unit_price = 5000;
		// ���� kopo38_unit_price�� 5000���� ����
		int kopo38_num = 500;
		// ���� kopo38_num�� 500���� ����
		int kopo38_total = 0;
		// ���� kopo38_total�� 0���� ����

		DecimalFormat df = new DecimalFormat("###,###,###,###,###");
		// DecimalFormat�� ������ ������ ����(String��)���� ��ȯ�ϴ� Method�� �ҷ��´�.
		// ���⼭�� df�� ����. df.format(����)���·� ����.
		System.out.printf("======================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n", "ǰ��", "�ܰ�", "����", "�հ�");
		System.out.printf("======================================================\n");
		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n", kopo38_item, df.format(kopo38_unit_price),
				df.format(kopo38_num), df.format(kopo38_unit_price * kopo38_num));
		System.out.printf("======================================================\n");
		// %20.20s : ��ü 20�ڸ����� 20�ڸ����� ���, 20�ڸ��� �ȵǸ� ������ ������ �߰�
		// �̶� �ѱ��� 1s�� �ν��ϰ� ó�������� �����δ� �� ���ڴ� 2�ڸ��� �����Ѵ�.
		// �ڸ� ���߱� ���ؼ��� %n.ns, �ѱ� ������ m�̶� �� ��(n>m) ������ ũ��� n-m�̰� �� ���̴� (n-m)+2m=n+m�̴�.
		// ���� ���� ��� ������ "�ܰ�"�� �ѱ� �� �����̸�, %8.8s ǥ���ϱ� ������ ���� ������ 6, �� ���̴� 10�̴�.
		// ���� �Ʒ����� 10.10�� ���ְ� �ȴ�.
	}

}
