package ticket;

public class Print_Class {

	public void inputDorN() {
		System.out.println("권종을 선택하세요");
		System.out.println("1. 주간권");
		System.out.println("2. 야간권");
	}

	public void inputreginum() {
		System.out.println("주민등록번호를 입력하세요");
	}

	public void inputnums() {
		System.out.println("몇개를 주문하시겠습니까? (최대 10개)");
	}

	public void inputtreat() {
		System.out.println("우대사항을 선택하세요");
		System.out.println("1. 없음 (나이 우대는 자동처리)");
		System.out.println("2. 장애인");
		System.out.println("3. 국가유공자");
		System.out.println("4. 다자녀");
		System.out.println("5. 임산부");
	}

	public void price_result(Data_Class data) {
		System.out.printf("가격은 %s 원 입니다.\n감사합니다.\n", data.price);
		System.out.println("계속 발권 하시겠습니까?");
		System.out.println("1. 티켓 발권");
		System.out.println("2. 종료");
	}

	public void total_price_result(Data_Class data) {
		System.out.println("티켓 발권을 종료합니다. 감사합니다.");
		System.out.println("=================== 에버랜드 ===================");
		for (int i = 0; i < data.ticketArray.size(); i++) {
			System.out.printf("%s %s X %s %s원 *%s\n", data.ticketArray.get(i).dorn(), data.ticketArray.get(i).ages(),
					data.ticketArray.get(i).nums(), data.ticketArray.get(i).price(), data.ticketArray.get(i).treat());
			data.totalprice += data.ticketArray.get(i).price();
		}
		System.out.printf("\n\n입장료 총액은 %s원 입니다.\n", data.totalprice);
		System.out.println("================================================");
	}

	public void temp2() {
		System.out.print("\n계속 진행(1.: 새로운 주문, 2: 프로그램 종료) : ");
	}

	public void thx() {
		System.out.println("감사합니다.");
	}

	public void errorocu() {
		System.out.println("\n처음으로 돌아갑니다.\n");
	}
}
