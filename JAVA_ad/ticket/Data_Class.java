package ticket;

import java.util.ArrayList;

public class Data_Class extends ConstValue_Class {
	ArrayList<Array_Class> ticketArray = new ArrayList<Array_Class>();
	int dorncode; // �����ڵ�
	String reginum; // �ֹε�Ϲ�ȣ
	int currentYear; // ���� �⵵
	int currentMonth; // ���� ��
	int currentDay; // ���� ��
	int birthYear; // �¾ �⵵
	int birthMonth; // �¾ ��
	int birthDay; // �¾ ��
	int age; // ���ɴ�
	int agescode; // ���ɴ� �ڵ�
	int nums; // �Է¹��� Ƽ�� ����
	String treat; // ������
	int treatcode; // ������ �ڵ�
	int price; // ����
	int choice1; // ��� �߱� or ����
	int choice2; // ���ο� �ֹ� or ����
	int totalprice; // �� ����
	int array_size;
	String dataset = dorncode + "," + agescode + "," + treatcode;	
}