package kopo38_swc05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class kopo38_P06 {
	static int kopo38_receiptwidth = 41;
	// 영수증 가로 칸수 설정, 최소 34칸을 설정해야한다.

	public static void main(String[] args) {
		String[][] kopo38_items = { { "tf", "저탄소인증 사과 4~7입/봉 (1.3kg내외)", "9900", "2" },
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
				{ "0", "[매일] 마이 카페라떼 220ml*6입 기획 (기획랜덤구성)", "5980", "6" },
				{ "0", "노브랜드 콜롬비아 아메리카노 블랙 2.1L", "2980", "4" }, { "0", "[서울우유] 스페셜티 카페라떼 모카 250ml", "1000", "5" },
				{ "0", "[맥심] TOP 볼드 에스프레소 라떼 300ml", "1000", "10" },
				{ "0", "[서울우유] 스페셜티 카페라떼 아포가토 250ml", "1000", "10" },
				{ "0", "(쓱배송)[맥심] 모카골드 마일드 커피믹스 250입(12g*250입)", "27200", "1" } };
		// String 다중 배열 kopo38_items를 설정한다. { 과세여부, 상품명, 단가, 수량 } 순이다.(과세 여부에 면세일 경우
		// "tf", 아닐경우 "0"를 입력한다.)

		DecimalFormat kopo38_df = new DecimalFormat("###,###,###,###");
		Calendar kopo38_calendar = Calendar.getInstance();
		SimpleDateFormat kopo38_sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm");
		SimpleDateFormat kopop38_sdf2 = new SimpleDateFormat("YYYYMMdd");
		// 사용할 method들을 불러온다. kopo38_df는 숫자에 세자리마다 ','를 찍는다. kopo38_calendar는 시간은 불러온다.
		// kopo38_sdf와 kopo38_sdf2는 시간을 출력하는 형식을 지정한다.

		System.out.printf("  *******   이마트 죽전점 (031)888-1234\n");
		System.out.printf("  *      *  206-85-50913 강희석\n");
		System.out.printf("  *******   용인 수지구 포은대로 552\n");
		System.out.printf("\n영수증 미지참시 교환/환불 불가\n");
		System.out.printf("정상상품에 한함, 30일 이내(신선7일)\n");
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참조)\n");
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n\n");
		// 내용을 출력한다.
		kopo38_twostring("[구 매]" + kopo38_sdf.format(kopo38_calendar.getTime()), "POS:0011-9861");
		// 작성한 method를 활용해 나눔 정렬을 한다. 내용으로 kopo39_sdf과 kopo38_calendar를 활용하여 현재 시간을 지정한
		// 형식으로 불러온다.
		kopo38_drawline();
		// kopo38_receiptwidth만큼 선을 긋는 method인 kopo38_line을 실행한다.
		int kopo38_tax_name = kopo38_receiptwidth - 25;
		int kopo38_tnsf = (int) Math.ceil((kopo38_tax_name - 8) / 2.0);
		int kopo38_tnsb = (int) Math.floor((kopo38_tax_name - 8) / 2.0);

		System.out.printf(
				"%" + (kopo38_tnsf + 5) + "." + 5 + "s%" + kopo38_tnsb + "." + kopo38_tnsf + "s%8.5s%3.2s%8.5s\n",
				"상 품 명", "", "단   가", "수량", "금   액");
		// 한줄의 길이를 kopo38_receiptwidth로 설정했을 때, 각각의 항목이 차지하는 길이는 '단가' : 10칸, '수량' : 4칸,
		// '금액' : 11칸 , '상품명' : kopo38_receiptwidth -10 -4 -11로 설정한다.
		// (단가, 수량, 금액 부분은 줄일 수 없으므로 상품명을 줄인다. '상품명'의 영역은 과세 여부와 상품명 부분을 포함한다.)
		// 이때, 프로그램은 한글이 1칸을 차지하는 것으로 인식하고 실행하지만, 실제로는 2칸을 차지하므로 한글 한 글자당 길이를 한칸씩 줄여야한다.
		// '상품명' 항목은 가운데 정렬을 위해 kopo38_tax_name칸에서 '상품명' 내용의 길이인 8글자만큼을 뺀 상태에서 2로 나누어
		// 올림한 칸만큼을 앞에, 내림한 칸만큼을 뒤에 배치하여 처리한다.
		// '단가' 항목은 10칸에서 한글 2글자만큼의 길이를 뺀 8칸으로 처리했다.
		// '수량' 항목은 4칸에서 한글 2글자만큼의 길이를 뺀 2칸으로 처리해야 하지만 위치 조정을 위해 3칸으로 처리하였다.
		// '금액' 항목은 11칸에서 한글 2글자만큼의 길이를 뺀 9칸으로 처리해야 하지만 '수량'의 위치 조정으로 8칸으로 처리하였다.
		int kopo38_nums = kopo38_items.length;
		// 총 물품 수량인 kopo38_nums를 kopo38_items 다중 배열의 길이로 설정했다.
		int kopo38_taxfreeprice = 0;
		int kopo38_taxitemprice = 0;
		// 면세 물품 값의 합인 kopo38_taxfreeprice와 과세 물품 값의 합인 kopo38_taxitemprice를 각각 0으로 설정하고
		// 시작한다.
		for (int kopo38_i = 0; kopo38_i < kopo38_items.length; kopo38_i++) {
			// 0부터 시작해 kopo38_items.length의 길이보다 작은 정수 kopo38_i에 대해(모든 물품을 출력 및 처리하기 위해 반복문
			// 사용)
			if (kopo38_i % 5 == 0) {
				kopo38_drawline();
			}
			// kopo38_i가 0이 아니고(시작점에서는 실선을 긋지 않는다.) kopo38_i가 5로 나누어 떨어지면 실선을 긋는다.(항목 5개마다
			// 실선을 긋는다.)
			int kopo38_iprice = Integer.parseInt(kopo38_items[kopo38_i][2])
					* Integer.parseInt(kopo38_items[kopo38_i][3]);
			// 정수 kopo38_iprice를 정수 처리한(String값으로 입력됐으므로) 물품 가격과 물품 수량을 곱한 값으로 설정한다.(현재 물품
			// 금액)
			if (kopo38_items[kopo38_i][0].equals("tf")) {
				System.out.printf("* ");
				kopo38_taxfreeprice += kopo38_iprice;
				// kopo38_items[kopo38_i][0]이 "tf"이면(현재 처리되고있는 물품이 면세 대상이면) 맨 앞에 "* "을 넣는다.
				// 또한 kopo38_taxfreeprice(면세 물품 가격의 합)에 kopo38_iprice(현재 물품 금액)를 더한다.
			} else {
				System.out.printf("  ");
				kopo38_taxitemprice += kopo38_iprice;
			}
			// kopo38_items[kopo38_i][0]이 "tf"가 아니면(현재 처리되고있는 물품이 과세 대상이면) 맨 앞에 " "을 넣는다.("*
			// "가 들어가는 길이를 맞춰주기 위해)
			// 또한 kopo38_taxitemprice(면세 물품 가격의 합)에 kopo38_iprice(현재 물품 금액)를 더한다.
			int kopo38_namewidth = kopo38_tax_name - 2;
			// 상품명영역에서 과세 여부를 제외한 길이를 정수 namewidth로 설정한다. namewidth는 단가, 수량, 금액이 우선 출력되고
			// 남은 부분에 출력되어야하므로 kopo38_tax_name에서 과세여부길이 2를 제외한 부분으로 설정한다.
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
			// 상품명을 처리하기위해 반복문을 사용한다.
			// 상품명의 문제는 한글이 들어간다는 점이다. 한글이 들어간 String을 원하는 길이로 출력하기 위해서는 원하는 길이에서 String에
			// 포함된 한글의 갯수를 빼주면 된다.(한글이 2칸을 차지하므로)
			// 한글의 ASCII코드는 '가'가 44032이고, 마지막 글자인 '힣'이 55203의 값을 가진다.
			// 반복문을 이용해 상품명의 첫글자부터 한글인지 아닌지 확인한다. 먼저 몇번째 글자까지 확인했는지를 정수 kopo38_charnum으로
			// 확인한다.
			// (kopo38_i는 0부터 시작하므로) 이후 정수 kopo38_charint를 현재 확인하고 있는 글자의 정수 변환으로 설정하고
			// kopo38_charint의 크기로 한글 여부를 확인한다. 만약 한글이면 한글 글자수인 kopo38_kornum에 1을 더한다.
			// 현재까지 센 글자 길이의 합은 각 (한글인 글자수)*2 + (한글이 아닌 글자)*1 =
			// kopo38_kornum*2 + (kopo38_charnum-kopo38_kornum)*1 =
			// kopo38_kornum+kopo38_charnum이다.
			// 길이가 1또는 2씩 증가하므로 상품명이 kopo38_namewidth보다 길다면 하나씩 세어나갔을 때
			// 세어진 상품명의 길이는 kopo38_namewidth에 정확히 도달하거나 kopo38_namewidth+1에 도달하게 된다.(무조건)
			// 상품명의 길이가 kopo38_namewidth이 되었을 때 break하여 해당 부분까지 출력하거나
			// 상품명의 길이가 kopo38_namewidth+1이 되었을 때 kopo38_namewidth을 건너뛰고 도달했으므로 마지막 글자는 한글임을
			// 알 수 있다.
			// 따라서 한글 갯수에서 하나를 빼고(마지막글자는 출력이 불가능하므로) 표시할 글자 수에서도 하나를 빼주고 break한다.
			System.out.printf(
					"%-" + (kopo38_namewidth - kopo38_kornum) + "." + kopo38_charnum + "s%10.9s%4.3s%11.10s\n",
					kopo38_items[kopo38_i][1], kopo38_df.format(Integer.parseInt(kopo38_items[kopo38_i][2])),
					kopo38_items[kopo38_i][3], kopo38_df.format(kopo38_iprice));
			// 이전과 같이 상품명에 정해진 영역인 namewidth에서 출력할 내용에서 한글인 글자를 빼준 영역을 상품명 영역으로 설정하고,
			// 해당 영역만큼의 길이를 가지도록 센 글자수만큼을 출력한다.
			// 단가는 10칸의 영역에서 간격을 위해 9칸까지 출력한다.
			// 수량은 4칸의 영역에서 간격을 위해 3칸까지 출력한다.
			// 금액은 11칸의 영역에서 간격을 위해 10칸까지 출력한다.
		}
		kopo38_drawline();
		System.out.println();
		kopo38_calc("총 품목 수량", kopo38_df.format(kopo38_nums));
		kopo38_calc("(*)면 세  물 품", kopo38_df.format(kopo38_taxfreeprice));
		kopo38_calc("과 세  물 품", kopo38_df.format(Math.round(kopo38_taxitemprice / 1.1)));
		kopo38_calc("부   가   세", kopo38_df.format(kopo38_taxitemprice - Math.round(kopo38_taxitemprice / 1.1)));
		kopo38_calc("합        계", kopo38_df.format(kopo38_taxitemprice + kopo38_taxfreeprice));
		// 계산 부분 형식을 맞추기 위한 method kopo38_calc를 이용한다.
		// 숫자 형식은 kopo38_df를 활용하여 지정한 형식으로 출력한다.
		// 총 품목수량은 kopo38_nums를 출력한다.
		// 면세물품은 kopo38_taxfreeprice를 출력한다.
		// 과세물품은 kopo38_taxitemprice를 1.1로 나눈 값의 소숫점 첫째자리에서 반올림으로 설정한다.
		// 부가세는 kopo38_taxitemprice에서 과세물품 가격을 뺀 값으로 설정한다.
		// 합계는 면세물품과 과세물품가격의 합이다.
		kopo38_twostring("결제대상금액", kopo38_df.format(kopo38_taxitemprice + kopo38_taxfreeprice));
		// 결제 대상금액은 kopo38_twostring을 활용한 형식으로 면세물품과 과세물품 가격의 합을 출력한다.
		kopo38_drawline();
		kopo38_twostring("0012 KEB 하나", "541707**0484/35860658");
		kopo38_twostring("카드결제(IC)", "일시불 /" + kopo38_df.format(kopo38_taxitemprice + kopo38_taxfreeprice));
		kopo38_drawline();
		// kopo38_twostring과 kopo38_drawline를 활용하여 출력한다.
		kopo38_center("[신세계포인트 적립]");
		System.out.printf("%s\n", "조*현 고객님의 포인트 현황입니다.");
		kopo38_threestring("금회발생포인트", "9350**9995",
				kopo38_df.format((int) ((kopo38_taxitemprice + kopo38_taxfreeprice) / 100)));
		kopo38_twostring("누계(가용)포인트 ",
				kopo38_df.format(1000000 + (int) ((kopo38_taxitemprice + kopo38_taxfreeprice) / 100)) + "("
						+ kopo38_df.format(1000000) + ")");
		// kopo38_threestring을 활용하여 String이 3개 있을 때 간격을 동일하게 정렬하여 출력한다.
		// 발생 포인트는 총 결제 금액의 1%로, 누계 포인트는 기존 포인트에 발생포인트를 합한 값으로 출력한다.
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
		// method를 이용해 내용을 출력한다.

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
		// kopo38_a_kornum은 String kopo38_a에 포함된 한글의 수,
		// kopo38_b_kornum은 String kopo38_b에 포함된 한글의 수이다.
		// 각각 반복문과 ASCII코드를 활용하여 문자열에 포함된 한글 수를 세어준다.
		int kopo38_spacenum = kopo38_receiptwidth
				- (kopo38_a.length() + kopo38_b.length() + kopo38_a_kornum + kopo38_b_kornum);
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		// kopo38_spacenum은 총 길이 41에서 kopo38_a와 kopo38_b의 글자 수, 그리고 한글로 인해 늘어난 길이만큼을
		// 제외해준 숫자이다.
		// 즉, kopo38_a와 kopo38_b가 차지하고 있는 영역을 제외한 빈 공간의 길이이다.
		// kopo38_spacenum만큼 빈칸을 kopo38_space로 설정한다.
		System.out.printf("%s%s%s\n", kopo38_a, kopo38_space, kopo38_b);
		// 좌측에 kopo38_a, 가운데에 둘을 제외한 만큼의 공간, 우측에 kopo38_b를 배치하여 두 String을 양쪽 정렬 한다.
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
		// kopo38_a_kornum은 String kopo38_a에 포함된 한글의 수,
		// kopo38_b_kornum은 String kopo38_b에 포함된 한글의 수,.
		// kopo38_C_kornum은 String kopo38_c에 포함된 한글의 수이다.
		// 각각 반복문과 ASCII코드를 활용하여 문자열에 포함된 한글 수를 세어준다.
		int kopo38_spacenum = kopo38_receiptwidth - (kopo38_a.length() + kopo38_b.length() + kopo38_c.length()
				+ kopo38_a_kornum + kopo38_b_kornum + kopo38_c_kornum);
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum / 2; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		// kopo38_spacenum은 총 길이에서 kopo38_a와 kopo38_b, kopo38_c의 글자 수,
		// 그리고 한글로 인해 늘어난 길이만큼을 제외해준 숫자이다.
		// 즉, kopo38_a와 kopo38_b, kopo38_c가 차지하고 있는 영역을 제외한 빈 공간의 길이이다.
		// kopo38_spacenum의 반만큼의 빈칸을 kopo38_space로 설정한다.
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
		// kopo38_a_num을 이용해 String kopo38_a에 포함된 한글을 세어준다.
		int kopo38_spacenum = (kopo38_receiptwidth - (kopo38_a.length() + kopo38_a_kornum)) / 2;
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		// kopo38_spacenum은 총 길이에서 kopo38_a의 글자수에 한글로 인해 늘어난 길이만큼을 제외해준 숫자를 2로 나눈 몫이다.
		// 즉, kopo38_a가 차지하고 있는 영역을 제외한 빈공간을 반으로 나눈 몫이 된다.
		// 해당 길이만큼 빈칸을 kopo38_space로 설정한다.
		System.out.printf("%s%s\n", kopo38_space, kopo38_a);
		// kopo38_space만큼의 빈공간을 출력하고 이어서 kopo38_a를 출력하면 가운데 정렬이 된다.
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
		// 계산부분 형식을 출력하기위해 kopo38_a에 포함된 한글을 세어준다.

		int kopo38_spacenum = kopo38_receiptwidth - 19 - (kopo38_a.length() + kopo38_a_kornum);
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		// kopo38_spacenum은 총 길이에서 kopo38_b가 차지할 부분 19와
		// kopo38_a가 차지하고 있는 부분(kopo38_a의 길이 + 한글 글자수)을 제외한 공간으로 kopo38_a의 앞에 들어갈 빈 공간의
		// 길이이다.

		System.out.printf("%s%s%19.19s\n", kopo38_space, kopo38_a, kopo38_b);
		// kopo38_space만큼의 빈공간을 출력해주고 이어서 kopo38_a를 출력한다. 마지막 kopo38_b가 차지하는 길이는 19로
		// 설정한다.
	}

	public static void kopo38_drawline() {
		for (int i = 0; i < kopo38_receiptwidth; i++) {
			System.out.printf("-");
		}
		System.out.printf("\n");
		// 영수증 길이만큼 선을 긋는 method이다.
	}
}