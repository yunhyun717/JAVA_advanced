package ticket;

public class ConstValue_Class {
	final int[] AGESRAN = { 0, 2, 12, 18, 64 }; // 나이 구분

	final String[] AGESTEMP = { "유아", "소인", "청소년", "대인", "경로" };

	final int[][] DORN_AGE_PRICE = { { 0, 44000, 47000, 56000, 44000 }, { 0, 37000, 40000, 46000, 37000 } };
	// 주야간 유아,소인,청소년,대인,경로 가격

	final String[] DORNTEMP = { "주간권", "야간권" }; //

	final double[] TREAT = { .0, .4, .5, .2, .15 }; // 우대사항 할인율

	final String[] TREATTEMP = { "우대적용 없음", "장애인 우대적용", "국가유공자 우대적용", "다자녀 우대적용", "임산부 우대적용" }; // 우대사항

	final String FILEPATH = "report.csv";

	final String FILEMENU = "날짜,권종,연령구분,수량,가격,우대사항\n";
}
