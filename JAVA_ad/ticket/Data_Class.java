package ticket;

import java.util.ArrayList;

public class Data_Class extends ConstValue_Class {
	ArrayList<Array_Class> ticketArray = new ArrayList<Array_Class>();
	int dorncode; // 권종코드
	String reginum; // 주민등록번호
	int currentYear; // 현재 년도
	int currentMonth; // 현재 월
	int currentDay; // 현재 일
	int birthYear; // 태어난 년도
	int birthMonth; // 태어난 월
	int birthDay; // 태어난 일
	int age; // 연령대
	int agescode = 0; // 연령대 코드
	int nums; // 입력받은 티켓 갯수
	String treat; // 우대사항
	int treatcode; // 우대사항 코드
	int price; // 가격
	int temp; // 계속 발권 or 종료
	int temp2; // 새로운 주문 or 종료
	int totalprice; // 총 가격
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