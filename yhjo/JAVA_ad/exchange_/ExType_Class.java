package exchange_;

public class ExType_Class extends ConstValue_Class {
	int won; // 환전할 원화
	int how; // 어떤 화폐로 환전할지 코드
	int money; // 선택한 화폐로 환전된 금액
	int won_chg; // 환전 후 남은 한화 거스름돈
	double exchangeResult; // 한화 거스름돈을 계산하기 위한 값 
}