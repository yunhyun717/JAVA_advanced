package kopo38_swc05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class kopo38_P05 {

	public static void main(String[] args) {
		String kopo38_itemname1 = "퓨어에어 비말차단용마스크(최고급형)";
		String kopo38_itemcode1 = "1031615";
		int kopo38_price1 = 3000;
		int kopo38_amount1 = 1;

		String kopo38_itemname2 = "슬라이드식명찰(가로형)(100호)";
		String kopo38_itemcode2 = "11008152";
		int kopo38_price2 = 1000;
		int kopo38_amount2 = 1;

		String kopo38_itemname3 = "매직흡착 인테리어후크(알루미늄타입)";
		String kopo38_itemcode3 = "1020800";
		int kopo38_price3 = 1000;
		int kopo38_amount3 = 1;
		// 세개의 상품에 대한 정보를 입력한다.(상품명, 상품코드, 가격, 갯수)

		DecimalFormat kopo38_df = new DecimalFormat("###,###,###,###");
		Calendar kopo38_calendar = Calendar.getInstance();
		SimpleDateFormat kopo38_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		SimpleDateFormat kopo38_sdf2 = new SimpleDateFormat("(MM월dd일)");
		// 사용할 method를 불러온다. kopo38_df는 숫자 쉼표, kopo38_calendar는 시간불러오기
		// kopo38_sdf는 시간 형식 지정

		kopo38_center("\"국민가게, 다이소\"");
		System.out.printf("(주)아성다이소_분당서현점\n");
		System.out.printf("전화:031-702-6016\n");
		System.out.printf("본사:서울 강남구 남부순환로 2748 (도곡동)\n");
		System.out.printf("대표:박정부,신호섭 213-81-52063\n");
		System.out.printf("매장:경기도 성남시 분당구 분당로53번길 11 (서현동)\n");
		System.out.printf("=========================================\n");
		kopo38_center("소비자중심경영(CCM) 인증기업");
		kopo38_center("ISO 9001 품질경영시스템 인증기업");
		System.out.printf("=========================================\n");
		kopo38_calendar.add(Calendar.DAY_OF_MONTH,14);
		kopo38_center("교환/환불 14일"+kopo38_sdf2.format(kopo38_calendar.getTime())+"이내,");
		kopo38_calendar.add(Calendar.DAY_OF_MONTH,-14);
		// kopo38_calendar을 이용해 14일을 더해주고 kopo38_sdf2에서 설정한 형식으로 출력한다.
		// 이후 14일을 다시 빼준다.
		kopo38_center("(전자)영수증, 결제카드 지참 후 ");
		kopo38_center("구입매장에서 가능");
		kopo38_center("포장/가격 택 훼손시 교환/환불 불가");
		kopo38_center("체크카드 취소 시 최대 7일 소요");
		System.out.printf("=========================================\n");
		kopo38_twostring("[POS 1058231]", kopo38_sdf.format(kopo38_calendar.getTime()));
		System.out.printf("=========================================\n");
		// kopo38_center와 kopo38_twostring을 활용해 내용을 출력한다.
		// 시간은 kopo38_calendar로 불러와 kopo38_sdf에서 지정한 형식으로 출력한다.
		int kopo38_price = 0;
		// 총 가격 합계인 정수 kopo38_price를 0으로 설정한다.
		int kopo38_charnum = 0;
		int kopo38_kornum = 0;
		for (int kopo38_i = 0; kopo38_i < kopo38_itemname1.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_itemname1.charAt(kopo38_i));
			kopo38_charnum = kopo38_i + 1;
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_kornum++;
			}
			if (kopo38_kornum + kopo38_charnum == 16) {
				break;
			} else if (kopo38_kornum + kopo38_charnum == 17) {
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
		// 길이가 1또는 2씩 증가하므로 상품명이 16보다 길다면 하나씩 세어나갔을 때
		// 세어진 상품명의 길이는 16에 정확히 도달하거나 17에 도달하게 된다.(무조건)
		// 상품명의 길이가 16이 되었을 때 break하여 해당 부분까지 출력하거나
		// 상품명의 길이가 17이 되었을 때 16을 건너뛰고 도달했으므로 마지막 글자는 한글임을 알 수 있다.
		// 따라서 한글 갯수에서 하나를 빼고(마지막글자는 출력이 불가능하므로) 표시할 글자 수에서도 하나를 빼주고 break한다.

		System.out.printf("%-" + (16 - kopo38_kornum) + "." + kopo38_charnum + "s%10.9s%4.3s%11.10s\n[%s]\n",
				kopo38_itemname1, kopo38_df.format(kopo38_price1), kopo38_df.format(kopo38_amount1),
				kopo38_df.format(kopo38_price1 * kopo38_amount1), kopo38_itemcode1);
		
		// 상품명에 정해진 영역인 16칸에서 출력할 내용에서 한글인 글자를 빼준 영역을 상품명 영역으로 설정하고,
		// 해당 영역만큼의 길이를 가지도록 센 글자수만큼을 출력한다.
		// 단가는 10칸의 영역에서 간격을 위해 9칸까지 출력한다,
		// 수량은 4칸의 영역에서 간격을 위해 3칸까지 출력한다.
		// 금액은 11칸의 영역에서 간격을 위해 10칸까지 출력한다.
		kopo38_price += kopo38_price1 * kopo38_amount1;
		// 총가격에 현재 상품의 가격과 갯수를 곱하여 더한다.
		kopo38_charnum = 0;
		kopo38_kornum = 0;
		for (int kopo38_i = 0; kopo38_i < kopo38_itemname2.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_itemname2.charAt(kopo38_i));
			kopo38_charnum = kopo38_i + 1;
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_kornum++;
			}
			if (kopo38_kornum + kopo38_charnum == 16) {
				break;
			} else if (kopo38_kornum + kopo38_charnum == 17) {
				kopo38_kornum--;
				kopo38_charnum--;
				break;
			}
		}

		System.out.printf("%-" + (16 - kopo38_kornum) + "." + kopo38_charnum + "s%10.9s%4.3s%11.10s\n[%s]\n",
				kopo38_itemname2, kopo38_df.format(kopo38_price2), kopo38_df.format(kopo38_amount2),
				kopo38_df.format(kopo38_price2 * kopo38_amount2), kopo38_itemcode2);
		kopo38_price += kopo38_price2 * kopo38_amount2;
		kopo38_charnum = 0;
		kopo38_kornum = 0;
		for (int kopo38_i = 0; kopo38_i < kopo38_itemname3.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_itemname3.charAt(kopo38_i));
			kopo38_charnum = kopo38_i + 1;
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_kornum++;
			}
			if (kopo38_kornum + kopo38_charnum == 16) {
				break;
			} else if (kopo38_kornum + kopo38_charnum == 17) {
				kopo38_kornum--;
				kopo38_charnum--;
				break;
			}
		}
		System.out.printf("%-" + (16 - kopo38_kornum) + "." + kopo38_charnum + "s%10.9s%4.3s%11.10s\n[%s]\n",
				kopo38_itemname3, kopo38_df.format(kopo38_price3), kopo38_df.format(kopo38_amount3),
				kopo38_df.format(kopo38_price3 * kopo38_amount3), kopo38_itemcode3);
		kopo38_price += kopo38_price3 * kopo38_amount3;
		// 다른 상품도 동일하게 진행한다.
		
		kopo38_calc("과세합계", kopo38_df.format(Math.round(kopo38_price / 1.1)));
		kopo38_calc("부가세", kopo38_df.format(kopo38_price - Math.round(kopo38_price / 1.1)));
		// kopo38_method 함수를 이용해 과세합계와 부가세를 출력한다.
		// 과세합계는 총가격을 1.1로 나눈 값의 반올림을 kopo38_df에서 정한 형식으로 출력하며
		// 부가세는 총 가격에서 과세합계를 제외한 값을 kopo38_df에서 정한 형식으로 출력한다.

		System.out.printf("-----------------------------------------\n");
		kopo38_twostring("판매합계", kopo38_df.format(kopo38_price));
		System.out.printf("=========================================\n");
		kopo38_twostring("신용카드", kopo38_df.format(kopo38_price));
		System.out.printf("-----------------------------------------\n");
		kopo38_twostring("우리카드", "538720**********");
		kopo38_twostring("승인번호 77982843(0)", "승인금액 " + kopo38_df.format(kopo38_price));
		System.out.printf("=========================================\n");
		kopo38_center(kopo38_sdf.format(kopo38_calendar.getTime()) + " 분당서현점");
		System.out.printf("상품 및 기타 문의 : 1522-4400\n");
		System.out.printf("멤버십 및 샵다이소 관련 문의 : 1599-2211\n");
		kopo38_center("||||||||||||||||||||");
		kopo38_center("||||||||||||||||||||");
		kopo38_center("2112820610158231");
		System.out.printf("-----------------------------------------\n");
		kopo38_center("◈ 다이소 멤버십 앱 또는 홈페이지에 접속");
		kopo38_center(" 하셔서 회원가입 후 다양한 혜택을 ");
		kopo38_center("누려보세요! ◈");
		// kopo38_center와 kopo38_twostring을 활용해 내용을 출력한다.
		// 시간은 kopo38_calendar로 불러와 kopo38_sdf에서 지정한 형식으로 출력한다.
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
		int kopo38_spacenum = 41 - (kopo38_a.length() + kopo38_b.length() + kopo38_a_kornum + kopo38_b_kornum);
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		// kopo38_spacenum은 총 길이 41에서 kopo38_a와 kopo38_b의 글자 수, 그리고 한글로 인해 늘어난 길이만큼을 제외해준 숫자이다.
		// 즉, kopo38_a와 kopo38_b가 차지하고 있는 영역을 제외한 빈 공간의 길이이다.
		// kopo38_spacenum만큼 빈칸을 kopo38_space로 설정한다.
		System.out.printf("%s%s%s\n", kopo38_a, kopo38_space, kopo38_b);
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

		int kopo38_spacenum = 41 - 19 - (kopo38_a.length() + kopo38_a_kornum);
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		// kopo38_spacenum은 총 길이 41에서 kopo38_b가 차지할 부분 19와
		// kopo38_a가 차지하고 있는 부분(kopo38_a의 길이 + 한글 글자수)을 제외한 공간으로 kopo38_a의 앞에 들어갈 빈 공간의 길이이다. 

		System.out.printf("%s%s%19.19s\n", kopo38_space, kopo38_a, kopo38_b);
		// kopo38_space만큼의 빈공간을 출력해주고 이어서 kopo38_a를 출력한다. 마지막 kopo38_b가 차지하는 길이는 19로 설정한다.
	}

}