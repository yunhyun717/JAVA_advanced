package exchange_;

public class ConstValue_Class {
	final double[] EX_RATE = { 1127.40, 1328.08, 10.1976 };
							// USD ȯ��, EUR ȯ��, JPY ȯ��
	
	final int[][] CHANGE = { { 1000, 500, 100, 50, 10 }, // KRW ȭ�� ���� 
							 { 100, 50, 20, 10, 5, 2, 1 }, // USD ȭ�� ����
							 { 500, 200, 100, 50, 20, 10, 5, 2, 1 }, // EUR ȭ�� ����
							 { 10000, 5000, 2000, 1000, 500, 100, 50, 10, 5, 1 } }; // JPY ȭ�� ����

	final String[] EX = { "KRW", "USD", "EUR", "JPY" }; // ȭ�� ����
	
	final String FILEDIR = "Exchange.csv"; // ���� ���� ���
	
	final String SDT = "YYYY-MM-dd HH:mm:ss"; // ���� ��½� ��¥ ����
	
	final String filemenu = "��¥,ȯ�����,�ݾ�,ȯ�����,�Ž�����\n"; // ���� ��½� �׸��

}
