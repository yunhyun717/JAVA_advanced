package ticket;

public class Data_Class extends ConstValue_Class {
	int[][][] tickets = new int[DORNTEMP.length][AGESRAN.length][TREAT.length];
	int dorncode; // �����ڵ�
	String reginum = ""; // �ֹε�Ϲ�ȣ
	int[] current; // ���� �⵵
	int[] birth;
	int age; // ���ɴ�
	int agescode; // ���ɴ� �ڵ�
	int nums = 0; // �Է¹��� Ƽ�� ����
	int treatcode; // ������ �ڵ�
	int choice1; // ��� �߱� or ����
	int choice2; // ���ο� �ֹ� or ����
	int totalprice; // �� ����
}