package kopo38_swc05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class kopo38_P04 {

	public static void main(String[] args) {
		int kopo38_iPrice = 33000;
		// 총 가격을 kopo38_iPrice로 설정
		DecimalFormat kopo38_df = new DecimalFormat("###,###,###,###");
		Calendar kopo38_calendar = Calendar.getInstance();
		SimpleDateFormat kopo38_sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		// 사용할 method를 불러온다. kopo38_df는 숫자 쉼표, kopo38_calendar는 시간불러오기
		// kopo38_sdf는 시간 형식 지정
		int kopo38_Price = (int) (Math.round(kopo38_iPrice /1.1));
		int kopo38_tax = kopo38_iPrice - kopo38_Price;
		// 세전가격을 정수 kopo38_Price로 설정한다. 이 값은 총 가격을 1.1로 나눈 값의 반올림을 정수 변환한 값이다.
		// 세금을 kopo38_tax로 설정한다. 세금은 총가격에서 세전가격을 뺀 값이다.
		System.out.printf("신용승인\n");
		kopo38_twostring("단말기 : 2N68665898", "전표번호 : 041218");
		System.out.printf("가맹점 : 한양김치찌개\n");
		System.out.printf("주  소 : 경기 성남시 분당구 황새울로351번길 10 1층\n");
		System.out.printf("대표자 : 유창신\n");
		kopo38_twostring("사업자 : 752-53-00558", "TEL : 7055695");
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");
		kopo38_twostring("금  액", kopo38_df.format(kopo38_Price) + " 원");
		kopo38_twostring("부가세", kopo38_df.format(kopo38_tax) + " 원");
		kopo38_twostring("합  계", kopo38_df.format(kopo38_iPrice) + " 원");
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");
		System.out.printf("우리카드\n");
		System.out.printf("카드번호 : 5387-20**-****-4613(S)  일시불\n");
		System.out.printf("거래일시 : %s\n", kopo38_sdf.format(kopo38_calendar.getTime()));
		System.out.printf("승인번호 : 70404427\n");
		System.out.printf("거래번호 : 357734873739\n");
		System.out.printf("%s  %s\n", "매입 : 비씨카드사", "가맹 : 720068568");
		System.out.printf("알림 : EDC매출표\n");
		System.out.printf("문의 : TEL)1544-4700\n");
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");
		kopo38_center("	* 감사합니다 *");
		System.out.printf("%40.40s", "표준V2.08_20200212\n");
		// kopo38_center와 kopo38_twostring을 활용해 내용을 출력한다.
		// 시간은 kopo38_calendar로 불러와 kopo38_sdf에서 지정한 형식으로 출력한다.
	}

	public static void kopo38_twostring(String kopo38_a, String koppo38_b) {
		int kopo38_a_kornum = 0;
		int kopo38_b_kornumm = 0;
		String kopo38_space = "";
		for (int kopo38_i = 0; kopo38_i < kopo38_a.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_a.charAt(kopo38_i));
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_a_kornum++;
			}
		}
		for (int kopo38_i = 0; kopo38_i < koppo38_b.length(); kopo38_i++) {
			int kopo38_charint = (int) (koppo38_b.charAt(kopo38_i));
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_b_kornumm++;
			}
		}
		// kopo38_a_kornum은 String kopo38_a에 포함된 한글의 수,
		// kopo38_b_kornum은 String kopo38_b에 포함된 한글의 수이다.
		// 각각 반복문과 ASCII코드를 활용하여 문자열에 포함된 한글 수를 세어준다.
		int kopo38_spacenum = 41 - (kopo38_a.length() + koppo38_b.length() + kopo38_a_kornum + kopo38_b_kornumm);
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		// kopo38_spacenum은 총 길이 41에서 kopo38_a와 kopo38_b의 글자 수, 그리고 한글로 인해 늘어난 길이만큼을 제외해준 숫자이다.
		// 즉, kopo38_a와 kopo38_b가 차지하고 있는 영역을 제외한 빈 공간의 길이이다.
		// kopo38_spacenum만큼 빈칸을 kopo38_space로 설정한다.
		System.out.printf("%s%s%s\n", kopo38_a, kopo38_space, koppo38_b);
		// 좌측에 kopo38_a, 가운데에 둘을 제외한 만큼의 공간, 우측에 kopo38_b를 배치하여 두 String을 양쪽 정렬 한다.
	}

	public static void kopo38_center(String kopo38_a) {
		int kopo38_a_kornum = 0;
		String kopo38_space = "";
		for (int kopo38_i = 0; kopo38_i < kopo38_a.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_a.charAt(kopo38_i));
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_a_kornum++;
			}
		}
		// kopo38_a_num을 이용해 String kopo38_a에 포함된 한글을 세어준다.
		int kopo38_spacenum = (41 - (kopo38_a.length() + kopo38_a_kornum)) / 2;
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		// kopo38_spacenum은 총 길이 41에서 kopo38_a의 글자수에 한글로 인해 늘어난 길이만큼을 제외해준 숫자를 2로 나눈 몫이다.
		// 즉, kopo38_a가 차지하고 있는 영역을 제외한 빈공간을 반으로 나눈 몫이 된다.
		// 해당 길이만큼 빈칸을 kopo38_space로 설정한다.
		System.out.printf("%s%s\n", kopo38_space, kopo38_a);
		// kopo38_space만큼의 빈공간을 출력하고 이어서 kopo38_a를 출력하면 가운데 정렬이 된다.
	}

}
