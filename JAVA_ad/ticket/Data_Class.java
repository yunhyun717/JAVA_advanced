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
	int agescode = 0; // ���ɴ� �ڵ�
	int nums; // �Է¹��� Ƽ�� ����
	String treat; // ������
	int treatcode; // ������ �ڵ�
	int price; // ����
	int choice1; // ��� �߱� or ����
	int choice2; // ���ο� �ֹ� or ����
	int totalprice; // �� ����
	int array_size;
	
	public void add(Data_Class data) {
		array_size = ticketArray.size();
		if (array_size == 0) {
			ticketArray.add(new Array_Class(data));
		} else {
			for (int i = 0; i < array_size; i++) {
				if (ticketArray.get(i).dorncode == dorncode && ticketArray.get(i).agescode == agescode
						&& ticketArray.get(i).treatcode == treatcode) {
					ticketArray.get(i).numsedit(nums);
				} else {
					ticketArray.add(new Array_Class(data));
				}
			}
		}
	}

	
}