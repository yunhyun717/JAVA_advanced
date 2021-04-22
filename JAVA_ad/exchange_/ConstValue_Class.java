package exchange_;

public class ConstValue_Class {
	final double[] EX_RATE = { 1127.40, 1328.08, 10.1976 };
							// USD 환율, EUR 환율, JPY 환율
	
	final int[][] CHANGE = { { 1000, 500, 100, 50, 10 }, // KRW 화폐 단위 
							 { 100, 50, 20, 10, 5, 2, 1 }, // USD 화폐 단위
							 { 500, 200, 100, 50, 20, 10, 5, 2, 1 }, // EUR 화폐 단위
							 { 10000, 5000, 2000, 1000, 500, 100, 50, 10, 5, 1 } }; // JPY 화폐 단위

	final String[] EX = { "KRW", "USD", "EUR", "JPY" }; // 화폐 종류
	
	final String FILEDIR = "Exchange.csv"; // 파일 생성 경로
	
	final String SDT = "YYYY-MM-dd HH:mm:ss"; // 파일 출력시 날짜 형식
	
	final String filemenu = "날짜,환전대상,금액,환전결과,거스름돈\n"; // 파일 출력시 항목명

}
