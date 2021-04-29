package kopo38_swc06;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class kopo38_P03 {
	static int kopo38_receiptwidth = 41;
	static String[][] kopo38_items = { { "tf", "저탄소인증 사과 4~7입/봉 (1.3kg내외)", "9900", "2" },
			{ "tf", "[국내산] 성주참외 3~6입/봉 (1.2kg내외)", "10900", "1" }, { "tf", "적상추 200g", "1480", "2" },
			{ "tf", "애호박 200g", "1280", "2" }, { "tf", "일판란 30개입 (특란, 1800g)", "6980", "1" },
			{ "tf", "[국내산] 성주참외 3~6입/봉 (1.2kg내외)", "10900", "2" }, { "tf", "[20년산] 이맛쌀 20kg", "58900", "1" },
			{ "tf", "[국내산] 당찬사과 4~11입/봉 (1.8kg)", "12800", "2" }, { "tf", "[국내산] 대추방울토마토 1kg/팩", "7900", "2" },
			{ "tf", "[풀무원] 국산콩 콩나물 340g", "2500", "2" }, { "tf", "[국내산] 방울토마토 600g/팩", "5400", "3" },
			{ "tf", "[서울우유] 후레쉬 밀크 기획(900ml*2) 1800ml", "3870", "3" }, { "0", "노브랜드 도톰한 물티슈 100매", "980", "3" },
			{ "0", "노브랜드 위생장갑125매", "1680", "4" }, { "0", "피지 파워젤 세제 프레쉬2.7L", "6900", "1" },
			{ "0", "에이퓨리 유어프리 KF94 의약외품 국산 대형 블랙 화이트 일회용마스크 100매", "15900", "1" },
			{ "0", "프릴 베이킹소다 퓨어레몬 750ML 용기", "6500", "1" }, { "0", "노브랜드 콜드브루 아메리카노 500m", "1880", "5" },
			{ "0", "[노브랜드] 숯불데리야끼닭꼬치 800g", "12980", "1" }, { "0", "피코크 콜롬비아 안티오키아 수프리모 1kg (홀빈)", "14980", "1" },
			{ "0", "오랄비 칫솔 어드밴티지 5웨이 3개입+크로스액션 탁월한 세정력 2개입", "9900", "2" }, { "0", "농심 배홍동비빔면 4입", "2980", "2" },
			{ "0", "[풀무원]국산콩 투컵 두부 600g", "4980", "2" }, { "0", "2080 오리지날 알파 블루 140g*3입", "7900", "1" },
			{ "0", "[매일] 마이 카페라떼 220ml*6입 기획 (기획랜덤구성)", "5980", "6" }, { "0", "노브랜드 콜롬비아 아메리카노 블랙 2.1L", "2980", "4" },
			{ "0", "[서울우유] 스페셜티 카페라떼 모카 250ml", "1000", "5" }, { "0", "[맥심] TOP 볼드 에스프레소 라떼 300ml", "1000", "10" },
			{ "0", "[서울우유] 스페셜티 카페라떼 아포가토 250ml", "1000", "10" },
			{ "0", "(쓱배송)[맥심] 모카골드 마일드 커피믹스 250입(12g*250입)", "27200", "1" } };
	
	// 영수증 길이와 물품 정보를 전역변수로 설정한다.

	public static void main(String[] args) {
		int itemCount = kopo38_items.length;
		TitlePrint();
		TimeStemp();
		HeaderPrint();
		for (int kopo38_i = 0; kopo38_i < itemCount; kopo38_i++) {
			ItemPrint(kopo38_i);
		}
		TotalPrint();
	}
	// main함수에 메소드 실행 구문만을 남겨놓고 내용을 메소드로 정리한다.

	public static void TitlePrint() {
		System.out.printf("  *******   이마트 죽전점 (031)888-1234\n");
		System.out.printf("  *      *  206-85-50913 강희석\n");
		System.out.printf("  *******   용인 수지구 포은대로 552\n");
		System.out.printf("\n영수증 미지참시 교환/환불 불가\n");
		System.out.printf("정상상품에 한함, 30일 이내(신선7일)\n");
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참조)\n");
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n\n");
	}

	public static void TimeStemp() {
		Calendar kopo38_calendar = Calendar.getInstance();
		SimpleDateFormat kopo38_sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm");
		kopo38_twostring("[구 매]" + kopo38_sdf.format(kopo38_calendar.getTime()), "POS:0011-9861");
		kopo38_drawline();
	}

	public static void HeaderPrint() {
		int kopo38_tax_name = kopo38_receiptwidth - 25;
		int kopo38_tnsf = (int) Math.ceil((kopo38_tax_name - 8) / 2.0);
		int kopo38_tnsb = (int) Math.floor((kopo38_tax_name - 8) / 2.0);

		System.out.printf(
				"%" + (kopo38_tnsf + 5) + "." + 5 + "s%" + kopo38_tnsb + "." + kopo38_tnsf + "s%8.5s%3.2s%8.5s\n",
				"상 품 명", "", "단   가", "수량", "금   액");
		kopo38_drawline();
	}

	public static void ItemPrint(int kopo38_i) {
		DecimalFormat kopo38_df = new DecimalFormat("###,###,###,###");
		int kopo38_iprice = Integer.parseInt(kopo38_items[kopo38_i][2]) * Integer.parseInt(kopo38_items[kopo38_i][3]);
		if (kopo38_items[kopo38_i][0].equals("tf")) {
			System.out.printf("* ");
		} else {
			System.out.printf("  ");
		}
		int kopo38_namewidth = kopo38_receiptwidth - 27;
		int kopo38_charnum = 0;
		int kopo38_kornum = 0;

		for (int kopo38_j = 0; kopo38_j < kopo38_items[kopo38_i][1].length(); kopo38_j++) {
			int kopo38_charint = (int) (kopo38_items[kopo38_i][1].charAt(kopo38_j));
			kopo38_charnum = kopo38_j + 1;
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_kornum++;
			}
			if (kopo38_kornum + kopo38_charnum == kopo38_namewidth) {
				break;
			} else if (kopo38_kornum + kopo38_charnum == kopo38_namewidth + 1) {
				kopo38_kornum--;
				kopo38_charnum--;
				break;
			}
		}
		System.out.printf("%-" + (kopo38_namewidth - kopo38_kornum) + "." + kopo38_charnum + "s%10.9s%4.3s%11.10s\n",
				kopo38_items[kopo38_i][1], kopo38_df.format(Integer.parseInt(kopo38_items[kopo38_i][2])),
				kopo38_items[kopo38_i][3], kopo38_df.format(kopo38_iprice));
		if ((kopo38_i + 1) % 5 == 0) {
			kopo38_drawline();
		}
	}

	public static void TotalPrint() {
		DecimalFormat kopo38_df = new DecimalFormat("###,###,###,###");
		Calendar kopo38_calendar = Calendar.getInstance();
		SimpleDateFormat kopop38_sdf2 = new SimpleDateFormat("YYYYMMdd");

		int kopo38_taxfreeprice = 0;
		int kopo38_taxitemprice = 0;
		for (int kopo38_i = 0; kopo38_i < kopo38_items.length; kopo38_i++) {
			int kopo38_iprice = Integer.parseInt(kopo38_items[kopo38_i][2])
					* Integer.parseInt(kopo38_items[kopo38_i][3]);
			if (kopo38_items[kopo38_i][0].equals("tf")) {
				kopo38_taxfreeprice += kopo38_iprice;
			} else {
				kopo38_taxitemprice += kopo38_iprice;
			}
		}

		System.out.println();
		kopo38_calc("총 품목 수량", kopo38_df.format(kopo38_items.length));
		kopo38_calc("(*)면 세  물 품", kopo38_df.format(kopo38_taxfreeprice));
		kopo38_calc("과 세  물 품", kopo38_df.format(Math.round(kopo38_taxitemprice / 1.1)));
		kopo38_calc("부   가   세", kopo38_df.format(kopo38_taxitemprice - Math.round(kopo38_taxitemprice / 1.1)));
		kopo38_calc("합        계", kopo38_df.format(kopo38_taxitemprice + kopo38_taxfreeprice));
		kopo38_twostring("결제대상금액", kopo38_df.format(kopo38_taxitemprice + kopo38_taxfreeprice));
		kopo38_drawline();
		kopo38_twostring("0012 KEB 하나", "541707**0484/35860658");
		kopo38_twostring("카드결제(IC)", "일시불 /" + kopo38_df.format(kopo38_taxitemprice + kopo38_taxfreeprice));
		kopo38_drawline();
		kopo38_center("[신세계포인트 적립]");
		System.out.printf("%s\n", "조*현 고객님의 포인트 현황입니다.");
		kopo38_threestring("금회발생포인트", "9350**9995",
				kopo38_df.format((int) ((kopo38_taxitemprice + kopo38_taxfreeprice) / 100)));
		kopo38_twostring("누계(가용)포인트 ",
				kopo38_df.format(1000000 + (int) ((kopo38_taxitemprice + kopo38_taxfreeprice) / 100)) + "("
						+ kopo38_df.format(1000000) + ")");
		System.out.printf("*신세계포인트 유효기간은 2년입니다.\n");
		kopo38_drawline();
		kopo38_center("구매금액기준 무료주차시간 자동부여");
		kopo38_twostring("차량번호 :", "34저****");
		kopo38_twostring("입차시간 :", "2021-04-14 15:00:15");
		kopo38_drawline();
		kopo38_twostring("캐셔:084599 양OO", "1150");
		kopo38_center("|||||||||||||||||||||||||||||||||");
		kopo38_center("|||||||||||||||||||||||||||||||||");
		kopo38_center(kopop38_sdf2.format(kopo38_calendar.getTime()) + "/00119861/00164980/31");

	}

	public static void kopo38_twostring(String kopo38_a, String kopo38_b) {
		int kopo38_a_kornum = 0;
		int kopo38_b_kornum = 0;
		String kopo38_space = "";

		for (int kopo38_i = 0; kopo38_i < kopo38_a.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_a.charAt(kopo38_i));
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_a_kornum++;
			}
		}
		for (int kopo38_i = 0; kopo38_i < kopo38_b.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_b.charAt(kopo38_i));
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_b_kornum++;
			}
		}
		int kopo38_spacenum = kopo38_receiptwidth
				- (kopo38_a.length() + kopo38_b.length() + kopo38_a_kornum + kopo38_b_kornum);
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		System.out.printf("%s%s%s\n", kopo38_a, kopo38_space, kopo38_b);
	}

	public static void kopo38_threestring(String kopo38_a, String kopo38_b, String kopo38_c) {
		int kopo38_a_kornum = 0;
		int kopo38_b_kornum = 0;
		int kopo38_c_kornum = 0;
		String kopo38_space = "";

		for (int kopo38_i = 0; kopo38_i < kopo38_a.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_a.charAt(kopo38_i));
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_a_kornum++;
			}
		}
		for (int kopo38_i = 0; kopo38_i < kopo38_b.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_b.charAt(kopo38_i));
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_b_kornum++;
			}
		}
		for (int kopo38_i = 0; kopo38_i < kopo38_c.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_c.charAt(kopo38_i));
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_c_kornum++;
			}
		}
		int kopo38_spacenum = kopo38_receiptwidth - (kopo38_a.length() + kopo38_b.length() + kopo38_c.length()
				+ kopo38_a_kornum + kopo38_b_kornum + kopo38_c_kornum);
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum / 2; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		System.out.printf("%s%s%s%s%s\n", kopo38_a, kopo38_space, kopo38_b, kopo38_space, kopo38_c);
	}

	public static void kopo38_center(String kopo38_a) {
		int kopo38_a_kornum = 0;
		String kopo38_space = "";
		for (int kopo38_i = 0; kopo38_i < kopo38_a.length(); kopo38_i++) {
			int kopo38_charnum = (int) (kopo38_a.charAt(kopo38_i));
			if (44031 < kopo38_charnum && 55204 > kopo38_charnum) {
				kopo38_a_kornum++;
			}
		}
		int kopo38_spacenum = (kopo38_receiptwidth - (kopo38_a.length() + kopo38_a_kornum)) / 2;
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		System.out.printf("%s%s\n", kopo38_space, kopo38_a);
	}

	public static void kopo38_calc(String kopo38_a, String kopo38_b) {
		int kopo38_a_kornum = 0;
		String kopo38_space = "";
		for (int kopo38_i = 0; kopo38_i < kopo38_a.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_a.charAt(kopo38_i));
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_a_kornum++;
			}
		}

		int kopo38_spacenum = kopo38_receiptwidth - 19 - (kopo38_a.length() + kopo38_a_kornum);
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		System.out.printf("%s%s%19.19s\n", kopo38_space, kopo38_a, kopo38_b);
	}

	public static void kopo38_drawline() {
		for (int i = 0; i < kopo38_receiptwidth; i++) {
			System.out.printf("-");
		}
		System.out.printf("\n");
	}
}