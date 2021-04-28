package ticket;

public class Data_Class extends ConstValue_Class {
	int[][][] tickets = new int[DORNTEMP.length][AGESRAN.length][TREAT.length];
	int dorncode; // 권종코드
	String reginum = ""; // 주민등록번호
	int[] current; // 현재 년도
	int[] birth;
	int age; // 연령대
	int agescode; // 연령대 코드
	int nums = 0; // 입력받은 티켓 갯수
	int treatcode; // 우대사항 코드
	int choice1; // 계속 발권 or 종료
	int choice2; // 새로운 주문 or 종료
	int totalprice; // 총 가격
}