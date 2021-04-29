package report;

public class Print_Class {

	public void data(Data_Class data) {
		System.out.println("====================REPORT====================");
		System.out.printf("%4.2s%6.2s%4.2s%4.2s%8.2s%6.4s\n", data.FileArray.get(0)[0], data.FileArray.get(0)[1],
				data.FileArray.get(0)[2], data.FileArray.get(0)[3], data.FileArray.get(0)[4], data.FileArray.get(0)[5]);
		for (int i = 1; i < data.FileArray.size(); i++) {
			System.out.printf("%8.8s%5.1s%6.1s%6.3s%12.10s%6.1s\n", data.FileArray.get(i)[0], data.FileArray.get(i)[1],
					data.FileArray.get(i)[2], data.FileArray.get(i)[3], data.FileArray.get(i)[4],
					data.FileArray.get(i)[5]);
		}
		System.out.println();
	}

	public void choice1() {
		System.out.println("\n매출 현황을 선택하세요.");
		System.out.println("1. 권종 별 판매 현황");
		System.out.println("2. 일자별 매출 현황");
		System.out.println("3. 우대권 판매 현황");
	}
	
	public void choice2() {
		System.out.println("\n결과를 파일로 출력하시겠습니까?");
		System.out.println("1. Yes");
		System.out.println("2. No");
	}

	public void dornsell(Data_Class data) {
		System.out.println("\n==================권종 별 판매현황====================");
		for (int i = 0; i < data.DORNTEMP.length; i++) {
			System.out.printf("%s 총 ", data.DORNTEMP[i]);
			if (i == 0) {
				System.out.printf("%s매\n", data.dagesum);
			} else {
				System.out.printf("%s매\n", data.nagesum);
			}
			for (int j = 0; j < data.AGESTEMP.length; j++) {
				if (j != 0) {
					System.out.printf(", ");
				}
				System.out.printf("%s %s매", data.AGESTEMP[j], data.dornageticket[i][j]);
			}
			System.out.println();
			System.out.printf("%s 매출 : ", data.DORNTEMP[i]);
			if (i == 0) {
				System.out.printf("%s원\n", data.dagetotalprice);
			} else {
				System.out.printf("%s원\n", data.nagetotalprice);
			}
			System.out.println();
		}

	}

	public void daysell(Data_Class data) {
		System.out.println("\n=======일자별 매출 현황=======");
		for (int i = 0; i < data.va.length; i++) {
			System.out.printf("%s년 %s월 %s일 :%10.9s원\n", data.va[i].toString().substring(0, 4),
					data.va[i].toString().substring(4, 6), data.va[i].toString().substring(6), data.daysell[i]);

		}
	}

	public void treatticket(Data_Class data) {
		System.out.println("\n===우대권 판매 현황===");
		System.out.printf("총 판매 티켓 수 : %s매\n", data.ticketsum);
		for (int i = 0; i < data.TREATTEMP.length; i++) {
			System.out.printf("%s : %s매\n", data.TREATTEMP[i], data.treatticket[i]);

		}
	}
	
	public void error() {
		System.out.println("\n다시 입력하십시오.");
	}
}
