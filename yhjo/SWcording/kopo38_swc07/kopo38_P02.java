package kopo38_swc07;

import java.text.DecimalFormat;

public class kopo38_P02 {
	static String[] kopo38_OneRec = {
			"01* 저탄소인증 사과 4~7입/봉 (1.3kg내외)                                          9,900   2     198,000",
			"02* [국내산] 성주참외 3~6입/봉 (1.2kg내외)                                       10,900   1     10,900",
			"03* 적상추 200g                                                                   1,480   2      29,600",
			"04* 애호박 200g                                                                   1,280   2      2,560",
			"05* 일판란 30개입 (특란, 1800g)                                                   6,980   1      6,980",
			"06* [국내산] 성주참외 3~6입/봉 (1.2kg내외)                                       10,900   2     21,800",
			"07* [20년산] 이맛쌀 20kg                                                         58,900   1     58,900",
			"08* [국내산] 당찬사과 4~11입/봉 (1.8kg)                                          12,800   2     25,600",
			"09* [국내산] 대추방울토마토 1kg/팩                                                7,900   2     15,800",
			"10* [풀무원] 국산콩 콩나물 340g                                                   2,500   2      5,000",
			"11* [국내산] 방울토마토 600g/팩                                                   5,400   3     16,200",
			"12* [서울우유] 후레쉬 밀크 기획(900ml*2) 1800ml                                   3,870   3     11,610",
			"13  노브랜드 도톰한 물티슈 100매                                                    980   3      2,940",
			"14  노브랜드 위생장갑125매                                                        1,680   4      6,720",
			"15  피지 파워젤 세제 프레쉬2.7L                                                   6,900   1      6,900",
			"16  에이퓨리 유어프리 KF94 의약외품 국산 대형 블랙 화이트 일회용마스크 100매     15,900   1     15,900",
			"17  프릴 베이킹소다 퓨어레몬 750ML 용기                                           6,500   1      6,500",
			"18  노브랜드 콜드브루 아메리카노 500m                                             1,880   5      9,400",
			"19  [노브랜드] 숯불데리야끼닭꼬치 800g                                           12,980   1     129,800",
			"20  피코크 콜롬비아 안티오키아 수프리모 1kg (홀빈)                               14,980   1     14,980",
			"21  오랄비 칫솔 어드밴티지 5웨이 3개입+크로스액션 탁월한 세정력 2개입             9,900   2     19,800",
			"22  농심 배홍동비빔면 4입                                                         2,980   2      5,960",
			"23  [풀무원]국산콩 투컵 두부 600g                                                 4,980   2      9,960",
			"24  2080 오리지날 알파 블루 140g*3입                                              7,900   1      7,900",
			"25  [매일] 마이 카페라떼 220ml*6입 기획 (기획랜덤구성)                            5,980   6     35,880",
			"26  노브랜드 콜롬비아 아메리카노 블랙 2.1L                                        2,980   4     11,920",
			"27  [서울우유] 스페셜티 카페라떼 모카 250ml                                       1,000   5      5,000",
			"28  [맥심] TOP 볼드 에스프레소 라떼 300ml                                         1,000  10     10,000",
			"29  [서울우유] 스페셜티 카페라떼 아포가토 250ml                                   1,000  10     10,000",
			"30  (쓱배송)[맥심] 모카골드 마일드 커피믹스 250입(12g*250입)                     27,200   1     27,200" };
	// 6강 영수증에서 데이터를 가져온다.
	static DecimalFormat kopo38_df;

	// DecimalFormat을 선언한다.
	public static void main(String[] args) {
		kopo38_df = new DecimalFormat("###,###,###,###");
		// DecimalFormat을 설정한다.
		for (int kopo38_i = 0; kopo38_i < kopo38_OneRec.length; kopo38_i++) {
			// 0부터 시작해 kopo38_OneRec의 길이보다 작은 정수 kopo38_i에 대해
			int kopo38_n = kopo38_OneRec[kopo38_i].length();
			// kopo38_OneRec의 kopo38_i번째의 길이를 kopo38_n으로 설정한다.
			int kopo38_totalprice = Integer
					.parseInt(kopo38_OneRec[kopo38_i].substring(kopo38_n - 10, kopo38_n).trim().replaceAll(",", ""));
			int kopo38_num = Integer.parseInt(
					kopo38_OneRec[kopo38_i].substring(kopo38_n - 14, kopo38_n - 10).trim().replaceAll(",", ""));
			int kopo38_price = Integer.parseInt(
					kopo38_OneRec[kopo38_i].substring(kopo38_n - 25, kopo38_n - 14).trim().replaceAll(",", ""));
			// substring과 parseInt를 이용해 필요한 부분(총가격. 가격, 개수)부분을 추출하여 변수로 설정한다.
			if (kopo38_price * kopo38_num != kopo38_totalprice) {
				System.out.printf("*********************\n");
				System.out.printf("오류[%s]\n", kopo38_OneRec[kopo38_i]);
				System.out.printf("수정[%s%9.8s%4.3s%12.11s]\n", kopo38_OneRec[kopo38_i].substring(0, kopo38_n - 25),
						kopo38_df.format(kopo38_price), kopo38_df.format(kopo38_num),
						kopo38_df.format(kopo38_price * kopo38_num));
				System.out.printf("*********************\n");
				// 가격과 개수의 곱이 총 가격과 다르면(오류가 있으면) 오류 내용과 수정 결과를 출력하도록 설정한다.
			}
		}

	}
}
