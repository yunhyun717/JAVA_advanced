package report;

public class ConstValue_Class {
	final String[] AGESTEMP = { "유아", "소인", "청소년", "대인", "경로" };

	final String[] DORNTEMP = { "주간권", "야간권" }; //

	final String[] TREATTEMP = { "없음", "장애인", "국가유공자", "다자녀", "임산부" }; // 우대사항

	final String FILEPATH = "report.csv";
	
	final String FILEPATH1 = "report1.csv";

	final String FILEPATH2 = "report2.csv";

	final String FILEPATH3 = "report3.csv";

	final String FILEMENU1 = "구분,주간권,야간권\n";
	
	final String FILEMENU2 = "일자,총매출\n";
	
	final String FILEMENU3 = "구분,티켓수\n";
	
	final int[][] DORN_AGE_PRICE = { { 0, 44000, 47000, 56000, 44000 }, { 0, 37000, 40000, 46000, 37000 } };
	
	final double[] TREAT = { .0, .4, .5, .2, .15 }; // 우대사항 할인율
}
